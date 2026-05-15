package net.redchujelly.cluttered.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class ChairEntity extends Entity {

    private final BlockPos CHAIR_POS;
    private final Level CHAIR_LEVEL;

    public ChairEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        CHAIR_POS = new BlockPos(0, 0, 0);
        CHAIR_LEVEL = pLevel;
    }
    public ChairEntity(EntityType<?> pEntityType, Level pLevel, BlockPos pos) {
        super(pEntityType, pLevel);
        CHAIR_POS = pos;
        CHAIR_LEVEL = pLevel;
    }

    public void mountPlayer(Player player, Direction sittingDirection) {
        float yRot = sittingDirection.toYRot();
        setYRot(yRot);
        setXRot(0.0F);
        player.startRiding(this);
        player.setYRot(yRot);
        player.setYHeadRot(yRot);
        player.setYBodyRot(yRot);
        player.setXRot(0.0F);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder entityData) {
    }

    @Override
    protected void readAdditionalSaveData(ValueInput input) {
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput output) {
    }

    @Override
    protected void removePassenger(Entity pPassenger) {
        this.teleportTo(this.getX(), this.getY() + 0.5f, this.getZ());
        super.removePassenger(pPassenger);
        clearChair();
        discard();
    }

    @Override
    public void kill(ServerLevel level) {
        clearChair();
        super.kill(level);
    }

    private void clearChair() {
        BlockState chair = CHAIR_LEVEL.getBlockState(CHAIR_POS);
        if (chair.hasProperty(BlockStateProperties.OCCUPIED)) {
            this.teleportTo(this.getX(), this.getY() + 0.5f, this.getZ());
            CHAIR_LEVEL.setBlock(CHAIR_POS, chair.setValue(BlockStateProperties.OCCUPIED, false), 2);
        }
    }

    @Override
    public void dismountTo(double pX, double pY, double pZ) {
        super.dismountTo(pX, pY, pZ);
    }

    @Override
    public boolean canBeCollidedWith(Entity other) {
        return false;
    }

    @Override
    public boolean hurtServer(ServerLevel level, DamageSource source, float damage) {
        return false;
    }

    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }
}
