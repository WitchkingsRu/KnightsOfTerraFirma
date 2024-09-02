package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.armor.ArmorType;
import net.witchkings.knightsofterrafirma.mixin.ArmorTypeAccessor;
import net.minecraft.world.item.ArmorItem; // Adjust import
import java.util.EnumMap;

public class ArmorModifier {
    public static void modifyArmorType(ArmorType armorType,
                                       int bootsDurability, int leggingsDurability, int chestplateDurability, int helmetDurability,
                                       int bootsDefense, int leggingsDefense, int chestplateDefense, int helmetDefense, float toughness, float knockbackResistance) {

        // Cast to ArmorTypeAccessor to gain access to accessor methods
        ArmorTypeAccessor armorTypeAccessor = (ArmorTypeAccessor) (Object) armorType;

        // Modify the durability EnumMap
        EnumMap<ArmorItem.Type, Integer> durability = armorTypeAccessor.getDurability();
        durability.put(ArmorItem.Type.BOOTS, bootsDurability);
        durability.put(ArmorItem.Type.LEGGINGS, leggingsDurability);
        durability.put(ArmorItem.Type.CHESTPLATE, chestplateDurability);
        durability.put(ArmorItem.Type.HELMET, helmetDurability);
        armorTypeAccessor.setDurability(durability);

        // Modify the defenseForSlot EnumMap
        EnumMap<ArmorItem.Type, Integer> defenseForSlot = armorTypeAccessor.getDefenseForSlot();
        defenseForSlot.put(ArmorItem.Type.BOOTS, bootsDefense);
        defenseForSlot.put(ArmorItem.Type.LEGGINGS, leggingsDefense);
        defenseForSlot.put(ArmorItem.Type.CHESTPLATE, chestplateDefense);
        defenseForSlot.put(ArmorItem.Type.HELMET, helmetDefense);
        armorTypeAccessor.setDefenseForSlot(defenseForSlot);

        armorTypeAccessor.setToughness(toughness);
        armorTypeAccessor.setKnockbackResistance(knockbackResistance);

        System.out.println("Modified " + armorType + " with new durability and defense values.");
    }

}
