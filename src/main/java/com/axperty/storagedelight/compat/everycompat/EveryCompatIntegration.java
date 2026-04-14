package com.axperty.storagedelight.compat.everycompat;

import com.axperty.storagedelight.StorageDelight;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;

/**
 * EveryCompat registration handler for Storage Delight.
 * Automatically registers the mod's blocks with EveryCompat when present.
 */
public final class EveryCompatIntegration {

    private static final String EVERYCOMP_MOD_ID = "everycomp";

    private EveryCompatIntegration() {
    }

    /**
     * Called during InterModEnqueueEvent to register Storage Delight with EveryCompat.
     */
    public static void onEnqueueIMC(InterModEnqueueEvent event) {
        if (!ModList.get().isLoaded(EVERYCOMP_MOD_ID)) {
            return;
        }

        try {
            // Register the Storage Delight module with EveryCompat API
            EveryCompatAPI.registerModule(new StorageDelightEveryCompatModule(StorageDelight.MOD_ID));
            StorageDelight.LOGGER.info("Successfully registered Storage Delight module with EveryCompat");
        } catch (Exception e) {
            StorageDelight.LOGGER.error("Failed to register Storage Delight with EveryCompat", e);
        }
    }
}

