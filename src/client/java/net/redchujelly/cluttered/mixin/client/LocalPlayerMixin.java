package net.redchujelly.cluttered.mixin.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.HangingSignEditScreen;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.redchujelly.cluttered.block.entity.ClutteredHangingSignBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LocalPlayer.class)
public abstract class LocalPlayerMixin {
    @Inject(method = "openTextEdit", at = @At("HEAD"), cancellable = true)
    private void cluttered$openHangingSignEditor(SignBlockEntity sign, boolean isFrontText, CallbackInfo ci) {
        if (!(sign instanceof ClutteredHangingSignBlockEntity)) {
            return;
        }

        Minecraft minecraft = Minecraft.getInstance();
        minecraft.gui.setScreen(new HangingSignEditScreen(sign, isFrontText, minecraft.isTextFilteringEnabled()));
        ci.cancel();
    }
}
