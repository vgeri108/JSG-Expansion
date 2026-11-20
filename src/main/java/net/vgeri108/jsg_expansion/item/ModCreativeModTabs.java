package net.vgeri108.jsg_expansion.item;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.vgeri108.jsg_expansion.block.ModBlocks;

public class ModCreativeModTabs {

    private static final ResourceLocation JSG_BUILDING_BLOCKS =
            ResourceLocation.fromNamespaceAndPath("jsg_core", "building_blocks");

    public static void register(IEventBus eventBus) {
        eventBus.addListener(ModCreativeModTabs::addItems);
    }

    private static void addItems(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().location().equals(JSG_BUILDING_BLOCKS)) {
            event.accept(ModBlocks.lemon_block.get());
        }
    }
}