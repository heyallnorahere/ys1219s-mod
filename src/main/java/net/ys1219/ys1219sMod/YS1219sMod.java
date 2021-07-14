package net.ys1219.ys1219sMod;

import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.javafmlmod.*;

@Mod(YS1219sMod.MODID)
public class YS1219sMod {
    public static final String MODID = "ys1219s-mod";
    public YS1219sMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        final ModEventRegisterer eventRegisterer = new ModEventRegisterer(modEventBus);
        eventRegisterer.registerCommonEvents();
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> eventRegisterer::registerClientOnlyEvents);
    }
}