package net.witchkings.knightsofterrafirma;

import com.mojang.logging.LogUtils;
import com.magistuarmory.item.ModItemTier;
import dev.architectury.platform.Platform;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.witchkings.knightsofterrafirma.misc.CreativeTab;
import net.witchkings.knightsofterrafirma.mixin.ModItemTierMixin;
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
        Mixins.addConfiguration("knightsofterrafirma.mixins.json");
        ModItemTier copper = ModItemTier.COPPER;
        System.out.println("Copper uses: " + copper.getUses());
        CreativeTab.register(modEventBus);
        ModdedItems.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Some client setup code

            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }

    public static void checkBetterCombatOrEpicFightInstalled() {
        BC_or_EF_installed = Platform.isModLoaded("bettercombat") || Platform.isModLoaded("epicfight");
    }
}
