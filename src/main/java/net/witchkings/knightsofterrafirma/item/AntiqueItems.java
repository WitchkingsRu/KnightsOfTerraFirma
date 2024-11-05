package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.antiquelegacy.item.AddonShieldTypes;
import com.magistuarmory.antiquelegacy.item.AddonWeaponTypes;
import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.*;
import com.magistuarmory.item.armor.ArmorTypes;
import com.magistuarmory.item.armor.DyeableWearableArmorDecorationItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import com.magistuarmory.item.armor.WearableArmorDecorationItem;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.armor.AntiqueArmor;

import java.util.ArrayList;




public class AntiqueItems extends ModItemsProvider {
    public static final AntiqueItems INSTANCE = new AntiqueItems();

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_attic_helmet", AntiqueArmor.BLACK_BRONZE_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_BELL_CUIRASS = INSTANCE.addMedievalArmorItem("black_bronze_bell_cuirass", AntiqueArmor.BLACK_BRONZE_BELL_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_BEOTIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_beotian_helmet", AntiqueArmor.BLACK_BRONZE_BEOTIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZED_GALLEA = INSTANCE.addMedievalArmorItem("black_bronzed_gallea", AntiqueArmor.BLACK_BRONZED_GALLEA, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_RIDGE_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_ridge_helmet", AntiqueArmor.BLACK_BRONZE_RIDGE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_COOLUS = INSTANCE.addMedievalArmorItem("black_bronze_coolus", AntiqueArmor.BLACK_BRONZE_COOLUS, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_INTERCISA = INSTANCE.addMedievalArmorItem("black_bronze_intercisa", AntiqueArmor.BLACK_BRONZE_INTERCISA, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_MELOS = INSTANCE.addMedievalArmorItem("black_bronze_melos", AntiqueArmor.BLACK_BRONZE_MELOS, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_montefortino_helmet", AntiqueArmor.BLACK_BRONZE_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_MUSCLE_CUIRASS = INSTANCE.addMedievalArmorItem("black_bronze_muscle_cuirass", AntiqueArmor.BLACK_BRONZE_MUSCLE_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_NIEDERBIEBER_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_niederbieber_helmet", AntiqueArmor.BLACK_BRONZE_NIEDERBIEBER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_PHRYGIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_phrygian_helmet", AntiqueArmor.BLACK_BRONZE_PHRYGIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_PILOS_CLOSET = INSTANCE.addMedievalArmorItem("black_bronze_pilos_closet", AntiqueArmor.BLACK_BRONZE_PILOS_CLOSET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_PILOS = INSTANCE.addMedievalArmorItem("black_bronze_pilos", AntiqueArmor.BLACK_BRONZE_PILOS, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SQUAMATA = INSTANCE.addMedievalArmorItem("black_bronze_squamata", AntiqueArmor.BLACK_BRONZE_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_ROMAN_PARADE_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_roman_parade_helmet", AntiqueArmor.BLACK_BRONZE_ROMAN_PARADE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_APULO_CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_apulo_corinthian_helmet", AntiqueArmor.BLACK_BRONZE_APULO_CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_CHALCIDIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_chalcidian_helmet", AntiqueArmor.BLACK_BRONZE_CHALCIDIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_corinthian_helmet", AntiqueArmor.BLACK_BRONZE_CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_GREEK_GREAVES = INSTANCE.addMedievalArmorItem("black_bronze_greek_greaves", AntiqueArmor.BLACK_BRONZE_GREEK_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_HAMATA = INSTANCE.addMedievalArmorItem("black_bronze_hamata", AntiqueArmor.BLACK_BRONZE_HAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_HAMATA_OPTIO = INSTANCE.addMedievalArmorItem("black_bronze_hamata_optio", AntiqueArmor.BLACK_BRONZE_HAMATA_OPTIO, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_HEDDERNHEIM_HELMET = INSTANCE.addDyeableMedievalArmorItem("black_bronze_heddernheim_helmet", AntiqueArmor.BLACK_BRONZE_HEDDERNHEIM_HELMET, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_ILLIRIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_illirian_helmet", AntiqueArmor.BLACK_BRONZE_ILLIRIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_IRON_NIEDERBIEBER_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_iron_niederbieber_helmet", AntiqueArmor.BLACK_BRONZE_IRON_NIEDERBIEBER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_MURMILLO_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_murmillo_helmet", AntiqueArmor.BLACK_BRONZE_MURMILLO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_MUSCULATA = INSTANCE.addMedievalArmorItem("black_bronze_musculata", AntiqueArmor.BLACK_BRONZE_MUSCULATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_OFFICER_SQUAMATA = INSTANCE.addDyeableMedievalArmorItem("black_bronze_officer_squamata", AntiqueArmor.BLACK_BRONZE_OFFICER_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_OPEN_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_open_attic_helmet", AntiqueArmor.BLACK_BRONZE_OPEN_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_PROVOCATOR_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_provocator_helmet", AntiqueArmor.BLACK_BRONZE_PROVOCATOR_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SECUTOR_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_secutor_helmet", AntiqueArmor.BLACK_BRONZE_SECUTOR_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SEGMENTATA = INSTANCE.addMedievalArmorItem("black_bronze_segmentata", AntiqueArmor.BLACK_BRONZE_SEGMENTATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_THRACIAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_thracian_helmet", AntiqueArmor.BLACK_BRONZE_THRACIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_CARDIOPHYLAX = INSTANCE.addMedievalArmorItem("black_bronze_cardiophylax", AntiqueArmor.BLACK_BRONZE_CARDIOPHYLAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SCALE_THORAX = INSTANCE.addMedievalArmorItem("black_bronze_scale_thorax", AntiqueArmor.BLACK_BRONZE_SCALE_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_KUBAN_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_kuban_helmet", AntiqueArmor.BLACK_BRONZE_KUBAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SCYTHIAN_SCALE_THORAX = INSTANCE.addMedievalArmorItem("black_bronze_scythian_scale_thorax", AntiqueArmor.BLACK_BRONZE_SCYTHIAN_SCALE_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SCYTHIAN_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_scythian_attic_helmet", AntiqueArmor.BLACK_BRONZE_SCYTHIAN_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SCYTHIAN_SCALE_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_scythian_scale_helmet", AntiqueArmor.BLACK_BRONZE_SCYTHIAN_SCALE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_ROMAN_GREAVES = INSTANCE.addMedievalArmorItem("black_bronze_roman_greaves", AntiqueArmor.BLACK_BRONZE_ROMAN_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_CELTIC_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_celtic_montefortino_helmet", AntiqueArmor.BLACK_BRONZE_CELTIC_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_LA_GORGE_MEILLET = INSTANCE.addMedievalArmorItem("black_bronze_la_gorge_meillet", AntiqueArmor.BLACK_BRONZE_LA_GORGE_MEILLET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_SAVA_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_sava_helmet", AntiqueArmor.BLACK_BRONZE_SAVA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BLACK_BRONZE_WATERLOO_HELMET = INSTANCE.addMedievalArmorItem("black_bronze_waterloo_helmet", AntiqueArmor.BLACK_BRONZE_WATERLOO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());


    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_attic_helmet", AntiqueArmor.BISMUTH_BRONZE_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_BELL_CUIRASS = INSTANCE.addMedievalArmorItem("bismuth_bronze_bell_cuirass", AntiqueArmor.BISMUTH_BRONZE_BELL_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_BEOTIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_beotian_helmet", AntiqueArmor.BISMUTH_BRONZE_BEOTIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZED_GALLEA = INSTANCE.addMedievalArmorItem("bismuth_bronzed_gallea", AntiqueArmor.BISMUTH_BRONZED_GALLEA, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_RIDGE_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_ridge_helmet", AntiqueArmor.BISMUTH_BRONZE_RIDGE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_COOLUS = INSTANCE.addMedievalArmorItem("bismuth_bronze_coolus", AntiqueArmor.BISMUTH_BRONZE_COOLUS, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_INTERCISA = INSTANCE.addMedievalArmorItem("bismuth_bronze_intercisa", AntiqueArmor.BISMUTH_BRONZE_INTERCISA, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_MELOS = INSTANCE.addMedievalArmorItem("bismuth_bronze_melos", AntiqueArmor.BISMUTH_BRONZE_MELOS, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_montefortino_helmet", AntiqueArmor.BISMUTH_BRONZE_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_MUSCLE_CUIRASS = INSTANCE.addMedievalArmorItem("bismuth_bronze_muscle_cuirass", AntiqueArmor.BISMUTH_BRONZE_MUSCLE_CUIRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_NIEDERBIEBER_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_niederbieber_helmet", AntiqueArmor.BISMUTH_BRONZE_NIEDERBIEBER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_PHRYGIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_phrygian_helmet", AntiqueArmor.BISMUTH_BRONZE_PHRYGIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_PILOS_CLOSET = INSTANCE.addMedievalArmorItem("bismuth_bronze_pilos_closet", AntiqueArmor.BISMUTH_BRONZE_PILOS_CLOSET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_PILOS = INSTANCE.addMedievalArmorItem("bismuth_bronze_pilos", AntiqueArmor.BISMUTH_BRONZE_PILOS, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SQUAMATA = INSTANCE.addMedievalArmorItem("bismuth_bronze_squamata", AntiqueArmor.BISMUTH_BRONZE_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_ROMAN_PARADE_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_roman_parade_helmet", AntiqueArmor.BISMUTH_BRONZE_ROMAN_PARADE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_APULO_CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_apulo_corinthian_helmet", AntiqueArmor.BISMUTH_BRONZE_APULO_CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_CHALCIDIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_chalcidian_helmet", AntiqueArmor.BISMUTH_BRONZE_CHALCIDIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_CORINTHIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_corinthian_helmet", AntiqueArmor.BISMUTH_BRONZE_CORINTHIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_GREEK_GREAVES = INSTANCE.addMedievalArmorItem("bismuth_bronze_greek_greaves", AntiqueArmor.BISMUTH_BRONZE_GREEK_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_HAMATA = INSTANCE.addMedievalArmorItem("bismuth_bronze_hamata", AntiqueArmor.BISMUTH_BRONZE_HAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_HAMATA_OPTIO = INSTANCE.addMedievalArmorItem("bismuth_bronze_hamata_optio", AntiqueArmor.BISMUTH_BRONZE_HAMATA_OPTIO, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_HEDDERNHEIM_HELMET = INSTANCE.addDyeableMedievalArmorItem("bismuth_bronze_heddernheim_helmet", AntiqueArmor.BISMUTH_BRONZE_HEDDERNHEIM_HELMET, ArmorItem.Type.HELMET, new Item.Properties(), 0xFFFFFF);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_ILLIRIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_illirian_helmet", AntiqueArmor.BISMUTH_BRONZE_ILLIRIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_IRON_NIEDERBIEBER_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_iron_niederbieber_helmet", AntiqueArmor.BISMUTH_BRONZE_IRON_NIEDERBIEBER_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_MURMILLO_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_murmillo_helmet", AntiqueArmor.BISMUTH_BRONZE_MURMILLO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_MUSCULATA = INSTANCE.addMedievalArmorItem("bismuth_bronze_musculata", AntiqueArmor.BISMUTH_BRONZE_MUSCULATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_OFFICER_SQUAMATA = INSTANCE.addDyeableMedievalArmorItem("bismuth_bronze_officer_squamata", AntiqueArmor.BISMUTH_BRONZE_OFFICER_SQUAMATA, ArmorItem.Type.CHESTPLATE, new Item.Properties(), 0xFFFFFF);

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_OPEN_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_open_attic_helmet", AntiqueArmor.BISMUTH_BRONZE_OPEN_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_PROVOCATOR_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_provocator_helmet", AntiqueArmor.BISMUTH_BRONZE_PROVOCATOR_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SECUTOR_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_secutor_helmet", AntiqueArmor.BISMUTH_BRONZE_SECUTOR_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SEGMENTATA = INSTANCE.addMedievalArmorItem("bismuth_bronze_segmentata", AntiqueArmor.BISMUTH_BRONZE_SEGMENTATA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_THRACIAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_thracian_helmet", AntiqueArmor.BISMUTH_BRONZE_THRACIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_CARDIOPHYLAX = INSTANCE.addMedievalArmorItem("bismuth_bronze_cardiophylax", AntiqueArmor.BISMUTH_BRONZE_CARDIOPHYLAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SCALE_THORAX = INSTANCE.addMedievalArmorItem("bismuth_bronze_scale_thorax", AntiqueArmor.BISMUTH_BRONZE_SCALE_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_KUBAN_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_kuban_helmet", AntiqueArmor.BISMUTH_BRONZE_KUBAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SCYTHIAN_SCALE_THORAX = INSTANCE.addMedievalArmorItem("bismuth_bronze_scythian_scale_thorax", AntiqueArmor.BISMUTH_BRONZE_SCYTHIAN_SCALE_THORAX, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SCYTHIAN_ATTIC_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_scythian_attic_helmet", AntiqueArmor.BISMUTH_BRONZE_SCYTHIAN_ATTIC_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SCYTHIAN_SCALE_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_scythian_scale_helmet", AntiqueArmor.BISMUTH_BRONZE_SCYTHIAN_SCALE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_ROMAN_GREAVES = INSTANCE.addMedievalArmorItem("bismuth_bronze_roman_greaves", AntiqueArmor.BISMUTH_BRONZE_ROMAN_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_CELTIC_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_celtic_montefortino_helmet", AntiqueArmor.BISMUTH_BRONZE_CELTIC_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_LA_GORGE_MEILLET = INSTANCE.addMedievalArmorItem("bismuth_bronze_la_gorge_meillet", AntiqueArmor.BISMUTH_BRONZE_LA_GORGE_MEILLET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SAVA_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_sava_helmet", AntiqueArmor.BISMUTH_BRONZE_SAVA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_WATERLOO_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_waterloo_helmet", AntiqueArmor.BISMUTH_BRONZE_WATERLOO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final RegistrySupplier<ArmorDecorationItem> BLACK_BRONZE_HORNS_DECORATION = INSTANCE.addArmorDecorationItem("black_bronze_horns_decoration", () -> new ArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_horns"), new Item.Properties(), ArmorItem.Type.HELMET));
    public static final RegistrySupplier<ArmorDecorationItem> BLACK_BRONZE_SMALL_WINGS_DECORATION = INSTANCE.addArmorDecorationItem("black_bronze_small_wings_decoration", () -> new ArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_small_wings"), new Item.Properties(), ArmorItem.Type.HELMET));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_GREEK_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_greek_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_greek_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_GREEK_HIGH_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_greek_high_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_greek_high_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_HAIR_PLUME_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_hair_plume_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_hair_plume"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_ROMAN_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_roman_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_roman_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_ROMAN_CREST_ALT_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_roman_crest_alt_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_roman_crest_alt"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_ROMAN_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_roman_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_roman_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_ROMAN_TWO_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_roman_two_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_roman_two_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_TRIPLE_FEATHER_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_triple_feather_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_triple_feather"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BLACK_BRONZE_TWO_HAIR_PLUMES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("black_bronze_two_hair_plumes_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "black_bronze_two_hair_plumes"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<WearableArmorDecorationItem> BLACK_BRONZE_LEFT_GLADIATOR_SHOULDER_PAD_DECORATION = INSTANCE.addWearableArmorDecorationItem("black_bronze_left_gladiator_shoulder_pad_decoration", AntiqueArmor.BLACK_BRONZE_LEFT_GLADIATOR_SHOULDER_PAD, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> BLACK_BRONZE_RIGHT_GLADIATOR_SHOULDER_PAD_DECORATION = INSTANCE.addWearableArmorDecorationItem("black_bronze_right_gladiator_shoulder_pad_decoration", AntiqueArmor.BLACK_BRONZE_RIGHT_GLADIATOR_SHOULDER_PAD, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> BLACK_BRONZE_LEFT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("black_bronze_left_hand_manika_decoration", AntiqueArmor.BLACK_BRONZE_LEFT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> BLACK_BRONZE_RIGHT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("black_bronze_right_hand_manika_decoration", AntiqueArmor.BLACK_BRONZE_RIGHT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final RegistrySupplier<ArmorDecorationItem> BISMUTH_BRONZE_HORNS_DECORATION = INSTANCE.addArmorDecorationItem("bismuth_bronze_horns_decoration", () -> new ArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_horns"), new Item.Properties(), ArmorItem.Type.HELMET));
    public static final RegistrySupplier<ArmorDecorationItem> BISMUTH_BRONZE_SMALL_WINGS_DECORATION = INSTANCE.addArmorDecorationItem("bismuth_bronze_small_wings_decoration", () -> new ArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_small_wings"), new Item.Properties(), ArmorItem.Type.HELMET));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_GREEK_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_greek_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_greek_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_GREEK_HIGH_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_greek_high_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_greek_high_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_HAIR_PLUME_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_hair_plume_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_hair_plume"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_ROMAN_CREST_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_roman_crest_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_roman_crest"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_ROMAN_CREST_ALT_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_roman_crest_alt_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_roman_crest_alt"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_ROMAN_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_roman_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_roman_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_ROMAN_TWO_FEATHERS_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_roman_two_feathers_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_roman_two_feathers"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_TRIPLE_FEATHER_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_triple_feather_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_triple_feather"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<DyeableArmorDecorationItem> BISMUTH_BRONZE_TWO_HAIR_PLUMES_DECORATION = INSTANCE.addDyeableArmorDecorationItem("bismuth_bronze_two_hair_plumes_decoration", () -> new DyeableArmorDecorationItem(new ResourceLocation(KnightsOfTerraFirma.MODID, "bismuth_bronze_two_hair_plumes"), new Item.Properties(), ArmorItem.Type.HELMET, 0xFFFFFF));
    public static final RegistrySupplier<WearableArmorDecorationItem> BISMUTH_BRONZE_LEFT_GLADIATOR_SHOULDER_PAD_DECORATION = INSTANCE.addWearableArmorDecorationItem("bismuth_bronze_left_gladiator_shoulder_pad_decoration", AntiqueArmor.BISMUTH_BRONZE_LEFT_GLADIATOR_SHOULDER_PAD, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> BISMUTH_BRONZE_RIGHT_GLADIATOR_SHOULDER_PAD_DECORATION = INSTANCE.addWearableArmorDecorationItem("bismuth_bronze_right_gladiator_shoulder_pad_decoration", AntiqueArmor.BISMUTH_BRONZE_RIGHT_GLADIATOR_SHOULDER_PAD, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> BISMUTH_BRONZE_LEFT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("bismuth_bronze_left_hand_manika_decoration", AntiqueArmor.BISMUTH_BRONZE_LEFT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<WearableArmorDecorationItem> BISMUTH_BRONZE_RIGHT_HAND_MANIKA_DECORATION = INSTANCE.addWearableArmorDecorationItem("bismuth_bronze_right_hand_manika_decoration", AntiqueArmor.BISMUTH_BRONZE_RIGHT_HAND_MANIKA, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final ArrayList<RegistrySupplier<DyeableArmorDecorationItem>> listDecoBlackBronze = new ArrayList<>(){{
        add(BLACK_BRONZE_GREEK_CREST_DECORATION);
        add(BLACK_BRONZE_GREEK_HIGH_CREST_DECORATION);
        add(BLACK_BRONZE_HAIR_PLUME_DECORATION);
        add(BLACK_BRONZE_ROMAN_CREST_DECORATION);
        add(BLACK_BRONZE_ROMAN_CREST_ALT_DECORATION);
        add(BLACK_BRONZE_ROMAN_FEATHERS_DECORATION);
        add(BLACK_BRONZE_ROMAN_TWO_FEATHERS_DECORATION);
        add(BLACK_BRONZE_TRIPLE_FEATHER_DECORATION);
        add(BLACK_BRONZE_TWO_HAIR_PLUMES_DECORATION);
    }};

    public static final ArrayList<RegistrySupplier<DyeableArmorDecorationItem>> listDecoBismuthBronze = new ArrayList<>(){{
        add(BISMUTH_BRONZE_GREEK_CREST_DECORATION);
        add(BISMUTH_BRONZE_GREEK_HIGH_CREST_DECORATION);
        add(BISMUTH_BRONZE_HAIR_PLUME_DECORATION);
        add(BISMUTH_BRONZE_ROMAN_CREST_DECORATION);
        add(BISMUTH_BRONZE_ROMAN_CREST_ALT_DECORATION);
        add(BISMUTH_BRONZE_ROMAN_FEATHERS_DECORATION);
        add(BISMUTH_BRONZE_ROMAN_TWO_FEATHERS_DECORATION);
        add(BISMUTH_BRONZE_TRIPLE_FEATHER_DECORATION);
        add(BISMUTH_BRONZE_TWO_HAIR_PLUMES_DECORATION);
    }};

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listArmorBlackBronze = new ArrayList<>(){{
        add(BLACK_BRONZE_ATTIC_HELMET);
        add(BLACK_BRONZE_BELL_CUIRASS);
        add(BLACK_BRONZE_BEOTIAN_HELMET);
        add(BLACK_BRONZED_GALLEA);
        add(BLACK_BRONZE_RIDGE_HELMET);
        add(BLACK_BRONZE_COOLUS);
        add(BLACK_BRONZE_INTERCISA);
        add(BLACK_BRONZE_MELOS);
        add(BLACK_BRONZE_MONTEFORTINO_HELMET);
        add(BLACK_BRONZE_MUSCLE_CUIRASS);
        add(BLACK_BRONZE_NIEDERBIEBER_HELMET);
        add(BLACK_BRONZE_PHRYGIAN_HELMET);
        add(BLACK_BRONZE_PILOS);
        add(BLACK_BRONZE_PILOS_CLOSET);
        add(BLACK_BRONZE_SQUAMATA);
        add(BLACK_BRONZE_ROMAN_PARADE_HELMET);
        add(BLACK_BRONZE_APULO_CORINTHIAN_HELMET);
        add(BLACK_BRONZE_CHALCIDIAN_HELMET);
        add(BLACK_BRONZE_CORINTHIAN_HELMET);
        add(BLACK_BRONZE_GREEK_GREAVES);
        add(BLACK_BRONZE_HAMATA);
        add(BLACK_BRONZE_HAMATA_OPTIO);
        add(BLACK_BRONZE_HEDDERNHEIM_HELMET);
        add(BLACK_BRONZE_ILLIRIAN_HELMET);
        add(BLACK_BRONZE_IRON_NIEDERBIEBER_HELMET);
        add(BLACK_BRONZE_MURMILLO_HELMET);
        add(BLACK_BRONZE_MUSCULATA);
        add(BLACK_BRONZE_OFFICER_SQUAMATA);
        add(BLACK_BRONZE_OPEN_ATTIC_HELMET);
        add(BLACK_BRONZE_PROVOCATOR_HELMET);
        add(BLACK_BRONZE_SECUTOR_HELMET);
        add(BLACK_BRONZE_SEGMENTATA);
        add(BLACK_BRONZE_THRACIAN_HELMET);
        add(BLACK_BRONZE_CARDIOPHYLAX);
        add(BLACK_BRONZE_SCALE_THORAX);
        add(BLACK_BRONZE_KUBAN_HELMET);
        add(BLACK_BRONZE_SCYTHIAN_SCALE_HELMET);
        add(BLACK_BRONZE_SCYTHIAN_ATTIC_HELMET);
        add(BLACK_BRONZE_SCYTHIAN_SCALE_THORAX);
        add(BLACK_BRONZE_ROMAN_GREAVES);
        add(BLACK_BRONZE_CELTIC_MONTEFORTINO_HELMET);
        add(BLACK_BRONZE_LA_GORGE_MEILLET);
        add(BLACK_BRONZE_SAVA_HELMET);
        add(BLACK_BRONZE_WATERLOO_HELMET);
    }};

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listArmorBismuthBronze = new ArrayList<>(){{
        add(BISMUTH_BRONZE_ATTIC_HELMET);
        add(BISMUTH_BRONZE_BELL_CUIRASS);
        add(BISMUTH_BRONZE_BEOTIAN_HELMET);
        add(BISMUTH_BRONZED_GALLEA);
        add(BISMUTH_BRONZE_RIDGE_HELMET);
        add(BISMUTH_BRONZE_COOLUS);
        add(BISMUTH_BRONZE_INTERCISA);
        add(BISMUTH_BRONZE_MELOS);
        add(BISMUTH_BRONZE_MONTEFORTINO_HELMET);
        add(BISMUTH_BRONZE_MUSCLE_CUIRASS);
        add(BISMUTH_BRONZE_NIEDERBIEBER_HELMET);
        add(BISMUTH_BRONZE_PHRYGIAN_HELMET);
        add(BISMUTH_BRONZE_PILOS);
        add(BISMUTH_BRONZE_PILOS_CLOSET);
        add(BISMUTH_BRONZE_SQUAMATA);
        add(BISMUTH_BRONZE_ROMAN_PARADE_HELMET);
        add(BISMUTH_BRONZE_APULO_CORINTHIAN_HELMET);
        add(BISMUTH_BRONZE_CHALCIDIAN_HELMET);
        add(BISMUTH_BRONZE_CORINTHIAN_HELMET);
        add(BISMUTH_BRONZE_GREEK_GREAVES);
        add(BISMUTH_BRONZE_HAMATA);
        add(BISMUTH_BRONZE_HAMATA_OPTIO);
        add(BISMUTH_BRONZE_HEDDERNHEIM_HELMET);
        add(BISMUTH_BRONZE_ILLIRIAN_HELMET);
        add(BISMUTH_BRONZE_IRON_NIEDERBIEBER_HELMET);
        add(BISMUTH_BRONZE_MURMILLO_HELMET);
        add(BISMUTH_BRONZE_MUSCULATA);
        add(BISMUTH_BRONZE_OFFICER_SQUAMATA);
        add(BISMUTH_BRONZE_OPEN_ATTIC_HELMET);
        add(BISMUTH_BRONZE_PROVOCATOR_HELMET);
        add(BISMUTH_BRONZE_SECUTOR_HELMET);
        add(BISMUTH_BRONZE_SEGMENTATA);
        add(BISMUTH_BRONZE_THRACIAN_HELMET);
        add(BISMUTH_BRONZE_CARDIOPHYLAX);
        add(BISMUTH_BRONZE_SCALE_THORAX);
        add(BISMUTH_BRONZE_KUBAN_HELMET);
        add(BISMUTH_BRONZE_SCYTHIAN_SCALE_HELMET);
        add(BISMUTH_BRONZE_SCYTHIAN_ATTIC_HELMET);
        add(BISMUTH_BRONZE_SCYTHIAN_SCALE_THORAX);
        add(BISMUTH_BRONZE_ROMAN_GREAVES);
        add(BISMUTH_BRONZE_CELTIC_MONTEFORTINO_HELMET);
        add(BISMUTH_BRONZE_LA_GORGE_MEILLET);
        add(BISMUTH_BRONZE_SAVA_HELMET);
        add(BISMUTH_BRONZE_WATERLOO_HELMET);
    }};

    public static final RegistrySupplier<Item> SMALL_BLACK_BRONZE_PLATE = INSTANCE.addIngredientItem("small_black_bronze_plate", () -> {
        return new Item(new Item.Properties());
    });
    public static final RegistrySupplier<Item> BLACK_BRONZE_LAMELLAR_ROWS = INSTANCE.addIngredientItem("black_bronze_lamellar_rows", () -> {
        return new Item(new Item.Properties());
    });
    public static final RegistrySupplier<Item> BLACK_BRONZE_PLATE = INSTANCE.addIngredientItem("black_bronze_plate", () -> {
        return new Item(new Item.Properties());
    });

    public static final RegistrySupplier<Item> SMALL_BISMUTH_BRONZE_PLATE = INSTANCE.addIngredientItem("small_bismuth_bronze_plate", () -> {
        return new Item(new Item.Properties());
    });
    public static final RegistrySupplier<Item> BISMUTH_BRONZE_LAMELLAR_ROWS = INSTANCE.addIngredientItem("bismuth_bronze_lamellar_rows", () -> {
        return new Item(new Item.Properties());
    });
    public static final RegistrySupplier<Item> BISMUTH_BRONZE_PLATE = INSTANCE.addIngredientItem("bismuth_bronze_plate", () -> {
        return new Item(new Item.Properties());
    });

    public static final RegistrySupplier<MedievalShieldItem> BLACK_BRONZE_REPUBLIC_SCUTUM = INSTANCE.addMedievalShieldItem("black_bronze_republic_scutum", "republic_scutum", new Item.Properties(), ModdedItems.BLACK_BRONZE, true, true, AddonShieldTypes.REPUBLIC_SCUTUM);
    public static final RegistrySupplier<MedievalShieldItem> BLACK_BRONZE_IMPERIAL_SCUTUM = INSTANCE.addMedievalShieldItem("black_bronze_imperial_scutum", "imperial_scutum", new Item.Properties(), ModdedItems.BLACK_BRONZE, true, true, AddonShieldTypes.IMPERIAL_SCUTUM);
    public static final RegistrySupplier<MedievalShieldItem> BLACK_BRONZE_TUREOS = INSTANCE.addMedievalShieldItem("black_bronze_tureos", "tureos", new Item.Properties(), ModdedItems.BLACK_BRONZE, true, true, AddonShieldTypes.TUREOS);
    public static final RegistrySupplier<MedievalShieldItem> BLACK_BRONZE_HOPLON = INSTANCE.addMedievalShieldItem("black_bronze_hoplon", "hoplon", new Item.Properties(), ModdedItems.BLACK_BRONZE, true, true, AddonShieldTypes.HOPLON);

    public static final RegistrySupplier<MedievalShieldItem> BISMUTH_BRONZE_REPUBLIC_SCUTUM = INSTANCE.addMedievalShieldItem("bismuth_bronze_republic_scutum", "republic_scutum", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, AddonShieldTypes.REPUBLIC_SCUTUM);
    public static final RegistrySupplier<MedievalShieldItem> BISMUTH_BRONZE_IMPERIAL_SCUTUM = INSTANCE.addMedievalShieldItem("bismuth_bronze_imperial_scutum", "imperial_scutum", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, AddonShieldTypes.IMPERIAL_SCUTUM);
    public static final RegistrySupplier<MedievalShieldItem> BISMUTH_BRONZE_TUREOS = INSTANCE.addMedievalShieldItem("bismuth_bronze_tureos", "tureos", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, AddonShieldTypes.TUREOS);
    public static final RegistrySupplier<MedievalShieldItem> BISMUTH_BRONZE_HOPLON = INSTANCE.addMedievalShieldItem("bismuth_bronze_hoplon", "hoplon", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, AddonShieldTypes.HOPLON);

    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_ANTIQUE_DAGGER = INSTANCE.addMedievalWeaponItem("bismuth_bronze_antique_dagger", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.ANTIQUE_DAGGER);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_SICA = INSTANCE.addMedievalWeaponItem("bismuth_bronze_sica", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.SICA);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_ANTIQUE_SPEAR = INSTANCE.addMedievalWeaponItem("bismuth_bronze_antique_spear", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.ANTIQUE_SPEAR);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_DORU = INSTANCE.addMedievalWeaponItem("bismuth_bronze_doru", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.DORU);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_RETIARIUS = INSTANCE.addMedievalWeaponItem("bismuth_bronze_retiarius", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.RETIARIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_SARISSA = INSTANCE.addMedievalWeaponItem("bismuth_bronze_sarissa", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.SARISSA);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_TRIARII_SPEAR = INSTANCE.addMedievalWeaponItem("bismuth_bronze_triarii_spear", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.TRIARII_SPEAR);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_ANTIQUE_SWORD = INSTANCE.addMedievalWeaponItem("bismuth_bronze_antique_sword", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.ANTIQUE_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_CELTIC_SWORD = INSTANCE.addMedievalWeaponItem("bismuth_bronze_celtic_sword", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.CELTIC_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_EARLY_SPATHA = INSTANCE.addMedievalWeaponItem("bismuth_bronze_early_spatha", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.EARLY_SPATHA);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_GLADIATOR_SWORD = INSTANCE.addMedievalWeaponItem("bismuth_bronze_gladiator_sword", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.GLADIATOR_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_GLADIUS = INSTANCE.addMedievalWeaponItem("bismuth_bronze_gladius", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.GLADIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_KOPIS = INSTANCE.addMedievalWeaponItem("bismuth_bronze_kopis", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.KOPIS);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_REPUBLIC_GLADIUS = INSTANCE.addMedievalWeaponItem("bismuth_bronze_republic_gladius", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.REPUBLIC_GLADIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_RHOMPHAIA = INSTANCE.addMedievalWeaponItem("bismuth_bronze_rhomphaia", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.RHOMPHAIA);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_SINGLE_EDGED_SWORD = INSTANCE.addMedievalWeaponItem("bismuth_bronze_single_edged_sword", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.SINGLE_EDGED_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_SPATHA = INSTANCE.addMedievalWeaponItem("bismuth_bronze_spatha", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.SPATHA);
    public static final RegistrySupplier<MedievalWeaponItem> BISMUTH_BRONZE_XIPHOS = INSTANCE.addMedievalWeaponItem("bismuth_bronze_xiphos", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, AddonWeaponTypes.XIPHOS);

    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_ANTIQUE_DAGGER = INSTANCE.addMedievalWeaponItem("bronze_antique_dagger", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.ANTIQUE_DAGGER);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_SICA = INSTANCE.addMedievalWeaponItem("bronze_sica", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.SICA);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_ANTIQUE_SPEAR = INSTANCE.addMedievalWeaponItem("bronze_antique_spear", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.ANTIQUE_SPEAR);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_DORU = INSTANCE.addMedievalWeaponItem("bronze_doru", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.DORU);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_RETIARIUS = INSTANCE.addMedievalWeaponItem("bronze_retiarius", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.RETIARIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_SARISSA = INSTANCE.addMedievalWeaponItem("bronze_sarissa", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.SARISSA);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_TRIARII_SPEAR = INSTANCE.addMedievalWeaponItem("bronze_triarii_spear", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.TRIARII_SPEAR);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_ANTIQUE_SWORD = INSTANCE.addMedievalWeaponItem("bronze_antique_sword", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.ANTIQUE_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_CELTIC_SWORD = INSTANCE.addMedievalWeaponItem("bronze_celtic_sword", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.CELTIC_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_EARLY_SPATHA = INSTANCE.addMedievalWeaponItem("bronze_early_spatha", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.EARLY_SPATHA);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_GLADIATOR_SWORD = INSTANCE.addMedievalWeaponItem("bronze_gladiator_sword", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.GLADIATOR_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_GLADIUS = INSTANCE.addMedievalWeaponItem("bronze_gladius", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.GLADIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_KOPIS = INSTANCE.addMedievalWeaponItem("bronze_kopis", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.KOPIS);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_REPUBLIC_GLADIUS = INSTANCE.addMedievalWeaponItem("bronze_republic_gladius", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.REPUBLIC_GLADIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_RHOMPHAIA = INSTANCE.addMedievalWeaponItem("bronze_rhomphaia", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.RHOMPHAIA);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_SINGLE_EDGED_SWORD = INSTANCE.addMedievalWeaponItem("bronze_single_edged_sword", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.SINGLE_EDGED_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_SPATHA = INSTANCE.addMedievalWeaponItem("bronze_spatha", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.SPATHA);
    public static final RegistrySupplier<MedievalWeaponItem> BRONZE_XIPHOS = INSTANCE.addMedievalWeaponItem("bronze_xiphos", new Item.Properties(), ModItemTier.BRONZE, AddonWeaponTypes.XIPHOS);

    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_ANTIQUE_DAGGER = INSTANCE.addMedievalWeaponItem("black_bronze_antique_dagger", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.ANTIQUE_DAGGER);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_SICA = INSTANCE.addMedievalWeaponItem("black_bronze_sica", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.SICA);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_ANTIQUE_SPEAR = INSTANCE.addMedievalWeaponItem("black_bronze_antique_spear", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.ANTIQUE_SPEAR);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_DORU = INSTANCE.addMedievalWeaponItem("black_bronze_doru", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.DORU);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_RETIARIUS = INSTANCE.addMedievalWeaponItem("black_bronze_retiarius", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.RETIARIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_SARISSA = INSTANCE.addMedievalWeaponItem("black_bronze_sarissa", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.SARISSA);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_TRIARII_SPEAR = INSTANCE.addMedievalWeaponItem("black_bronze_triarii_spear", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.TRIARII_SPEAR);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_ANTIQUE_SWORD = INSTANCE.addMedievalWeaponItem("black_bronze_antique_sword", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.ANTIQUE_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_CELTIC_SWORD = INSTANCE.addMedievalWeaponItem("black_bronze_celtic_sword", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.CELTIC_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_EARLY_SPATHA = INSTANCE.addMedievalWeaponItem("black_bronze_early_spatha", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.EARLY_SPATHA);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_GLADIATOR_SWORD = INSTANCE.addMedievalWeaponItem("black_bronze_gladiator_sword", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.GLADIATOR_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_GLADIUS = INSTANCE.addMedievalWeaponItem("black_bronze_gladius", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.GLADIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_KOPIS = INSTANCE.addMedievalWeaponItem("black_bronze_kopis", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.KOPIS);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_REPUBLIC_GLADIUS = INSTANCE.addMedievalWeaponItem("black_bronze_republic_gladius", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.REPUBLIC_GLADIUS);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_RHOMPHAIA = INSTANCE.addMedievalWeaponItem("black_bronze_rhomphaia", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.RHOMPHAIA);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_SINGLE_EDGED_SWORD = INSTANCE.addMedievalWeaponItem("black_bronze_single_edged_sword", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.SINGLE_EDGED_SWORD);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_SPATHA = INSTANCE.addMedievalWeaponItem("black_bronze_spatha", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.SPATHA);
    public static final RegistrySupplier<MedievalWeaponItem> BLACK_BRONZE_XIPHOS = INSTANCE.addMedievalWeaponItem("black_bronze_xiphos", new Item.Properties(), ModdedItems.BLACK_BRONZE, AddonWeaponTypes.XIPHOS);


    public static final ArrayList<RegistrySupplier<MedievalShieldItem>> listShields = new ArrayList<>(){{
        add(BLACK_BRONZE_REPUBLIC_SCUTUM);
        add(BLACK_BRONZE_IMPERIAL_SCUTUM);
        add(BLACK_BRONZE_TUREOS);
        add(BLACK_BRONZE_HOPLON);
        add(BISMUTH_BRONZE_REPUBLIC_SCUTUM);
        add(BISMUTH_BRONZE_IMPERIAL_SCUTUM);
        add(BISMUTH_BRONZE_TUREOS);
        add(BISMUTH_BRONZE_HOPLON);
    }};
    public static final ArrayList<RegistrySupplier<Item>> listBismuthBronzeParts = new ArrayList<>() {{

    }};
    public static final ArrayList<RegistrySupplier<Item>> listBlackBronzeParts = new ArrayList<>() {{

    }};
    public static final ArrayList<RegistrySupplier<Item>> listBronzeParts = new ArrayList<>() {{

    }};
    public static final ArrayList<RegistrySupplier<MedievalWeaponItem>> listBismuthBronzeWeapons = new ArrayList<>() {{
        add(BISMUTH_BRONZE_ANTIQUE_DAGGER);
        add(BISMUTH_BRONZE_SICA);
        add(BISMUTH_BRONZE_ANTIQUE_SPEAR);
        add(BISMUTH_BRONZE_ANTIQUE_SWORD);
        add(BISMUTH_BRONZE_DORU);
        add(BISMUTH_BRONZE_RETIARIUS);
        add(BISMUTH_BRONZE_SARISSA);
        add(BISMUTH_BRONZE_TRIARII_SPEAR);
        add(BISMUTH_BRONZE_CELTIC_SWORD);
        add(BISMUTH_BRONZE_EARLY_SPATHA);
        add(BISMUTH_BRONZE_GLADIATOR_SWORD);
        add(BISMUTH_BRONZE_GLADIUS);
        add(BISMUTH_BRONZE_KOPIS);
        add(BISMUTH_BRONZE_REPUBLIC_GLADIUS);
        add(BISMUTH_BRONZE_RHOMPHAIA);
        add(BISMUTH_BRONZE_SINGLE_EDGED_SWORD);
        add(BISMUTH_BRONZE_SPATHA);
        add(BISMUTH_BRONZE_XIPHOS);
    }};
    public static final ArrayList<RegistrySupplier<MedievalWeaponItem>> listBlackBronzeWeapons = new ArrayList<>() {{
        add(BLACK_BRONZE_ANTIQUE_DAGGER);
        add(BLACK_BRONZE_SICA);
        add(BLACK_BRONZE_ANTIQUE_SPEAR);
        add(BLACK_BRONZE_ANTIQUE_SWORD);
        add(BLACK_BRONZE_DORU);
        add(BLACK_BRONZE_RETIARIUS);
        add(BLACK_BRONZE_SARISSA);
        add(BLACK_BRONZE_TRIARII_SPEAR);
        add(BLACK_BRONZE_CELTIC_SWORD);
        add(BLACK_BRONZE_EARLY_SPATHA);
        add(BLACK_BRONZE_GLADIATOR_SWORD);
        add(BLACK_BRONZE_GLADIUS);
        add(BLACK_BRONZE_KOPIS);
        add(BLACK_BRONZE_REPUBLIC_GLADIUS);
        add(BLACK_BRONZE_RHOMPHAIA);
        add(BLACK_BRONZE_SINGLE_EDGED_SWORD);
        add(BLACK_BRONZE_SPATHA);
        add(BLACK_BRONZE_XIPHOS);
    }};
    public static final ArrayList<RegistrySupplier<MedievalWeaponItem>> listBronzeWeapons = new ArrayList<>() {{
        add(BRONZE_ANTIQUE_DAGGER);
        add(BRONZE_SICA);
        add(BRONZE_ANTIQUE_SPEAR);
        add(BRONZE_ANTIQUE_SWORD);
        add(BRONZE_DORU);
        add(BRONZE_RETIARIUS);
        add(BRONZE_SARISSA);
        add(BRONZE_TRIARII_SPEAR);
        add(BRONZE_CELTIC_SWORD);
        add(BRONZE_EARLY_SPATHA);
        add(BRONZE_GLADIATOR_SWORD);
        add(BRONZE_GLADIUS);
        add(BRONZE_KOPIS);
        add(BRONZE_REPUBLIC_GLADIUS);
        add(BRONZE_RHOMPHAIA);
        add(BRONZE_SINGLE_EDGED_SWORD);
        add(BRONZE_SPATHA);
        add(BRONZE_XIPHOS);
    }};
    public AntiqueItems() {
        super(KnightsOfTerraFirma.MODID);
    }

}
