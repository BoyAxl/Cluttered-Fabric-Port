package net.redchujelly.cluttered.block.custom.furniture.storage;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.redchujelly.cluttered.block.custom.furniture.SmallFurnitureBlock;
import net.redchujelly.cluttered.block.entity.CustomStorageBlockEntity;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import org.jetbrains.annotations.Nullable;

public class StorageBlock extends SmallFurnitureBlock implements EntityBlock {


    public StorageBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected InteractionResult useItemOn(net.minecraft.world.item.ItemStack pUsedStack, BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (pLevel.isClientSide()){
            return InteractionResult.SUCCESS;
        } else {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof CustomStorageBlockEntity){
                pPlayer.openMenu((CustomStorageBlockEntity) blockEntity);
            }
            return InteractionResult.CONSUME;
        }
    }

    @Override
    protected void affectNeighborsAfterRemoval(BlockState pState, net.minecraft.server.level.ServerLevel pLevel, BlockPos pPos, boolean pIsMoving) {
        if (true) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof Container) {
                Containers.dropContents(pLevel, pPos, (Container)blockEntity);
                pLevel.updateNeighbourForOutputSignal(pPos, this);
            }
        }
    }


    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, @org.jetbrains.annotations.Nullable LivingEntity pPlacer, ItemStack pStack) {
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return TileEntityRegistration.TWO_ROWS_BE.get().create(blockPos, blockState);
    }
}
