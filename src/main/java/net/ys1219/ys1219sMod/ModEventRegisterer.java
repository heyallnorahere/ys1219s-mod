package net.ys1219.ys1219sMod;

import net.minecraftforge.eventbus.api.*;

public class ModEventRegisterer {
    public ModEventRegisterer(IEventBus eventBus) {
        this.eventBus = eventBus;
    }
    public void registerCommonEvents() {
        this.eventBus.register(TestBlock.StartupCommon.class);
    }
    public void registerClientOnlyEvents() {
        this.eventBus.register(TestBlock.StartupClientOnly.class);
    }
    private final IEventBus eventBus;
}
