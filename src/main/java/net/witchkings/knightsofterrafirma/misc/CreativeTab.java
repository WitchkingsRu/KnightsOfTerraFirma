package net.witchkings.knightsofterrafirma.misc;


import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceKey;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.item.AdditionalItems;
import net.witchkings.knightsofterrafirma.item.ModdedItems;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.network.chat.Component;
import net.witchkings.knightsofterrafirma.item.ModelledItems;

import java.util.function.Supplier;


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);

    public static final RegistryObject<CreativeModeTab> KOTF_WEAPONS = CREATIVE_MODE_TABS.register("kotf_weapons", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get()))
            .title(Component.translatable("creativetab.kotf_weapons")).
            displayItems((itemDisplayParameters, output) -> {
            for (RegistrySupplier<MedievalWeaponItem> item:ModdedItems.listWeapons) {
                output.accept(item.get());
            }})
            .build());
    public static final RegistryObject<CreativeModeTab> KOTF_SHIELDS = CREATIVE_MODE_TABS.register("kotf_shields", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModelledItems.ELLIPTICAL_SHIELD.get()))
            .title(Component.translatable("creativetab.kotf_shields")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ModelledItems.ELLIPTICAL_SHIELD.get());
                for (RegistrySupplier<MedievalShieldItem> shield: ModelledItems.listShields) {
                    output.accept(shield.get());
                }
            })
            .build());
    public static final RegistryObject<CreativeModeTab> KOTF_PARTS = CREATIVE_MODE_TABS.register("kotf_parts", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get()))
            .title(Component.translatable("creativetab.kotf_weapon_parts")).
            displayItems((itemDisplayParameters, output) -> {
                for (RegistrySupplier<Item> item:ModdedItems.listParts) {
                    output.accept(item.get());
                }
            })
            .build());
    public static final RegistryObject<CreativeModeTab> KOTF_ARMOR_PARTS = CREATIVE_MODE_TABS.register("kotf_armor_parts", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BASCINET_VISOR.get()))
            .title(Component.translatable("creativetab.kotf_armor_parts")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ModdedItems.BASCINET_VISOR.get());
                output.accept(ModdedItems.CHAINMAIL_HELMET.get());
                output.accept(ModdedItems.CHAINMAIL_TORSO.get());
                output.accept(ModdedItems.CRUSADER_KNEES.get());
                output.accept(ModdedItems.CRUSADER_VISOR.get());
                output.accept(ModdedItems.GOTHIC_VISOR.get());
                output.accept(ModdedItems.GRAND_BASCINET_VISOR.get());
                output.accept(ModdedItems.JOUSTING_VISOR.get());
                output.accept(ModdedItems.HALFARMOR_HELMET.get());
                output.accept(ModdedItems.HALFARMOR_BODY.get());
                output.accept(ModdedItems.HALFARMOR_SHOULDER.get());
                output.accept(ModdedItems.KNIGHT_VISOR.get());
                output.accept(ModdedItems.MAXIMILIAN_VISOR.get());
                output.accept(ModdedItems.HELMET_NOSE.get());
                output.accept(ModdedItems.PLATEMAIL_ARMS.get());
                output.accept(ModdedItems.PLATEMAIL_HAT.get());
                output.accept(ModdedItems.PLATEMAIL_KNEES.get());
                output.accept(ModdedItems.SHISHAK.get());
                output.accept(ModdedItems.XIV_ARMS.get());
                output.accept(ModdedItems.XIV_KNEES.get());

                output.accept(ModdedItems.BLACK_STEEL_CHAINMAIL_HELMET.get());
                output.accept(ModdedItems.BLACK_STEEL_CHAINMAIL_TORSO.get());
                output.accept(ModdedItems.BLACK_STEEL_PLATEMAIL_ARMS.get());
                output.accept(ModdedItems.BLACK_STEEL_PLATEMAIL_HAT.get());
                output.accept(ModdedItems.BLACK_STEEL_CHAINMAIL_PANTS.get());
                output.accept(ModdedItems.BLACK_STEEL_PLATEMAIL_KNEES.get());

                output.accept(ModdedItems.BLACK_STEEL_GOTHIC_VISOR.get());
                output.accept(ModdedItems.BLACK_STEEL_GRAND_BASCINET_VISOR.get());
                output.accept(ModdedItems.BLACK_STEEL_JOUSTING_VISOR.get());
                output.accept(ModdedItems.BLACK_STEEL_HALFARMOR_HELMET.get());
                output.accept(ModdedItems.BLACK_STEEL_HALFARMOR_BODY.get());
                output.accept(ModdedItems.BLACK_STEEL_HALFARMOR_SHOULDER.get());
                output.accept(ModdedItems.BLACK_STEEL_KNIGHT_VISOR.get());
                output.accept(ModdedItems.BLACK_STEEL_MAXIMILIAN_VISOR.get());

                output.accept(ModdedItems.BLUE_STEEL_GOTHIC_VISOR.get());
                output.accept(ModdedItems.BLUE_STEEL_GRAND_BASCINET_VISOR.get());
                output.accept(ModdedItems.BLUE_STEEL_JOUSTING_VISOR.get());
                output.accept(ModdedItems.BLUE_STEEL_HALFARMOR_HELMET.get());
                output.accept(ModdedItems.BLUE_STEEL_HALFARMOR_BODY.get());
                output.accept(ModdedItems.BLUE_STEEL_HALFARMOR_SHOULDER.get());
                output.accept(ModdedItems.BLUE_STEEL_KNIGHT_VISOR.get());
                output.accept(ModdedItems.BLUE_STEEL_MAXIMILIAN_VISOR.get());

                output.accept(ModdedItems.RED_STEEL_GOTHIC_VISOR.get());
                output.accept(ModdedItems.RED_STEEL_GRAND_BASCINET_VISOR.get());
                output.accept(ModdedItems.RED_STEEL_JOUSTING_VISOR.get());
                output.accept(ModdedItems.RED_STEEL_HALFARMOR_HELMET.get());
                output.accept(ModdedItems.RED_STEEL_HALFARMOR_BODY.get());
                output.accept(ModdedItems.RED_STEEL_HALFARMOR_SHOULDER.get());
                output.accept(ModdedItems.RED_STEEL_KNIGHT_VISOR.get());
                output.accept(ModdedItems.RED_STEEL_MAXIMILIAN_VISOR.get());

                for (RegistrySupplier<Item> item:ModdedItems.listArmorParts) {
                    output.accept(item.get());
                }

            })
            .build());
    public static final RegistryObject<CreativeModeTab> KOTF_ARMOR = CREATIVE_MODE_TABS.register("kotf_armor", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModelledItems.BLACKSTEEL_ARMET.get()))
            .title(Component.translatable("creativetab.kotf_armor")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ModelledItems.SILVER_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.SILVER_STEEL_CEREMONIAL_CHESTPLATE.get());
                output.accept(ModelledItems.SILVER_STEEL_CEREMONIAL_BOOTS.get());

                output.accept(ModelledItems.ST_SILVER_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.STERLING_SILVER_STEEL_CEREMONIAL_CHESTPLATE.get());
                output.accept(ModelledItems.STERLING_SILVER_STEEL_CEREMONIAL_BOOTS.get());

                output.accept(ModelledItems.BRASS_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BRASS_STEEL_CEREMONIAL_CHESTPLATE.get());
                output.accept(ModelledItems.BRASS_STEEL_CEREMONIAL_BOOTS.get());

                output.accept(ModelledItems.ROSE_GOLD_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.ROSE_GOLD_STEEL_CEREMONIAL_CHESTPLATE.get());
                output.accept(ModelledItems.ROSE_GOLD_STEEL_CEREMONIAL_BOOTS.get());

                output.accept(ModelledItems.BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.GOLD_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.GOLD_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.GOLD_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.SILVER_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.SILVER_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.SILVER_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.SILVER_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ST_SILVER_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.ST_SILVER_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.ST_SILVER_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.ST_SILVER_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.BRASS_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BRASS_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BRASS_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BRASS_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ROSE_GOLD_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_BOOTS.get());

                for (RegistrySupplier<MedievalArmorItem> item:ModelledItems.listBlackArmor) {
                    output.accept(item.get());
                }

                output.accept(ModelledItems.BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLUESTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLUESTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLUESTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.GOLD_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLUESTEEL_GOLD_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLUESTEEL_GOLD_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLUESTEEL_GOLD_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.SILVER_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLUESTEEL_SILVER_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLUESTEEL_SILVER_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLUESTEEL_SILVER_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ST_SILVER_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLUESTEEL_ST_SILVER_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLUESTEEL_ST_SILVER_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLUESTEEL_ST_SILVER_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.BRASS_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLUESTEEL_BRASS_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLUESTEEL_BRASS_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLUESTEEL_BRASS_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ROSE_GOLD_BLUE_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BLUESTEEL_ROSE_GOLD_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BLUESTEEL_ROSE_GOLD_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BLUESTEEL_ROSE_GOLD_KNIGHT_BOOTS.get());

                for (RegistrySupplier<MedievalArmorItem> item:ModelledItems.listBlueArmor) {
                    output.accept(item.get());
                }

                output.accept(ModelledItems.RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.REDSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.REDSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.REDSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.GOLD_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.REDSTEEL_GOLD_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.REDSTEEL_GOLD_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.REDSTEEL_GOLD_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.SILVER_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.REDSTEEL_SILVER_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.REDSTEEL_SILVER_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.REDSTEEL_SILVER_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ST_SILVER_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.REDSTEEL_ST_SILVER_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.REDSTEEL_ST_SILVER_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.REDSTEEL_ST_SILVER_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.BRASS_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.REDSTEEL_BRASS_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.REDSTEEL_BRASS_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.REDSTEEL_BRASS_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ROSE_GOLD_RED_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.REDSTEEL_ROSE_GOLD_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.REDSTEEL_ROSE_GOLD_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.REDSTEEL_ROSE_GOLD_KNIGHT_BOOTS.get());

                for (RegistrySupplier<MedievalArmorItem> item:ModelledItems.listRedArmor) {
                    output.accept(item.get());
                }

            })
            .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
