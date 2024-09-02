package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.armor.ArmorTypes;


public class EKArmor {
    public static void init() {
        // Call the method to apply all armor modifications at once
        ArmorModifier.modifyArmorType(ArmorTypes.KNIGHT,
                300, 400, 450, 350,  // Durability values
                3, 6, 9, 3, 1.25F, 2.5F);         // Defense values);

        // Other initialization code for your mod can go here
    }
}
