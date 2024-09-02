package net.witchkings.knightsofterrafirma;

import com.mojang.logging.LogUtils;
import dev.architectury.platform.Platform;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.witchkings.knightsofterrafirma.client.ModModel;
import net.witchkings.knightsofterrafirma.item.ArmorModifier;
import net.witchkings.knightsofterrafirma.item.EKArmor;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.witchkings.knightsofterrafirma.item.Shields;
import net.witchkings.knightsofterrafirma.misc.CreativeTab;
import net.witchkings.knightsofterrafirma.misc.RPLoader;


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
        Shields.INSTANCE.init();
        Shields.shieldRegistry();
        if (Platform.getEnv() == Dist.CLIENT)
            ModModel.INSTANCE.init(Shields.INSTANCE);
        RPLoader.init();
        EKArmor.init();
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
}
