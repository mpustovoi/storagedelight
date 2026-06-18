package com.axperty.storagedelight.compat.aeronautics;

import com.axperty.storagedelight.registry.EntityTypesRegistry;
import net.minecraft.world.Container;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.items.wrapper.InvWrapper;

public class AeronauticsCompat {
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.DRAWER.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.DRAWER_DOOR.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.DRAWER_BOOKS.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.GLASS_CABINET.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.CABINET_VARIANT.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.BOOKSHELF_DOOR.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.SMALL_DRAWERS.get(), (be, dir) -> new InvWrapper((Container) be));
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EntityTypesRegistry.COUNTERTOP.get(), (be, dir) -> new InvWrapper((Container) be));
    }
}
