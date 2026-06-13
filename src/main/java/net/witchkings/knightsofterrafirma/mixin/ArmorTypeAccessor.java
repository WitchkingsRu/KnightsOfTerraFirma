package net.witchkings.knightsofterrafirma.mixin;

import net.minecraft.world.item.ArmorItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import com.magistuarmory.item.armor.ArmorType;

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


    @Accessor("bootsDurability")
    int getBootsDurability();

    @Mutable
    @Accessor("bootsDurability")
    void setBootsDurability(int value);

    @Accessor("leggingsDurability")
    int getLeggingsDurability();

    @Mutable
    @Accessor("leggingsDurability")
    void setLeggingsDurability(int value);

    @Accessor("chestplateDurability")
    int getChestplateDurability();

    @Mutable
    @Accessor("chestplateDurability")
    void setChestplateDurability(int value);

    @Accessor("helmetDurability")
    int getHelmetDurability();

    @Mutable
    @Accessor("helmetDurability")
    void setHelmetDurability(int value);


    @Accessor("bootsDefense")
    int getBootsDefense();

    @Mutable
    @Accessor("bootsDefense")
    void setBootsDefense(int value);

    @Accessor("leggingsDefense")
    int getLeggingsDefense();

    @Mutable
    @Accessor("leggingsDefense")
    void setLeggingsDefense(int value);

    @Accessor("chestplateDefense")
    int getChestplateDefense();

    @Mutable
    @Accessor("chestplateDefense")
    void setChestplateDefense(int value);

    @Accessor("helmetDefense")
    int getHelmetDefense();

    @Mutable
    @Accessor("helmetDefense")
    void setHelmetDefense(int value);
}