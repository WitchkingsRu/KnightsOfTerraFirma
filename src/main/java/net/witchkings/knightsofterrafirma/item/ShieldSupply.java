package net.witchkings.knightsofterrafirma.item;

import com.magistuarmory.item.ItemsSupply;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItemTier;
import com.magistuarmory.item.ShieldsSupply;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import dev.architectury.registry.registries.RegistrySupplier;
import java.util.function.BiFunction;
import net.minecraft.world.item.Item;

import java.util.function.BiFunction;

public class ShieldSupply extends ItemsSupply<MedievalShieldItem> {
    public String shieldName;
    public String bismuth_bronzeTexture;
    public ShieldSupply(BiFunction<ModItemTier, Item.Properties, RegistrySupplier<MedievalShieldItem>> workshop, String shieldName) {
        super(workshop, new Item.Properties());
        this.shieldName = shieldName;
        String var10001 = ModdedItems.BISMUTH_BRONZE.getMaterialName();
        this.bismuth_bronzeTexture = "entity/" + var10001 + "_" + shieldName;
    }

}

