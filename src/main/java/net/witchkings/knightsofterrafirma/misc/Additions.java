package net.witchkings.knightsofterrafirma.misc;



import com.magistuarmory.antiquelegacy.item.AddonItems;
import dev.architectury.platform.Platform;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.AdditionalItems;
import net.witchkings.knightsofterrafirma.item.AntiqueItems;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.network.chat.Component;
import net.witchkings.knightsofterrafirma.item.ModelledItems;
import static com.magistuarmory.misc.ModCreativeTabs.ARMOR_DECORATIONS_RESOURCE_KEY;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Additions {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);


    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (Platform.isModLoaded("dfc")) {
            if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
                tabData.getEntries().putAfter(ModdedItems.ROSE_GOLD_TEMPLATE.get().getDefaultInstance(), ModdedItems.PLATINUM_TEMPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            }
        }
    }
    @SubscribeEvent
    public static void buildTabContentsModded(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeTab.KOTF_ARMOR.getKey()) {
            if (Platform.isModLoaded("dfc")) {
                tabData.getEntries().putAfter(ModelledItems.ROSE_GOLD_STEEL_CEREMONIAL_BOOTS.get().getDefaultInstance(), AdditionalItems.PLATINUM_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), AdditionalItems.PLATINUM_STEEL_CEREMONIAL_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_STEEL_CEREMONIAL_CHESTPLATE.get().getDefaultInstance(), AdditionalItems.PLATINUM_STEEL_CEREMONIAL_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

                tabData.getEntries().putAfter(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_BOOTS.get().getDefaultInstance(), AdditionalItems.PLATINUM_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), AdditionalItems.PLATINUM_BLACKSTEEL_KNIGHT_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_BLACKSTEEL_KNIGHT_CHESTPLATE.get().getDefaultInstance(), AdditionalItems.PLATINUM_BLACKSTEEL_KNIGHT_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_BLACKSTEEL_KNIGHT_LEGGINGS.get().getDefaultInstance(), AdditionalItems.PLATINUM_BLACKSTEEL_KNIGHT_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

                tabData.getEntries().putAfter(ModelledItems.BLUESTEEL_ROSE_GOLD_KNIGHT_BOOTS.get().getDefaultInstance(), AdditionalItems.PLATINUM_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), AdditionalItems.BLUESTEEL_PLATINUM_KNIGHT_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.BLUESTEEL_PLATINUM_KNIGHT_CHESTPLATE.get().getDefaultInstance(), AdditionalItems.BLUESTEEL_PLATINUM_KNIGHT_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.BLUESTEEL_PLATINUM_KNIGHT_LEGGINGS.get().getDefaultInstance(), AdditionalItems.BLUESTEEL_PLATINUM_KNIGHT_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

                tabData.getEntries().putAfter(ModelledItems.REDSTEEL_ROSE_GOLD_KNIGHT_BOOTS.get().getDefaultInstance(), AdditionalItems.PLATINUM_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.PLATINUM_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get(), AdditionalItems.REDSTEEL_PLATINUM_KNIGHT_CHESTPLATE.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.REDSTEEL_PLATINUM_KNIGHT_CHESTPLATE.get().getDefaultInstance(), AdditionalItems.REDSTEEL_PLATINUM_KNIGHT_LEGGINGS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AdditionalItems.REDSTEEL_PLATINUM_KNIGHT_LEGGINGS.get().getDefaultInstance(), AdditionalItems.REDSTEEL_PLATINUM_KNIGHT_BOOTS.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }

        } else if (tabData.getTabKey() == ARMOR_DECORATIONS_RESOURCE_KEY) {
            if (Platform.isModLoaded("dfc")) {
                tabData.getEntries().putAfter(ModelledItems.ROSE_GOLD_CROWN_DECORATION.get().getDefaultInstance(), ModelledItems.PLATINUM_CROWN_DECORATION.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(ModelledItems.ROSE_GOLD_MINICROWN_DECORATION.get().getDefaultInstance(), ModelledItems.PLATINUM_MINICROWN_DECORATION.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
                tabData.getEntries().putAfter(AntiqueItems.ROSE_GOLD_LAUREL_WREATH_DECORATION.get().getDefaultInstance(), AntiqueItems.PLATINUM_LAUREL_WREATH_DECORATION.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            }

        }
    }
    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
