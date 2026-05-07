package com.zyphron.memoryleakfix.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MemoryLeakMixin {

    @Inject(at = @At("HEAD"), method = "close")
    private void onClose(CallbackInfo info) {
        System.gc();
    }
}
