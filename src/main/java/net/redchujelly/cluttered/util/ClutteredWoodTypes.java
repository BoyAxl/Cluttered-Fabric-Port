package net.redchujelly.cluttered.util;

import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.redchujelly.cluttered.Cluttered;

public class ClutteredWoodTypes {
    public static final WoodType WILLOW = register("willow", BlockSetType.OAK);
    public static final WoodType FLOWERING_WILLOW = register("flowering_willow", BlockSetType.OAK);
    public static final WoodType POPLAR = register("poplar", BlockSetType.OAK);
    public static final WoodType FLOWERING_POPLAR = register("flowering_poplar", BlockSetType.OAK);
    public static final WoodType CRABAPPLE = register("crabapple", BlockSetType.OAK);
    public static final WoodType FLOWERING_CRABAPPLE = register("flowering_crabapple", BlockSetType.OAK);
    public static final WoodType SYCAMORE = register("sycamore", BlockSetType.OAK);
    public static final WoodType MAPLE = register("fluorescent_maple", BlockSetType.OAK);
    public static final WoodType RED_MUSHROOM = register("red_mushroom", BlockSetType.CRIMSON);
    public static final WoodType BLUE_MUSHROOM = register("blue_mushroom", BlockSetType.WARPED);

    private static WoodType register(String name, BlockSetType blockSetType) {
        return WoodTypeBuilder.copyOf(WoodType.OAK).register(Identifier.fromNamespaceAndPath(Cluttered.MODID, name), blockSetType);
    }
}
