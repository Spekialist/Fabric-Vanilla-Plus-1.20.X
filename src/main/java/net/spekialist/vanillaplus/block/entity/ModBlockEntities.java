package net.spekialist.vanillaplus.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.VanillaPlus;
import net.spekialist.vanillaplus.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<ImprovedSmelterEntity> IMPROVED_SMELTER_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(VanillaPlus.MOD_ID, "improved_smelter_be"),
                    FabricBlockEntityTypeBuilder.create(ImprovedSmelterEntity::new,
                            ModBlocks.IMPROVED_SMELTER).build());

    public static final BlockEntityType<StoveBlockEntity> STOVE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(VanillaPlus.MOD_ID, "stove_be"),
                    FabricBlockEntityTypeBuilder.create(StoveBlockEntity::new,
                            ModBlocks.STOVE).build());

    public static final BlockEntityType<SmallChestBlockEntity> SMALL_CHEST_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(VanillaPlus.MOD_ID, "small_chest_be"),
                    FabricBlockEntityTypeBuilder.create(SmallChestBlockEntity::new,
                            ModBlocks.SMALL_CHEST).build());

    public static void registerBlockEntities() {
        VanillaPlus.LOGGER.info("Registering Block Entities for " + VanillaPlus.MOD_ID);
    }
}
