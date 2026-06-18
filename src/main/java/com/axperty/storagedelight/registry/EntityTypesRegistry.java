package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.entity.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityTypesRegistry {
    public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StorageDelight.MOD_ID);

    // Drawers
    public static final RegistryObject<BlockEntityType<DrawerBlockEntity>> DRAWER = TILES.register("drawer",
            () -> BlockEntityType.Builder.of(DrawerBlockEntity::new,
                            BlockRegistry.OAK_DRAWER.get(),
                            BlockRegistry.BIRCH_DRAWER.get(),
                            BlockRegistry.SPRUCE_DRAWER.get(),
                            BlockRegistry.JUNGLE_DRAWER.get(),
                            BlockRegistry.ACACIA_DRAWER.get(),
                            BlockRegistry.DARK_OAK_DRAWER.get(),
                            BlockRegistry.MANGROVE_DRAWER.get(),
                            BlockRegistry.CRIMSON_DRAWER.get(),
                            BlockRegistry.WARPED_DRAWER.get())
                    .build(null));

    // Drawers with Doors
    public static final RegistryObject<BlockEntityType<DrawerDoorBlockEntity>> DRAWER_DOOR = TILES.register("drawer_door",
            () -> BlockEntityType.Builder.of(DrawerDoorBlockEntity::new,
                            BlockRegistry.OAK_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get(),
                            BlockRegistry.WARPED_DRAWER_WITH_DOOR.get())
                    .build(null));

    // Drawers with Books
    public static final RegistryObject<BlockEntityType<DrawerBooksBlockEntity>> DRAWER_BOOKS = TILES.register("drawer_books",
            () -> BlockEntityType.Builder.of(DrawerBooksBlockEntity::new,
                            BlockRegistry.OAK_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.BIRCH_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.SPRUCE_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.JUNGLE_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.ACACIA_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.DARK_OAK_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.MANGROVE_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.CRIMSON_DRAWER_WITH_BOOKS.get(),
                            BlockRegistry.WARPED_DRAWER_WITH_BOOKS.get())
                    .build(null));

    // Glass Cabinets
    public static final RegistryObject<BlockEntityType<GlassCabinetBlockEntity>> GLASS_CABINET = TILES.register("glass_cabinet",
            () -> BlockEntityType.Builder.of(GlassCabinetBlockEntity::new,
                            BlockRegistry.GLASS_OAK_CABINET.get(),
                            BlockRegistry.GLASS_BIRCH_CABINET.get(),
                            BlockRegistry.GLASS_SPRUCE_CABINET.get(),
                            BlockRegistry.GLASS_JUNGLE_CABINET.get(),
                            BlockRegistry.GLASS_ACACIA_CABINET.get(),
                            BlockRegistry.GLASS_DARK_OAK_CABINET.get(),
                            BlockRegistry.GLASS_MANGROVE_CABINET.get(),
                            BlockRegistry.GLASS_CRIMSON_CABINET.get(),
                            BlockRegistry.GLASS_WARPED_CABINET.get())
                    .build(null));

    // Cabinets with Glass Doors and Single Door Cabinets
    public static final RegistryObject<BlockEntityType<CabinetVariantBlockEntity>> CABINET_VARIANT = TILES.register("cabinet_variant",
            () -> BlockEntityType.Builder.of(CabinetVariantBlockEntity::new,
                            BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get(),
                            BlockRegistry.OAK_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get(),
                            BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get())
                    .build(null));

    // Bookshelves with Doors
    public static final RegistryObject<BlockEntityType<BookshelfDoorBlockEntity>> BOOKSHELF_DOOR = TILES.register("bookshelf_door",
            () -> BlockEntityType.Builder.of(BookshelfDoorBlockEntity::new,
                            BlockRegistry.OAK_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.BIRCH_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.SPRUCE_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.JUNGLE_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.ACACIA_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.DARK_OAK_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.MANGROVE_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.CRIMSON_BOOKSHELF_WITH_DOOR.get(),
                            BlockRegistry.WARPED_BOOKSHELF_WITH_DOOR.get())
                    .build(null));

    // Small Drawers
    public static final RegistryObject<BlockEntityType<SmallDrawersBlockEntity>> SMALL_DRAWERS = TILES.register("small_drawers",
            () -> BlockEntityType.Builder.of(SmallDrawersBlockEntity::new,
                            BlockRegistry.SMALL_OAK_DRAWERS.get(),
                            BlockRegistry.SMALL_BIRCH_DRAWERS.get(),
                            BlockRegistry.SMALL_SPRUCE_DRAWERS.get(),
                            BlockRegistry.SMALL_JUNGLE_DRAWERS.get(),
                            BlockRegistry.SMALL_ACACIA_DRAWERS.get(),
                            BlockRegistry.SMALL_DARK_OAK_DRAWERS.get(),
                            BlockRegistry.SMALL_MANGROVE_DRAWERS.get(),
                            BlockRegistry.SMALL_CRIMSON_DRAWERS.get(),
                            BlockRegistry.SMALL_WARPED_DRAWERS.get())
                    .build(null));

    // Cabinets with Countertops
    public static final RegistryObject<BlockEntityType<CabinetCountertopBlockEntity>> COUNTERTOP = TILES.register("countertop",
            () -> BlockEntityType.Builder.of(CabinetCountertopBlockEntity::new,
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP.get(),
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP.get(),
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP.get(),
                            BlockRegistry.OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP.get(),
                            BlockRegistry.OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get(),
                            BlockRegistry.WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP.get())
                    .build(null));
}