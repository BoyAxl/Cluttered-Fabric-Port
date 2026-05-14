package net.redchujelly.cluttered.worldgen.tree;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.redchujelly.cluttered.worldgen.ClutteredConfiguredFeatures;

import java.util.Optional;

public final class MapleTreeGrower {
    public static final TreeGrower INSTANCE = new TreeGrower(
            "cluttered_maple",
            Optional.empty(),
            Optional.of(ClutteredConfiguredFeatures.MAPLE_KEY),
            Optional.empty());

    private MapleTreeGrower() {
    }
}
