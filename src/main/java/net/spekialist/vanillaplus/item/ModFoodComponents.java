package net.spekialist.vanillaplus.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build();
    public static final FoodComponent WHEAT_DOUGH = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent DUMPLINGS = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent APPLE_PIE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CHOCOLATE_PIE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent SWEET_BERRY_CHEESECAKE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent BACON_SANDWICH = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CHICKEN_SANDWICH = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent MINCED_BEEF = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent BEEF_PATTY = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CABBAGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CABBAGE_LEAF = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent COD_ROLL = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent COD_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_COD_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_RICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent SALMON_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_SALMON_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent SALMON_ROLL = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent EGG_SANDWICH = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent GRILLED_SALMON = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent KELP_ROLL_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PASTA_WITH_MEATBALLS = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PUMPKIN_PIE_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent RATATOUILLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent STEAK_AND_POTATOES = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent STUFFED_POTATO = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent STUFFED_PUMPKIN = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();

    public static final FoodComponent COOKED_MUSHROOM = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent BACON = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent COOKED_BACON = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent BACON_AND_EGGS = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();
    public static final FoodComponent BARBECUE_STICK = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();
    public static final FoodComponent SHRIMP = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();

    public static final FoodComponent CARAMEL = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).build();
    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).build();
    public static final FoodComponent SWEET_BERRY_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build();

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).build();
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent APRICOT = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent COCONUT = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PEACH = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent ROTTEN_APPLE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 1).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 0.6f).build();
    public static final FoodComponent ROTTEN_ORANGE = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 1).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 0.6f).build();
    public static final FoodComponent ROTTEN_PEACH = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 1).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 0.6f).build();
    public static final FoodComponent PEPPER = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent RADISH = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PUMPKIN_SLICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();

    public static final FoodComponent NETHER_SALAD = createStew(6).build();
    public static final FoodComponent MIXED_SALAD = createStew(6).build();
    public static final FoodComponent FRUIT_SALAD = createStew(5).build();
    public static final FoodComponent FISH_STEW = createStew(6).build();
    public static final FoodComponent BEEF_STEW = createStew(6).build();
    public static final FoodComponent BAKED_COD_STEW = createStew(6).build();
    public static final FoodComponent NOODLE_SOUP = createStew(6).build();
    public static final FoodComponent PUMPKIN_SOUP = createStew(6).build();
    public static final FoodComponent VEGETABLE_SOUP = createStew(6).build();
    public static final FoodComponent CHICKEN_SOUP = createStew(6).build();
    public static final FoodComponent BONE_BROTH = createStew(6).build();
    public static final FoodComponent TOMATO_SAUCE = createStew(6).build();
    public static final FoodComponent BEETROOT_SALAD = createStew(6).build();

    private static FoodComponent.Builder createStew(int hunger) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(0.6f);
    }

}