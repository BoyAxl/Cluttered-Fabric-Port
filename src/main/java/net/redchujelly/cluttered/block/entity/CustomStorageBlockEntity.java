package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

public class CustomStorageBlockEntity extends RandomizableContainerBlockEntity {
    private NonNullList<ItemStack> items;
    private final int size;
    private final ContainerOpenersCounter openersCounter;

    public CustomStorageBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int rows) {
        super(pType, pPos, pBlockState);
        this.size = rows * 9;
        this.items = NonNullList.withSize(size, ItemStack.EMPTY);
        this.openersCounter = new ContainerOpenersCounter() {
            @Override
            protected void onOpen(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.BARREL_OPEN, SoundSource.BLOCKS);
            }

            @Override
            protected void onClose(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.BARREL_CLOSE, SoundSource.BLOCKS);
            }

            @Override
            protected void openerCountChanged(Level level, BlockPos blockPos, BlockState blockState, int i, int i1) {

            }

            @Override
            public boolean isOwnContainer(Player player) {
                return false;
            }
        };
    }

    public CustomStorageBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int rows, SoundEvent openSound, SoundEvent closeSound) {
        super(pType, pPos, pBlockState);
        this.size = rows * 9;
        this.items = NonNullList.withSize(size, ItemStack.EMPTY);
        this.openersCounter = new ContainerOpenersCounter() {
            @Override
            protected void onOpen(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, openSound, SoundSource.BLOCKS);
            }

            @Override
            protected void onClose(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, closeSound, SoundSource.BLOCKS);
            }

            @Override
            protected void openerCountChanged(Level level, BlockPos blockPos, BlockState blockState, int i, int i1) {

            }

            @Override
            public boolean isOwnContainer(Player player) {
                return false;
            }
        };
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> pItems) {
        this.items = pItems;
    }

    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        if (!this.trySaveLootTable(output)) {
            ContainerHelper.saveAllItems(output, this.items);
        }

    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(input)) {
            ContainerHelper.loadAllItems(input, this.items);
        }

    }

    @Override
    public void startOpen(ContainerUser containerUser) {
        LivingEntity entity = containerUser.getLivingEntity();
        if (!this.remove && !entity.isSpectator()) {
            this.openersCounter.incrementOpeners(entity, this.getLevel(), this.getBlockPos(), this.getBlockState(), containerUser.getContainerInteractionRange());
        }

    }


    @Override
    public void stopOpen(ContainerUser containerUser) {
        LivingEntity entity = containerUser.getLivingEntity();
        if (!this.remove && !entity.isSpectator()) {
            this.openersCounter.decrementOpeners(entity, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }

    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("cluttered.storage");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pId, Inventory pInventory) {
        return switch (this.size / 9) {
            case 1 -> new ChestMenu(MenuType.GENERIC_9x1, pId, pInventory, this, size/9);
            case 2 -> new ChestMenu(MenuType.GENERIC_9x2, pId, pInventory, this, size/9);
            case 4 -> new ChestMenu(MenuType.GENERIC_9x4, pId, pInventory, this, size/9);
            case 5 -> new ChestMenu(MenuType.GENERIC_9x5, pId, pInventory, this, size/9);
            case 6 -> ChestMenu.sixRows(pId, pInventory, this);
            default -> ChestMenu.threeRows(pId, pInventory, this);
        };
    }

    @Override
    public int getContainerSize() {
        return size;
    }
}
