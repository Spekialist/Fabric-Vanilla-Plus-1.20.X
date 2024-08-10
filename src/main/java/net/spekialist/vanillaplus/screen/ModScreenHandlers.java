package net.spekialist.vanillaplus.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.spekialist.vanillaplus.VanillaPlus;

public class ModScreenHandlers {
    public static final ScreenHandlerType<ImprovedSmelterScreenHandler> IMPROVED_SMELTER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(VanillaPlus.MOD_ID, "improved_smelter"),
                    new ExtendedScreenHandlerType<>(ImprovedSmelterScreenHandler::new));

    public static final ScreenHandlerType<StoveScreenHandler> STOVE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(VanillaPlus.MOD_ID, "stove"),
                    new ExtendedScreenHandlerType<>(StoveScreenHandler::new));

    public static final ScreenHandlerType<SmallChestScreenHandler> SMALL_CHEST_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(VanillaPlus.MOD_ID, "small_chest"),
                    new ExtendedScreenHandlerType<>(SmallChestScreenHandler::new));

    public static void registerScreenHandlers() {
        VanillaPlus.LOGGER.info("Registering Screen Handlers for " + VanillaPlus.MOD_ID);
    }
}
