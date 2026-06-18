package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.EntityTypesRegistry;
import com.axperty.storagedelight.registry.CreativeTabRegistry;
import com.axperty.storagedelight.registry.BlockRegistry;
import com.axperty.storagedelight.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StorageDelight.MOD_ID)
public class StorageDelight {
    public static final String MOD_ID = "storagedelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StorageDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegistry.ITEMS.register(modEventBus);
        BlockRegistry.BLOCKS.register(modEventBus);
        EntityTypesRegistry.TILES.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Storage Delight loaded");
    }
}
