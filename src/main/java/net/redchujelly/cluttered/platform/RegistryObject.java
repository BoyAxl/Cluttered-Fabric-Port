package net.redchujelly.cluttered.platform;

import net.minecraft.resources.Identifier;

import java.util.Objects;
import java.util.function.Supplier;

public final class RegistryObject<T> implements Supplier<T> {
    private final DeferredRegister<? super T> owner;
    private final Identifier id;
    private final Supplier<? extends T> supplier;
    private T value;

    RegistryObject(DeferredRegister<? super T> owner, Identifier id, Supplier<? extends T> supplier) {
        this.owner = owner;
        this.id = id;
        this.supplier = supplier;
    }

    @Override
    public T get() {
        if (value == null) {
            value = owner.registerNow(this);
        }
        return value;
    }

    Identifier id() {
        return id;
    }

    Supplier<? extends T> supplier() {
        return supplier;
    }

    void setValue(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public Identifier getId() {
        return id;
    }
}
