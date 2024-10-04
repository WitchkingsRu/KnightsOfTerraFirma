package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.ShieldTypes;
import com.magistuarmory.item.armor.ArmorTypes;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.armor.ModArmor;

import java.util.ArrayList;
import java.util.function.Supplier;

import static net.witchkings.knightsofterrafirma.item.ModdedItems.BISMUTH_BRONZE;
import static net.witchkings.knightsofterrafirma.item.ModdedItems.Materials;

public class ModelledItems extends ModItemsProvider {
    public static final ModelledItems INSTANCE = new ModelledItems();
    public static final ArrayList<RegistrySupplier<MedievalShieldItem>> listShields = new ArrayList<>();
    public static void shieldRegistry() {
        for (ModItemTier material: Materials) {
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_heatershield", "heatershield", new Item.Properties(), material, true, true, ShieldTypes.HEATER_SHIELD));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_target", "target", new Item.Properties(), material, false, true, ShieldTypes.TARGET));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_buckler", "buckler", new Item.Properties(), material, false, true, ShieldTypes.BUCKLER));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_rondache", "rondache", new Item.Properties(), material, false, true, ShieldTypes.RONDACHE));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_tartsche", "tartsche", new Item.Properties(), material, true, true, ShieldTypes.TARTSCHE));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_roundshield", "roundshield", new Item.Properties(), material, true, true, ShieldTypes.ROUND_SHIELD));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_pavese", "pavese", new Item.Properties(), material, true, true, ShieldTypes.PAVISE));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_kiteshield", "kiteshield", new Item.Properties(), material, true, true, ShieldTypes.KITE_SHIELD));
            if (material != BISMUTH_BRONZE) {
                listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_ellipticalshield", "ellipticalshield", new Item.Properties(), material, true, true, ShieldTypes.ELLIPTICAL_SHIELD));
            }
        }
    }
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_ARMET = INSTANCE.addKnightItem("black_steel_armet", ModArmor.BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_knight_chestplate", ModArmor.BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_knight_leggings", ModArmor.BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_knight_boots", ModArmor.BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_BARBUTE = INSTANCE.addMedievalArmorItem("black_steel_halfarmor_helmet", ModArmor.BLACKSTEEL_BARBUTE, ArmorItem.Type.HELMET, new Item.Properties());
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_HALFARMOR_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_halfarmor_chestplate", ModArmor.BLACKSTEEL_HALFARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_SALLET = INSTANCE.addMedievalArmorItem("black_steel_sallet", ModArmor.BLACKSTEEL_SALLET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_gothic_chestplate", ModArmor.BLACKSTEEL_GOTHIC_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_gothic_leggings", ModArmor.BLACKSTEEL_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_gothic_boots", ModArmor.BLACKSTEEL_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GRANDBASCINET = INSTANCE.addMedievalArmorItem("black_steel_grand_bascinet", ModArmor.BLACKSTEEL_GRAND_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_kastenbrust_chestplate", ModArmor.BLACKSTEEL_KASTENBRUST_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_kastenbrust_leggings", ModArmor.BLACKSTEEL_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_kastenbrust_boots", ModArmor.BLACKSTEEL_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("black_steel_maximilian_helmet", ModArmor.BLACKSTEEL_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_maximilian_chestplate", ModArmor.BLACKSTEEL_MAXIMILIAN_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_maximilian_leggings", ModArmor.BLACKSTEEL_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_maximilian_boots", ModArmor.BLACKSTEEL_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_JOUSTING_HELMET = INSTANCE.addJoustingItem("black_steel_stechhelm", ModArmor.BLACKSTEEL_JOUSTING_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_JOUSTING_CHESTPLATE = INSTANCE.addJoustingItem("black_steel_jousting_chestplate", ModArmor.BLACKSTEEL_JOUSTING_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_JOUSTING_LEGGINGS = INSTANCE.addJoustingItem("black_steel_jousting_leggings", ModArmor.BLACKSTEEL_JOUSTING, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_JOUSTING_BOOTS = INSTANCE.addJoustingItem("black_steel_jousting_boots", ModArmor.BLACKSTEEL_JOUSTING, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KETTLEHAT = INSTANCE.addMedievalArmorItem("black_steel_kettlehat", ModArmor.BLACKSTEEL_KETTLEHAT, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_PLATEMAIL_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_platemail_chestplate", ModArmor.BLACKSTEEL_PLATEMAIL_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_PLATEMAIL_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_platemail_leggings", ModArmor.BLACKSTEEL_PLATEMAIL, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_PLATEMAIL_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_platemail_boots", ModArmor.BLACKSTEEL_PLATEMAIL, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> GOLD_BLACKSTEEL_ARMET = INSTANCE.addKnightItem("gold_black_steel_armet", ModArmor.GOLD_BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("gold_black_steel_knight_chestplate", ModArmor.GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> GOLD_BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("gold_black_steel_knight_leggings", ModArmor.GOLD_BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> GOLD_BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("gold_black_steel_knight_boots", ModArmor.GOLD_BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> SILVER_BLACKSTEEL_ARMET = INSTANCE.addKnightItem("silver_black_steel_armet", ModArmor.SILVER_BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> SILVER_BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("silver_black_steel_knight_chestplate", ModArmor.SILVER_BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> SILVER_BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("silver_black_steel_knight_leggings", ModArmor.SILVER_BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> SILVER_BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("silver_black_steel_knight_boots", ModArmor.SILVER_BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ST_SILVER_BLACKSTEEL_ARMET = INSTANCE.addKnightItem("sterling_silver_black_steel_armet", ModArmor.ST_SILVER_BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ST_SILVER_BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("sterling_silver_black_steel_knight_chestplate", ModArmor.ST_SILVER_BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ST_SILVER_BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("sterling_silver_black_steel_knight_leggings", ModArmor.ST_SILVER_BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ST_SILVER_BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("sterling_silver_black_steel_knight_boots", ModArmor.ST_SILVER_BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BRASS_BLACKSTEEL_ARMET = INSTANCE.addKnightItem("brass_black_steel_armet", ModArmor.BRASS_BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BRASS_BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("brass_black_steel_knight_chestplate", ModArmor.BRASS_BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BRASS_BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("brass_black_steel_knight_leggings", ModArmor.BRASS_BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BRASS_BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("brass_black_steel_knight_boots", ModArmor.BRASS_BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_BLACKSTEEL_ARMET = INSTANCE.addKnightItem("rose_gold_black_steel_armet", ModArmor.ROSE_GOLD_BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("rose_gold_black_steel_knight_chestplate", ModArmor.ROSE_GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("rose_gold_black_steel_knight_leggings", ModArmor.ROSE_GOLD_BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("rose_gold_black_steel_knight_boots", ModArmor.ROSE_GOLD_BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    public static final RegistrySupplier<MedievalArmorItem> SILVER_STEEL_CEREMONIAL_ARMET = INSTANCE.addKnightItem("silver_steel_ceremonialarmet", ModArmor.SILVER_STEEL_CEREMONIAL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> SILVER_STEEL_CEREMONIAL_CHESTPLATE = INSTANCE.addMedievalArmorItem("silver_steel_ceremonial_chestplate", ModArmor.SILVER_STEEL_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> SILVER_STEEL_CEREMONIAL_BOOTS = INSTANCE.addMedievalArmorItem("silver_steel_ceremonial_boots", ModArmor.SILVER_STEEL_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final RegistrySupplier<MedievalArmorItem> STERLING_SILVER_STEEl_CEREMONIAL_ARMET = INSTANCE.addKnightItem("sterling_silver_steel_ceremonialarmet", ModArmor.STERLING_SILVER_STEEL_CEREMONIAL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> STERLING_SILVER_STEEL_CEREMONIAL_CHESTPLATE = INSTANCE.addMedievalArmorItem("sterling_silver_steel_ceremonial_chestplate", ModArmor.STERLING_SILVER_STEEL_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> STERLING_SILVER_STEEL_CEREMONIAL_BOOTS = INSTANCE.addMedievalArmorItem("sterling_silver_steel_ceremonial_boots", ModArmor.STERLING_SILVER_STEEL_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final RegistrySupplier<MedievalArmorItem> BRASS_STEEl_CEREMONIAL_ARMET = INSTANCE.addKnightItem("brass_steel_ceremonialarmet", ModArmor.BRASS_STEEL_CEREMONIAL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> BRASS_STEEL_CEREMONIAL_CHESTPLATE = INSTANCE.addMedievalArmorItem("brass_steel_ceremonial_chestplate", ModArmor.BRASS_STEEL_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> BRASS_STEEL_CEREMONIAL_BOOTS = INSTANCE.addMedievalArmorItem("brass_steel_ceremonial_boots", ModArmor.BRASS_STEEL_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties());

    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_STEEl_CEREMONIAL_ARMET = INSTANCE.addKnightItem("rose_gold_steel_ceremonialarmet", ModArmor.ROSE_GOLD_STEEL_CEREMONIAL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_STEEL_CEREMONIAL_CHESTPLATE = INSTANCE.addMedievalArmorItem("rose_gold_steel_ceremonial_chestplate", ModArmor.ROSE_GOLD_STEEL_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> ROSE_GOLD_STEEL_CEREMONIAL_BOOTS = INSTANCE.addMedievalArmorItem("rose_gold_steel_ceremonial_boots", ModArmor.ROSE_GOLD_STEEL_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties());

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ARMET = INSTANCE.addKnightItem("blue_steel_armet", ModArmor.BLUESTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("blue_steel_knight_chestplate", ModArmor.BLUESTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("blue_steel_knight_leggings", ModArmor.BLUESTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("blue_steel_knight_boots", ModArmor.BLUESTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOLD_ARMET = INSTANCE.addKnightItem("gold_blue_steel_armet", ModArmor.BLUESTEEL_GOLD_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOLD_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("gold_blue_steel_knight_chestplate", ModArmor.BLUESTEEL_GOLD_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOLD_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("gold_blue_steel_knight_leggings", ModArmor.BLUESTEEL_GOLD_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOLD_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("gold_blue_steel_knight_boots", ModArmor.BLUESTEEL_GOLD_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_SILVER_ARMET = INSTANCE.addKnightItem("silver_blue_steel_armet", ModArmor.BLUESTEEL_SILVER_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_SILVER_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("silver_blue_steel_knight_chestplate", ModArmor.BLUESTEEL_SILVER_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_SILVER_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("silver_blue_steel_knight_leggings", ModArmor.BLUESTEEL_SILVER_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_SILVER_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("silver_blue_steel_knight_boots", ModArmor.BLUESTEEL_SILVER_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ST_SILVER_ARMET = INSTANCE.addKnightItem("sterling_silver_blue_steel_armet", ModArmor.BLUESTEEL_ST_SILVER_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ST_SILVER_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("sterling_silver_blue_steel_knight_chestplate", ModArmor.BLUESTEEL_ST_SILVER_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ST_SILVER_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("sterling_silver_blue_steel_knight_leggings", ModArmor.BLUESTEEL_ST_SILVER_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ST_SILVER_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("sterling_silver_blue_steel_knight_boots", ModArmor.BLUESTEEL_ST_SILVER_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_BRASS_ARMET = INSTANCE.addKnightItem("brass_blue_steel_armet", ModArmor.BLUESTEEL_BRASS_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_BRASS_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("brass_blue_steel_knight_chestplate", ModArmor.BLUESTEEL_BRASS_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_BRASS_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("brass_blue_steel_knight_leggings", ModArmor.BLUESTEEL_BRASS_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_BRASS_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("brass_blue_steel_knight_boots", ModArmor.BLUESTEEL_BRASS_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ROSE_GOLD_ARMET = INSTANCE.addKnightItem("rose_gold_blue_steel_armet", ModArmor.BLUESTEEL_ROSE_GOLD_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ROSE_GOLD_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("rose_gold_blue_steel_knight_chestplate", ModArmor.BLUESTEEL_ROSE_GOLD_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ROSE_GOLD_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("rose_gold_blue_steel_knight_leggings", ModArmor.BLUESTEEL_ROSE_GOLD_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_ROSE_GOLD_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("rose_gold_blue_steel_knight_boots", ModArmor.BLUESTEEL_ROSE_GOLD_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_SALLET = INSTANCE.addMedievalArmorItem("blue_steel_sallet", ModArmor.BLUESTEEL_SALLET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("blue_steel_gothic_chestplate", ModArmor.BLUESTEEL_GOTHIC_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("blue_steel_gothic_leggings", ModArmor.BLUESTEEL_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("blue_steel_gothic_boots", ModArmor.BLUESTEEL_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_STECHHELM = INSTANCE.addMedievalArmorItem("blue_steel_stechhelm", ModArmor.BLUESTEEL_JOUSTING_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_JOUSTING_CHESTPLATE = INSTANCE.addMedievalArmorItem("blue_steel_jousting_chestplate", ModArmor.BLUESTEEL_JOUSTING_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_JOUSTING_LEGGINGS = INSTANCE.addMedievalArmorItem("blue_steel_jousting_leggings", ModArmor.BLUESTEEL_JOUSTING, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_JOUSTING_BOOTS = INSTANCE.addMedievalArmorItem("blue_steel_jousting_boots", ModArmor.BLUESTEEL_JOUSTING, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_GRAND_BASCINET = INSTANCE.addMedievalArmorItem("blue_steel_grand_bascinet", ModArmor.BLUESTEEL_KASTENBRUST_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("blue_steel_kastenbrust_chestplate", ModArmor.BLUESTEEL_KASTENBRUST_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("blue_steel_kastenbrust_leggings", ModArmor.BLUESTEEL_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("blue_steel_kastenbrust_boots", ModArmor.BLUESTEEL_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("blue_steel_maximilian_helmet", ModArmor.BLUESTEEL_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("blue_steel_maximilian_chestplate", ModArmor.BLUESTEEL_MAXIMILIAN_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("blue_steel_maximilian_leggings", ModArmor.BLUESTEEL_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("blue_steel_maximilian_boots", ModArmor.BLUESTEEL_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_BARBUTE = INSTANCE.addMedievalArmorItem("blue_steel_halfarmor_helmet", ModArmor.BLUESTEEL_BARBUTE, ArmorItem.Type.HELMET, new Item.Properties());
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_HALFARMOR_CHESTPLATE = INSTANCE.addMedievalArmorItem("blue_steel_halfarmor_chestplate", ModArmor.BLUESTEEL_HALFARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());


    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ARMET = INSTANCE.addKnightItem("red_steel_armet", ModArmor.REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("red_steel_knight_chestplate", ModArmor.REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("red_steel_knight_leggings", ModArmor.REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("red_steel_knight_boots", ModArmor.REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOLD_ARMET = INSTANCE.addKnightItem("gold_red_steel_armet", ModArmor.GOLD_REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOLD_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("gold_red_steel_knight_chestplate", ModArmor.GOLD_REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOLD_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("gold_red_steel_knight_leggings", ModArmor.GOLD_REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOLD_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("gold_red_steel_knight_boots", ModArmor.GOLD_REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_SILVER_ARMET = INSTANCE.addKnightItem("silver_red_steel_armet", ModArmor.SILVER_REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_SILVER_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("silver_red_steel_knight_chestplate", ModArmor.SILVER_REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_SILVER_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("silver_red_steel_knight_leggings", ModArmor.SILVER_REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_SILVER_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("silver_red_steel_knight_boots", ModArmor.SILVER_REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ST_SILVER_ARMET = INSTANCE.addKnightItem("sterling_silver_red_steel_armet", ModArmor.ST_SILVER_REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ST_SILVER_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("sterling_silver_red_steel_knight_chestplate", ModArmor.ST_SILVER_REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ST_SILVER_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("sterling_silver_red_steel_knight_leggings", ModArmor.ST_SILVER_REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ST_SILVER_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("sterling_silver_red_steel_knight_boots", ModArmor.ST_SILVER_REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_BRASS_ARMET = INSTANCE.addKnightItem("brass_red_steel_armet", ModArmor.BRASS_REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_BRASS_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("brass_red_steel_knight_chestplate", ModArmor.BRASS_REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_BRASS_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("brass_red_steel_knight_leggings", ModArmor.BRASS_REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_BRASS_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("brass_red_steel_knight_boots", ModArmor.BRASS_REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ROSE_GOLD_ARMET = INSTANCE.addKnightItem("rose_gold_red_steel_armet", ModArmor.ROSE_GOLD_REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ROSE_GOLD_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("rose_gold_red_steel_knight_chestplate", ModArmor.ROSE_GOLD_REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ROSE_GOLD_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("rose_gold_red_steel_knight_leggings", ModArmor.ROSE_GOLD_REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_ROSE_GOLD_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("rose_gold_red_steel_knight_boots", ModArmor.ROSE_GOLD_REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_SALLET = INSTANCE.addMedievalArmorItem("red_steel_sallet", ModArmor.REDSTEEL_SALLET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("red_steel_gothic_chestplate", ModArmor.REDSTEEL_GOTHIC_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("red_steel_gothic_leggings", ModArmor.REDSTEEL_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("red_steel_gothic_boots", ModArmor.REDSTEEL_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_STECHHELM = INSTANCE.addMedievalArmorItem("red_steel_stechhelm", ModArmor.REDSTEEL_JOUSTING_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_JOUSTING_CHESTPLATE = INSTANCE.addMedievalArmorItem("red_steel_jousting_chestplate", ModArmor.REDSTEEL_JOUSTING_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_JOUSTING_LEGGINGS = INSTANCE.addMedievalArmorItem("red_steel_jousting_leggings", ModArmor.REDSTEEL_JOUSTING, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_JOUSTING_BOOTS = INSTANCE.addMedievalArmorItem("red_steel_jousting_boots", ModArmor.REDSTEEL_JOUSTING, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_GRAND_BASCINET = INSTANCE.addMedievalArmorItem("red_steel_grand_bascinet", ModArmor.REDSTEEL_KASTENBRUST_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("red_steel_kastenbrust_chestplate", ModArmor.REDSTEEL_KASTENBRUST_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("red_steel_kastenbrust_leggings", ModArmor.REDSTEEL_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("red_steel_kastenbrust_boots", ModArmor.REDSTEEL_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_MAXIMILIAN_HELMET = INSTANCE.addMedievalArmorItem("red_steel_maximilian_helmet", ModArmor.REDSTEEL_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("red_steel_maximilian_chestplate", ModArmor.REDSTEEL_MAXIMILIAN_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("red_steel_maximilian_leggings", ModArmor.REDSTEEL_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("red_steel_maximilian_boots", ModArmor.REDSTEEL_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_BARBUTE = INSTANCE.addMedievalArmorItem("red_steel_halfarmor_helmet", ModArmor.REDSTEEL_BARBUTE, ArmorItem.Type.HELMET, new Item.Properties());
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_HALFARMOR_CHESTPLATE = INSTANCE.addMedievalArmorItem("red_steel_halfarmor_chestplate", ModArmor.REDSTEEL_HALFARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());


    public static Supplier<ItemStack> BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> GOLD_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_GOLD_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> GOLD_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_GOLD_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> SILVER_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_SILVER_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> SILVER_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_SILVER_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ST_SILVER_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_ST_SILVER_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ST_SILVER_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_ST_SILVER_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> BRASS_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_BRASS_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> BRASS_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_BRASS_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ROSE_GOLD_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_ROSE_GOLD_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ROSE_GOLD_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_ROSE_GOLD_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> GOLD_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(GOLD_BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> SILVER_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(SILVER_BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ST_SILVER_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(ST_SILVER_BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };

    public static Supplier<ItemStack> BRASS_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BRASS_BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ROSE_GOLD_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(ROSE_GOLD_BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };

    public static Supplier<ItemStack> SILVER_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(SILVER_STEEL_CEREMONIAL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> ST_SILVER_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(STERLING_SILVER_STEEl_CEREMONIAL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> BRASS_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BRASS_STEEl_CEREMONIAL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };

    public static Supplier<ItemStack> ROSE_GOLD_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(ROSE_GOLD_STEEl_CEREMONIAL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listBlackArmor = new ArrayList<>() {{
        add(BLACKSTEEL_SALLET);
        add(BLACKSTEEL_GOTHIC_CHESTPLATE);
        add(BLACKSTEEL_GOTHIC_LEGGINGS);
        add(BLACKSTEEL_GOTHIC_BOOTS);
        add(BLACKSTEEL_GRANDBASCINET);
        add(BLACKSTEEL_KASTENBRUST_CHESTPLATE);
        add(BLACKSTEEL_KASTENBRUST_LEGGINGS);
        add(BLACKSTEEL_KASTENBRUST_BOOTS);
        add(BLACKSTEEL_MAXIMILIAN_HELMET);
        add(BLACKSTEEL_MAXIMILIAN_CHESTPLATE);
        add(BLACKSTEEL_MAXIMILIAN_LEGGINGS);
        add(BLACKSTEEL_MAXIMILIAN_BOOTS);
        add(BLACKSTEEL_JOUSTING_HELMET);
        add(BLACKSTEEL_JOUSTING_CHESTPLATE);
        add(BLACKSTEEL_JOUSTING_LEGGINGS);
        add(BLACKSTEEL_JOUSTING_BOOTS);
        add(BLACKSTEEL_KETTLEHAT);
        add(BLACKSTEEL_PLATEMAIL_CHESTPLATE);
        add(BLACKSTEEL_PLATEMAIL_LEGGINGS);
        add(BLACKSTEEL_PLATEMAIL_BOOTS);
        add(BLACKSTEEL_BARBUTE);
        add(BLACKSTEEL_HALFARMOR_CHESTPLATE);
    }};

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listRedArmor = new ArrayList<>() {{
        add(REDSTEEL_SALLET);
        add(REDSTEEL_GOTHIC_CHESTPLATE);
        add(REDSTEEL_GOTHIC_LEGGINGS);
        add(REDSTEEL_GOTHIC_BOOTS);
        add(REDSTEEL_STECHHELM);
        add(REDSTEEL_JOUSTING_CHESTPLATE);
        add(REDSTEEL_JOUSTING_LEGGINGS);
        add(REDSTEEL_JOUSTING_BOOTS);
        add(REDSTEEL_GRAND_BASCINET);
        add(REDSTEEL_KASTENBRUST_CHESTPLATE);
        add(REDSTEEL_KASTENBRUST_LEGGINGS);
        add(REDSTEEL_KASTENBRUST_BOOTS);
        add(REDSTEEL_MAXIMILIAN_HELMET);
        add(REDSTEEL_MAXIMILIAN_CHESTPLATE);
        add(REDSTEEL_MAXIMILIAN_LEGGINGS);
        add(REDSTEEL_MAXIMILIAN_BOOTS);
        add(REDSTEEL_BARBUTE);
        add(REDSTEEL_HALFARMOR_CHESTPLATE);
    }};

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listBlueArmor = new ArrayList<>() {{
        add(BLUESTEEL_SALLET);
        add(BLUESTEEL_GOTHIC_CHESTPLATE);
        add(BLUESTEEL_GOTHIC_LEGGINGS);
        add(BLUESTEEL_GOTHIC_BOOTS);
        add(BLUESTEEL_STECHHELM);
        add(BLUESTEEL_JOUSTING_CHESTPLATE);
        add(BLUESTEEL_JOUSTING_LEGGINGS);
        add(BLUESTEEL_JOUSTING_BOOTS);
        add(BLUESTEEL_GRAND_BASCINET);
        add(BLUESTEEL_KASTENBRUST_CHESTPLATE);
        add(BLUESTEEL_KASTENBRUST_LEGGINGS);
        add(BLUESTEEL_KASTENBRUST_BOOTS);
        add(BLUESTEEL_MAXIMILIAN_HELMET);
        add(BLUESTEEL_MAXIMILIAN_CHESTPLATE);
        add(BLUESTEEL_MAXIMILIAN_LEGGINGS);
        add(BLUESTEEL_MAXIMILIAN_BOOTS);
        add(BLUESTEEL_BARBUTE);
        add(BLUESTEEL_HALFARMOR_CHESTPLATE);
    }};
    public static final RegistrySupplier<MedievalShieldItem>ELLIPTICAL_SHIELD = INSTANCE.addMedievalShieldItem("bismuth_bronze_ellipticalshield", "ellipticalshield", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, ShieldTypes.ELLIPTICAL_SHIELD);

    public ModelledItems() {
        super(KnightsOfTerraFirma.MODID);
    }
}
