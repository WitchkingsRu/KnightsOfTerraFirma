package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.forge.item.MedievalShieldItemForge;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.ShieldType;
import com.magistuarmory.item.ShieldTypes;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import com.magistuarmory.item.forge.ItemRegistryHelperImpl;


public class Shields extends ModItemsProvider {
    public static final Shields INSTANCE = new Shields();
    public static final RegistrySupplier<MedievalShieldItem>ELLIPTICAL_SHIELD = INSTANCE.addMedievalShieldItem("ellipticalshield", "ellipticalshield", new Item.Properties(), ModdedItems.BISMUTH_BRONZE, false, true, ShieldTypes.ELLIPTICAL_SHIELD);

    public Shields() {
        super(KnightsOfTerraFirma.MODID);
    }
}
