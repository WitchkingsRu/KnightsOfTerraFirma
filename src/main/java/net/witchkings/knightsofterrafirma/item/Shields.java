package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.*;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item.Properties;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;;

import java.util.ArrayList;

import static net.witchkings.knightsofterrafirma.item.ModdedItems.*;


public class Shields extends ModItemsProvider {
    public static final Shields INSTANCE = new Shields();
    public static final ArrayList<RegistrySupplier<MedievalShieldItem>> listShields = new ArrayList<>();
    public static void shieldRegistry() {
        for (ModItemTier material: Materials) {
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_heatershield", "heatershield", new Properties(), material, true, true, ShieldTypes.HEATER_SHIELD));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_target", "target", new Properties(), material, false, true, ShieldTypes.TARGET));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_buckler", "buckler", new Properties(), material, false, true, ShieldTypes.BUCKLER));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_rondache", "rondache", new Properties(), material, false, true, ShieldTypes.RONDACHE));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_tartsche", "tartsche", new Properties(), material, true, true, ShieldTypes.TARTSCHE));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_roundshield", "roundshield", new Properties(), material, true, true, ShieldTypes.ROUND_SHIELD));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_pavese", "pavese", new Properties(), material, true, true, ShieldTypes.PAVISE));
            listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_kiteshield", "kiteshield", new Properties(), material, true, true, ShieldTypes.KITE_SHIELD));
            if (material != BISMUTH_BRONZE) {
                listShields.add(INSTANCE.addMedievalShieldItem(material.getMaterialName() + "_ellipticalshield", "ellipticalshield", new Properties(), material, true, true, ShieldTypes.ELLIPTICAL_SHIELD));
            }
        }
    }

    public static final RegistrySupplier<MedievalShieldItem>ELLIPTICAL_SHIELD = INSTANCE.addMedievalShieldItem("bismuth_bronze_ellipticalshield", "ellipticalshield", new Properties(), ModdedItems.BISMUTH_BRONZE, true, true, ShieldTypes.ELLIPTICAL_SHIELD);

    public Shields() {
        super(KnightsOfTerraFirma.MODID);
    }
}
