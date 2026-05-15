package net.redchujelly.cluttered.platform;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraft.sounds.SoundEvent;

public final class FabricRegistries {
    public static final Registry<Block> BLOCKS = BuiltInRegistries.BLOCK;
    public static final Registry<Item> ITEMS = BuiltInRegistries.ITEM;
    public static final Registry<SoundEvent> SOUND_EVENTS = BuiltInRegistries.SOUND_EVENT;
    public static final Registry<EntityType<?>> ENTITY_TYPES = BuiltInRegistries.ENTITY_TYPE;
    public static final Registry<BlockEntityType<?>> BLOCK_ENTITY_TYPES = BuiltInRegistries.BLOCK_ENTITY_TYPE;
    public static final Registry<CreativeModeTab> CREATIVE_MODE_TABS = BuiltInRegistries.CREATIVE_MODE_TAB;
    public static final Registry<TrunkPlacerType<?>> TRUNK_PLACER_TYPES = BuiltInRegistries.TRUNK_PLACER_TYPE;
    public static final Registry<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = BuiltInRegistries.FOLIAGE_PLACER_TYPE;
    public static final Registry<TreeDecoratorType<?>> TREE_DECORATOR_TYPES = BuiltInRegistries.TREE_DECORATOR_TYPE;

    private FabricRegistries() {
    }
}
