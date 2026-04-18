package com.axperty.storagedelight.compat.everycompat;

import com.axperty.storagedelight.StorageDelight;
import net.neoforged.fml.InterModComms;
import net.neoforged.fml.ModList;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;


public final class WoodGoodCompat {
    private static final String EVERYCOMP_MOD_ID = "everycomp";
    private static final String WOODGOOD_LEGACY_MOD_ID = "woodgood";

    private WoodGoodCompat() {
    }

    public static void enqueueImc(InterModEnqueueEvent event) {
        if (ModList.get().isLoaded(EVERYCOMP_MOD_ID)) {
            sendModuleMessages(EVERYCOMP_MOD_ID);
            StorageDelight.LOGGER.info("Enabled Every Compat (Wood Good) compatibility via mod ID '{}'", EVERYCOMP_MOD_ID);
            return;
        }

        if (ModList.get().isLoaded(WOODGOOD_LEGACY_MOD_ID)) {
            sendModuleMessages(WOODGOOD_LEGACY_MOD_ID);
            StorageDelight.LOGGER.info("Enabled Every Compat (Wood Good) compatibility via legacy mod ID '{}'", WOODGOOD_LEGACY_MOD_ID);
        }
    }

    private static void sendModuleMessages(String targetModId) {
        // Primary IMC channel used by Every Compat (Wood Good).
        InterModComms.sendTo(targetModId, "add_module", () -> StorageDelight.MOD_ID);

        // Backward-compatible alias for older builds expecting a different key.
        InterModComms.sendTo(targetModId, "add_compat_mod", () -> StorageDelight.MOD_ID);
    }
}