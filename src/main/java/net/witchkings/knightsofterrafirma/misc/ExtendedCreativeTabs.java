package net.witchkings.knightsofterrafirma.misc;


import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.network.chat.Component;
import net.witchkings.knightsofterrafirma.item.ModelledItems;

import java.util.function.Supplier;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExtendedCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);

    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            tabData.accept(ModdedItems.BLACK_STEEL_CHAINMAIL.get());
            tabData.accept(ModItems.GILDING_TEMPLATE.get());
            tabData.accept(ModdedItems.SILVER_TEMPLATE.get());
            tabData.accept(ModdedItems.STERLING_SILVER_TEMPLATE.get());
            tabData.accept(ModdedItems.BRASS_TEMPLATE.get());
            tabData.accept(ModdedItems.ROSE_GOLD_TEMPLATE.get());
        }
    }
    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}