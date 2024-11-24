package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeTabRegistry
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StorageDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> STORAGEDELIGHT_TAB = CREATIVE_MODE_TABS.register("storagedelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.storagedelight"))
            .icon(() -> ItemRegistry.OAK_DRAWER.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                output.accept(BlockRegistry.OAK_DRAWER.get());


            }).build());
}