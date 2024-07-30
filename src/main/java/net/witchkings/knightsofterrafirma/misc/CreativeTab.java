package net.witchkings.knightsofterrafirma.misc;


import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.network.chat.Component;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);

    public static final RegistryObject<CreativeModeTab> KOTF = CREATIVE_MODE_TABS.register("kotf", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get()))
            .title(Component.translatable("creativetab.kotf")).
            displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get());})
            .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
