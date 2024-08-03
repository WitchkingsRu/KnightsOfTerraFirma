package net.witchkings.knightsofterrafirma.misc;


import com.magistuarmory.forge.item.MedievalWeaponItemForge;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.network.chat.Component;
import net.witchkings.knightsofterrafirma.item.Shields;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);

    public static final RegistryObject<CreativeModeTab> KOTF_WEAPONS = CREATIVE_MODE_TABS.register("kotf_weapons", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get()))
            .title(Component.translatable("creativetab.kotf_weapons")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get());
            for (RegistryObject<MedievalWeaponItemForge> item:ModdedItems.listWeapons) {
                output.accept(item.get());
            }})
            .build());
    public static final RegistryObject<CreativeModeTab> KOTF_PARTS = CREATIVE_MODE_TABS.register("kotf_parts", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get()))
            .title(Component.translatable("creativetab.kotf_weapon_parts")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get());
                output.accept(Shields.BB_ELLIPTICAL_SHIELD.get());
                for (RegistryObject<Item> item:ModdedItems.listParts) {
                    output.accept(item.get());
                }})
            .build());
//    public static final ResourceKey<CreativeModeTab> PARTICULAR_WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(KnightsOfTerraFirma.MODID, "particular_weapons"));

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
