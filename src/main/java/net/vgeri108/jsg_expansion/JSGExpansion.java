package net.vgeri108.jsg_expansion;

import dev.tauri.jsgcore.JSGAddon;
import dev.tauri.jsgcore.JSGAddons;
import net.vgeri108.jsg_expansion.block.ModBlocks;
import net.vgeri108.jsg_expansion.item.ModCreativeModTabs;
import net.vgeri108.jsg_expansion.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(JSGExpansion.MOD_ID)
public class JSGExpansion implements JSGAddon {
    public static final String MOD_ID = "jsg_expansion";

    public JSGExpansion(IEventBus modEventBus) {
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        JSGAddons.registerAddon(this);
    }

    @Override
    public String getName() {
        return "JSG Expansion";
    }

    @Override
    public String getId() {
        return "jsg_expansion";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }
}
