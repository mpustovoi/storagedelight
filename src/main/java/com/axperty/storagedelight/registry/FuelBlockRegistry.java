package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class FuelBlockRegistry {

    public static void register() {
        StorageDelight.LOGGER.info("Registering furniture fuels for " + StorageDelight.MOD_ID);

        // Oak
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_OAK_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_OAK_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Birch
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_BIRCH_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_BIRCH_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Spruce
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_SPRUCE_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_SPRUCE_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Jungle
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_JUNGLE_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_JUNGLE_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Acacia
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_ACACIA_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_ACACIA_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Dark Oak
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_DARK_OAK_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_DARK_OAK_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Mangrove
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_MANGROVE_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_MANGROVE_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Cherry
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_CHERRY_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_CHERRY_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);

        // Bamboo
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_DRAWER, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.SMALL_BAMBOO_DRAWERS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.GLASS_BAMBOO_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP, 300);
        FuelRegistry.INSTANCE.add(BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP, 300);
    }
}