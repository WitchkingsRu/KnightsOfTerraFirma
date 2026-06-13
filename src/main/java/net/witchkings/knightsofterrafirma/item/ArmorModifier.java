package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.armor.ArmorType;
import net.witchkings.knightsofterrafirma.mixin.ArmorTypeAccessor;
import net.minecraft.world.item.ArmorItem; // Adjust import

public class ArmorModifier {
    public static void modifyArmorType(ArmorType armorType,
                                       int bootsDurability, int leggingsDurability, int chestplateDurability, int helmetDurability,
                                       int bootsDefense, int leggingsDefense, int chestplateDefense, int helmetDefense, float toughness, float knockbackResistance) {

        // Cast to ArmorTypeAccessor to gain access to accessor methods
        ArmorTypeAccessor armorTypeAccessor = (ArmorTypeAccessor) (Object) armorType;

        // Modify the durability For Each Slot
        armorTypeAccessor.setBootsDurability(bootsDurability);
        armorTypeAccessor.setLeggingsDurability(leggingsDurability);
        armorTypeAccessor.setChestplateDurability(chestplateDurability);
        armorTypeAccessor.setHelmetDurability(helmetDurability);

        // Modify the defense For Each Slot
        armorTypeAccessor.setBootsDefense(bootsDefense);
        armorTypeAccessor.setLeggingsDefense(leggingsDefense);
        armorTypeAccessor.setChestplateDefense(chestplateDefense);
        armorTypeAccessor.setHelmetDefense(helmetDefense);

        armorTypeAccessor.setToughness(toughness);
        armorTypeAccessor.setKnockbackResistance(knockbackResistance);
    }

}