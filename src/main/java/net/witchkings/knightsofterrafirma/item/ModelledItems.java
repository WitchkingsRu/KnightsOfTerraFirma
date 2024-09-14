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
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_SALLET = INSTANCE.addKnightItem("black_steel_sallet", ModArmor.BLACKSTEEL_SALLET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GOTHIC_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_gothic_chestplate", ModArmor.BLACKSTEEL_GOTHIC_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GOTHIC_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_gothic_leggings", ModArmor.BLACKSTEEL_GOTHIC, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GOTHIC_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_gothic_boots", ModArmor.BLACKSTEEL_GOTHIC, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_GRANDBASCINET = INSTANCE.addKnightItem("black_steel_grand_bascinet", ModArmor.BLACKSTEEL_GRAND_BASCINET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KASTENBRUST_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_kastenbrust_chestplate", ModArmor.BLACKSTEEL_KASTENBRUST_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KASTENBRUST_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_kastenbrust_leggings", ModArmor.BLACKSTEEL_KASTENBRUST, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KASTENBRUST_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_kastenbrust_boots", ModArmor.BLACKSTEEL_KASTENBRUST, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_HELMET = INSTANCE.addKnightItem("black_steel_maximilian_helmet", ModArmor.BLACKSTEEL_MAXIMILIAN_HELMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_maximilian_chestplate", ModArmor.BLACKSTEEL_MAXIMILIAN_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_maximilian_leggings", ModArmor.BLACKSTEEL_MAXIMILIAN, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_MAXIMILIAN_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_maximilian_boots", ModArmor.BLACKSTEEL_MAXIMILIAN, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_KETTLEHAT = INSTANCE.addKnightItem("black_steel_kettlehat", ModArmor.BLACKSTEEL_KETTLEHAT, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_PLATEMAIL_CHESTPLATE = INSTANCE.addMedievalArmorItem("black_steel_platemail_chestplate", ModArmor.BLACKSTEEL_PLATEMAIL_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_PLATEMAIL_LEGGINGS = INSTANCE.addMedievalArmorItem("black_steel_platemail_leggings", ModArmor.BLACKSTEEL_PLATEMAIL, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLACKSTEEL_PLATEMAIL_BOOTS = INSTANCE.addMedievalArmorItem("black_steel_platemail_boots", ModArmor.BLACKSTEEL_PLATEMAIL, ArmorItem.Type.BOOTS, new Item.Properties());;

    public static Supplier<ItemStack> ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };

    public static final ArrayList<RegistrySupplier<MedievalArmorItem>> listArmor = new ArrayList<>() {{
        add(BLACKSTEEL_KNIGHT_CHESTPLATE);
        add(BLACKSTEEL_KNIGHT_LEGGINGS);
        add(BLACKSTEEL_KNIGHT_BOOTS);
        add(BLACKSTEEL_SALLET);
        add(BLACKSTEEL_GOTHIC_CHESTPLATE);
        add(BLACKSTEEL_GOTHIC_LEGGINGS);
        add(BLACKSTEEL_GOTHIC_BOOTS);
        add(BLACKSTEEL_BARBUTE);
        add(BLACKSTEEL_HALFARMOR_CHESTPLATE);
        add(BLACKSTEEL_GRANDBASCINET);
        add(BLACKSTEEL_KASTENBRUST_CHESTPLATE);
        add(BLACKSTEEL_KASTENBRUST_LEGGINGS);
        add(BLACKSTEEL_KASTENBRUST_BOOTS);
        add(BLACKSTEEL_MAXIMILIAN_HELMET);
        add(BLACKSTEEL_MAXIMILIAN_CHESTPLATE);
        add(BLACKSTEEL_MAXIMILIAN_LEGGINGS);
        add(BLACKSTEEL_MAXIMILIAN_BOOTS);
        add(BLACKSTEEL_KETTLEHAT);
        add(BLACKSTEEL_PLATEMAIL_CHESTPLATE);
        add(BLACKSTEEL_PLATEMAIL_LEGGINGS);
        add(BLACKSTEEL_PLATEMAIL_BOOTS);
    }};
    public static final RegistrySupplier<MedievalShieldItem>ELLIPTICAL_SHIELD = INSTANCE.addMedievalShieldItem("bismuth_bronze_ellipticalshield", "ellipticalshield", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, ShieldTypes.ELLIPTICAL_SHIELD);

    public ModelledItems() {
        super(KnightsOfTerraFirma.MODID);
    }
}
