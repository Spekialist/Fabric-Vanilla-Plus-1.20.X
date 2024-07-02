package net.spekialist.vanillaplus;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.spekialist.vanillaplus.block.ModBlocks;
import net.spekialist.vanillaplus.block.entity.ModBlockEntities;
import net.spekialist.vanillaplus.entity.ModBoats;
import net.spekialist.vanillaplus.item.ModItemGroups;
import net.spekialist.vanillaplus.item.ModItems;
import net.spekialist.vanillaplus.recipe.ModRecipes;
import net.spekialist.vanillaplus.screen.ModScreenHandlers;
import net.spekialist.vanillaplus.util.ModCustomTrades;
import net.spekialist.vanillaplus.util.ModLootTableModifiers;
import net.spekialist.vanillaplus.villager.ModVillagers;
import net.spekialist.vanillaplus.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaPlus implements ModInitializer {
	public static final String MOD_ID = "vanillaplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModBlockEntities.registerBlockEntities();

		ModVillagers.registerVillagers();

		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		StrippableBlockRegistry.register(ModBlocks.PINE_LOG, ModBlocks.STRIPPED_PINE_LOG);
		StrippableBlockRegistry.register(ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINE_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_LEAVES, 30, 60);

		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();
	}
}
