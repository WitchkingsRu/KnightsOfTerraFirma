package net.witchkings.knightsofterrafirma.mixin;

import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.armor.ArmorTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModItemTier.class)
public class ModItemTierMixin {

    @Shadow @Mutable private int uses;
    @Shadow @Mutable private float attackDamageBonus;

    @Inject(method = "<init>(Ljava/lang/String;Lnet/minecraft/world/item/Tier;F)V", at = @At("TAIL"))
    private void onInit(String name, Tier tier, float density, CallbackInfo ci) {
        System.out.println("ModItemTier constructor with Tier called. Original uses: " + this.uses);
        if (name == "iron"){
            this.uses = 2200;
            this.attackDamageBonus = 2.5F;
        }
        System.out.println("Modified uses: " + this.uses);
    }

    @Inject(method = "<init>(Ljava/lang/String;IIFFILjava/lang/String;F)V", at = @At("TAIL"))
    private void onInit(String name, int level, int uses, float speed, float attack, int enchantment, String repairitemtag, float density, CallbackInfo ci) {
        // Modify the `uses` value here. For example, doubling the provided value.
        System.out.println("ModItemTier constructor with parameters called. Original uses: " + this.uses);
        switch (name) {
            case "bronze":
                this.uses = 1200;
                break;
            case "copper":
                this.uses = 600;
                break;
            case "steel":
                this.uses = 3300;
                this.attackDamageBonus = 3.5F;
                break;
            case "tin":
                this.uses = 50;
                break;
            case "silver":
                this.uses = 50;
                break;
            default:
                System.out.println("Modified uses: " + this.uses);
        }
        System.out.println("Modified uses: " + this.uses);
    }
}
