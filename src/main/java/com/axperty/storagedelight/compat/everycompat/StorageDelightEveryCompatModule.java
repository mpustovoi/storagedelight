package com.axperty.storagedelight.compat.everycompat;

import com.axperty.storagedelight.registry.BlockRegistry;
import net.mehvahdjukaar.every_compat.api.PaletteStrategies;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.minecraft.world.level.block.Block;

import java.util.Locale;

/**
 * Every Compat (Wood Good) module for Storage Delight.
 * Generates Storage Delight blocks for all available wood types via Every Compat (Wood Good).
 */
public class StorageDelightEveryCompatModule extends SimpleModule {

    public StorageDelightEveryCompatModule(String modId) {
        super(modId, "sd");

        // Drawers
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawer", "",
                () -> BlockRegistry.OAK_DRAWER.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "drawer"))
                .addTile("drawer")
                .addTexture(modRes("block/oak_drawer_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Drawer with Door
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawer_door", "",
                () -> BlockRegistry.OAK_DRAWER_WITH_DOOR.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "drawer_door"))
                .addTile("drawer_door")
                .addTexture(modRes("block/oak_drawer_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Drawer with Books
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "drawer_books", "",
                () -> BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "drawer_books"))
                .addTile("drawer_books")
                .addTexture(modRes("block/oak_drawer_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Small Drawers
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "small_drawers", "",
                () -> BlockRegistry.SMALL_OAK_DRAWERS.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "small_drawers"))
                .addTile("small_drawers")
                .addTexture(modRes("block/small_oak_drawers_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Bookshelf with Door
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "bookshelf_door", "",
                () -> BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "bookshelf_door"))
                .addTile("bookshelf_door")
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Glass Cabinet
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "glass_cabinet", "",
                () -> BlockRegistry.GLASS_OAK_CABINET.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "glass_cabinet"))
                .addTile("glass_cabinet")
                .addTexture(modRes("block/glass_oak_cabinet_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Cabinet with Glass Doors
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet_glass_doors", "",
                () -> BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "cabinet_glass_doors"))
                .addTile("cabinet_variant")
                .addTexture(modRes("block/oak_cabinet_with_glass_doors_front"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Single Door Cabinet
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "single_door_cabinet", "",
                () -> BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "single_door_cabinet"))
                .addTile("cabinet_variant")
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());

        // Cabinet with Countertop
        this.addEntry(SimpleEntrySet.builder(WoodType.class, "cabinet_countertop", "",
                () -> BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(), () -> VanillaWoodTypes.OAK,
                w -> getBlockByWoodType(w, "cabinet_countertop"))
                .addTile("countertop")
                .addTexture(modRes("block/oak_cabinet_top"), PaletteStrategies.PLANKS_STANDARD)
                .addTexture(modRes("block/oak_cabinet_side"), PaletteStrategies.PLANKS_STANDARD)
                .setTabKey(modRes("storagedelight"))
                .defaultRecipe()
                .build());
    }

    private Block getBlockByWoodType(WoodType woodType, String blockType) {
        String woodName = woodType.getTypeName().toUpperCase(Locale.ROOT);

        return switch (blockType) {
            case "drawer" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_DRAWER.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_DRAWER.get();
                case "BIRCH" -> BlockRegistry.BIRCH_DRAWER.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_DRAWER.get();
                case "ACACIA" -> BlockRegistry.ACACIA_DRAWER.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_DRAWER.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_DRAWER.get();
                case "CHERRY" -> BlockRegistry.CHERRY_DRAWER.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_DRAWER.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_DRAWER.get();
                case "WARPED" -> BlockRegistry.WARPED_DRAWER.get();
                default -> BlockRegistry.OAK_DRAWER.get();
            };
            case "drawer_door" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_DRAWER_WITH_DOOR.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get();
                case "BIRCH" -> BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get();
                case "ACACIA" -> BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get();
                case "CHERRY" -> BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get();
                case "WARPED" -> BlockRegistry.WARPED_DRAWER_WITH_DOOR.get();
                default -> BlockRegistry.OAK_DRAWER_WITH_DOOR.get();
            };
            case "drawer_books" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_DRAWER_WITH_BOOKS.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get();
                case "BIRCH" -> BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get();
                case "ACACIA" -> BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get();
                case "CHERRY" -> BlockRegistry.CHERRY_DRAWER_WITH_BOOKS.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_DRAWER_WITH_BOOKS.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get();
                case "WARPED" -> BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get();
                default -> BlockRegistry.OAK_DRAWER_WITH_BOOKS.get();
            };
            case "small_drawers" -> switch (woodName) {
                case "OAK" -> BlockRegistry.SMALL_OAK_DRAWERS.get();
                case "SPRUCE" -> BlockRegistry.SMALL_SPRUCE_DRAWERS.get();
                case "BIRCH" -> BlockRegistry.SMALL_BIRCH_DRAWERS.get();
                case "JUNGLE" -> BlockRegistry.SMALL_JUNGLE_DRAWERS.get();
                case "ACACIA" -> BlockRegistry.SMALL_ACACIA_DRAWERS.get();
                case "DARK_OAK" -> BlockRegistry.SMALL_DARK_OAK_DRAWERS.get();
                case "MANGROVE" -> BlockRegistry.SMALL_MANGROVE_DRAWERS.get();
                case "CHERRY" -> BlockRegistry.SMALL_CHERRY_DRAWERS.get();
                case "BAMBOO" -> BlockRegistry.SMALL_BAMBOO_DRAWERS.get();
                case "CRIMSON" -> BlockRegistry.SMALL_CRIMSON_DRAWERS.get();
                case "WARPED" -> BlockRegistry.SMALL_WARPED_DRAWERS.get();
                default -> BlockRegistry.SMALL_OAK_DRAWERS.get();
            };
            case "bookshelf_door" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR.get();
                case "BIRCH" -> BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR.get();
                case "ACACIA" -> BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR.get();
                case "CHERRY" -> BlockRegistry.CHERRY_BOOKSHELF_WITH_DOOR.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_BOOKSHELF_WITH_DOOR.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR.get();
                case "WARPED" -> BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR.get();
                default -> BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get();
            };
            case "glass_cabinet" -> switch (woodName) {
                case "OAK" -> BlockRegistry.GLASS_OAK_CABINET.get();
                case "SPRUCE" -> BlockRegistry.GLASS_SPRUCE_CABINET.get();
                case "BIRCH" -> BlockRegistry.GLASS_BIRCH_CABINET.get();
                case "JUNGLE" -> BlockRegistry.GLASS_JUNGLE_CABINET.get();
                case "ACACIA" -> BlockRegistry.GLASS_ACACIA_CABINET.get();
                case "DARK_OAK" -> BlockRegistry.GLASS_DARK_OAK_CABINET.get();
                case "MANGROVE" -> BlockRegistry.GLASS_MANGROVE_CABINET.get();
                case "CHERRY" -> BlockRegistry.GLASS_CHERRY_CABINET.get();
                case "BAMBOO" -> BlockRegistry.GLASS_BAMBOO_CABINET.get();
                case "CRIMSON" -> BlockRegistry.GLASS_CRIMSON_CABINET.get();
                case "WARPED" -> BlockRegistry.GLASS_WARPED_CABINET.get();
                default -> BlockRegistry.GLASS_OAK_CABINET.get();
            };
            case "cabinet_glass_doors" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get();
                case "BIRCH" -> BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get();
                case "ACACIA" -> BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get();
                case "CHERRY" -> BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get();
                case "WARPED" -> BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get();
                default -> BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get();
            };
            case "single_door_cabinet" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_SINGLE_DOOR_CABINET.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get();
                case "BIRCH" -> BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get();
                case "ACACIA" -> BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get();
                case "CHERRY" -> BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get();
                case "WARPED" -> BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get();
                default -> BlockRegistry.OAK_SINGLE_DOOR_CABINET.get();
            };
            case "cabinet_countertop" -> switch (woodName) {
                case "OAK" -> BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "SPRUCE" -> BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "BIRCH" -> BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "JUNGLE" -> BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "ACACIA" -> BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "DARK_OAK" -> BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "MANGROVE" -> BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "CHERRY" -> BlockRegistry.CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "BAMBOO" -> BlockRegistry.BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "CRIMSON" -> BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                case "WARPED" -> BlockRegistry.WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
                default -> BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get();
            };
            default -> BlockRegistry.OAK_DRAWER.get();
        };
    }
}

