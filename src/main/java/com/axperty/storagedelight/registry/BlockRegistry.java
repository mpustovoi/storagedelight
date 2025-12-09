package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.DrawerBlock;
import com.axperty.storagedelight.block.DrawerDoorBlock;
import com.axperty.storagedelight.block.DrawerBooksBlock;
import com.axperty.storagedelight.block.GlassCabinetBlock;
import com.axperty.storagedelight.block.CabinetVariantBlock;
import com.axperty.storagedelight.block.BookshelfDoorBlock;
import com.axperty.storagedelight.block.SmallDrawersBlock;
import com.axperty.storagedelight.block.CabinetCountertopBlock;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlockRegistry {

    // Oak Furniture Registry
    public static final Block OAK_DRAWER = registerBlock("oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_DRAWER_WITH_DOOR = registerBlock("oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_DRAWER_WITH_BOOKS = registerBlock("oak_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_OAK_DRAWERS = registerBlock("small_oak_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_BOOKSHELF_WITH_DOOR = registerBlock("oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_OAK_CABINET = registerBlock("glass_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_CABINET_WITH_GLASS_DOORS = registerBlock("oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_SINGLE_DOOR_CABINET = registerBlock("oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("oak_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("oak_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Birch Furniture Registry
    public static final Block BIRCH_DRAWER = registerBlock("birch_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_DRAWER_WITH_DOOR = registerBlock("birch_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_DRAWER_WITH_BOOKS = registerBlock("birch_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_BIRCH_DRAWERS = registerBlock("small_birch_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_BOOKSHELF_WITH_DOOR = registerBlock("birch_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_BIRCH_CABINET = registerBlock("glass_birch_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_CABINET_WITH_GLASS_DOORS = registerBlock("birch_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_SINGLE_DOOR_CABINET = registerBlock("birch_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("birch_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("birch_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Spruce Furniture Registry
    public static final Block SPRUCE_DRAWER = registerBlock("spruce_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_DRAWER_WITH_DOOR = registerBlock("spruce_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_DRAWER_WITH_BOOKS = registerBlock("spruce_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_SPRUCE_DRAWERS = registerBlock("small_spruce_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_BOOKSHELF_WITH_DOOR = registerBlock("spruce_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_SPRUCE_CABINET = registerBlock("glass_spruce_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_CABINET_WITH_GLASS_DOORS = registerBlock("spruce_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_SINGLE_DOOR_CABINET = registerBlock("spruce_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("spruce_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Jungle Furniture Registry
    public static final Block JUNGLE_DRAWER = registerBlock("jungle_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_DRAWER_WITH_DOOR = registerBlock("jungle_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_DRAWER_WITH_BOOKS = registerBlock("jungle_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_JUNGLE_DRAWERS = registerBlock("small_jungle_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_BOOKSHELF_WITH_DOOR = registerBlock("jungle_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_JUNGLE_CABINET = registerBlock("glass_jungle_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_CABINET_WITH_GLASS_DOORS = registerBlock("jungle_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_SINGLE_DOOR_CABINET = registerBlock("jungle_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("jungle_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Acacia Furniture Registry
    public static final Block ACACIA_DRAWER = registerBlock("acacia_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_DRAWER_WITH_DOOR = registerBlock("acacia_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_DRAWER_WITH_BOOKS = registerBlock("acacia_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_ACACIA_DRAWERS = registerBlock("small_acacia_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_BOOKSHELF_WITH_DOOR = registerBlock("acacia_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_ACACIA_CABINET = registerBlock("glass_acacia_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_CABINET_WITH_GLASS_DOORS = registerBlock("acacia_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_SINGLE_DOOR_CABINET = registerBlock("acacia_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("acacia_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Dark Oak Furniture Registry
    public static final Block DARK_OAK_DRAWER = registerBlock("dark_oak_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_DRAWER_WITH_DOOR = registerBlock("dark_oak_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_DRAWER_WITH_BOOKS = registerBlock("dark_oak_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_DARK_OAK_DRAWERS = registerBlock("small_dark_oak_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_BOOKSHELF_WITH_DOOR = registerBlock("dark_oak_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_DARK_OAK_CABINET = registerBlock("glass_dark_oak_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_CABINET_WITH_GLASS_DOORS = registerBlock("dark_oak_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_SINGLE_DOOR_CABINET = registerBlock("dark_oak_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("dark_oak_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Mangrove Furniture Registry
    public static final Block MANGROVE_DRAWER = registerBlock("mangrove_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_DRAWER_WITH_DOOR = registerBlock("mangrove_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_DRAWER_WITH_BOOKS = registerBlock("mangrove_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_MANGROVE_DRAWERS = registerBlock("small_mangrove_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_BOOKSHELF_WITH_DOOR = registerBlock("mangrove_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_MANGROVE_CABINET = registerBlock("glass_mangrove_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_CABINET_WITH_GLASS_DOORS = registerBlock("mangrove_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_SINGLE_DOOR_CABINET = registerBlock("mangrove_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("mangrove_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Crimson Furniture Registry
    public static final Block CRIMSON_DRAWER = registerBlock("crimson_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_DRAWER_WITH_DOOR = registerBlock("crimson_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_DRAWER_WITH_BOOKS = registerBlock("crimson_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_CRIMSON_DRAWERS = registerBlock("small_crimson_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_BOOKSHELF_WITH_DOOR = registerBlock("crimson_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_CRIMSON_CABINET = registerBlock("glass_crimson_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_CABINET_WITH_GLASS_DOORS = registerBlock("crimson_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_SINGLE_DOOR_CABINET = registerBlock("crimson_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("crimson_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    // Warped Furniture Registry
    public static final Block WARPED_DRAWER = registerBlock("warped_drawer", DrawerBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_DRAWER_WITH_DOOR = registerBlock("warped_drawer_with_door", DrawerDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_DRAWER_WITH_BOOKS = registerBlock("warped_drawer_with_books", DrawerBooksBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block SMALL_WARPED_DRAWERS = registerBlock("small_warped_drawers", SmallDrawersBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_BOOKSHELF_WITH_DOOR = registerBlock("warped_bookshelf_with_door", BookshelfDoorBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block GLASS_WARPED_CABINET = registerBlock("glass_warped_cabinet", GlassCabinetBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_CABINET_WITH_GLASS_DOORS = registerBlock("warped_cabinet_with_glass_doors", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_SINGLE_DOOR_CABINET = registerBlock("warped_single_door_cabinet", CabinetVariantBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = registerBlock("warped_cabinet_with_polished_deepslate_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));
    public static final Block WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = registerBlock("warped_cabinet_with_polished_andesite_countertop", CabinetCountertopBlock::new, Block.Settings.copy(Blocks.BARREL));

    private static Block registerBlock(String path, Function<Block.Settings, Block> factory, Block.Settings settings) {
        final Identifier identifier = new Identifier(StorageDelight.MOD_ID, path);
        final Block block = factory.apply(settings);
        Registry.register(Registry.BLOCK, identifier, block);
        registerItem(path, itemSettings -> new BlockItem(block, itemSettings),
                new Item.Settings().group(CreativeTabRegistry.ITEM_GROUP));
        return block;
    }

    // UPDATE THIS METHOD
    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final Identifier identifier = new Identifier(StorageDelight.MOD_ID, path);
        final Item item = factory.apply(settings);
        Registry.register(Registry.ITEM, identifier, item);
        return item;
    }

    public static void register() {

    }
}