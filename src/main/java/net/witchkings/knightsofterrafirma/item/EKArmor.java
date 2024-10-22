package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.armor.ArmorTypes;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.witchkings.knightsofterrafirma.config.ConfigAntique;
import net.witchkings.knightsofterrafirma.config.ConfigArmor;
import net.witchkings.knightsofterrafirma.config.ConfigMain;


public class EKArmor {

    public static void init(ConfigArmor ARMOR_CONFIG) {
        ArmorModifier.modifyArmorType(ArmorTypes.KNIGHT,
                ARMOR_CONFIG.knight.bootsDurability, ARMOR_CONFIG.knight.leggingsDurability, ARMOR_CONFIG.knight.chestplateDurability, 0,
                ARMOR_CONFIG.knight.bootsDefense, ARMOR_CONFIG.knight.leggingsDefense, ARMOR_CONFIG.knight.chestplateDefense, 0, ARMOR_CONFIG.knight.toughness, 3F);         // Defense values);
        ArmorModifier.modifyArmorType(ArmorTypes.ARMET,
                0, 0, 0, ARMOR_CONFIG.armet.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.armet.helmetDefense, ARMOR_CONFIG.armet.toughness, 3F);

        ArmorModifier.modifyArmorType(ArmorTypes.STECHHELM,
                0, 0, 0, ARMOR_CONFIG.stechhelm.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.stechhelm.helmetDefense,
                ARMOR_CONFIG.stechhelm.toughness, 6F);
        ArmorModifier.modifyArmorType(ArmorTypes.JOUSTING,
                ARMOR_CONFIG.jousting.bootsDurability, ARMOR_CONFIG.jousting.leggingsDurability, ARMOR_CONFIG.jousting.chestplateDurability, 0,
                ARMOR_CONFIG.jousting.bootsDefense, ARMOR_CONFIG.jousting.leggingsDefense, ARMOR_CONFIG.jousting.chestplateDefense, 0,
                ARMOR_CONFIG.jousting.toughness, 6F);
        ArmorModifier.modifyArmorType(ArmorTypes.SALLET,
                0, 0, 0, ARMOR_CONFIG.sallet.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.sallet.helmetDefense,
                ARMOR_CONFIG.sallet.toughness, 3F);
        ArmorModifier.modifyArmorType(ArmorTypes.GOTHIC,
                ARMOR_CONFIG.gothic.bootsDurability, ARMOR_CONFIG.gothic.leggingsDurability, ARMOR_CONFIG.gothic.chestplateDurability, 0,
                ARMOR_CONFIG.gothic.bootsDefense, ARMOR_CONFIG.gothic.leggingsDefense, ARMOR_CONFIG.gothic.chestplateDefense, 0,
                ARMOR_CONFIG.gothic.toughness, 3F);
        ArmorModifier.modifyArmorType(ArmorTypes.MAXIMILIAN_HELMET,
                0, 0, 0, ARMOR_CONFIG.maximilianHelmet.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.maximilianHelmet.helmetDefense,
                ARMOR_CONFIG.maximilianHelmet.toughness, 5F);
        ArmorModifier.modifyArmorType(ArmorTypes.MAXIMILIAN,
                ARMOR_CONFIG.maximilian.bootsDurability, ARMOR_CONFIG.maximilian.leggingsDurability, ARMOR_CONFIG.maximilian.chestplateDurability, 0,
                ARMOR_CONFIG.maximilian.bootsDefense, ARMOR_CONFIG.maximilian.leggingsDefense, ARMOR_CONFIG.maximilian.chestplateDefense, 0,
                ARMOR_CONFIG.maximilian.toughness, 5F);
        ArmorModifier.modifyArmorType(ArmorTypes.CHAINMAIL,
                ARMOR_CONFIG.chainmail.bootsDurability, ARMOR_CONFIG.chainmail.leggingsDurability, ARMOR_CONFIG.chainmail.chestplateDurability, ARMOR_CONFIG.chainmail.helmetDurability,
                ARMOR_CONFIG.chainmail.bootsDefense, ARMOR_CONFIG.chainmail.leggingsDefense, ARMOR_CONFIG.chainmail.chestplateDefense, ARMOR_CONFIG.chainmail.helmetDefense,
                ARMOR_CONFIG.chainmail.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.KETTLEHAT,
                0, 0, 0, ARMOR_CONFIG.kettlehat.helmetDurability,
                0 ,0 ,0, ARMOR_CONFIG.kettlehat.helmetDefense,
                ARMOR_CONFIG.kettlehat.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.PLATEMAIL,
                ARMOR_CONFIG.platemail.bootsDurability, ARMOR_CONFIG.platemail.leggingsDurability, ARMOR_CONFIG.platemail.chestplateDurability, 0,
                ARMOR_CONFIG.platemail.bootsDefense, ARMOR_CONFIG.platemail.leggingsDefense, ARMOR_CONFIG.platemail.chestplateDefense, 0,
                ARMOR_CONFIG.platemail.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.BARBUTE,
                0, 0, 0, ARMOR_CONFIG.barbute.helmetDurability,
                0 , 0 ,0, ARMOR_CONFIG.barbute.helmetDefense,
                ARMOR_CONFIG.barbute.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.HALFARMOR,
                0, 0, ARMOR_CONFIG.halfarmor.chestplateDurability, 0,
                0, 0, ARMOR_CONFIG.halfarmor.chestplateDefense, 0,
                ARMOR_CONFIG.halfarmor.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.CRUSADER,
                ARMOR_CONFIG.crusader.bootsDurability, ARMOR_CONFIG.crusader.leggingsDurability, ARMOR_CONFIG.crusader.chestplateDurability, ARMOR_CONFIG.crusader.helmetDurability,
                ARMOR_CONFIG.crusader.bootsDefense, ARMOR_CONFIG.crusader.leggingsDefense, ARMOR_CONFIG.crusader.chestplateDefense, ARMOR_CONFIG.crusader.helmetDefense,
                ARMOR_CONFIG.crusader.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.BRIGANDINE,
                0, 0, ARMOR_CONFIG.brigandine.chestplateDurability, 0,
                0, 0, ARMOR_CONFIG.brigandine.chestplateDefense, 0,
                ARMOR_CONFIG.brigandine.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.CEREMONIAL_ARMET,
                0, 0, 0, ARMOR_CONFIG.ceremonialArmet.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.ceremonialArmet.helmetDefense,
                ARMOR_CONFIG.ceremonialArmet.toughness, 3F);
        ArmorModifier.modifyArmorType(ArmorTypes.CEREMONIAL,
                ARMOR_CONFIG.ceremonial.bootsDurability, 0, ARMOR_CONFIG.ceremonial.chestplateDurability, 0,
                ARMOR_CONFIG.ceremonial.bootsDefense, 0, ARMOR_CONFIG.ceremonial.chestplateDefense, 0,
                ARMOR_CONFIG.ceremonial.toughness, 3F);
        ArmorModifier.modifyArmorType(ArmorTypes.SHISHAK,
                0, 0, 0, ARMOR_CONFIG.shishak.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.shishak.helmetDefense,
                ARMOR_CONFIG.shishak.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.NORMAN,
                0, 0, 0, ARMOR_CONFIG.norman.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.norman.helmetDefense,
                ARMOR_CONFIG.norman.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.BASCINET,
                0, 0, 0, ARMOR_CONFIG.bascinet.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.bascinet.helmetDefense,
                ARMOR_CONFIG.bascinet.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.XIV_CENTURY_KNIGHT,
                ARMOR_CONFIG.xivCenturyKnight.bootsDurability, ARMOR_CONFIG.xivCenturyKnight.leggingsDurability, ARMOR_CONFIG.xivCenturyKnight.chestplateDurability, 0,
                ARMOR_CONFIG.xivCenturyKnight.bootsDefense, ARMOR_CONFIG.xivCenturyKnight.leggingsDefense, ARMOR_CONFIG.xivCenturyKnight.chestplateDefense, 0,
                ARMOR_CONFIG.xivCenturyKnight.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.WINGED_HUSSAR_CHESTPLATE,
                0, 0, ARMOR_CONFIG.wingedHussarChestplate.chestplateDurability, 0,
                0, 0, ARMOR_CONFIG.wingedHussarChestplate.chestplateDefense, 0,
                ARMOR_CONFIG.wingedHussarChestplate.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.CUIRASSIER,
                ARMOR_CONFIG.cuirassier.bootsDurability, ARMOR_CONFIG.cuirassier.leggingsDurability, ARMOR_CONFIG.cuirassier.chestplateDurability, ARMOR_CONFIG.cuirassier.helmetDurability,
                ARMOR_CONFIG.cuirassier.bootsDefense, ARMOR_CONFIG.cuirassier.leggingsDefense, ARMOR_CONFIG.cuirassier.chestplateDefense, ARMOR_CONFIG.cuirassier.helmetDefense,
                ARMOR_CONFIG.cuirassier.toughness, 0F);
        ArmorModifier.modifyArmorType(ArmorTypes.KASTENBRUST,
                ARMOR_CONFIG.kastenbrust.bootsDurability, ARMOR_CONFIG.kastenbrust.leggingsDurability, ARMOR_CONFIG.kastenbrust.chestplateDurability, 0,
                ARMOR_CONFIG.kastenbrust.bootsDefense, ARMOR_CONFIG.kastenbrust.leggingsDefense, ARMOR_CONFIG.kastenbrust.chestplateDefense, 0,
                ARMOR_CONFIG.kastenbrust.toughness, 3F);
        ArmorModifier.modifyArmorType(ArmorTypes.GRAND_BASCINET,
                0, 0, 0, ARMOR_CONFIG.grandBascinet.helmetDurability,
                0, 0, 0, ARMOR_CONFIG.grandBascinet.helmetDefense,
                ARMOR_CONFIG.grandBascinet.toughness, 3F);
        ArmorModifier.modifyArmorType(ArmorTypes.LAMELLAR,
                ARMOR_CONFIG.lamellar.bootsDurability, 0, ARMOR_CONFIG.lamellar.chestplateDurability, 0,
                ARMOR_CONFIG.lamellar.bootsDefense, 0, ARMOR_CONFIG.lamellar.chestplateDefense, 0,
                ARMOR_CONFIG.lamellar.toughness, 0F);
    }

}
