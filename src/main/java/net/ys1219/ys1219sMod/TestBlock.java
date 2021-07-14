package net.ys1219.ys1219sMod;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.*;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.event.lifecycle.*;

public class TestBlock extends Block {
    public TestBlock() {
        super(Block.Properties.of(Material.STONE));
    }
    public static class StartupCommon {
        public static TestBlock testBlock;
        public static BlockItem itemTestBlock;
        @SubscribeEvent
        public static void onBlocksRegistration(final RegistryEvent.Register<Block> blockRegisterEvent) {
            testBlock = (TestBlock)(new TestBlock().setRegistryName("ys1219s_mod", "test_block"));
            blockRegisterEvent.getRegistry().register(testBlock);
        }
        @SubscribeEvent
        public static void onItemsRegistration(final RegistryEvent.Register<Item> itemRegisterEvent) {
            Item.Properties properties = new Item.Properties().stacksTo(64).tab(ItemGroup.TAB_BUILDING_BLOCKS);
            itemTestBlock = new BlockItem(testBlock, properties);
            itemTestBlock.setRegistryName(testBlock.getRegistryName());
            itemRegisterEvent.getRegistry().register(itemTestBlock);
        }
    }
    public static class StartupClientOnly {
        @SubscribeEvent
        public static void onClientSetupEvent(FMLClientSetupEvent event) {
            RenderTypeLookup.setRenderLayer(StartupCommon.testBlock, RenderType.solid());
        }
    }
}
