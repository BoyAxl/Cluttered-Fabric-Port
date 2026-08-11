package net.redchujelly.cluttered.mixin.client;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.screens.inventory.SignEditScreen;
import net.minecraft.resources.Identifier;
import net.redchujelly.cluttered.client.ClutteredSignTextures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(SignEditScreen.class)
public abstract class SignEditScreenMixin {
    @WrapOperation(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/resources/Identifier;withDefaultNamespace(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;"
            )
    )
    private Identifier cluttered$resolveSignTexture(String path, Operation<Identifier> original) {
        return ClutteredSignTextures.resolveGuiTexture(path, () -> original.call(path));
    }
}
