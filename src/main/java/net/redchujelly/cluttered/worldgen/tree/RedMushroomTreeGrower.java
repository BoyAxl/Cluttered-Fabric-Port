package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class RedMushroomTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_red_mushroom",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.RED_MUSHROOM_KEY),
            Optional.empty());

    private RedMushroomTreeGrower() {
    }
}
