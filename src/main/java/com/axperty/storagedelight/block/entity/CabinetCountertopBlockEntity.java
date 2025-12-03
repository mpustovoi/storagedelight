package com.axperty.storagedelight.block.entity;

import com.axperty.storagedelight.block.CabinetCountertopBlock;
import com.axperty.storagedelight.registry.EntityTypesRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Vec3i;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

public class CabinetCountertopBlockEntity extends RandomizableContainerBlockEntity
{
    private NonNullList<ItemStack> items;
    private final ContainerOpenersCounter openersCounter;

    public CabinetCountertopBlockEntity(BlockPos pos, BlockState blockState) {
        super(EntityTypesRegistry.COUNTERTOP.get(), pos, blockState);
        this.items = NonNullList.withSize(27, ItemStack.EMPTY);
        this.openersCounter = new ContainerOpenersCounter() {
            protected void onOpen(Level p_155062_, BlockPos p_155063_, BlockState p_155064_) {
                CabinetCountertopBlockEntity.this.playSound(p_155064_, SoundEvents.BARREL_OPEN);
                CabinetCountertopBlockEntity.this.updateBlockState(p_155064_, true);
            }

            protected void onClose(Level p_155072_, BlockPos p_155073_, BlockState p_155074_) {
                CabinetCountertopBlockEntity.this.playSound(p_155074_, SoundEvents.BARREL_CLOSE);
                CabinetCountertopBlockEntity.this.updateBlockState(p_155074_, false);
            }

            protected void openerCountChanged(Level p_155066_, BlockPos p_155067_, BlockState p_155068_, int p_155069_, int p_155070_) {
            }

            protected boolean isOwnContainer(Player p_155060_) {
                if (p_155060_.containerMenu instanceof ChestMenu) {
                    Container container = ((ChestMenu)p_155060_.containerMenu).getContainer();
                    return container == CabinetCountertopBlockEntity.this;
                } else {
                    return false;
                }
            }
        };
    }

    protected void saveAdditional(ValueOutput p_422559_) {
        super.saveAdditional(p_422559_);
        if (!this.trySaveLootTable(p_422559_)) {
            ContainerHelper.saveAllItems(p_422559_, this.items);
        }

    }

    protected void loadAdditional(ValueInput p_422397_) {
        super.loadAdditional(p_422397_);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(p_422397_)) {
            ContainerHelper.loadAllItems(p_422397_, this.items);
        }

    }

    public int getContainerSize() {
        return 27;
    }

    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    protected void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    protected Component getDefaultName() {
        return Component.translatable("container.storagedelight.cabinet_countertop");
    }

    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return ChestMenu.threeRows(id, player, this);
    }

    public void startOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.incrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public void stopOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.decrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    public void recheckOpen() {
        if (!this.remove) {
            this.openersCounter.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    void updateBlockState(BlockState state, boolean open) {
        this.level.setBlock(this.getBlockPos(), (BlockState)state.setValue(CabinetCountertopBlock.OPEN, open), 3);
    }

    void playSound(BlockState state, SoundEvent sound) {
        Vec3i vec3i = ((Direction)state.getValue(CabinetCountertopBlock.FACING)).getUnitVec3i();
        double d0 = (double)this.worldPosition.getX() + (double)0.5F + (double)vec3i.getX() / (double)2.0F;
        double d1 = (double)this.worldPosition.getY() + (double)0.5F + (double)vec3i.getY() / (double)2.0F;
        double d2 = (double)this.worldPosition.getZ() + (double)0.5F + (double)vec3i.getZ() / (double)2.0F;
        this.level.playSound((Entity)null, d0, d1, d2, sound, SoundSource.BLOCKS, 0.5F, this.level.random.nextFloat() * 0.1F + 0.9F);
    }
}