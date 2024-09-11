package net.witchkings.knightsofterrafirma.client;

import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.ModModels;
import com.magistuarmory.client.render.model.armor.ArmetModel;
import com.magistuarmory.client.render.model.block.PaviseBlockModel;
import com.magistuarmory.client.render.model.item.*;
import dev.architectury.platform.Mod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;

@OnlyIn(Dist.CLIENT)
public class ModModel extends ModModelsProvider {
    public static final ModModel INSTANCE = new ModModel(KnightsOfTerraFirma.MODID);

    public static final ModelLayerLocation HEATER_SHIELD = INSTANCE.addModel("heatershield", HeaterShieldModel::createLayer);
    public static final ModelLayerLocation PAVISE = INSTANCE.addModel("pavese", PaviseModel::createLayer);
    public static final ModelLayerLocation ROUND_SHIELD = INSTANCE.addModel("roundshield", RoundShieldModel::createLayer);
    public static final ModelLayerLocation ELLIPTICAL_SHIELD = INSTANCE.addModel("ellipticalshield", EllipticalShieldModel::createLayer);
    public static final ModelLayerLocation TARTSCHE = INSTANCE.addModel("tartsche", TartscheModel::createLayer);
    public static final ModelLayerLocation RONDACHE = INSTANCE.addModel("rondache", RondacheModel::createLayer);
    public static final ModelLayerLocation KITE_SHIELD = INSTANCE.addModel("kiteshield", KiteShieldModel::createLayer);
    public static final ModelLayerLocation BUCKLER = INSTANCE.addModel("buckler", BucklerModel::createLayer);
    public static final ModelLayerLocation TARGET = INSTANCE.addModel("target", TargeModel::createLayer);
    public static final ModelLayerLocation PAVISE_BLOCK_LOCATION = INSTANCE.addModel("pavise_block", PaviseBlockModel::createLayer);

    public static final ModelLayerLocation ARMET_LOCATION = INSTANCE.addArmorModel("armet", ArmetModel::createLayer);
    public ModModel(String modId) {
        super(modId);
    }
}
