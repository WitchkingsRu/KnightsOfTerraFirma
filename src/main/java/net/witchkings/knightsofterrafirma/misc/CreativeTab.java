package net.witchkings.knightsofterrafirma.misc;


import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.MedievalWeaponItem;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.armor.MedievalArmorItem;
import dev.architectury.registry.registries.RegistrySupplier;
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


public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KnightsOfTerraFirma.MODID);

    public static final RegistryObject<CreativeModeTab> KOTF_WEAPONS = CREATIVE_MODE_TABS.register("kotf_weapons", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get()))
            .title(Component.translatable("creativetab.kotf_weapons")).
            displayItems((itemDisplayParameters, output) -> {
                output.accept(ModdedItems.BISMUTH_BRONZE_BASTARDSWORD.get());
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
                output.accept(ModdedItems.BISMUTH_BRONZE_CONCAVE_HEAD.get());
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

                output.accept(ModelledItems.PLATINUM_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.PLATINUM_STEEL_CEREMONIAL_CHESTPLATE.get());
                output.accept(ModelledItems.PLATINUM_STEEL_CEREMONIAL_BOOTS.get());

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

                output.accept(ModelledItems.PLATINUM_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.PLATINUM_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.PLATINUM_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.PLATINUM_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.BRASS_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.BRASS_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.BRASS_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.BRASS_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.ROSE_GOLD_BLACK_STEEL_ARMET_WITH_PLUME_SUPPLIER.get());
                output.accept(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_CHESTPLATE.get());
                output.accept(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_LEGGINGS.get());
                output.accept(ModelledItems.ROSE_GOLD_BLACKSTEEL_KNIGHT_BOOTS.get());

                output.accept(ModelledItems.BLUESTEEL_ARMET.get());
                output.accept(ModelledItems.BLUESTEEL_KNIGHT_CHESTPLATE.get());
                for (RegistrySupplier<MedievalArmorItem> item:ModelledItems.listArmor) {
                    output.accept(item.get());
                }
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
