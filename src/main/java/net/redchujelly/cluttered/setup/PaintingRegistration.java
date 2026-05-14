package net.redchujelly.cluttered.setup;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;

import java.util.Optional;

public class PaintingRegistration {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, Cluttered.MODID);

    public static final RegistryObject<PaintingVariant> MIMIKYU = register("mimikyu", 1, 1);
    public static final RegistryObject<PaintingVariant> CANDLE = register("candle", 1, 1);
    public static final RegistryObject<PaintingVariant> CAT_SHORT = register("cat_short", 1, 1);
    public static final RegistryObject<PaintingVariant> BEACH_CROW = register("crow_on_a_beach", 1, 1);
    public static final RegistryObject<PaintingVariant> EGGPLANTS = register("eggplants_lynnhays", 1, 1);
    public static final RegistryObject<PaintingVariant> ETIENNE = register("etienne_carolhoffnagle", 1, 1);
    public static final RegistryObject<PaintingVariant> FLOWER_POTS = register("flower_pots", 1, 1);
    public static final RegistryObject<PaintingVariant> LEMONS = register("lemons", 1, 1);
    public static final RegistryObject<PaintingVariant> RED_MUSHROOM = register("red_mushroom", 1, 1);
    public static final RegistryObject<PaintingVariant> HEIDEDAHL = register("stiefmutterchen_heidedahl", 1, 1);
    public static final RegistryObject<PaintingVariant> TWO_CATS = register("two_cats", 1, 1);

    public static final RegistryObject<PaintingVariant> CAT_TALL = register("cat_tall", 1, 2);
    public static final RegistryObject<PaintingVariant> DAY_SKY = register("day_sky", 1, 2);
    public static final RegistryObject<PaintingVariant> NIGHT_SKY = register("night_sky", 1, 2);
    public static final RegistryObject<PaintingVariant> FROGMAN = register("frogman_washington", 1, 2);
    public static final RegistryObject<PaintingVariant> FLAMENETTLE = register("van_gogh_flamenettle", 1, 2);
    public static final RegistryObject<PaintingVariant> SUNFLOWER_VASE = register("vase_of_sunflowers", 1, 2);
    public static final RegistryObject<PaintingVariant> WORM = register("worm", 1, 2);

    public static final RegistryObject<PaintingVariant> BUTTERFLIES = register("pinned_butterflies", 2, 1);
    public static final RegistryObject<PaintingVariant> HORSE = register("van_gogh_horse", 2, 1);

    public static final RegistryObject<PaintingVariant> SUNFLOWER_GOLD = register("gold_sunflower", 2, 2);
    public static final RegistryObject<PaintingVariant> WHEATFIELD = register("van_gogh_wheatfield", 2, 2);
    public static final RegistryObject<PaintingVariant> RIDLEY_FIRE = register("ridley_fire", 2, 2);
    public static final RegistryObject<PaintingVariant> RIDLEY_DIMENSION = register("ridley_dimension", 2, 2);

    private static RegistryObject<PaintingVariant> register(String name, int width, int height) {
        Identifier id = Identifier.fromNamespaceAndPath(Cluttered.MODID, name);
        return PAINTING_VARIANTS.register(name, () -> new PaintingVariant(
                width,
                height,
                id,
                Optional.of(Component.translatable(id.toLanguageKey("painting", "title"))),
                Optional.empty()));
    }

    public static void register(BusGroup eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
