package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class CrabappleTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_crabapple",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.CRABAPPLE_KEY),
            Optional.empty());

    private CrabappleTreeGrower() {
    }
}
