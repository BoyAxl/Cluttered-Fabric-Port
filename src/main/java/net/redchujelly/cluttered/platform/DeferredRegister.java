package net.redchujelly.cluttered.platform;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public final class DeferredRegister<T> {
    private final Registry<T> registry;
    private final ResourceKey<? extends Registry<T>> registryKey;
    private final String namespace;
    private final List<RegistryObject<? extends T>> entries = new ArrayList<>();

    private DeferredRegister(Registry<T> registry, ResourceKey<? extends Registry<T>> registryKey, String namespace) {
        this.registry = registry;
        this.registryKey = registryKey;
        this.namespace = namespace;
    }

    public static <T> DeferredRegister<T> create(Registry<T> registry, String namespace) {
        return new DeferredRegister<>(registry, registry.key(), namespace);
    }

    public static <T> DeferredRegister<T> create(ResourceKey<? extends Registry<T>> registryKey, String namespace) {
        return new DeferredRegister<>(null, registryKey, namespace);
    }

    public <I extends T> RegistryObject<I> register(String name, Supplier<? extends I> supplier) {
        RegistryObject<I> entry = new RegistryObject<>(this, Identifier.fromNamespaceAndPath(namespace, name), supplier);
        entries.add(entry);
        return entry;
    }

    public void register(BusGroup ignored) {
        for (RegistryObject<? extends T> entry : entries) {
            entry.get();
        }
    }

    public List<RegistryObject<? extends T>> entries() {
        return List.copyOf(entries);
    }

    public ResourceKey<T> key(String name) {
        return ResourceKey.create(registryKey, Identifier.fromNamespaceAndPath(namespace, name));
    }

    @SuppressWarnings("unchecked")
    <I extends T> I registerNow(RegistryObject<I> entry) {
        I value = entry.supplier().get();
        Registry<I> target = (Registry<I>) registry();
        I registered = Registry.register(target, entry.id(), value);
        entry.setValue(registered);
        return registered;
    }

    @SuppressWarnings("unchecked")
    private Registry<T> registry() {
        if (registry != null) {
            return registry;
        }
        return (Registry<T>) BuiltInRegistries.REGISTRY.getValue(registryKey.identifier());
    }
}
