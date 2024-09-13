package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.ShieldTypes;
import com.magistuarmory.item.armor.ArmorTypes;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.armor.ModArmor;

import java.util.ArrayList;

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
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_BARBUTE = INSTANCE.addMedievalArmorItem("black_steel_halfarmor_helmet", ModArmor.BLACKSTEEL_BARBUTE, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_HALFARMOR_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_halfarmor_chestplate", ModArmor.BLACKSTEEL_HALFARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties());

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listArmor = new ArrayList<>() {{
        add(BLACKSTEEL_ARMET);
        add(BLACKSTEEL_KNIGHT_CHESTPLATE);
        add(BLACKSTEEL_KNIGHT_LEGGINGS);
        add(BLACKSTEEL_KNIGHT_BOOTS);
        add(BLACKSTEEL_BARBUTE);
        add(BLACKSTEEL_HALFARMOR_CHESTPLATE);
    }};
    public static final RegistrySupplier<MedievalShieldItem>ELLIPTICAL_SHIELD = INSTANCE.addMedievalShieldItem("bismuth_bronze_ellipticalshield", "ellipticalshield", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, ShieldTypes.ELLIPTICAL_SHIELD);

    public ModelledItems() {
        super(KnightsOfTerraFirma.MODID);
    }
}
