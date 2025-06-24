package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.*;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StorageDelight.MOD_ID)
public final class StorageDelight {
    public static final String MOD_ID = "storagedelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StorageDelight(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        ItemRegistry.ITEMS.register(modBusGroup);
        BlockRegistry.BLOCKS.register(modBusGroup);
        EntityTypesRegistry.TILES.register(modBusGroup);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modBusGroup);
    }
}
