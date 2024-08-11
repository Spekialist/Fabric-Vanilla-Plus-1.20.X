package net.spekialist.vanillaplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;
import net.spekialist.vanillaplus.block.ModBlocks;
import net.spekialist.vanillaplus.block.custom.CornCropBlock;
import net.spekialist.vanillaplus.block.custom.TomatoCropBlock;
import net.spekialist.vanillaplus.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool calcite_Pool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CALCITE);

        BlockStateModelGenerator.BlockTexturePool diorite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossy_diorite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_DIORITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool andesite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossy_andesite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_ANDESITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_ANDESITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool granite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool mossy_granite_bricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_GRANITE_BRICKS);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.DACITE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.POLISHED_DACITE, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        BlockStateModelGenerator.BlockTexturePool pine_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINE_PLANKS);

        BlockStateModelGenerator.BlockTexturePool terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool white_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool light_gray_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool gray_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool black_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool brown_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool red_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool orange_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool yellow_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool lime_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool green_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool cyan_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool light_blue_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool blue_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool purple_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool magenta_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_TERRACOTTA);
        BlockStateModelGenerator.BlockTexturePool pink_terracottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_TERRACOTTA);

        BlockStateModelGenerator.BlockTexturePool white_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool light_gray_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool gray_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool black_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool brown_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool red_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool orange_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool yellow_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool lime_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool green_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool cyan_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool light_blue_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool blue_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool purple_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool magenta_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);
        BlockStateModelGenerator.BlockTexturePool pink_concretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);

        calcite_Pool.stairs(ModBlocks.CALCITE_STAIRS);
        calcite_Pool.slab(ModBlocks.CALCITE_SLAB);
        calcite_Pool.wall(ModBlocks.CALCITE_WALL);

        diorite_bricksPool.stairs(ModBlocks.DIORITE_BRICK_STAIRS);
        mossy_diorite_bricksPool.stairs(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS);
        diorite_bricksPool.slab(ModBlocks.DIORITE_BRICK_SLAB);
        mossy_diorite_bricksPool.slab(ModBlocks.MOSSY_DIORITE_BRICK_SLAB);
        diorite_bricksPool.wall(ModBlocks.DIORITE_BRICK_WALL);
        mossy_diorite_bricksPool.wall(ModBlocks.MOSSY_DIORITE_BRICK_WALL);

        andesite_bricksPool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        mossy_andesite_bricksPool.stairs(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS);
        andesite_bricksPool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        mossy_andesite_bricksPool.slab(ModBlocks.MOSSY_ANDESITE_BRICK_SLAB);
        andesite_bricksPool.wall(ModBlocks.ANDESITE_BRICK_WALL);
        mossy_andesite_bricksPool.wall(ModBlocks.MOSSY_ANDESITE_BRICK_WALL);

        granite_bricksPool.stairs(ModBlocks.GRANITE_BRICK_STAIRS);
        mossy_granite_bricksPool.stairs(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS);
        granite_bricksPool.slab(ModBlocks.GRANITE_BRICK_SLAB);
        mossy_granite_bricksPool.slab(ModBlocks.MOSSY_GRANITE_BRICK_SLAB);
        granite_bricksPool.wall(ModBlocks.GRANITE_BRICK_WALL);
        mossy_granite_bricksPool.wall(ModBlocks.MOSSY_GRANITE_BRICK_WALL);

        pine_pool.stairs(ModBlocks.PINE_STAIRS);
        pine_pool.slab(ModBlocks.PINE_SLAB);
        pine_pool.button(ModBlocks.PINE_BUTTON);
        pine_pool.pressurePlate(ModBlocks.PINE_PRESSURE_PLATE);
        pine_pool.fence(ModBlocks.PINE_FENCE);
        pine_pool.fenceGate(ModBlocks.PINE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(ModBlocks.PINE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINE_TRAPDOOR);

        terracottaPool.stairs(ModBlocks.TERRACOTTA_STAIRS);
        terracottaPool.slab(ModBlocks.TERRACOTTA_SLAB);

        white_terracottaPool.stairs(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        white_terracottaPool.slab(ModBlocks.WHITE_TERRACOTTA_SLAB);

        light_gray_terracottaPool.stairs(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        light_gray_terracottaPool.slab(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);

        gray_terracottaPool.stairs(ModBlocks.GRAY_TERRACOTTA_STAIRS);
        gray_terracottaPool.slab(ModBlocks.GRAY_TERRACOTTA_SLAB);

        black_terracottaPool.stairs(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        black_terracottaPool.slab(ModBlocks.BLACK_TERRACOTTA_SLAB);

        brown_terracottaPool.stairs(ModBlocks.BROWN_TERRACOTTA_STAIRS);
        brown_terracottaPool.slab(ModBlocks.BROWN_TERRACOTTA_SLAB);

        red_terracottaPool.stairs(ModBlocks.RED_TERRACOTTA_STAIRS);
        red_terracottaPool.slab(ModBlocks.RED_TERRACOTTA_SLAB);

        orange_terracottaPool.stairs(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        orange_terracottaPool.slab(ModBlocks.ORANGE_TERRACOTTA_SLAB);

        yellow_terracottaPool.stairs(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
        yellow_terracottaPool.slab(ModBlocks.YELLOW_TERRACOTTA_SLAB);

        lime_terracottaPool.stairs(ModBlocks.LIME_TERRACOTTA_STAIRS);
        lime_terracottaPool.slab(ModBlocks.LIME_TERRACOTTA_SLAB);

        green_terracottaPool.stairs(ModBlocks.GREEN_TERRACOTTA_STAIRS);
        green_terracottaPool.slab(ModBlocks.GREEN_TERRACOTTA_SLAB);

        cyan_terracottaPool.stairs(ModBlocks.CYAN_TERRACOTTA_STAIRS);
        cyan_terracottaPool.slab(ModBlocks.CYAN_TERRACOTTA_SLAB);

        light_blue_terracottaPool.stairs(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        light_blue_terracottaPool.slab(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);

        blue_terracottaPool.stairs(ModBlocks.BLUE_TERRACOTTA_STAIRS);
        blue_terracottaPool.slab(ModBlocks.BLUE_TERRACOTTA_SLAB);

        purple_terracottaPool.stairs(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
        purple_terracottaPool.slab(ModBlocks.PURPLE_TERRACOTTA_SLAB);

        magenta_terracottaPool.stairs(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
        magenta_terracottaPool.slab(ModBlocks.MAGENTA_TERRACOTTA_SLAB);

        pink_terracottaPool.stairs(ModBlocks.PINK_TERRACOTTA_STAIRS);
        pink_terracottaPool.slab(ModBlocks.PINK_TERRACOTTA_SLAB);


        white_concretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        white_concretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);

        light_gray_concretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        light_gray_concretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);

        gray_concretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        gray_concretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);

        black_concretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        black_concretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);

        brown_concretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        brown_concretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);

        red_concretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        red_concretePool.slab(ModBlocks.RED_CONCRETE_SLAB);

        orange_concretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        orange_concretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);

        yellow_concretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        yellow_concretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);

        lime_concretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        lime_concretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);

        green_concretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        green_concretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);

        cyan_concretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        cyan_concretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);

        light_blue_concretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        light_blue_concretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);

        blue_concretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        blue_concretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);

        purple_concretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        purple_concretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);

        magenta_concretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        magenta_concretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);

        pink_concretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        pink_concretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7, 8);

        blockStateModelGenerator.registerSimpleState(ModBlocks.IMPROVED_SMELTER);
        blockStateModelGenerator.registerCooker(ModBlocks.STOVE, TexturedModel.ORIENTABLE_WITH_BOTTOM);

        blockStateModelGenerator.registerLog(ModBlocks.PINE_LOG).log(ModBlocks.PINE_LOG).wood(ModBlocks.PINE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PINE_LOG).log(ModBlocks.STRIPPED_PINE_LOG).wood(ModBlocks.STRIPPED_PINE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINE_LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINE_SAPLING, ModBlocks.POTTED_PINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIG_AMETHYST, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHEAT_DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUMPLINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.APPLE_PIE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE_PIE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_CHEESECAKE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACON_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINCED_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_PATTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.COD_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COD_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_COD_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SALMON_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.EGG_SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRILLED_SALMON, Models.GENERATED);
        itemModelGenerator.register(ModItems.KELP_ROLL, Models.GENERATED);
        itemModelGenerator.register(ModItems.KELP_ROLL_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PASTA_WITH_MEATBALLS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_PIE_SLICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RATATOUILLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PASTA, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEAK_AND_POTATOES, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUFFED_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUFFED_PUMPKIN, Models.GENERATED);

        itemModelGenerator.register(ModItems.COOKED_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_EGG, Models.GENERATED);
        itemModelGenerator.register(ModItems.BACON_AND_EGGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARBECUE_STICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHRIMP, Models.GENERATED);

        itemModelGenerator.register(ModItems.CARAMEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SWEET_BERRY_COOKIE, Models.GENERATED);

        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.APRICOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCONUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_ORANGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROTTEN_PEACH, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RADISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_SLICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHER_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIXED_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRUIT_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FISH_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAKED_COD_STEW, Models.GENERATED);
        itemModelGenerator.register(ModItems.NOODLE_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.VEGETABLE_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHICKEN_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.BONE_BROTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO_SAUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEETROOT_SALAD, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STEEL_BOOTS));

        itemModelGenerator.register(ModItems.PINE_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.HANGING_PINE_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.PINE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINE_BOAT_WITH_CHEST, Models.GENERATED);
    }
}
