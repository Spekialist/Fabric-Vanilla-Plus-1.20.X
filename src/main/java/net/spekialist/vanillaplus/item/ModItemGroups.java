package net.spekialist.vanillaplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.VanillaPlus;
import net.spekialist.vanillaplus.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup VP_BUILDING_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_building_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_building_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.DIORITE_BRICKS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CALCITE_STAIRS);
                        entries.add(ModBlocks.CALCITE_SLAB);
                        entries.add(ModBlocks.CALCITE_WALL);

                        entries.add(ModBlocks.DIORITE_BRICKS);
                        entries.add(ModBlocks.MOSSY_DIORITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_DIORITE_BRICKS);
                        entries.add(ModBlocks.DIORITE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_DIORITE_BRICK_WALL);
                        entries.add(ModBlocks.DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS);
                        entries.add(ModBlocks.DIORITE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_DIORITE_BRICK_SLAB);

                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.MOSSY_ANDESITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_ANDESITE_BRICK_WALL);
                        entries.add(ModBlocks.ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB);

                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.MOSSY_GRANITE_BRICKS);
                        entries.add(ModBlocks.CRACKED_GRANITE_BRICKS);
                        entries.add(ModBlocks.GRANITE_BRICK_WALL);
                        entries.add(ModBlocks.MOSSY_GRANITE_BRICK_WALL);
                        entries.add(ModBlocks.GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS);
                        entries.add(ModBlocks.GRANITE_BRICK_SLAB);
                        entries.add(ModBlocks.MOSSY_GRANITE_BRICK_SLAB);

                        entries.add(ModBlocks.PINE_LOG);
                        entries.add(ModBlocks.PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_PINE_WOOD);
                        entries.add(ModBlocks.PINE_PLANKS);
                        entries.add(ModBlocks.PINE_STAIRS);
                        entries.add(ModBlocks.PINE_SLAB);
                        entries.add(ModBlocks.PINE_FENCE);
                        entries.add(ModBlocks.PINE_FENCE_GATE);
                        entries.add(ModBlocks.PINE_DOOR);
                        entries.add(ModBlocks.PINE_TRAPDOOR);
                        entries.add(ModBlocks.PINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINE_BUTTON);

                        entries.add(ModBlocks.DACITE);
                        entries.add(ModBlocks.POLISHED_DACITE);

                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build());

    public static final ItemGroup VP_COLOURED_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_coloured_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_coloured_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.BLUE_CONCRETE_STAIRS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);

                        entries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.WHITE_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GRAY_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLACK_CONCRETE_SLAB);
                        entries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BROWN_CONCRETE_SLAB);
                        entries.add(ModBlocks.RED_CONCRETE_STAIRS);
                        entries.add(ModBlocks.RED_CONCRETE_SLAB);
                        entries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
                        entries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
                        entries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIME_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIME_CONCRETE_SLAB);
                        entries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.GREEN_CONCRETE_SLAB);
                        entries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
                        entries.add(ModBlocks.CYAN_CONCRETE_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.BLUE_CONCRETE_SLAB);
                        entries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
                        entries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
                        entries.add(ModBlocks.PINK_CONCRETE_STAIRS);
                        entries.add(ModBlocks.PINK_CONCRETE_SLAB);

                    }).build());

    public static final ItemGroup VP_FOOD_AND_DRINKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_food_and_drinks"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_food_and_drinks"))
                    .icon(() -> new ItemStack(ModItems.CHEESE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.ONION);
                        entries.add(ModItems.PEPPER);
                        entries.add(ModItems.RADISH);
                        entries.add(ModItems.PUMPKIN_SLICE);
                        entries.add(ModItems.CABBAGE);
                        entries.add(ModItems.CABBAGE_LEAF);

                        entries.add(ModItems.CHERRY);
                        entries.add(ModItems.APRICOT);
                        entries.add(ModItems.GRAPE);
                        entries.add(ModItems.COCONUT);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.PEACH);
                        entries.add(ModItems.ROTTEN_APPLE);
                        entries.add(ModItems.ROTTEN_ORANGE);
                        entries.add(ModItems.ROTTEN_PEACH);

                        entries.add(ModItems.CARAMEL);
                        entries.add(ModItems.CHOCOLATE);
                        entries.add(ModItems.SWEET_BERRY_COOKIE);
                        entries.add(ModItems.APPLE_PIE_SLICE);
                        entries.add(ModItems.CHOCOLATE_PIE_SLICE);
                        entries.add(ModItems.SWEET_BERRY_CHEESECAKE_SLICE);
                        entries.add(ModItems.PUMPKIN_PIE_SLICE);

                        entries.add(ModItems.NETHER_SALAD);
                        entries.add(ModItems.MIXED_SALAD);
                        entries.add(ModItems.FRUIT_SALAD);
                        entries.add(ModItems.FISH_STEW);
                        entries.add(ModItems.BEEF_STEW);
                        entries.add(ModItems.BAKED_COD_STEW);
                        entries.add(ModItems.NOODLE_SOUP);
                        entries.add(ModItems.PUMPKIN_SOUP);
                        entries.add(ModItems.VEGETABLE_SOUP);
                        entries.add(ModItems.CHICKEN_SOUP);
                        entries.add(ModItems.BONE_BROTH);
                        entries.add(ModItems.TOMATO_SAUCE);
                        entries.add(ModItems.BEETROOT_SALAD);
                        entries.add(ModItems.BACON_AND_EGGS);
                        entries.add(ModItems.GRILLED_SALMON);
                        entries.add(ModItems.PASTA_WITH_MEATBALLS);
                        entries.add(ModItems.RATATOUILLE);
                        entries.add(ModItems.STEAK_AND_POTATOES);
                        entries.add(ModItems.STUFFED_PUMPKIN);

                        entries.add(ModItems.MINCED_BEEF);
                        entries.add(ModItems.BEEF_PATTY);
                        entries.add(ModItems.BACON);
                        entries.add(ModItems.COOKED_BACON);
                        entries.add(ModItems.BACON_SANDWICH);
                        entries.add(ModItems.CHICKEN_SANDWICH);
                        entries.add(ModItems.EGG_SANDWICH);
                        entries.add(ModItems.BARBECUE_STICK);
                        entries.add(ModItems.DUMPLINGS);
                        entries.add(ModItems.STUFFED_POTATO);
                        entries.add(ModItems.COD_SLICE);
                        entries.add(ModItems.COOKED_COD_SLICE);
                        entries.add(ModItems.COD_ROLL);
                        entries.add(ModItems.SALMON_SLICE);
                        entries.add(ModItems.COOKED_SALMON_SLICE);
                        entries.add(ModItems.SALMON_ROLL);
                        entries.add(ModItems.KELP_ROLL);
                        entries.add(ModItems.KELP_ROLL_SLICE);
                        entries.add(ModItems.SHRIMP);

                        entries.add(ModItems.RICE);
                        entries.add(ModItems.COOKED_RICE);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.COOKED_MUSHROOM);
                        entries.add(ModItems.FRIED_EGG);

                        entries.add(ModItems.WHEAT_DOUGH);
                        entries.add(ModItems.RAW_PASTA);

                    }).build());

    public static final ItemGroup VP_NATURAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_natural_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_natural_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.RUBY_ORE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.PINE_LEAVES);
                        entries.add(ModBlocks.PINE_SAPLING);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.CORN_SEEDS);

                    }).build());

    public static final ItemGroup VP_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_ingredients"))
                    .icon(() -> new ItemStack(ModItems.BIG_AMETHYST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BIG_AMETHYST);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.STEEL_INGOT);

                    }).build());

    public static final ItemGroup VP_TOOLS_AND_UTILITIES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_tools_and_utilities"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_tools_and_utilities"))
                    .icon(() -> new ItemStack(ModItems.STEEL_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);

                        entries.add(ModItems.PINE_BOAT);
                        entries.add(ModItems.PINE_BOAT_WITH_CHEST);

                    }).build());

    public static final ItemGroup VP_COMBAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_combat"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_combat"))
                    .icon(() -> new ItemStack(ModItems.STEEL_SWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                    }).build());

    public static final ItemGroup VP_FUNCTIONAL_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(VanillaPlus.MOD_ID, "vp_functional_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("item group.vp_functional_blocks"))
                    .icon(() -> new ItemStack(ModItems.PINE_SIGN)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.IMPROVED_SMELTER);
                        entries.add(ModBlocks.STOVE);
                        entries.add(ModBlocks.MYTHRIL_BLASTER);
                        entries.add(ModBlocks.SMALL_CHEST);
                        entries.add(ModItems.PINE_SIGN);
                        entries.add(ModItems.HANGING_PINE_SIGN);

                    }).build());

    public static void registerItemGroups() {
        VanillaPlus.LOGGER.info("Registering Item Groups for " + VanillaPlus.MOD_ID);
    }
}