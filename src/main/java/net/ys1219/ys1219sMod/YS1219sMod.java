package net.ys1219.ys1219sMod;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.*;
@Mod(YS1219sMod.MODID)
public class YS1219sMod {
    public static final String MODID = "ys1219s-mod";
    public YS1219sMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        this.registerCommonEvents(modEventBus);
    }
    public void registerCommonEvents(IEventBus eventBus) {
        // todo: register common events
    }
}