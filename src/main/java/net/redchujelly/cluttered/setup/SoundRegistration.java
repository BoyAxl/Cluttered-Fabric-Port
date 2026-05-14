package net.redchujelly.cluttered.setup;

import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redchujelly.cluttered.Cluttered;

public class SoundRegistration {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Cluttered.MODID);

    public static final RegistryObject<SoundEvent> POLAROID_FLASH = registerSoundEvent("polaroid_flash");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        Identifier id = Identifier.fromNamespaceAndPath(Cluttered.MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void register(BusGroup eventBus){SOUND_EVENTS.register(eventBus);}
}
