package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(StorageDelight.MOD_ID);

    // Oak Furniture
    public static final DeferredItem<BlockItem> OAK_DRAWER = ITEMS.registerSimpleBlockItem("oak_drawer",
            BlockRegistry.OAK_DRAWER,
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> OAK_DRAWER_WITH_DOOR = ITEMS.registerSimpleBlockItem("oak_drawer_with_door",
            BlockRegistry.OAK_DRAWER_WITH_DOOR,
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> GLASS_OAK_CABINET = ITEMS.registerSimpleBlockItem("glass_oak_cabinet",
            BlockRegistry.GLASS_OAK_CABINET,
            new Item.Properties()
    );
    public static final DeferredItem<BlockItem> OAK_CABINET_WITH_GLASS_DOORS = ITEMS.registerSimpleBlockItem("oak_cabinet_with_glass_doors",
            BlockRegistry.OAK_CABINET_WITH_GLASS_DOORS,
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> OAK_SINGLE_DOOR_CABINET = ITEMS.registerSimpleBlockItem("oak_single_door_cabinet",
            BlockRegistry.OAK_SINGLE_DOOR_CABINET,
            new Item.Properties()
    );

//    // Spruce Furniture
//    public static final Supplier<Item> SPRUCE_DRAWER = ITEMS.register("spruce_drawer",
//            () -> new BlockItem(BlockRegistry.SPRUCE_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> SPRUCE_DRAWER_WITH_DOOR = ITEMS.register("spruce_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.SPRUCE_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_SPRUCE_CABINET = ITEMS.register("glass_spruce_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_SPRUCE_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> SPRUCE_CABINET_WITH_GLASS_DOORS = ITEMS.register("spruce_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.SPRUCE_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> SPRUCE_SINGLE_DOOR_CABINET = ITEMS.register("spruce_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.SPRUCE_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Birch Furniture
//    public static final Supplier<Item> BIRCH_DRAWER = ITEMS.register("birch_drawer",
//            () -> new BlockItem(BlockRegistry.BIRCH_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> BIRCH_DRAWER_WITH_DOOR = ITEMS.register("birch_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.BIRCH_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_BIRCH_CABINET = ITEMS.register("glass_birch_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_BIRCH_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> BIRCH_CABINET_WITH_GLASS_DOORS = ITEMS.register("birch_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.BIRCH_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> BIRCH_SINGLE_DOOR_CABINET = ITEMS.register("birch_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.BIRCH_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Jungle Furniture
//    public static final Supplier<Item> JUNGLE_DRAWER = ITEMS.register("jungle_drawer",
//            () -> new BlockItem(BlockRegistry.JUNGLE_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> JUNGLE_DRAWER_WITH_DOOR = ITEMS.register("jungle_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.JUNGLE_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_JUNGLE_CABINET = ITEMS.register("glass_jungle_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_JUNGLE_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> JUNGLE_CABINET_WITH_GLASS_DOORS = ITEMS.register("jungle_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.JUNGLE_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> JUNGLE_SINGLE_DOOR_CABINET = ITEMS.register("jungle_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.JUNGLE_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Acacia Furniture
//    public static final Supplier<Item> ACACIA_DRAWER = ITEMS.register("acacia_drawer",
//            () -> new BlockItem(BlockRegistry.ACACIA_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> ACACIA_DRAWER_WITH_DOOR = ITEMS.register("acacia_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.ACACIA_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_ACACIA_CABINET = ITEMS.register("glass_acacia_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_ACACIA_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> ACACIA_CABINET_WITH_GLASS_DOORS = ITEMS.register("acacia_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.ACACIA_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> ACACIA_SINGLE_DOOR_CABINET = ITEMS.register("acacia_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.ACACIA_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Dark Oak Furniture
//    public static final Supplier<Item> DARK_OAK_DRAWER = ITEMS.register("dark_oak_drawer",
//            () -> new BlockItem(BlockRegistry.DARK_OAK_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> DARK_OAK_DRAWER_WITH_DOOR = ITEMS.register("dark_oak_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.DARK_OAK_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_DARK_OAK_CABINET = ITEMS.register("glass_dark_oak_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_DARK_OAK_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> DARK_OAK_CABINET_WITH_GLASS_DOORS = ITEMS.register("dark_oak_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.DARK_OAK_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> DARK_OAK_SINGLE_DOOR_CABINET = ITEMS.register("dark_oak_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.DARK_OAK_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Mangrove Furniture
//    public static final Supplier<Item> MANGROVE_DRAWER = ITEMS.register("mangrove_drawer",
//            () -> new BlockItem(BlockRegistry.MANGROVE_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> MANGROVE_DRAWER_WITH_DOOR = ITEMS.register("mangrove_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.MANGROVE_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_MANGROVE_CABINET = ITEMS.register("glass_mangrove_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_MANGROVE_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> MANGROVE_CABINET_WITH_GLASS_DOORS = ITEMS.register("mangrove_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.MANGROVE_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> MANGROVE_SINGLE_DOOR_CABINET = ITEMS.register("mangrove_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.MANGROVE_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Cherry Furniture
//    public static final Supplier<Item> CHERRY_DRAWER = ITEMS.register("cherry_drawer",
//            () -> new BlockItem(BlockRegistry.CHERRY_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> CHERRY_DRAWER_WITH_DOOR = ITEMS.register("cherry_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.CHERRY_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_CHERRY_CABINET = ITEMS.register("glass_cherry_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_CHERRY_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> CHERRY_CABINET_WITH_GLASS_DOORS = ITEMS.register("cherry_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.CHERRY_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> CHERRY_SINGLE_DOOR_CABINET = ITEMS.register("cherry_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.CHERRY_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Bamboo Furniture
//    public static final Supplier<Item> BAMBOO_DRAWER = ITEMS.register("bamboo_drawer",
//            () -> new BlockItem(BlockRegistry.BAMBOO_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> BAMBOO_DRAWER_WITH_DOOR = ITEMS.register("bamboo_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.BAMBOO_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_BAMBOO_CABINET = ITEMS.register("glass_bamboo_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_BAMBOO_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> BAMBOO_CABINET_WITH_GLASS_DOORS = ITEMS.register("bamboo_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.BAMBOO_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> BAMBOO_SINGLE_DOOR_CABINET = ITEMS.register("bamboo_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.BAMBOO_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Crimson Furniture
//    public static final Supplier<Item> CRIMSON_CABINET = ITEMS.register("crimson_drawer",
//            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> CRIMSON_CABINET_WITH_DOOR = ITEMS.register("crimson_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.CRIMSON_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_CRIMSON_CABINET = ITEMS.register("glass_crimson_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_CRIMSON_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> CRIMSON_CABINET_WITH_GLASS_DOORS = ITEMS.register("crimson_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.CRIMSON_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> CRIMSON_SINGLE_DOOR_CABINET = ITEMS.register("crimson_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.CRIMSON_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
//
//    // Warped Furniture
//    public static final Supplier<Item> WARPED_DRAWER = ITEMS.register("warped_drawer",
//            () -> new BlockItem(BlockRegistry.WARPED_DRAWER.get(), new Item.Properties()));
//
//    public static final Supplier<Item> WARPED_DRAWER_WITH_DOOR = ITEMS.register("warped_drawer_with_door",
//            () -> new BlockItem(BlockRegistry.WARPED_DRAWER_WITH_DOOR.get(), new Item.Properties()));
//
//    public static final Supplier<Item> GLASS_WARPED_CABINET = ITEMS.register("glass_warped_cabinet",
//            () -> new BlockItem(BlockRegistry.GLASS_WARPED_CABINET.get(), new Item.Properties()));
//
//    public static final Supplier<Item> WARPED_CABINET_WITH_GLASS_DOORS = ITEMS.register("warped_cabinet_with_glass_doors",
//            () -> new BlockItem(BlockRegistry.WARPED_CABINET_WITH_GLASS_DOORS.get(), new Item.Properties()));
//
//    public static final Supplier<Item> WARPED_SINGLE_DOOR_CABINET = ITEMS.register("warped_single_door_cabinet",
//            () -> new BlockItem(BlockRegistry.WARPED_SINGLE_DOOR_CABINET.get(), new Item.Properties()));
}
