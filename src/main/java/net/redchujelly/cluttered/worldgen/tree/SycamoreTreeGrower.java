package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class SycamoreTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_sycamore",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.SYCAMORE_KEY),
            Optional.empty());

    private SycamoreTreeGrower() {
    }
}
