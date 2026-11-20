package net.vgeri108.jsg_expansion.item;

import net.vgeri108.jsg_expansion.JSGExpansion;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JSGExpansion.MOD_ID);

    //public static final DeferredItem<Item> Forint1 = ITEMS.registerSimpleItem("lemon");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
