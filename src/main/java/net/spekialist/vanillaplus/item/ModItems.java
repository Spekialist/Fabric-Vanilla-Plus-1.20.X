package net.spekialist.vanillaplus.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.VanillaPlus;
import net.spekialist.vanillaplus.block.ModBlocks;
import net.spekialist.vanillaplus.entity.ModBoats;

public class ModItems {
    public static final Item BIG_AMETHYST = registerItem("big_amethyst",
            new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));

    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item WHEAT_DOUGH = registerItem("wheat_dough",
            new Item(new FabricItemSettings().food(ModFoodComponents.WHEAT_DOUGH)));
    public static final Item DUMPLINGS = registerItem("dumplings",
            new Item(new FabricItemSettings().food(ModFoodComponents.DUMPLINGS)));
    public static final Item APPLE_PIE_SLICE = registerItem("apple_pie_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE_SLICE)));
    public static final Item CHOCOLATE_PIE_SLICE = registerItem("chocolate_pie_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE_PIE_SLICE)));
    public static final Item SWEET_BERRY_CHEESECAKE_SLICE = registerItem("sweet_berry_cheesecake_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_CHEESECAKE_SLICE)));
    public static final Item BACON_SANDWICH = registerItem("bacon_sandwich",
            new Item(new FabricItemSettings().food(ModFoodComponents.BACON_SANDWICH)));
    public static final Item CHICKEN_SANDWICH = registerItem("chicken_sandwich",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHICKEN_SANDWICH)));
    public static final Item MINCED_BEEF = registerItem("minced_beef",
            new Item(new FabricItemSettings().food(ModFoodComponents.MINCED_BEEF)));
    public static final Item BEEF_PATTY = registerItem("beef_patty",
            new Item(new FabricItemSettings().food(ModFoodComponents.BEEF_PATTY)));
    public static final Item CABBAGE = registerItem("cabbage",
            new Item(new FabricItemSettings().food(ModFoodComponents.CABBAGE)));
    public static final Item CABBAGE_LEAF = registerItem("cabbage_leaf",
            new Item(new FabricItemSettings().food(ModFoodComponents.CABBAGE_LEAF)));
    public static final Item COD_ROLL = registerItem("cod_roll",
            new Item(new FabricItemSettings().food(ModFoodComponents.COD_ROLL)));
    public static final Item COD_SLICE = registerItem("cod_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.COD_SLICE)));
    public static final Item COOKED_COD_SLICE = registerItem("cooked_cod_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_COD_SLICE)));
    public static final Item RICE = registerItem("rice",
            new Item(new FabricItemSettings()));
    public static final Item COOKED_RICE = registerItem("cooked_rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_RICE)));
    public static final Item SALMON_SLICE = registerItem("salmon_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.SALMON_SLICE)));
    public static final Item COOKED_SALMON_SLICE = registerItem("cooked_salmon_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_SALMON_SLICE)));
    public static final Item SALMON_ROLL = registerItem("salmon_roll",
            new Item(new FabricItemSettings().food(ModFoodComponents.SALMON_ROLL)));
    public static final Item EGG_SANDWICH = registerItem("egg_sandwich",
            new Item(new FabricItemSettings().food(ModFoodComponents.EGG_SANDWICH)));
    public static final Item GRAPE = registerItem("grape",
            new Item(new FabricItemSettings().food(ModFoodComponents.GRAPE)));
    public static final Item GRILLED_SALMON = registerItem("grilled_salmon",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.GRILLED_SALMON)));
    public static final Item KELP_ROLL = registerItem("kelp_roll",
            new Item(new FabricItemSettings()));
    public static final Item KELP_ROLL_SLICE = registerItem("kelp_roll_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.KELP_ROLL_SLICE)));
    public static final Item PASTA_WITH_MEATBALLS = registerItem("pasta_with_meatballs",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.PASTA_WITH_MEATBALLS)));
    public static final Item PINEAPPLE = registerItem("pineapple",
            new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item PUMPKIN_PIE_SLICE = registerItem("pumpkin_pie_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.PUMPKIN_PIE_SLICE)));
    public static final Item RATATOUILLE = registerItem("ratatouille",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.RATATOUILLE)));
    public static final Item RAW_PASTA = registerItem("raw_pasta",
            new Item(new FabricItemSettings()));
    public static final Item STEAK_AND_POTATOES = registerItem("steak_and_potatoes",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.STEAK_AND_POTATOES)));
    public static final Item STUFFED_POTATO = registerItem("stuffed_potato",
            new Item(new FabricItemSettings().food(ModFoodComponents.STUFFED_POTATO)));
    public static final Item STUFFED_PUMPKIN = registerItem("stuffed_pumpkin",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.STUFFED_PUMPKIN)));

    public static final Item COOKED_MUSHROOM = registerItem("cooked_mushroom",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_MUSHROOM)));
    public static final Item BACON = registerItem("bacon",
            new Item(new FabricItemSettings().food(ModFoodComponents.BACON)));
    public static final Item COOKED_BACON = registerItem("cooked_bacon",
            new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_BACON)));
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item BACON_AND_EGGS = registerItem("bacon_and_eggs",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BACON_AND_EGGS)));
    public static final Item BARBECUE_STICK = registerItem("barbecue_stick",
            new Item(new FabricItemSettings().food(ModFoodComponents.BARBECUE_STICK)));
    public static final Item SHRIMP = registerItem("shrimp",
            new Item(new FabricItemSettings().food(ModFoodComponents.SHRIMP)));

    public static final Item CARAMEL = registerItem("caramel",
            new Item(new FabricItemSettings().food(ModFoodComponents.CARAMEL)));
    public static final Item CHOCOLATE = registerItem("chocolate",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATE)));
    public static final Item SWEET_BERRY_COOKIE = registerItem("sweet_berry_cookie",
            new Item(new FabricItemSettings().food(ModFoodComponents.SWEET_BERRY_COOKIE)));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().food(ModFoodComponents.CORN)));
    public static final Item ONION = registerItem("onion",
            new Item(new FabricItemSettings().food(ModFoodComponents.ONION)));
    public static final Item CHERRY = registerItem("cherry",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHERRY)));
    public static final Item APRICOT = registerItem("apricot",
            new Item(new FabricItemSettings().food(ModFoodComponents.APRICOT)));
    public static final Item COCONUT = registerItem("coconut",
            new Item(new FabricItemSettings().food(ModFoodComponents.COCONUT)));
    public static final Item ORANGE = registerItem("orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item PEACH = registerItem("peach",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEACH)));
    public static final Item ROTTEN_APPLE = registerItem("rotten_apple",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROTTEN_APPLE)));
    public static final Item ROTTEN_ORANGE = registerItem("rotten_orange",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROTTEN_ORANGE)));
    public static final Item ROTTEN_PEACH = registerItem("rotten_peach",
            new Item(new FabricItemSettings().food(ModFoodComponents.ROTTEN_PEACH)));
    public static final Item PEPPER = registerItem("pepper",
            new Item(new FabricItemSettings().food(ModFoodComponents.PEPPER)));
    public static final Item RADISH = registerItem("radish",
            new Item(new FabricItemSettings().food(ModFoodComponents.RADISH)));
    public static final Item PUMPKIN_SLICE = registerItem("pumpkin_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.PUMPKIN_SLICE)));

    public static final Item NETHER_SALAD = registerItem("nether_salad",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.NETHER_SALAD)));
    public static final Item MIXED_SALAD = registerItem("mixed_salad",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.MIXED_SALAD)));
    public static final Item FRUIT_SALAD = registerItem("fruit_salad",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.FRUIT_SALAD)));
    public static final Item FISH_STEW = registerItem("fish_stew",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.FISH_STEW)));
    public static final Item BEEF_STEW = registerItem("beef_stew",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BEEF_STEW)));
    public static final Item BAKED_COD_STEW = registerItem("baked_cod_stew",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BAKED_COD_STEW)));
    public static final Item NOODLE_SOUP = registerItem("noodle_soup",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.NOODLE_SOUP)));
    public static final Item PUMPKIN_SOUP = registerItem("pumpkin_soup",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.PUMPKIN_SOUP)));
    public static final Item VEGETABLE_SOUP = registerItem("vegetable_soup",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.VEGETABLE_SOUP)));
    public static final Item CHICKEN_SOUP = registerItem("chicken_soup",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.CHICKEN_SOUP)));
    public static final Item BONE_BROTH = registerItem("bone_broth",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BONE_BROTH)));
    public static final Item TOMATO_SAUCE = registerItem("tomato_sauce",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.TOMATO_SAUCE)));
    public static final Item BEETROOT_SALAD = registerItem("beetroot_salad",
            new StewItem(new FabricItemSettings().maxCount(1).food(ModFoodComponents.BEETROOT_SALAD)));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL, 1, -2.6f,  new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL, 6.2f, -3,  new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL, 1.6f, -2.9f,  new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL, 3, -2.2f,  new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL, -1, -0.9f,  new FabricItemSettings()));

    public static final Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET,  new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE,  new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS,  new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS,  new FabricItemSettings()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));

    public static final Item PINE_SIGN = registerItem("pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.PINE_SIGN, ModBlocks.WALL_PINE_SIGN));
    public static final Item HANGING_PINE_SIGN = registerItem("pine_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_PINE_SIGN, ModBlocks.WALL_HANGING_PINE_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item PINE_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.PINE_BOAT_ID, ModBoats.PINE_BOAT_KEY, false);
    public static final Item PINE_BOAT_WITH_CHEST = TerraformBoatItemHelper.registerBoatItem(ModBoats.PINE_BOAT_WITH_CHEST_ID, ModBoats.PINE_BOAT_KEY, true);

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VanillaPlus.LOGGER.info("Registering Mod Items for " + VanillaPlus.MOD_ID);
    }
}
