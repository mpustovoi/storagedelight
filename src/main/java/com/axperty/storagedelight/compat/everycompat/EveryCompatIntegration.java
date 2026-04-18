package com.axperty.storagedelight.compat.everycompat;

import com.axperty.storagedelight.StorageDelight;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;

/**
 * Every Compat (Wood Good) registration handler for Storage Delight.
 * Automatically registers the mod's blocks with Every Compat (Wood Good) when present.
 */
public final class EveryCompatIntegration {

    private EveryCompatIntegration() {
    }

    /**
     * Registers the Storage Delight module with Every Compat (Wood Good).
     * Must be called during mod construction, after EveryCompat presence is confirmed.
     */
    public static void register() {
        try {
            EveryCompatAPI.registerModule(new StorageDelightEveryCompatModule(StorageDelight.MOD_ID));
            StorageDelight.LOGGER.info("Successfully registered Storage Delight module with Every Compat (Wood Good)");
        } catch (Exception e) {
            StorageDelight.LOGGER.error("Failed to register Storage Delight with Every Compat (Wood Good)", e);
        }
    }
}
