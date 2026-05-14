package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class PoplarTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_poplar",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.POPLAR_KEY),
            Optional.empty());

    private PoplarTreeGrower() {
    }
}
