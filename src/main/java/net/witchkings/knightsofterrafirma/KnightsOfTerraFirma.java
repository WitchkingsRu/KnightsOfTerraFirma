package net.witchkings.knightsofterrafirma;

import com.magistuarmory.config.ArmorConfig;
import com.magistuarmory.config.GeneralConfig;
import com.magistuarmory.config.ModConfig;
import com.mojang.logging.LogUtils;
import dev.architectury.platform.Platform;
import dev.architectury.platform.forge.EventBuses;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.witchkings.knightsofterrafirma.client.AntiqueModels;
import net.witchkings.knightsofterrafirma.client.ModModel;
import net.witchkings.knightsofterrafirma.config.ConfigArmor;
import net.witchkings.knightsofterrafirma.config.ConfigMain;
import net.witchkings.knightsofterrafirma.item.*;
import net.witchkings.knightsofterrafirma.misc.*;


import net.witchkings.knightsofterrafirma.recipe.WeldingSerializer;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixins;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(KnightsOfTerraFirma.MODID)
public class KnightsOfTerraFirma {
    public static boolean BC_or_EF_installed;
    // Define mod id in a common place for everything to reference
    public static final String MODID = "knightsofterrafirma";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static ConfigMain CONFIG;
    public static ConfigArmor CONFIG_ARMOR;

    public KnightsOfTerraFirma() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MODID, FMLJavaModLoadingContext.get().getModEventBus());

        CreativeTab.register(modEventBus);
        ModdedItems.INSTANCE.init();
        ModdedItems.weaponRegistry();
        Mixins.addConfiguration("mixins.knightsofterrafirma.json");
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        ModelledItems.INSTANCE.init();
        ModelledItems.shieldRegistry();
        if (Platform.getEnv() == Dist.CLIENT)
            ModModel.INSTANCE.init(ModelledItems.INSTANCE);
        RPLoader.init();
        EKArmor.init();
        ExtendedCreativeTabs.register(modEventBus);
        WeldingSerializer.RECIPE_SERIALIZERS.register(modEventBus);

        if (Platform.isModLoaded("dfc")) {
            AdditionalItems.INSTANCE.init();
            if (Platform.getEnv() == Dist.CLIENT)
                ModModel.INSTANCE.init(AdditionalItems.INSTANCE);

        }
        if (Platform.isModLoaded("dfc")) {
            Additions.register(modEventBus);
        }

        if (Platform.isModLoaded("antiquelegacy")) {
            AntiqueItems.INSTANCE.init();
            if (Platform.getEnv() == Dist.CLIENT)
                AntiqueModels.INSTANCE.init(AntiqueItems.INSTANCE);

        }
        if (Platform.isModLoaded("antiquelegacy")) {
            AntiqueTab.register(modEventBus);
        }

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("Weapons ready, my lord!");


    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Call the banners! We enter the fray!");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code
            LOGGER.info("Call the banners! We enter the fray!");
        }
    }

    public static void checkBetterCombatOrEpicFightInstalled() {
        BC_or_EF_installed = Platform.isModLoaded("bettercombat") || Platform.isModLoaded("epicfight");
    }
    static {
        AutoConfig.register(ConfigMain.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        CONFIG = AutoConfig.getConfigHolder(ConfigMain.class).getConfig();
        CONFIG_ARMOR = CONFIG.armor;
    }
}
