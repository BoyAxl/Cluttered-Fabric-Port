package net.redchujelly.cluttered.setup;

import net.fabricmc.fabric.api.registry.FuelValueEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.redchujelly.cluttered.platform.BusGroup;
import net.redchujelly.cluttered.platform.DeferredRegister;
import net.redchujelly.cluttered.platform.FabricRegistries;
import net.redchujelly.cluttered.platform.RegistryObject;
import net.redchujelly.cluttered.Cluttered;
import net.redchujelly.cluttered.item.HandDrillItem;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistration {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(FabricRegistries.ITEMS, Cluttered.MODID);
    private static final List<FuelEntry> FUEL_ITEMS = new ArrayList<>();

    private record FuelEntry(RegistryObject<? extends Item> item, int burnTime) {
    }

    public static final RegistryObject<Item> HAND_DRILL = ITEMS.register("hand_drill",
            () -> new HandDrillItem(itemProperties("hand_drill").stacksTo(1)));

    public static final RegistryObject<Item> WILLOW_SIGN = registerSign("willow", BlockRegistration.WILLOW_SIGN, BlockRegistration.WILLOW_WALL_SIGN);
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = registerHangingSign("willow", BlockRegistration.WILLOW_HANGING_SIGN, BlockRegistration.WILLOW_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> FLOWERING_WILLOW_SIGN = registerSign("flowering_willow", BlockRegistration.FLOWERING_WILLOW_SIGN, BlockRegistration.FLOWERING_WILLOW_WALL_SIGN);
    public static final RegistryObject<Item> FLOWERING_WILLOW_HANGING_SIGN = registerHangingSign("flowering_willow", BlockRegistration.FLOWERING_WILLOW_HANGING_SIGN, BlockRegistration.FLOWERING_WILLOW_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> POPLAR_SIGN = registerSign("poplar", BlockRegistration.POPLAR_SIGN, BlockRegistration.POPLAR_WALL_SIGN);
    public static final RegistryObject<Item> POPLAR_HANGING_SIGN = registerHangingSign("poplar", BlockRegistration.POPLAR_HANGING_SIGN, BlockRegistration.POPLAR_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> FLOWERING_POPLAR_SIGN = registerSign("flowering_poplar", BlockRegistration.FLOWERING_POPLAR_SIGN, BlockRegistration.FLOWERING_POPLAR_WALL_SIGN);
    public static final RegistryObject<Item> FLOWERING_POPLAR_HANGING_SIGN = registerHangingSign("flowering_poplar", BlockRegistration.FLOWERING_POPLAR_HANGING_SIGN, BlockRegistration.FLOWERING_POPLAR_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> CRABAPPLE_SIGN = registerSign("crabapple", BlockRegistration.CRABAPPLE_SIGN, BlockRegistration.CRABAPPLE_WALL_SIGN);
    public static final RegistryObject<Item> CRABAPPLE_HANGING_SIGN = registerHangingSign("crabapple", BlockRegistration.CRABAPPLE_HANGING_SIGN, BlockRegistration.CRABAPPLE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> FLOWERING_CRABAPPLE_SIGN = registerSign("flowering_crabapple", BlockRegistration.FLOWERING_CRABAPPLE_SIGN, BlockRegistration.FLOWERING_CRABAPPLE_WALL_SIGN);
    public static final RegistryObject<Item> FLOWERING_CRABAPPLE_HANGING_SIGN = registerHangingSign("flowering_crabapple", BlockRegistration.FLOWERING_CRABAPPLE_HANGING_SIGN, BlockRegistration.FLOWERING_CRABAPPLE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> SYCAMORE_SIGN = registerSign("sycamore", BlockRegistration.SYCAMORE_SIGN, BlockRegistration.SYCAMORE_WALL_SIGN);
    public static final RegistryObject<Item> SYCAMORE_HANGING_SIGN = registerHangingSign("sycamore", BlockRegistration.SYCAMORE_HANGING_SIGN, BlockRegistration.SYCAMORE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> MAPLE_SIGN = registerSign("fluorescent_maple", BlockRegistration.MAPLE_SIGN, BlockRegistration.MAPLE_WALL_SIGN);
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = registerHangingSign("fluorescent_maple", BlockRegistration.MAPLE_HANGING_SIGN, BlockRegistration.MAPLE_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> BLUE_MUSHROOM_SIGN = registerSign("blue_mushroom", BlockRegistration.BLUE_MUSHROOM_SIGN, BlockRegistration.BLUE_MUSHROOM_WALL_SIGN);
    public static final RegistryObject<Item> BLUE_MUSHROOM_HANGING_SIGN = registerHangingSign("blue_mushroom", BlockRegistration.BLUE_MUSHROOM_HANGING_SIGN, BlockRegistration.BLUE_MUSHROOM_WALL_HANGING_SIGN);
    public static final RegistryObject<Item> RED_MUSHROOM_SIGN = registerSign("red_mushroom", BlockRegistration.RED_MUSHROOM_SIGN, BlockRegistration.RED_MUSHROOM_WALL_SIGN);
    public static final RegistryObject<Item> RED_MUSHROOM_HANGING_SIGN = registerHangingSign("red_mushroom", BlockRegistration.RED_MUSHROOM_HANGING_SIGN, BlockRegistration.RED_MUSHROOM_WALL_HANGING_SIGN);

    public static void register(BusGroup eventBus) {
        ITEMS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registerSign(String name, RegistryObject<T> floorSign, RegistryObject<T> wallSign) {
        String itemName = name + "_sign";
        RegistryObject<Item> item = ITEMS.register(itemName,
                () -> new SignItem(floorSign.get(), wallSign.get(), itemProperties(itemName).stacksTo(16)){
                    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                        return 200;
                    }
                });
        FUEL_ITEMS.add(new FuelEntry(item, 200));
        return item;
    }

    private static <T extends Block> RegistryObject<Item> registerHangingSign(String name, RegistryObject<T> floorSign, RegistryObject<T> wallSign) {
        String itemName = name + "_hanging_sign";
        RegistryObject<Item> item = ITEMS.register(itemName,
                () -> new HangingSignItem(floorSign.get(), wallSign.get(), itemProperties(itemName).stacksTo(16)){
                    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                        return 200;
                    }
                });
        FUEL_ITEMS.add(new FuelEntry(item, 200));
        return item;
    }

    public static void registerFabricContent() {
        FuelValueEvents.BUILD.register((builder, context) -> {
            for (FuelEntry entry : FUEL_ITEMS) {
                builder.add(entry.item().get(), entry.burnTime());
            }
        });
    }

    private static Item.Properties itemProperties(String name) {
        return new Item.Properties().setId(ITEMS.key(name));
    }
    
}
