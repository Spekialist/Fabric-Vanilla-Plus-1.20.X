package net.spekialist.vanillaplus.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.VanillaPlus;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(VanillaPlus.MOD_ID, ImprovedSmelterRecipe.Serializer.ID),
                ImprovedSmelterRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(VanillaPlus.MOD_ID, ImprovedSmelterRecipe.Type.ID),
                ImprovedSmelterRecipe.Type.INSTANCE);

        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(VanillaPlus.MOD_ID, StoveRecipe.Serializer.ID),
                StoveRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(VanillaPlus.MOD_ID, StoveRecipe.Type.ID),
                StoveRecipe.Type.INSTANCE);
    }
}
