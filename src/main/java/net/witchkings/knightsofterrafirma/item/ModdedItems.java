package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.ModItemTier;
import dev.architectury.platform.Platform;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.magistuarmory.forge.item.MedievalWeaponItemForge;
import static com.magistuarmory.item.WeaponTypes.*;


public class ModdedItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KnightsOfTerraFirma.MODID);
    public static ModItemTier BISMUTH_BRONZE = new ModItemTier("bismuth_bronze", 2, 200, 6.0F, 2.0F, 15, Platform.isForge() ? "forge:ingots/bismuth_bronze" : "c:bismuth_bronze_ingots", 2);

    public static final RegistryObject<MedievalWeaponItemForge> BISMUTH_BRONZE_BASTARDSWORD = ITEMS.register("bismuth_bronze_bastardsword", () -> new MedievalWeaponItemForge(new Properties(), BISMUTH_BRONZE, BASTARD_SWORD));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

;}
