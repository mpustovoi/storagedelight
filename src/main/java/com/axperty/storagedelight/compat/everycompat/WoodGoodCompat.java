package com.axperty.storagedelight.compat.everycompat;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.loader.api.FabricLoader;

public final class WoodGoodCompat {
    private static final String EVERYCOMP_MOD_ID = "everycomp";

    private WoodGoodCompat() {
    }

    /**
     * Checks for EveryCompat and registers the module if present.
     * Should be called during mod construction.
     */
    public static void init() {
        if (FabricLoader.getInstance().isModLoaded(EVERYCOMP_MOD_ID)) {
            EveryCompatIntegration.register();
            StorageDelight.LOGGER.info("Enabled Every Compat (Wood Good) compatibility.");
        } else {
            StorageDelight.LOGGER.info("Every Compat (Wood Good) not found, skipping compatibility.");
        }
    }
}