package net.spekialist.vanillaplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.block.ModBlocks;
import net.spekialist.vanillaplus.item.ModItems;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
    private static final List<ItemConvertible> DIORITE_SMELTABLES = List.of(ModBlocks.DIORITE_BRICKS);
    private static final List<ItemConvertible> ANDESITE_SMELTABLES = List.of(ModBlocks.ANDESITE_BRICKS);
    private static final List<ItemConvertible> GRANITE_SMELTABLES = List.of(ModBlocks.GRANITE_BRICKS);
    private static final List<ItemConvertible> MUSHROOM_SMELTABLES = List.of(Items.BROWN_MUSHROOM);
    private static final List<ItemConvertible> EGG_SMELTABLES = List.of(Items.EGG);
    private static final List<ItemConvertible> BACON_SMELTABLES = List.of(ModItems.BACON);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerSmelting(exporter, DIORITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_DIORITE_BRICKS,
                0.7f, 200, "cracked_diorite_bricks");
        offerSmelting(exporter, ANDESITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_ANDESITE_BRICKS,
                0.7f, 200, "cracked_andesite_bricks");
        offerSmelting(exporter, GRANITE_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRACKED_GRANITE_BRICKS,
                0.7f, 200, "cracked_granite_bricks");
        offerSmelting(exporter, MUSHROOM_SMELTABLES, RecipeCategory.FOOD, ModItems.COOKED_MUSHROOM,
                0.35f, 200, "mushroom");
        offerSmelting(exporter, EGG_SMELTABLES, RecipeCategory.FOOD, ModItems.FRIED_EGG,
                0.35f, 200, "egg");
        offerSmelting(exporter, BACON_SMELTABLES, RecipeCategory.FOOD, ModItems.COOKED_BACON,
                0.35f, 200, "bacon");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BIG_AMETHYST)
                .pattern("##")
                .pattern("##")
                .input('#', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BIG_AMETHYST)));

        createStairsRecipe(ModBlocks.CALCITE_STAIRS, Ingredient.ofItems(Blocks.CALCITE))
                .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Ingredient.ofItems(Blocks.CALCITE))
                .criterion(hasItem(Blocks.CALCITE), conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.POLISHED_DIORITE)
                .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIORITE_BRICKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS)
                .input(ModBlocks.DIORITE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, convertBetween(ModBlocks.DIORITE_BRICKS, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICKS)
                .input(ModBlocks.DIORITE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                .offerTo(exporter, convertBetween(ModBlocks.DIORITE_BRICKS, Blocks.MOSS_BLOCK));
        createStairsRecipe(ModBlocks.DIORITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS))
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_DIORITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_DIORITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_ANDESITE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.DIORITE_BRICKS))
                .criterion(hasItem(ModBlocks.DIORITE_BRICKS), conditionsFromItem(ModBlocks.DIORITE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.MOSSY_DIORITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_DIORITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_DIORITE_BRICKS))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.POLISHED_ANDESITE)
                .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ANDESITE_BRICKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS)
                .input(ModBlocks.ANDESITE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, convertBetween(ModBlocks.ANDESITE_BRICKS, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICKS)
                .input(ModBlocks.ANDESITE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, convertBetween(ModBlocks.ANDESITE_BRICKS, Blocks.MOSS_BLOCK));
        createStairsRecipe(ModBlocks.ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_ANDESITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_ANDESITE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(ModBlocks.ANDESITE_BRICKS), conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.MOSSY_ANDESITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_ANDESITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_ANDESITE_BRICKS))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, 4)
                .pattern("##")
                .pattern("##")
                .input('#', Blocks.POLISHED_GRANITE)
                .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GRANITE_BRICKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS)
                .input(ModBlocks.GRANITE_BRICKS)
                .input(Blocks.VINE)
                .criterion(hasItem(Blocks.VINE), conditionsFromItem(Blocks.VINE))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                .offerTo(exporter, convertBetween(ModBlocks.GRANITE_BRICKS, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICKS)
                .input(ModBlocks.GRANITE_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .criterion(hasItem(Blocks.MOSS_BLOCK), conditionsFromItem(Blocks.MOSS_BLOCK))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                .offerTo(exporter, convertBetween(ModBlocks.GRANITE_BRICKS, Blocks.MOSS_BLOCK));
        createStairsRecipe(ModBlocks.GRANITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, Ingredient.ofItems(ModBlocks.MOSSY_GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_GRANITE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.GRANITE_BRICKS), conditionsFromItem(ModBlocks.GRANITE_BRICKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, Ingredient.ofItems(ModBlocks.MOSSY_GRANITE_BRICKS))
                .criterion(hasItem(ModBlocks.MOSSY_GRANITE_BRICKS), conditionsFromItem(ModBlocks.MOSSY_GRANITE_BRICKS))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_STAIRS, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB, Blocks.CALCITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_WALL, Blocks.CALCITE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, ModBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_STAIRS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, ModBlocks.DIORITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_SLAB, Blocks.POLISHED_DIORITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_STAIRS, ModBlocks.MOSSY_DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_SLAB, ModBlocks.MOSSY_DIORITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, ModBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICK_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_DIORITE_BRICK_WALL, ModBlocks.MOSSY_DIORITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.POLISHED_ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_STAIRS, ModBlocks.MOSSY_ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_SLAB, ModBlocks.MOSSY_ANDESITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANDESITE_BRICK_WALL, ModBlocks.MOSSY_ANDESITE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, ModBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_STAIRS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, ModBlocks.GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_SLAB, Blocks.POLISHED_GRANITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_STAIRS, ModBlocks.MOSSY_GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_SLAB, ModBlocks.MOSSY_GRANITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, ModBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICK_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRANITE_BRICK_WALL, ModBlocks.MOSSY_GRANITE_BRICKS);

        offerShapelessRecipe(exporter, ModBlocks.PINE_PLANKS, ModBlocks.PINE_LOG,"pine_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.PINE_PLANKS, ModBlocks.PINE_WOOD,"pine_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.PINE_PLANKS, ModBlocks.STRIPPED_PINE_LOG,"pine_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.PINE_PLANKS, ModBlocks.STRIPPED_PINE_WOOD,"pine_planks", 4);

        createStairsRecipe(ModBlocks.PINE_STAIRS, Ingredient.ofItems(ModBlocks.PINE_PLANKS))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_SLAB, Ingredient.ofItems(ModBlocks.PINE_PLANKS))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        offerShapelessRecipe(exporter, ModBlocks.PINE_BUTTON, ModBlocks.PINE_PLANKS,"pine_button", 1);
        offerPressurePlateRecipe(exporter, ModBlocks.PINE_PRESSURE_PLATE, ModBlocks.PINE_PLANKS);
        createFenceRecipe(ModBlocks.PINE_FENCE, Ingredient.ofItems(ModBlocks.PINE_PLANKS))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.PINE_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINE_PLANKS))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.PINE_DOOR, Ingredient.ofItems(ModBlocks.PINE_PLANKS))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.PINE_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINE_PLANKS))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        createSignRecipe(ModBlocks.PINE_SIGN, Ingredient.ofItems(ModBlocks.PINE_PLANKS, Items.STICK))
                .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                .offerTo(exporter);
        offerHangingSignRecipe(exporter, ModBlocks.HANGING_PINE_SIGN, ModBlocks.STRIPPED_PINE_LOG);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.PINE_LOG)
                .criterion(hasItem(ModBlocks.PINE_LOG), conditionsFromItem(ModBlocks.PINE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PINE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_PINE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_PINE_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_PINE_LOG), conditionsFromItem(ModBlocks.STRIPPED_PINE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_PINE_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('X', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('#', Items.STICK)
                .input('X', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                .pattern("X")
                .pattern("X")
                .pattern("#")
                .input('#', Items.STICK)
                .input('X', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .input('#', Items.STICK)
                .input('X', ModItems.STEEL_INGOT)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEEL_HOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SWEET_BERRY_COOKIE, 8)
                .pattern("#X#")
                .input('#', Items.WHEAT)
                .input('X', Items.SWEET_BERRIES)
                .criterion(hasItem(Items.WHEAT), conditionsFromItem(Items.WHEAT))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SWEET_BERRY_COOKIE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CARAMEL)
                .pattern("X#X")
                .pattern("#X#")
                .pattern("X#X")
                .input('#', Items.HONEY_BOTTLE)
                .input('X', Items.SUGAR)
                .criterion(hasItem(Items.HONEY_BOTTLE), conditionsFromItem(Items.HONEY_BOTTLE))
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CARAMEL)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BACON_AND_EGGS)
                .input(ModItems.COOKED_BACON, 2)
                .input(ModItems.FRIED_EGG, 2)
                .criterion(hasItem(ModItems.COOKED_BACON), conditionsFromItem(ModItems.COOKED_BACON))
                .criterion(hasItem(ModItems.FRIED_EGG), conditionsFromItem(ModItems.FRIED_EGG))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BACON_AND_EGGS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BARBECUE_STICK)
                .input(Items.STICK)
                .input(Items.COOKED_CHICKEN)
                .input(ModItems.TOMATO)
                .input(ModItems.ONION)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .criterion(hasItem(ModItems.ONION), conditionsFromItem(ModItems.ONION))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BARBECUE_STICK)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.NETHER_SALAD)
                .input(Items.CRIMSON_FUNGUS)
                .input(Items.WARPED_FUNGUS)
                .input(Items.BOWL)
                .criterion(hasItem(Items.CRIMSON_FUNGUS), conditionsFromItem(Items.CRIMSON_FUNGUS))
                .criterion(hasItem(Items.WARPED_FUNGUS), conditionsFromItem(Items.WARPED_FUNGUS))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHER_SALAD)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.FRUIT_SALAD)
                .input(Items.APPLE)
                .input(Items.SWEET_BERRIES)
                .input(Items.MELON_SLICE)
                .input(ModItems.PEACH)
                .input(Items.BOWL)
                .criterion(hasItem(Items.APPLE), conditionsFromItem(Items.APPLE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(hasItem(Items.MELON_SLICE), conditionsFromItem(Items.MELON_SLICE))
                .criterion(hasItem(ModItems.PEACH), conditionsFromItem(ModItems.PEACH))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FRUIT_SALAD)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.TOMATO_SAUCE)
                .input(ModItems.TOMATO, 6)
                .input(Items.BOWL)
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TOMATO_SAUCE)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GRILLED_SALMON)
                .input(ModItems.COOKED_SALMON_SLICE)
                .input(Items.SWEET_BERRIES)
                .input(ModItems.CABBAGE_LEAF)
                .input(Items.BOWL)
                .criterion(hasItem(ModItems.COOKED_SALMON_SLICE), conditionsFromItem(ModItems.COOKED_SALMON_SLICE))
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .criterion(hasItem(ModItems.CABBAGE_LEAF), conditionsFromItem(ModItems.CABBAGE_LEAF))
                .criterion(hasItem(Items.BOWL), conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GRILLED_SALMON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BACON_SANDWICH)
                .pattern(" X ")
                .pattern("#B%")
                .pattern(" X ")
                .input('X', Items.BREAD)
                .input('#', ModItems.TOMATO)
                .input('B', ModItems.COOKED_BACON)
                .input('%', ModItems.CABBAGE_LEAF)
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(ModItems.TOMATO), conditionsFromItem(ModItems.TOMATO))
                .criterion(hasItem(ModItems.COOKED_BACON), conditionsFromItem(ModItems.COOKED_BACON))
                .criterion(hasItem(ModItems.CABBAGE_LEAF), conditionsFromItem(ModItems.CABBAGE_LEAF))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.BACON_SANDWICH)));

    }
}
