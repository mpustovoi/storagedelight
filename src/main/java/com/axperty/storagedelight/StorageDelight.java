package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.EntityTypesRegistry;
import com.axperty.storagedelight.registry.CreativeTabRegistry;
import com.axperty.storagedelight.registry.BlockRegistry;
import com.axperty.storagedelight.registry.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StorageDelight.MOD_ID)
public class StorageDelight {
    public static final String MOD_ID = "storagedelight";

    public StorageDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.BLOCKS.register(modEventBus);
        EntityTypesRegistry.TILES.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
