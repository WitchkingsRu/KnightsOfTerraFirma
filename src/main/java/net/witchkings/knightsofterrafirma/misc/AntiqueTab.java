package net.witchkings.knightsofterrafirma.misc;

import com.magistuarmory.antiquelegacy.misc.AddonCreativeTabs;
import com.magistuarmory.item.DyeableArmorDecorationItem;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.RegistrySupplier;
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
import net.witchkings.knightsofterrafirma.item.ModelledItems;

import static net.witchkings.knightsofterrafirma.item.AntiqueItems.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AntiqueTab {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);

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
    public static void buildTabContentsDeco(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("antiquelegacy")) {
            if (tabData.getTabKey() == AddonCreativeTabs.ARMOR_DECORATIONS_RESOURCE_KEY) {
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
    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}


