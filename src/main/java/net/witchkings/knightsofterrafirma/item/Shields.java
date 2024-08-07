package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.client.render.forge.ModRenderImpl;
import com.magistuarmory.client.render.tileentity.HeraldryItemStackRenderer;
import com.magistuarmory.forge.item.MedievalShieldItemForge;
import com.magistuarmory.item.*;
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
import com.magistuarmory.client.render.ModRender;

import java.util.function.BiFunction;


public class Shields extends ModItemsProvider {
    public static final Shields INSTANCE = new Shields();
    public static final RegistrySupplier<MedievalShieldItem>ELLIPTICAL_SHIELD = INSTANCE.addMedievalShieldItem("bismuth_bronze_ellipticalshield", "ellipticalshield", new Properties(), ModdedItems.BISMUTH_BRONZE, true, true, ShieldTypes.ELLIPTICAL_SHIELD);

    public Shields() {
        super(KnightsOfTerraFirma.MODID);
    }
}
