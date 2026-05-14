package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class WillowTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_willow",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.WILLOW_KEY),
            Optional.empty());

    private WillowTreeGrower() {
    }
}
