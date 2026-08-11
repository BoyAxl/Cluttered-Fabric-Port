package net.redchujelly.cluttered.client;

import net.minecraft.resources.Identifier;
import net.redchujelly.cluttered.Cluttered;

import java.util.function.Supplier;

public final class ClutteredSignTextures {
    private static final String NAMESPACE_MARKER = Cluttered.MODID + ":";

    private ClutteredSignTextures() {
    }

    public static Identifier resolveGuiTexture(String vanillaPath, Supplier<Identifier> fallback) {
        int namespaceIndex = vanillaPath.indexOf(NAMESPACE_MARKER);
        if (namespaceIndex < 0) {
            return fallback.get();
        }

        String path = vanillaPath.substring(0, namespaceIndex)
                + vanillaPath.substring(namespaceIndex + NAMESPACE_MARKER.length());
        return Identifier.fromNamespaceAndPath(Cluttered.MODID, path);
    }
}
