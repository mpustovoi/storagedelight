package com.axperty.storagedelight.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabRegistry
{
    public static final CreativeModeTab STORAGEDELIGHT_TAB = new CreativeModeTab("storagedelight") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.OAK_DRAWER.get());
        }
    };
}