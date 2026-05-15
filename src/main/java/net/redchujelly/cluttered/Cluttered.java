package net.redchujelly.cluttered;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.block.ComposterBlock;
import net.redchujelly.cluttered.platform.BusGroup;
import net.redchujelly.cluttered.setup.BlockRegistration;
import net.redchujelly.cluttered.setup.CreativeTabRegistration;
import net.redchujelly.cluttered.setup.EntityTypeRegistration;
import net.redchujelly.cluttered.setup.FoliagePlacerTypeRegistration;
import net.redchujelly.cluttered.setup.ItemRegistration;
import net.redchujelly.cluttered.setup.PaintingRegistration;
import net.redchujelly.cluttered.setup.SoundRegistration;
import net.redchujelly.cluttered.setup.TileEntityRegistration;
import net.redchujelly.cluttered.setup.TreeDecoratorTypeRegistration;
import net.redchujelly.cluttered.setup.TrunkPlacerTypeRegistration;
import org.slf4j.Logger;

public class Cluttered implements ModInitializer {
    public static final String MODID = "cluttered";

    private static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        BusGroup eventBus = BusGroup.INSTANCE;

        SoundRegistration.register(eventBus);
        ItemRegistration.register(eventBus);
        BlockRegistration.register(eventBus);
        TileEntityRegistration.register(eventBus);
        EntityTypeRegistration.register(eventBus);
        PaintingRegistration.register(eventBus);
        TrunkPlacerTypeRegistration.register(eventBus);
        FoliagePlacerTypeRegistration.register(eventBus);
        TreeDecoratorTypeRegistration.register(eventBus);
        CreativeTabRegistration.register(eventBus);

        ItemRegistration.registerFabricContent();
        BlockRegistration.registerFabricContent();
        commonSetup();
        LOGGER.info("Loaded Cluttered Fabric port");
    }

    private void commonSetup() {
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_WILLOW.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.WILLOW_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_POPLAR.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_POPLAR_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.POPLAR_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.FLOWERING_CARPET_CRABAPPLE.get().asItem(), 0.075F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.CRABAPPLE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.SYCAMORE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.SYCAMORE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_LEAVES_FLOWERING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.MAPLE_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.BLUE_MUSHROOM_SAPLING.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(BlockRegistration.RED_MUSHROOM_SAPLING.get().asItem(), 0.65F);

    }
}
