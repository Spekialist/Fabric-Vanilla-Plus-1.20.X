package net.spekialist.vanillaplus.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.VanillaPlus;
import net.spekialist.vanillaplus.block.ModBlocks;
import net.spekialist.vanillaplus.item.ModItems;

public class ModBoats {
    public static final Identifier PINE_BOAT_ID = new Identifier(VanillaPlus.MOD_ID, "pine_boat");
    public static final Identifier PINE_BOAT_WITH_CHEST_ID = new Identifier(VanillaPlus.MOD_ID, "pine_boat_with_chest");

    public static final RegistryKey<TerraformBoatType> PINE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINE_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType pineBoat = new TerraformBoatType.Builder()
                .item(ModItems.PINE_BOAT)
                .chestItem(ModItems.PINE_BOAT_WITH_CHEST)
                .planks(ModBlocks.PINE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PINE_BOAT_KEY, pineBoat);
    }
}
