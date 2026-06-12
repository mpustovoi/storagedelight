package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        StorageDelight.MOD_ID);

    // Oak Furniture
    public static final RegistryObject<Block> OAK_DRAWER = BLOCKS.register("oak_drawer",
            () -> new DrawerBlock(
                    Block.Properties.ofFullCopy(Blocks.BARREL).setId(BLOCKS.key("oak_drawer"))));
    public static final RegistryObject<Block> OAK_DRAWER_WITH_DOOR = BLOCKS.register("oak_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_drawer_with_door"))));
    public static final RegistryObject<Block> OAK_DRAWER_WITH_BOOKS = BLOCKS.register("oak_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_OAK_DRAWERS = BLOCKS.register("small_oak_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_oak_drawers"))));
    public static final RegistryObject<Block> OAK_BOOKSHELF_WITH_DOOR = BLOCKS.register("oak_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_OAK_CABINET = BLOCKS.register("glass_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_oak_cabinet"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "oak_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> OAK_SINGLE_DOOR_CABINET = BLOCKS.register("oak_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_single_door_cabinet"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("oak_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("oak_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("oak_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("oak_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("oak_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("oak_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("oak_cabinet_with_stone_bricks_countertop"))));

    // Spruce Furniture
    public static final RegistryObject<Block> SPRUCE_DRAWER = BLOCKS.register("spruce_drawer",
            () -> new DrawerBlock(
                    Block.Properties.ofFullCopy(Blocks.BARREL).setId(BLOCKS.key("spruce_drawer"))));
    public static final RegistryObject<Block> SPRUCE_DRAWER_WITH_DOOR = BLOCKS.register("spruce_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_drawer_with_door"))));
    public static final RegistryObject<Block> SPRUCE_DRAWER_WITH_BOOKS = BLOCKS.register("spruce_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_SPRUCE_DRAWERS = BLOCKS.register("small_spruce_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_spruce_drawers"))));
    public static final RegistryObject<Block> SPRUCE_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "spruce_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_SPRUCE_CABINET = BLOCKS.register("glass_spruce_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_spruce_cabinet"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "spruce_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> SPRUCE_SINGLE_DOOR_CABINET = BLOCKS.register(
            "spruce_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_single_door_cabinet"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("spruce_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("spruce_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("spruce_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("spruce_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("spruce_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> SPRUCE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("spruce_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("spruce_cabinet_with_stone_bricks_countertop"))));

    // Birch Furniture
    public static final RegistryObject<Block> BIRCH_DRAWER = BLOCKS.register("birch_drawer",
            () -> new DrawerBlock(
                    Block.Properties.ofFullCopy(Blocks.BARREL).setId(BLOCKS.key("birch_drawer"))));
    public static final RegistryObject<Block> BIRCH_DRAWER_WITH_DOOR = BLOCKS.register("birch_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_drawer_with_door"))));
    public static final RegistryObject<Block> BIRCH_DRAWER_WITH_BOOKS = BLOCKS.register("birch_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_BIRCH_DRAWERS = BLOCKS.register("small_birch_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_birch_drawers"))));
    public static final RegistryObject<Block> BIRCH_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "birch_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_BIRCH_CABINET = BLOCKS.register("glass_birch_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_birch_cabinet"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "birch_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> BIRCH_SINGLE_DOOR_CABINET = BLOCKS.register("birch_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_single_door_cabinet"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("birch_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("birch_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("birch_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("birch_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("birch_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> BIRCH_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("birch_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("birch_cabinet_with_stone_bricks_countertop"))));

    // Jungle Furniture
    public static final RegistryObject<Block> JUNGLE_DRAWER = BLOCKS.register("jungle_drawer",
            () -> new DrawerBlock(
                    Block.Properties.ofFullCopy(Blocks.BARREL).setId(BLOCKS.key("jungle_drawer"))));
    public static final RegistryObject<Block> JUNGLE_DRAWER_WITH_DOOR = BLOCKS.register("jungle_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_drawer_with_door"))));
    public static final RegistryObject<Block> JUNGLE_DRAWER_WITH_BOOKS = BLOCKS.register("jungle_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_JUNGLE_DRAWERS = BLOCKS.register("small_jungle_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_jungle_drawers"))));
    public static final RegistryObject<Block> JUNGLE_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "jungle_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_JUNGLE_CABINET = BLOCKS.register("glass_jungle_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_jungle_cabinet"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "jungle_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> JUNGLE_SINGLE_DOOR_CABINET = BLOCKS.register(
            "jungle_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_single_door_cabinet"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("jungle_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("jungle_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("jungle_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("jungle_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("jungle_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> JUNGLE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("jungle_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("jungle_cabinet_with_stone_bricks_countertop"))));

    // Acacia Furniture
    public static final RegistryObject<Block> ACACIA_DRAWER = BLOCKS.register("acacia_drawer",
            () -> new DrawerBlock(
                    Block.Properties.ofFullCopy(Blocks.BARREL).setId(BLOCKS.key("acacia_drawer"))));
    public static final RegistryObject<Block> ACACIA_DRAWER_WITH_DOOR = BLOCKS.register("acacia_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_drawer_with_door"))));
    public static final RegistryObject<Block> ACACIA_DRAWER_WITH_BOOKS = BLOCKS.register("acacia_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_ACACIA_DRAWERS = BLOCKS.register("small_acacia_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_acacia_drawers"))));
    public static final RegistryObject<Block> ACACIA_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "acacia_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_ACACIA_CABINET = BLOCKS.register("glass_acacia_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_acacia_cabinet"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "acacia_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> ACACIA_SINGLE_DOOR_CABINET = BLOCKS.register(
            "acacia_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_single_door_cabinet"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("acacia_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("acacia_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("acacia_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("acacia_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("acacia_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> ACACIA_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("acacia_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("acacia_cabinet_with_stone_bricks_countertop"))));

    // Dark Oak Furniture
    public static final RegistryObject<Block> DARK_OAK_DRAWER = BLOCKS.register("dark_oak_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_drawer"))));
    public static final RegistryObject<Block> DARK_OAK_DRAWER_WITH_DOOR = BLOCKS.register(
            "dark_oak_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_drawer_with_door"))));
    public static final RegistryObject<Block> DARK_OAK_DRAWER_WITH_BOOKS = BLOCKS.register(
            "dark_oak_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_DARK_OAK_DRAWERS = BLOCKS.register("small_dark_oak_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_dark_oak_drawers"))));
    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "dark_oak_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_DARK_OAK_CABINET = BLOCKS.register("glass_dark_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_dark_oak_cabinet"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "dark_oak_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> DARK_OAK_SINGLE_DOOR_CABINET = BLOCKS.register(
            "dark_oak_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_single_door_cabinet"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("dark_oak_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("dark_oak_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("dark_oak_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("dark_oak_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("dark_oak_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> DARK_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("dark_oak_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("dark_oak_cabinet_with_stone_bricks_countertop"))));

    // Mangrove Furniture
    public static final RegistryObject<Block> MANGROVE_DRAWER = BLOCKS.register("mangrove_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_drawer"))));
    public static final RegistryObject<Block> MANGROVE_DRAWER_WITH_DOOR = BLOCKS.register(
            "mangrove_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_drawer_with_door"))));
    public static final RegistryObject<Block> MANGROVE_DRAWER_WITH_BOOKS = BLOCKS.register(
            "mangrove_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_MANGROVE_DRAWERS = BLOCKS.register("small_mangrove_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_mangrove_drawers"))));
    public static final RegistryObject<Block> MANGROVE_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "mangrove_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_MANGROVE_CABINET = BLOCKS.register("glass_mangrove_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_mangrove_cabinet"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "mangrove_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> MANGROVE_SINGLE_DOOR_CABINET = BLOCKS.register(
            "mangrove_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_single_door_cabinet"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("mangrove_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("mangrove_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("mangrove_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("mangrove_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("mangrove_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> MANGROVE_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("mangrove_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("mangrove_cabinet_with_stone_bricks_countertop"))));

    // Cherry Furniture
    public static final RegistryObject<Block> CHERRY_DRAWER = BLOCKS.register("cherry_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_drawer"))));
    public static final RegistryObject<Block> CHERRY_DRAWER_WITH_DOOR = BLOCKS.register("cherry_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD).setId(BLOCKS.key("cherry_drawer_with_door"))));
    public static final RegistryObject<Block> CHERRY_DRAWER_WITH_BOOKS = BLOCKS.register("cherry_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("cherry_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_CHERRY_DRAWERS = BLOCKS.register("small_cherry_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_cherry_drawers"))));
    public static final RegistryObject<Block> CHERRY_BOOKSHELF_WITH_DOOR = BLOCKS
            .register("cherry_bookshelf_with_door",
                    () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.CHERRY_WOOD)
                            .setId(BLOCKS.key("cherry_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_CHERRY_CABINET = BLOCKS.register("glass_cherry_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD).setId(BLOCKS.key("glass_cherry_cabinet"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_GLASS_DOORS = BLOCKS
            .register("cherry_cabinet_with_glass_doors",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.CHERRY_WOOD)
                            .setId(BLOCKS.key("cherry_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> CHERRY_SINGLE_DOOR_CABINET = BLOCKS
            .register("cherry_single_door_cabinet",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.CHERRY_WOOD)
                            .setId(BLOCKS.key("cherry_single_door_cabinet"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("cherry_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("cherry_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("cherry_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("cherry_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("cherry_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> CHERRY_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("cherry_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.CHERRY_WOOD)
                    .setId(BLOCKS.key("cherry_cabinet_with_stone_bricks_countertop"))));

    // Pale Oak Furniture
    public static final RegistryObject<Block> PALE_OAK_CABINET = BLOCKS.register("pale_oak_cabinet",
            () -> new CabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet"))));
    public static final RegistryObject<Block> PALE_OAK_DRAWER = BLOCKS.register("pale_oak_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_drawer"))));
    public static final RegistryObject<Block> PALE_OAK_DRAWER_WITH_DOOR = BLOCKS.register(
            "pale_oak_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_drawer_with_door"))));
    public static final RegistryObject<Block> PALE_OAK_DRAWER_WITH_BOOKS = BLOCKS.register(
            "pale_oak_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_PALE_OAK_DRAWERS = BLOCKS.register("small_pale_oak_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_pale_oak_drawers"))));
    public static final RegistryObject<Block> PALE_OAK_BOOKSHELF_WITH_DOOR = BLOCKS.register(
            "pale_oak_bookshelf_with_door",
            () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_PALE_OAK_CABINET = BLOCKS.register("glass_pale_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("glass_pale_oak_cabinet"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_GLASS_DOORS = BLOCKS.register(
            "pale_oak_cabinet_with_glass_doors",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> PALE_OAK_SINGLE_DOOR_CABINET = BLOCKS.register(
            "pale_oak_single_door_cabinet",
            () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_single_door_cabinet"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("pale_oak_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("pale_oak_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("pale_oak_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("pale_oak_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("pale_oak_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> PALE_OAK_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("pale_oak_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("pale_oak_cabinet_with_stone_bricks_countertop"))));

    // Bamboo Furniture
    public static final RegistryObject<Block> BAMBOO_DRAWER = BLOCKS.register("bamboo_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_drawer"))));
    public static final RegistryObject<Block> BAMBOO_DRAWER_WITH_DOOR = BLOCKS.register("bamboo_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD).setId(BLOCKS.key("bamboo_drawer_with_door"))));
    public static final RegistryObject<Block> BAMBOO_DRAWER_WITH_BOOKS = BLOCKS.register("bamboo_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("bamboo_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_BAMBOO_DRAWERS = BLOCKS.register("small_bamboo_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_bamboo_drawers"))));
    public static final RegistryObject<Block> BAMBOO_BOOKSHELF_WITH_DOOR = BLOCKS
            .register("bamboo_bookshelf_with_door",
                    () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.BAMBOO_WOOD)
                            .setId(BLOCKS.key("bamboo_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_BAMBOO_CABINET = BLOCKS.register("glass_bamboo_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD).setId(BLOCKS.key("glass_bamboo_cabinet"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_GLASS_DOORS = BLOCKS
            .register("bamboo_cabinet_with_glass_doors",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.BAMBOO_WOOD)
                            .setId(BLOCKS.key("bamboo_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> BAMBOO_SINGLE_DOOR_CABINET = BLOCKS
            .register("bamboo_single_door_cabinet",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.BAMBOO_WOOD)
                            .setId(BLOCKS.key("bamboo_single_door_cabinet"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("bamboo_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("bamboo_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("bamboo_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("bamboo_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("bamboo_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> BAMBOO_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("bamboo_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.BAMBOO_WOOD)
                    .setId(BLOCKS.key("bamboo_cabinet_with_stone_bricks_countertop"))));

    // Crimson Furniture
    public static final RegistryObject<Block> CRIMSON_DRAWER = BLOCKS.register("crimson_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_drawer"))));
    public static final RegistryObject<Block> CRIMSON_DRAWER_WITH_DOOR = BLOCKS.register("crimson_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD).setId(BLOCKS.key("crimson_drawer_with_door"))));
    public static final RegistryObject<Block> CRIMSON_DRAWER_WITH_BOOKS = BLOCKS.register(
            "crimson_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("crimson_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_CRIMSON_DRAWERS = BLOCKS.register("small_crimson_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_crimson_drawers"))));
    public static final RegistryObject<Block> CRIMSON_BOOKSHELF_WITH_DOOR = BLOCKS
            .register("crimson_bookshelf_with_door",
                    () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.NETHER_WOOD)
                            .setId(BLOCKS.key("crimson_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_CRIMSON_CABINET = BLOCKS.register("glass_crimson_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD).setId(BLOCKS.key("glass_crimson_cabinet"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_GLASS_DOORS = BLOCKS
            .register("crimson_cabinet_with_glass_doors",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.NETHER_WOOD)
                            .setId(BLOCKS.key("crimson_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> CRIMSON_SINGLE_DOOR_CABINET = BLOCKS
            .register("crimson_single_door_cabinet",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.NETHER_WOOD)
                            .setId(BLOCKS.key("crimson_single_door_cabinet"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("crimson_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("crimson_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("crimson_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("crimson_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("crimson_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> CRIMSON_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("crimson_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("crimson_cabinet_with_stone_bricks_countertop"))));

    // Warped Furniture
    public static final RegistryObject<Block> WARPED_DRAWER = BLOCKS.register("warped_drawer",
            () -> new DrawerBlock(Block.Properties.ofFullCopy(Blocks.BARREL).sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_drawer"))));
    public static final RegistryObject<Block> WARPED_DRAWER_WITH_DOOR = BLOCKS.register("warped_drawer_with_door",
            () -> new DrawerDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD).setId(BLOCKS.key("warped_drawer_with_door"))));
    public static final RegistryObject<Block> WARPED_DRAWER_WITH_BOOKS = BLOCKS.register("warped_drawer_with_books",
            () -> new DrawerBooksBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("warped_drawer_with_books"))));
    public static final RegistryObject<Block> SMALL_WARPED_DRAWERS = BLOCKS.register("small_warped_drawers",
            () -> new SmallDrawersBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .setId(BLOCKS.key("small_warped_drawers"))));
    public static final RegistryObject<Block> WARPED_BOOKSHELF_WITH_DOOR = BLOCKS
            .register("warped_bookshelf_with_door",
                    () -> new BookshelfDoorBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.NETHER_WOOD)
                            .setId(BLOCKS.key("warped_bookshelf_with_door"))));
    public static final RegistryObject<Block> GLASS_WARPED_CABINET = BLOCKS.register("glass_warped_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD).setId(BLOCKS.key("glass_warped_cabinet"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_GLASS_DOORS = BLOCKS
            .register("warped_cabinet_with_glass_doors",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.NETHER_WOOD)
                            .setId(BLOCKS.key("warped_cabinet_with_glass_doors"))));
    public static final RegistryObject<Block> WARPED_SINGLE_DOOR_CABINET = BLOCKS
            .register("warped_single_door_cabinet",
                    () -> new CabinetVariantBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                            .sound(SoundType.NETHER_WOOD)
                            .setId(BLOCKS.key("warped_single_door_cabinet"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_POLISHED_DEEPSLATE_COUNTERTOP = BLOCKS.register("warped_cabinet_with_polished_deepslate_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_cabinet_with_polished_deepslate_countertop"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_POLISHED_ANDESITE_COUNTERTOP = BLOCKS.register("warped_cabinet_with_polished_andesite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_cabinet_with_polished_andesite_countertop"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_POLISHED_TUFF_COUNTERTOP = BLOCKS.register("warped_cabinet_with_polished_tuff_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_cabinet_with_polished_tuff_countertop"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_POLISHED_BLACKSTONE_COUNTERTOP = BLOCKS.register("warped_cabinet_with_polished_blackstone_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_cabinet_with_polished_blackstone_countertop"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_POLISHED_DIORITE_COUNTERTOP = BLOCKS.register("warped_cabinet_with_polished_diorite_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_cabinet_with_polished_diorite_countertop"))));
    public static final RegistryObject<Block> WARPED_CABINET_WITH_STONE_BRICKS_COUNTERTOP = BLOCKS.register("warped_cabinet_with_stone_bricks_countertop",
            () -> new CabinetCountertopBlock(Block.Properties.ofFullCopy(Blocks.BARREL)
                    .sound(SoundType.NETHER_WOOD)
                    .setId(BLOCKS.key("warped_cabinet_with_stone_bricks_countertop"))));

}
