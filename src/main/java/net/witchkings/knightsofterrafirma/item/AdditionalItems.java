package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.ShieldTypes;
import com.magistuarmory.item.armor.ArmorTypes;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.event.events.common.EntityEvent;
import dev.architectury.registry.registries.RegistrySupplier;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.armor.ModArmor;

import java.util.ArrayList;
import java.util.function.Supplier;


public class AdditionalItems extends ModItemsProvider {
    public static final AdditionalItems INSTANCE = new AdditionalItems();
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_BLACKSTEEL_ARMET = INSTANCE.addKnightItem("platinum_black_steel_armet", ModArmor.PLATINUM_BLACKSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_BLACKSTEEL_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("platinum_black_steel_knight_chestplate", ModArmor.PLATINUM_BLACKSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_BLACKSTEEL_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("platinum_black_steel_knight_leggings", ModArmor.PLATINUM_BLACKSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_BLACKSTEEL_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("platinum_black_steel_knight_boots", ModArmor.PLATINUM_BLACKSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_STEEl_CEREMONIAL_ARMET = INSTANCE.addKnightItem("platinum_steel_ceremonialarmet", ModArmor.PLATINUM_STEEL_CEREMONIAL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_STEEL_CEREMONIAL_CHESTPLATE = INSTANCE.addMedievalArmorItem("platinum_steel_ceremonial_chestplate", ModArmor.PLATINUM_STEEL_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties());
    public static final RegistrySupplier<MedievalArmorItem> PLATINUM_STEEL_CEREMONIAL_BOOTS = INSTANCE.addMedievalArmorItem("platinum_steel_ceremonial_boots", ModArmor.PLATINUM_STEEL_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties());

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_PLATINUM_ARMET = INSTANCE.addKnightItem("platinum_blue_steel_armet", ModArmor.BLUESTEEL_PLATINUM_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_PLATINUM_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("platinum_blue_steel_knight_chestplate", ModArmor.BLUESTEEL_PLATINUM_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_PLATINUM_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("platinum_blue_steel_knight_leggings", ModArmor.BLUESTEEL_PLATINUM_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> BLUESTEEL_PLATINUM_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("platinum_blue_steel_knight_boots", ModArmor.BLUESTEEL_PLATINUM_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_PLATINUM_ARMET = INSTANCE.addKnightItem("platinum_red_steel_armet", ModArmor.PLATINUM_REDSTEEL_ARMET, ArmorItem.Type.HELMET, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_PLATINUM_KNIGHT_CHESTPLATE = INSTANCE.addMedievalArmorItem("platinum_red_steel_knight_chestplate", ModArmor.PLATINUM_REDSTEEL_KNIGHT_CHESTPLATE, ArmorItem.Type.CHESTPLATE, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_PLATINUM_KNIGHT_LEGGINGS = INSTANCE.addMedievalArmorItem("platinum_red_steel_knight_leggings", ModArmor.PLATINUM_REDSTEEL_KNIGHT, ArmorItem.Type.LEGGINGS, new Item.Properties());;
    @Nullable
    public static final RegistrySupplier<MedievalArmorItem> REDSTEEL_PLATINUM_KNIGHT_BOOTS = INSTANCE.addMedievalArmorItem("platinum_red_steel_knight_boots", ModArmor.PLATINUM_REDSTEEL_KNIGHT, ArmorItem.Type.BOOTS, new Item.Properties());;

    public static Supplier<ItemStack> PLATINUM_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(PLATINUM_STEEl_CEREMONIAL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> PLATINUM_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(PLATINUM_BLACKSTEEL_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> PLATINUM_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(BLUESTEEL_PLATINUM_ARMET, ModItems.BIG_PLUME_DECORATION);
    };
    public static Supplier<ItemStack> PLATINUM_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER = () -> {
        return ModItems.getDecoratedStack(REDSTEEL_PLATINUM_ARMET, ModItems.BIG_PLUME_DECORATION);
    };

    public AdditionalItems() {
        super(KnightsOfTerraFirma.MODID);
    }
}
