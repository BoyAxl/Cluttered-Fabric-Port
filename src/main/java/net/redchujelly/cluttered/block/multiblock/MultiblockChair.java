package net.redchujelly.cluttered.block.multiblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.redchujelly.cluttered.entity.ChairEntity;
import net.redchujelly.cluttered.setup.EntityTypeRegistration;

import java.util.List;

public class MultiblockChair extends MultiblockPlacer{

    public static final BooleanProperty OCCUPIED = BlockStateProperties.OCCUPIED;
    private static final float SEAT_OFFSET = 0.5f;

    public static final IntegerProperty MULTIBLOCK_PART = IntegerProperty.create("part", 1, 2);
    private static final int[][][] MULTIBLOCK_SHAPE = {
            {
                    {1},
                    {2}
            },
    };

    public MultiblockChair(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.defaultBlockState().setValue(OCCUPIED, false));
    }

    @Override
    protected InteractionResult useItemOn(net.minecraft.world.item.ItemStack pUsedStack, BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pState.getValue(OCCUPIED) && !pPlayer.isShiftKeyDown()){
            Direction sittingDirection = pState.getValue(FACING).getOpposite();
            if (pLevel.isClientSide()) {
                ChairEntity.snapPassengerRotation(pPlayer, sittingDirection);
            } else {
                pLevel.setBlock(pPos, pState.setValue(OCCUPIED, true), 2);
                ChairEntity seat = new ChairEntity(EntityTypeRegistration.CHAIR_ENTITY.get(), pLevel, pPos, sittingDirection);
                seat.setPos(pPos.getX() + .5, pPos.getY() - 1 + getSeatOffset(), pPos.getZ() + .5);
                pLevel.addFreshEntity(seat);
                seat.mountPlayer(pPlayer);
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    protected void affectNeighborsAfterRemoval(BlockState pState, net.minecraft.server.level.ServerLevel pLevel, BlockPos pPos, boolean pMovedByPiston) {
        List<ChairEntity> chairBlocks = pLevel.getEntitiesOfClass(ChairEntity.class, new AABB(pPos));
        for (ChairEntity chair : chairBlocks){
            chair.kill(pLevel);
        }
    }

    public float getSeatOffset(){
        return SEAT_OFFSET;
    }

    @Override
    public int[][][] getMultiblockShape() {
        return MULTIBLOCK_SHAPE;
    }

    @Override
    public IntegerProperty getMultiblockPart() {
        return MULTIBLOCK_PART;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(OCCUPIED);

    }
}
