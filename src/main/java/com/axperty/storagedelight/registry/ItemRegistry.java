package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.item.ModBlockItem;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum ItemRegistry {

    // Oak Furniture
    OAK_DRAWER("oak_drawer", () -> new ModBlockItem(BlockRegistry.OAK_DRAWER.get())),
    OAK_DRAWER_WITH_DOOR("oak_drawer_with_door", () -> new ModBlockItem(BlockRegistry.OAK_DRAWER_WITH_DOOR.get())),
    OAK_DRAWER_WITH_BOOKS("oak_drawer_with_books", () -> new ModBlockItem(BlockRegistry.OAK_DRAWER_WITH_BOOKS.get())),
    SMALL_OAK_DRAWERS("small_oak_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_OAK_DRAWERS.get())),
    OAK_BOOKSHELF_WITH_DOOR("oak_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get())),
    GLASS_OAK_CABINET("glass_oak_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_OAK_CABINET.get())),
    OAK_CABINET_WITH_GLASS_DOORS("oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get())),
    OAK_SINGLE_DOOR_CABINET("oak_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.OAK_SINGLE_DOOR_CABINET.get())),

    // Birch Furniture
    BIRCH_DRAWER("birch_drawer", () -> new ModBlockItem(BlockRegistry.BIRCH_DRAWER.get())),
    BIRCH_DRAWER_WITH_DOOR("birch_drawer_with_door", () -> new ModBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get())),
    BIRCH_DRAWER_WITH_BOOKS("birch_drawer_with_books", () -> new ModBlockItem(BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get())),
    SMALL_BIRCH_DRAWERS("small_birch_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_BIRCH_DRAWERS.get())),
    BIRCH_BOOKSHELF_WITH_DOOR("birch_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR.get())),
    GLASS_BIRCH_CABINET("glass_birch_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_BIRCH_CABINET.get())),
    BIRCH_CABINET_WITH_GLASS_DOORS("birch_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get())),
    BIRCH_SINGLE_DOOR_CABINET("birch_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get())),

    // Spruce Furniture
    SPRUCE_DRAWER("spruce_drawer", () -> new ModBlockItem(BlockRegistry.SPRUCE_DRAWER.get())),
    SPRUCE_DRAWER_WITH_DOOR("spruce_drawer_with_door", () -> new ModBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get())),
    SPRUCE_DRAWER_WITH_BOOKS("spruce_drawer_with_books", () -> new ModBlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get())),
    SMALL_SPRUCE_DRAWERS("small_spruce_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_SPRUCE_DRAWERS.get())),
    SPRUCE_BOOKSHELF_WITH_DOOR("spruce_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR.get())),
    GLASS_SPRUCE_CABINET("glass_spruce_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_SPRUCE_CABINET.get())),
    SPRUCE_CABINET_WITH_GLASS_DOORS("spruce_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get())),
    SPRUCE_SINGLE_DOOR_CABINET("spruce_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get())),

    // Jungle Furniture
    JUNGLE_DRAWER("jungle_drawer", () -> new ModBlockItem(BlockRegistry.JUNGLE_DRAWER.get())),
    JUNGLE_DRAWER_WITH_DOOR("jungle_drawer_with_door", () -> new ModBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get())),
    JUNGLE_DRAWER_WITH_BOOKS("jungle_drawer_with_books", () -> new ModBlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get())),
    SMALL_JUNGLE_DRAWERS("small_jungle_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_JUNGLE_DRAWERS.get())),
    JUNGLE_BOOKSHELF_WITH_DOOR("jungle_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR.get())),
    GLASS_JUNGLE_CABINET("glass_jungle_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_JUNGLE_CABINET.get())),
    JUNGLE_CABINET_WITH_GLASS_DOORS("jungle_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get())),
    JUNGLE_SINGLE_DOOR_CABINET("jungle_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get())),

    // Acacia Furniture
    ACACIA_DRAWER("acacia_drawer", () -> new ModBlockItem(BlockRegistry.ACACIA_DRAWER.get())),
    ACACIA_DRAWER_WITH_DOOR("acacia_drawer_with_door", () -> new ModBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get())),
    ACACIA_DRAWER_WITH_BOOKS("acacia_drawer_with_books", () -> new ModBlockItem(BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get())),
    SMALL_ACACIA_DRAWERS("small_acacia_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_ACACIA_DRAWERS.get())),
    ACACIA_BOOKSHELF_WITH_DOOR("acacia_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR.get())),
    GLASS_ACACIA_CABINET("glass_acacia_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_ACACIA_CABINET.get())),
    ACACIA_CABINET_WITH_GLASS_DOORS("acacia_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get())),
    ACACIA_SINGLE_DOOR_CABINET("acacia_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get())),

    // Dark Oak Furniture
    DARK_OAK_DRAWER("dark_oak_drawer", () -> new ModBlockItem(BlockRegistry.DARK_OAK_DRAWER.get())),
    DARK_OAK_DRAWER_WITH_DOOR("dark_oak_drawer_with_door", () -> new ModBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get())),
    DARK_OAK_DRAWER_WITH_BOOKS("dark_oak_drawer_with_books", () -> new ModBlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get())),
    SMALL_DARK_OAK_DRAWERS("small_dark_oak_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_DARK_OAK_DRAWERS.get())),
    DARK_OAK_BOOKSHELF_WITH_DOOR("dark_oak_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR.get())),
    GLASS_DARK_OAK_CABINET("glass_dark_oak_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_DARK_OAK_CABINET.get())),
    DARK_OAK_CABINET_WITH_GLASS_DOORS("dark_oak_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get())),
    DARK_OAK_SINGLE_DOOR_CABINET("dark_oak_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get())),

    // Mangrove Furniture
    MANGROVE_DRAWER("mangrove_drawer", () -> new ModBlockItem(BlockRegistry.MANGROVE_DRAWER.get())),
    MANGROVE_DRAWER_WITH_DOOR("mangrove_drawer_with_door", () -> new ModBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get())),
    MANGROVE_DRAWER_WITH_BOOKS("mangrove_drawer_with_books", () -> new ModBlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get())),
    SMALL_MANGROVE_DRAWERS("small_mangrove_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_MANGROVE_DRAWERS.get())),
    MANGROVE_BOOKSHELF_WITH_DOOR("mangrove_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR.get())),
    GLASS_MANGROVE_CABINET("glass_mangrove_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_MANGROVE_CABINET.get())),
    MANGROVE_CABINET_WITH_GLASS_DOORS("mangrove_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get())),
    MANGROVE_SINGLE_DOOR_CABINET("mangrove_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get())),

    // Crimson Furniture
    CRIMSON_DRAWER("crimson_drawer", () -> new ModBlockItem(BlockRegistry.CRIMSON_DRAWER.get())),
    CRIMSON_DRAWER_WITH_DOOR("crimson_drawer_with_door", () -> new ModBlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get())),
    CRIMSON_DRAWER_WITH_BOOKS("crimson_drawer_with_books", () -> new ModBlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get())),
    SMALL_CRIMSON_DRAWERS("small_crimson_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_CRIMSON_DRAWERS.get())),
    CRIMSON_BOOKSHELF_WITH_DOOR("crimson_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR.get())),
    GLASS_CRIMSON_CABINET("glass_crimson_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_CRIMSON_CABINET.get())),
    CRIMSON_CABINET_WITH_GLASS_DOORS("crimson_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get())),
    CRIMSON_SINGLE_DOOR_CABINET("crimson_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get())),

    // Warped Furniture
    WARPED_DRAWER("warped_drawer", () -> new ModBlockItem(BlockRegistry.WARPED_DRAWER.get())),
    WARPED_DRAWER_WITH_DOOR("warped_drawer_with_door", () -> new ModBlockItem(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get())),
    WARPED_DRAWER_WITH_BOOKS("warped_drawer_with_books", () -> new ModBlockItem(BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get())),
    SMALL_WARPED_DRAWERS("small_warped_drawers", () -> new ModBlockItem(BlockRegistry.SMALL_WARPED_DRAWERS.get())),
    WARPED_BOOKSHELF_WITH_DOOR("warped_bookshelf_with_door", () -> new ModBlockItem(BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR.get())),
    GLASS_WARPED_CABINET("glass_warped_cabinet", () -> new ModBlockItem(BlockRegistry.GLASS_WARPED_CABINET.get())),
    WARPED_CABINET_WITH_GLASS_DOORS("warped_cabinet_with_glass_doors", () -> new ModBlockItem(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get())),
    WARPED_SINGLE_DOOR_CABINET("warped_single_door_cabinet", () -> new ModBlockItem(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get()));

    private final String pathName;
    private final Supplier<Item> itemSupplier;
    private final Integer burnTime;
    private Item item;

    ItemRegistry(String pathName, Supplier<Item> itemSupplier) {
        this(pathName, itemSupplier, null);
    }

    ItemRegistry(String pathName, Supplier<Item> itemSupplier, Integer burnTime) {
        this.pathName = pathName;
        this.itemSupplier = itemSupplier;
        this.burnTime = burnTime;
    }

    public static void registerAll() {
        StorageDelight.LOGGER.info("Registering items for " + StorageDelight.MOD_ID);
        for (ItemRegistry value : values()) {
            Registry.register(Registry.ITEM, new Identifier(StorageDelight.MOD_ID, value.pathName), value.get());
            if (value.burnTime != null && value.burnTime > 0) {
                FuelRegistry.INSTANCE.add(value.get(), value.burnTime);
            }
        }
    }

    public Item get() {
        if (item == null) {
            item = itemSupplier.get();
        }
        return item;
    }

    public String getId() {
        return Registry.ITEM.getId(get()).toString();
    }
}
