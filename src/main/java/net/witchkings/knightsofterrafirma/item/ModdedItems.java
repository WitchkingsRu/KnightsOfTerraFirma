package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.*;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Item;
import com.magistuarmory.api.item.ModItemsProvider;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static com.magistuarmory.item.WeaponTypes.*;


public class ModdedItems extends ModItemsProvider{
    public static ModdedItems INSTANCE = new ModdedItems();
    public static ModItemTier BISMUTH_BRONZE = new ModItemTier("bismuth_bronze", 2, 1200, 6.0F, 2.0F, 15, Platform.isForge() ? "forge:ingots/bismuth_bronze" : "c:bismuth_bronze_ingots", 2);
    public static ModItemTier BLACK_BRONZE = new ModItemTier("black_bronze", 2, 1460, 6.0F, 2.0F, 15, Platform.isForge() ? "forge:ingots/black_bronze" : "c:black_bronze_ingots", 2);
    public static ModItemTier BLACK_STEEL = new ModItemTier("black_steel", 4, 4200, 8.0F, 4.0F, 15, Platform.isForge() ? "forge:ingots/black_steel" : "c:black_steel_ingots", 4);
    public static ModItemTier BLUE_STEEL = new ModItemTier("blue_steel", 5, 6500, 9.0F, 5.0F, 15, Platform.isForge() ? "forge:ingots/blue_steel" : "c:blue_steel_ingots", 5);
    public static ModItemTier RED_STEEL = new ModItemTier("red_steel", 5, 6500, 9.0F, 5.0F, 15, Platform.isForge() ? "forge:ingots/red_steel" : "c:red_steel_ingots", 5);

    public static RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_BASTARDSWORD = INSTANCE.addMedievalWeaponItem("bismuth_bronze_bastard_sword", new Properties(), BISMUTH_BRONZE, WeaponTypes.BASTARD_SWORD);
    public static RegistrySupplier<Item> BISMUTH_BRONZE_CONCAVE_HEAD = INSTANCE.addIngredientItem("bismuth_bronze_concave_halberd_head", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> BASCINET_VISOR = INSTANCE.addIngredientItem("bascinet_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> CHAINMAIL_HELMET = INSTANCE.addIngredientItem("chainmail_helmet_unfinished", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> CHAINMAIL_TORSO = INSTANCE.addIngredientItem("chainmail_torso", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> CRUSADER_KNEES = INSTANCE.addIngredientItem("crusader_knees", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> CRUSADER_VISOR = INSTANCE.addIngredientItem("crusader_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> GOTHIC_VISOR = INSTANCE.addIngredientItem("gothic_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> GRAND_BASCINET_VISOR = INSTANCE.addIngredientItem("grand_bascinet_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> JOUSTING_VISOR = INSTANCE.addIngredientItem("jousting_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> HALFARMOR_HELMET = INSTANCE.addIngredientItem("halfarmor_helmet_unfinished", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> HALFARMOR_BODY = INSTANCE.addIngredientItem("halfarmor_chestplate_unfinished", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> HALFARMOR_SHOULDER = INSTANCE.addIngredientItem("halfarmor_shoulder_pads", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> KNIGHT_VISOR = INSTANCE.addIngredientItem("knight_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> MAXIMILIAN_VISOR = INSTANCE.addIngredientItem("maximillian_visor", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> HELMET_NOSE = INSTANCE.addIngredientItem("norman_helmet_nose", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> PLATEMAIL_ARMS = INSTANCE.addIngredientItem("platemail_arms", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> PLATEMAIL_HAT = INSTANCE.addIngredientItem("platemail_helmet_unfinished", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> PLATEMAIL_KNEES = INSTANCE.addIngredientItem("platemail_knees", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> SHISHAK = INSTANCE.addIngredientItem("shishak_helmet_mask", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> XIV_ARMS = INSTANCE.addIngredientItem("xivcenturyknight_arms", () -> {
        return new Item(new Item.Properties());
    });
    public static RegistrySupplier<Item> XIV_KNEES = INSTANCE.addIngredientItem("xivcenturyknight_knees", () -> {
        return new Item(new Item.Properties());
    });

    public static final ArrayList<RegistrySupplier<MedievalWeaponItem>> listWeapons = new ArrayList<>();

    public static final ArrayList<RegistrySupplier<Item>> listParts = new ArrayList<>();
    public static final ArrayList<RegistrySupplier<Item>> listArmorParts = new ArrayList<>();

    public static ArrayList<ModItemTier> Materials = new ArrayList<>(){{
        add(BISMUTH_BRONZE);
        add(BLACK_BRONZE);
        add(BLACK_STEEL);
        add(BLUE_STEEL);
        add(RED_STEEL);
    }};

    public static ArrayList<String> PartsMaterials = new ArrayList<>(){{
        add("bismuth_bronze");
        add("black_bronze");
        add("bronze");
        add("copper");
        add("iron");
        add("steel");
        add("red_steel");
        add("blue_steel");
        add("black_steel");
    }};
    public static ArrayList<String> WeaponParts = new ArrayList<>() {{
        add("stiletto_blade");
        add("short_sword_blade");
        add("katzbalger_blade");
        add("ranseur_head");
        add("ahlspiess_blade");
        add("bastard_sword_blade");
        add("estoc_blade");
        add("claymore_blade");
        add("zweihander_blade");
        add("flame_bladed_sword_blade");
        add("lochaber_axe_blade");
        add("concave_halberd_head");
        add("heavy_war_hammer_head");
        add("lucerne_hammer_head");
        add("guisarme_head");
        add("flail_head");
        add("morningstar_head");
        add("heavy_mace_head");
        add("shield_brace");
    }};
    public static TreeMap<String,WeaponType> Weapons = new TreeMap<>(){{
        put("stiletto", STILETTO);
        put("short_sword", SHORT_SWORD);
        put("katzbalger", KATZBALGER);
        put("pike", PIKE);
        put("ranseur", RANSEUR);
        put("ahlspiess", AHLSPIESS);
        put("giant_lance", GIANT_LANCE);
        put("bastard_sword", BASTARD_SWORD);
        put("estoc", ESTOC);
        put("claymore", CLAYMORE);
        put("zweihander", ZWEIHANDER);
        put("flame_bladed_sword", FLAME_BLADED_SWORD);
        put("lochaber_axe", LOCHABER_AXE);
        put("concave_edged_halberd", CONCAVE_EDGED_HALBERD);
        put("heavy_mace", HEAVY_MACE);
        put("heavy_war_hammer", HEAVY_WAR_HAMMER);
        put("lucerne_hammer", LUCERNE_HAMMER);
        put("morningstar", MORNINGSTAR);
        put("flail", FLAIL);
        put("guisarme", GUISARME);
    }};

    public static ArrayList<String> ArmorParts = new ArrayList<>(){{
        add("arms");
        add("pants");
        add("knees");
    }};

    public static ArrayList<String> ArmorTypes = new ArrayList<>(){{
        add("knight");
        add("gothic");
        add("maximilian");
        add("chainmail");
        add("jousting");
        add("kastenbrust");
    }};

    public static void weaponRegistry() {
        for (Map.Entry<String, WeaponType> Weapon:Weapons.entrySet()) {
            for (ModItemTier Material:Materials) {
                if (Weapon.getValue() == BASTARD_SWORD && Material.getMaterialName() == "bismuth_bronze") {

                }
                else {
                    listWeapons.add(INSTANCE.addMedievalWeaponItem(Material.getMaterialName() + "_" + Weapon.getKey(), new Properties(), Material, Weapon.getValue()));
                }
            }
        }
        for (String WeaponPart:WeaponParts) {
            for (String Material:PartsMaterials) {
                if (WeaponPart == "concave_halberd_head" && Material == "bismuth_bronze") {
                }
                else {
                    listParts.add(INSTANCE.addIngredientItem(Material+"_"+WeaponPart, () -> {
                        return new Item(new Item.Properties());
                    }));
                }
            }
        }
        for (String ArmorPart:ArmorParts) {
            for (String ArmorType:ArmorTypes) {
                listArmorParts.add(INSTANCE.addIngredientItem(ArmorType+"_"+ArmorPart, () -> {
                    return new Item(new Item.Properties());
                }));
            }
        }


    }

    public ModdedItems() {
        super("knightsofterrafirma");
    }

;}
