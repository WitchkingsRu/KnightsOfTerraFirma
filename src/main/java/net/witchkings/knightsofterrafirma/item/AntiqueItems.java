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
import net.witchkings.knightsofterrafirma.item.armor.AntiqueArmor;

import java.util.ArrayList;
import java.util.function.Supplier;

import static net.witchkings.knightsofterrafirma.item.ModdedItems.BISMUTH_BRONZE;
import static net.witchkings.knightsofterrafirma.item.ModdedItems.Materials;

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

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SCYTHIAN_SCALE_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_bronze_scythian_scale_helmet", AntiqueArmor.BISMUTH_BRONZE_SCYTHIAN_SCALE_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_ROMAN_GREAVES = INSTANCE.addMedievalArmorItem("bismuth_bronze_bronze_roman_greaves", AntiqueArmor.BISMUTH_BRONZE_ROMAN_GREAVES, ArmorItem.Type.LEGGINGS, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_CELTIC_MONTEFORTINO_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_celtic_montefortino_helmet", AntiqueArmor.BISMUTH_BRONZE_CELTIC_MONTEFORTINO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_LA_GORGE_MEILLET = INSTANCE.addMedievalArmorItem("bismuth_bronze_la_gorge_meillet", AntiqueArmor.BISMUTH_BRONZE_LA_GORGE_MEILLET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_SAVA_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_sava_helmet", AntiqueArmor.BISMUTH_BRONZE_SAVA_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

    public static final @Nullable RegistrySupplier<MedievalArmorItem> BISMUTH_BRONZE_WATERLOO_HELMET = INSTANCE.addMedievalArmorItem("bismuth_bronze_waterloo_helmet", AntiqueArmor.BISMUTH_BRONZE_WATERLOO_HELMET, ArmorItem.Type.HELMET, new Item.Properties());

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
    
    
    public AntiqueItems() {
        super(KnightsOfTerraFirma.MODID);
    }

}