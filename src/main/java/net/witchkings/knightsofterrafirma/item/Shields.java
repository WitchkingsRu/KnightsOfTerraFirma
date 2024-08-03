package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ShieldTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;

public class Shields {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KnightsOfTerraFirma.MODID);

    public static final RegistryObject<MedievalShieldItem> BB_ELLIPTICAL_SHIELD = ITEMS.register("bismuth_bronze_elliptical_shield",
            () -> new MedievalShieldItem("bismuth_bronze_elliptical_shield",
                    new ResourceLocation(KnightsOfTerraFirma.MODID, "item/bismuth_bronze_ellipticalshield"),
                    new Item.Properties(), ModdedItems.BISMUTH_BRONZE, true, true, ShieldTypes.ELLIPTICAL_SHIELD));

}
