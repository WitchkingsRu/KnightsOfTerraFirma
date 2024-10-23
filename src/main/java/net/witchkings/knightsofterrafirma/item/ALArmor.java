package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.antiquelegacy.item.armor.AddonArmorTypes;
import net.witchkings.knightsofterrafirma.config.ConfigAntique;




public class ALArmor {
    public static void init(ConfigAntique ARMOR_CONFIG) {
        ArmorModifier.modifyArmorType(AddonArmorTypes.ATTIC_HELMET,
                0, 0, 0, ARMOR_CONFIG.AtticHelmetConfig.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.AtticHelmetConfig.helmetDefense, 0, 0);         // Defense values);

    }

}

