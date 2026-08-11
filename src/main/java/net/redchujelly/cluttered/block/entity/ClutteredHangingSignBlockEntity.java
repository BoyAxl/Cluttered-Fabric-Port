package net.redchujelly.cluttered.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.redchujelly.cluttered.setup.TileEntityRegistration;

public class ClutteredHangingSignBlockEntity extends SignBlockEntity {
    public ClutteredHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(TileEntityRegistration.CLUTTERED_HANGING_SIGN_BE.get(), pPos, pBlockState);
    }

    // HangingSignBlockEntity hardcodes the vanilla block entity type, so mirror its public behavior here.
    @Override
    public int getTextLineHeight() {
        return 9;
    }

    @Override
    public int getMaxTextLineWidth() {
        return 60;
    }

    @Override
    public SoundEvent getSignInteractionFailedSoundEvent() {
        return SoundEvents.WAXED_HANGING_SIGN_INTERACT_FAIL;
    }
}
