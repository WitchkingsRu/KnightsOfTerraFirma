package net.witchkings.knightsofterrafirma.mixin;

import net.minecraft.world.item.ArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import com.magistuarmory.item.armor.ArmorType; // Replace with the actual package and class for ArmorType

import java.util.EnumMap;

@Mixin(ArmorType.class)
public interface ArmorTypeAccessor {

    // Accessor for the toughness field
    @Accessor("toughness")
    float getToughness();

    @Accessor("toughness")
    void setToughness(float toughness);

    // Accessor for the knockbackResistance field
    @Accessor("knockbackResistance")
    float getKnockbackResistance();

    @Accessor("knockbackResistance")
    void setKnockbackResistance(float knockbackResistance);


    @Accessor("durability")
    EnumMap<ArmorItem.Type, Integer> getDurability();

    @Mutable
    @Accessor("durability")
    void setDurability(EnumMap<ArmorItem.Type, Integer> durability);

    @Accessor("defenseForSlot")
    EnumMap<ArmorItem.Type, Integer> getDefenseForSlot();

    @Mutable
    @Accessor("defenseForSlot")
    void setDefenseForSlot(EnumMap<ArmorItem.Type, Integer> defenseForSlot);
}