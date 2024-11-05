package net.witchkings.knightsofterrafirma.misc;


import com.magistuarmory.EpicKnights;
import com.magistuarmory.antiquelegacy.item.AddonItems;
import com.magistuarmory.item.DyeableArmorDecorationItem;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;

import net.witchkings.knightsofterrafirma.item.AntiqueItems;

import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.network.chat.Component;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.witchkings.knightsofterrafirma.item.ModelledItems;

import static net.witchkings.knightsofterrafirma.item.AntiqueItems.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AntiqueTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);
    public static final ResourceKey<CreativeModeTab> ARMOR_DECORATIONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "armor_decorations"));
    public static final ResourceKey<CreativeModeTab> PARTICULAR_WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(EpicKnights.ID, "particular_weapons"));

    @SubscribeEvent
    public static void buildTabContents(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("antiquelegacy")) {
            if (tabData.getTabKey() == CreativeTab.KOTF_ARMOR.getKey()) {
                for (RegistrySupplier<MedievalArmorItem> item: AntiqueItems.listArmorBismuthBronze) {
                    tabData.getEntries().putBefore(ModelledItems.SILVER_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
                for (RegistrySupplier<MedievalArmorItem> item: AntiqueItems.listArmorBlackBronze) {
                    tabData.getEntries().putBefore(ModelledItems.SILVER_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
        }
    }
    @SubscribeEvent
    public static void bildTabContents(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("antiquelegacy")) {
            if (tabData.getTabKey() == CreativeTab.KOTF_PARTS.getKey()) {
                for (RegistrySupplier<Item> item: AntiqueItems.listBismuthBronzeParts) {
                    tabData.getEntries().putBefore(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
                for (RegistrySupplier<Item> item: AntiqueItems.listBlackBronzeParts) {
                    tabData.getEntries().putBefore(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
                for (RegistrySupplier<Item> item: AntiqueItems.listBronzeParts) {
                    tabData.getEntries().putBefore(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
            else if (tabData.getTabKey() == CreativeTab.KOTF_ARMOR_PARTS.getKey()) {
                for (RegistrySupplier<Item> item : listArmorParts) {
                    tabData.getEntries().putBefore(ModdedItems.BASCINET_VISOR.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
        }
    }
    @SubscribeEvent
    public static void buildTabContentsDeco(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("antiquelegacy")) {
            if (tabData.getTabKey() == ARMOR_DECORATIONS_RESOURCE_KEY) {
                tabData.accept(BISMUTH_BRONZE_HORNS_DECORATION.get());
                tabData.accept(BISMUTH_BRONZE_SMALL_WINGS_DECORATION.get());
                for (RegistrySupplier<DyeableArmorDecorationItem> item: AntiqueItems.listDecoBismuthBronze) {
                    tabData.accept(item.get());
                }
                tabData.accept(BISMUTH_BRONZE_LEFT_GLADIATOR_SHOULDER_PAD_DECORATION.get());
                tabData.accept(BISMUTH_BRONZE_RIGHT_GLADIATOR_SHOULDER_PAD_DECORATION.get());
                tabData.accept(BISMUTH_BRONZE_LEFT_HAND_MANIKA_DECORATION.get());
                tabData.accept(BISMUTH_BRONZE_RIGHT_HAND_MANIKA_DECORATION.get());
                tabData.accept(BLACK_BRONZE_HORNS_DECORATION.get());
                tabData.accept(BLACK_BRONZE_SMALL_WINGS_DECORATION.get());
                for (RegistrySupplier<DyeableArmorDecorationItem> item: AntiqueItems.listDecoBlackBronze) {
                    tabData.accept(item.get());
                }
                tabData.accept(BLACK_BRONZE_LEFT_GLADIATOR_SHOULDER_PAD_DECORATION.get());
                tabData.accept(BLACK_BRONZE_RIGHT_GLADIATOR_SHOULDER_PAD_DECORATION.get());
                tabData.accept(BLACK_BRONZE_LEFT_HAND_MANIKA_DECORATION.get());
                tabData.accept(BLACK_BRONZE_RIGHT_HAND_MANIKA_DECORATION.get());

            }
        }
    }
    @SubscribeEvent
    public static void builtTabContents(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("antiquelegacy")) {
            if (tabData.getTabKey() == CreativeTab.KOTF_SHIELDS.getKey()) {
                for (RegistrySupplier<MedievalShieldItem> item: AntiqueItems.listShields) {
                    tabData.getEntries().putBefore(ModelledItems.ELLIPTICAL_SHIELD.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
        }
    }
    @SubscribeEvent
    public static void buildedTabContents(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("antiquelegacy")) {
            if (tabData.getTabKey() == CreativeTab.KOTF_WEAPONS.getKey()) {
                for (RegistrySupplier<MedievalWeaponItem> item: listBismuthBronzeWeapons) {
                    tabData.getEntries().putBefore(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
                for (RegistrySupplier<MedievalWeaponItem> item: listBlackBronzeWeapons) {
                    tabData.getEntries().putBefore(ModdedItems.BLACK_BRONZE_BASTARDSWORD.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            } else if (tabData.getTabKey() == PARTICULAR_WEAPONS_RESOURCE_KEY) {
                for (RegistrySupplier<MedievalWeaponItem> item: listBronzeWeapons) {
                    tabData.getEntries().putBefore(AddonItems.IRON_ANTIQUE_DAGGER.get().getDefaultInstance(), item.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                }
            }
        }
    }
    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            tabData.getEntries().putAfter(AddonItems.IRON_LAMELLAR_ROWS.get().getDefaultInstance(), SMALL_BLACK_BRONZE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            tabData.getEntries().putAfter(SMALL_BLACK_BRONZE_PLATE.get().getDefaultInstance(), BLACK_BRONZE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            tabData.getEntries().putAfter(BLACK_BRONZE_PLATE.get().getDefaultInstance(), BLACK_BRONZE_LAMELLAR_ROWS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            tabData.getEntries().putAfter(BLACK_BRONZE_LAMELLAR_ROWS.get().getDefaultInstance(), SMALL_BISMUTH_BRONZE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            tabData.getEntries().putAfter(SMALL_BISMUTH_BRONZE_PLATE.get().getDefaultInstance(), BISMUTH_BRONZE_PLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            tabData.getEntries().putAfter(BISMUTH_BRONZE_PLATE.get().getDefaultInstance(), BISMUTH_BRONZE_LAMELLAR_ROWS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}


