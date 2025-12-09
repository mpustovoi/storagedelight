package com.axperty.storagedelight;

import com.axperty.storagedelight.registry.*;
import net.fabricmc.api.ModInitializer;

public class StorageDelight implements ModInitializer {
	public static final String MOD_ID = "storagedelight";

	@Override
	public void onInitialize() {
        BlockRegistry.register();
        EntityTypesRegistry.register();
        FuelBlockRegistry.register();
        CreativeTabRegistry.register();
	}
}
