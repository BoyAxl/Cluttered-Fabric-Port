package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class BlueMushroomTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_blue_mushroom",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.BLUE_MUSHROOM_KEY),
            Optional.empty());

    private BlueMushroomTreeGrower() {
    }
}
