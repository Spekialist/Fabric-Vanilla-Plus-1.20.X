package net.spekialist.vanillaplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.spekialist.vanillaplus.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)

                .add(ModBlocks.CALCITE_STAIRS)
                .add(ModBlocks.CALCITE_SLAB)
                .add(ModBlocks.CALCITE_WALL)

                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.MOSSY_DIORITE_BRICKS)
                .add(ModBlocks.CRACKED_DIORITE_BRICKS)
                .add(ModBlocks.DIORITE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS)
                .add(ModBlocks.DIORITE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_DIORITE_BRICK_SLAB)
                .add(ModBlocks.DIORITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_DIORITE_BRICK_WALL)

                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.MOSSY_ANDESITE_BRICKS)
                .add(ModBlocks.CRACKED_ANDESITE_BRICKS)
                .add(ModBlocks.ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.ANDESITE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB)
                .add(ModBlocks.ANDESITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_ANDESITE_BRICK_WALL)

                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.MOSSY_GRANITE_BRICKS)
                .add(ModBlocks.CRACKED_GRANITE_BRICKS)
                .add(ModBlocks.GRANITE_BRICK_STAIRS)
                .add(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.GRANITE_BRICK_SLAB)
                .add(ModBlocks.MOSSY_GRANITE_BRICK_SLAB)
                .add(ModBlocks.GRANITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_GRANITE_BRICK_WALL)

                .add(ModBlocks.DACITE)
                .add(ModBlocks.POLISHED_DACITE)

                .add(ModBlocks.IMPROVED_SMELTER)
                .add(ModBlocks.STOVE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.PINE_PLANKS)
                .add(ModBlocks.PINE_STAIRS)
                .add(ModBlocks.PINE_SLAB)
                .add(ModBlocks.PINE_BUTTON)
                .add(ModBlocks.PINE_FENCE)
                .add(ModBlocks.PINE_FENCE_GATE)
                .add(ModBlocks.PINE_DOOR)
                .add(ModBlocks.PINE_TRAPDOOR)
                .add(ModBlocks.PINE_PRESSURE_PLATE)
                .add(ModBlocks.PINE_SIGN)
                .add(ModBlocks.WALL_PINE_SIGN)
                .add(ModBlocks.HANGING_PINE_SIGN)
                .add(ModBlocks.WALL_HANGING_PINE_SIGN)
                .add(ModBlocks.SMALL_CHEST);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS);

        /*getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.PINE_LOG)
                .add(ModBlocks.STRIPPED_PINE_LOG)
                .add(ModBlocks.PINE_WOOD)
                .add(ModBlocks.STRIPPED_PINE_WOOD);*/

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.PINE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PINE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CALCITE_WALL)
                .add(ModBlocks.DIORITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_DIORITE_BRICK_WALL)
                .add(ModBlocks.ANDESITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_ANDESITE_BRICK_WALL)
                .add(ModBlocks.GRANITE_BRICK_WALL)
                .add(ModBlocks.MOSSY_GRANITE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG)
                .add(ModBlocks.PINE_WOOD)
                .add(ModBlocks.STRIPPED_PINE_LOG)
                .add(ModBlocks.STRIPPED_PINE_WOOD);
    }
}