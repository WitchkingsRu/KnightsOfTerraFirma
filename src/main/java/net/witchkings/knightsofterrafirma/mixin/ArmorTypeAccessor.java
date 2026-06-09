package net.witchkings.knightsofterrafirma.mixin;

import net.minecraft.world.item.ArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import com.magistuarmory.item.armor.ArmorType; // Replace with the actual package and class for ArmorType

@Mixin(value = ArmorType.class, priority = 10000)
public interface ArmorTypeAccessor {

    // Accessor for the toughness field
    @Accessor("toughness")
    float getToughness();

    @Mutable
    @Accessor("toughness")
    void setToughness(float toughness);

    // Accessor for the knockbackResistance field
    @Accessor("knockbackResistance")
    float getKnockbackResistance();

    @Mutable
    @Accessor("knockbackResistance")
    void setKnockbackResistance(float knockbackResistance);


    @Accessor("durability")
    int[] getDurability();

    @Mutable
    @Accessor("durability")
    void setDurability(int[] durability);

    @Accessor("defenseForSlot")
    int[] getDefenseForSlot();

    @Mutable
    @Accessor("defenseForSlot")
    void setDefenseForSlot(int[] defenseForSlot);
}
