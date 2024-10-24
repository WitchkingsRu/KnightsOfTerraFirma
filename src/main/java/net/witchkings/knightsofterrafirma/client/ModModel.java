package net.witchkings.knightsofterrafirma.client;

import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.ModModels;
import com.magistuarmory.client.render.model.armor.*;
import com.magistuarmory.client.render.model.block.PaviseBlockModel;
import com.magistuarmory.client.render.model.item.*;
import dev.architectury.platform.Mod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import net.witchkings.knightsofterrafirma.client.armor.BlackSteelKnightArmor;
import net.witchkings.knightsofterrafirma.client.armor.BlueSteelChestplate;
import net.witchkings.knightsofterrafirma.client.armor.RedSteelChestplate;



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
    public static final ModelLayerLocation SALLET_LOCATION = INSTANCE.addArmorModel("sallet", SalletModel::createLayer);
    public static final ModelLayerLocation GRAND_BASCINET_LOCATION = INSTANCE.addArmorModel("grand_bascinet", GrandBascinetModel::createLayer);
    public static final ModelLayerLocation MAXIMILIAN_HELMET_LOCATION = INSTANCE.addArmorModel("maximilian_helmet", MaximilianHelmetModel::createLayer);
    public static final ModelLayerLocation STECHHELM_LOCATION = INSTANCE.addArmorModel("stechhelm", StechhelmModel::createLayer);
    public static final ModelLayerLocation KETTLEHAT_LOCATION = INSTANCE.addArmorModel("kettlehat", KettlehatModel::createLayer);
    public static final ModelLayerLocation BLACKSTEEL_KNIGHT = INSTANCE.addArmorModel("black_steel_armor", BlackSteelKnightArmor::createLayer);
    public static final ModelLayerLocation BLUESTEEL_KNIGHT = INSTANCE.addArmorModel("blue_steel_armor", BlueSteelChestplate::createLayer);
    public static final ModelLayerLocation REDSTEEL_KNIGHT = INSTANCE.addArmorModel("red_steel_armor", RedSteelChestplate::createLayer);

    public ModModel(String modId) {
        super(modId);
    }
}
