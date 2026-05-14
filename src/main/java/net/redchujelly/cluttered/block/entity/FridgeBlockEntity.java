package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.block.multiblock.storage.FridgeBlock;

public class FridgeBlockEntity extends CustomStorageBlockEntity{
    private final ContainerOpenersCounter openersCounter;

    public FridgeBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState, int rows) {
        super(pType, pPos, pBlockState, rows);
        this.openersCounter = new ContainerOpenersCounter() {
            @Override
            protected void onOpen(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.IRON_DOOR_OPEN, SoundSource.BLOCKS);
                FridgeBlock.setOpenAndClosed(level, pPos, pBlockState, true);
            }

            @Override
            protected void onClose(Level level, BlockPos blockPos, BlockState blockState) {
                level.playSound(null, pPos, SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS);
                FridgeBlock.setOpenAndClosed(level, pPos, pBlockState, false);

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
    protected Component getDefaultName() {
        return Component.translatable("cluttered.fridge");
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

}
