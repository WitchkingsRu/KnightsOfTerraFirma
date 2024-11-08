package net.witchkings.knightsofterrafirma.client;

import com.magistuarmory.antiquelegacy.client.render.model.armor.LaurelWreathModel;
import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.ModModels;
import com.magistuarmory.client.render.model.armor.*;
import com.magistuarmory.client.render.model.block.PaviseBlockModel;
import com.magistuarmory.client.render.model.decoration.*;
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

    public static final LayerDefinition CROWN = CrownModel.createLayer();
    public static final LayerDefinition MINICROWN = MiniCrownModel.createLayer();

    public static final ModelLayerLocation CROWN_ARMOR_LOCATION = INSTANCE.addArmorModel("crown", CrownArmorModel::createLayer);
    public static final ModelLayerLocation MINICROWN_ARMOR_LOCATION = INSTANCE.addArmorModel("minicrown", () -> {
        return MINICROWN;
    });

    public static final ModelLayerLocation S_CROWN = INSTANCE.addArmorModel("silver_crown", CrownModel::createLayer);
    public static final ModelLayerLocation S_CROWN_DECO = INSTANCE.addDecorationModel("silver_crown", CrownModel::createLayer);

    public static final ModelLayerLocation ST_SILVER_CROWN = INSTANCE.addArmorModel("sterling_silver_crown", CrownModel::createLayer);
    public static final ModelLayerLocation ST_S_CROWN_DECO = INSTANCE.addDecorationModel("sterling_silver_crown", CrownModel::createLayer);

    public static final ModelLayerLocation P_CROWN = INSTANCE.addArmorModel("platinum_crown", CrownModel::createLayer);
    public static final ModelLayerLocation P_CROWN_DECO = INSTANCE.addDecorationModel("platinum_crown", CrownModel::createLayer);

    public static final ModelLayerLocation B_CROWN = INSTANCE.addArmorModel("brass_crown", CrownModel::createLayer);
    public static final ModelLayerLocation B_CROWN_DECO = INSTANCE.addDecorationModel("brass_crown", CrownModel::createLayer);

    public static final ModelLayerLocation RG_CROWN = INSTANCE.addArmorModel("rose_gold_crown", CrownModel::createLayer);
    public static final ModelLayerLocation RG_CROWN_DECO = INSTANCE.addDecorationModel("rose_gold_crown", CrownModel::createLayer);

    public static final ModelLayerLocation C_CROWN = INSTANCE.addArmorModel("copper_crown", CrownModel::createLayer);
    public static final ModelLayerLocation C_CROWN_DECO = INSTANCE.addDecorationModel("copper_crown", CrownModel::createLayer);

    public static final ModelLayerLocation BR_CROWN = INSTANCE.addArmorModel("bronze_crown", CrownModel::createLayer);
    public static final ModelLayerLocation BR_CROWN_DECO = INSTANCE.addDecorationModel("bronze_crown", CrownModel::createLayer);

    public static final ModelLayerLocation BI_BR_CROWN = INSTANCE.addArmorModel("bismuth_bronze_crown", CrownModel::createLayer);
    public static final ModelLayerLocation BI_BR_CROWN_DECO = INSTANCE.addDecorationModel("bismuth_bronze_crown", CrownModel::createLayer);

    public static final ModelLayerLocation BL_BR_CROWN = INSTANCE.addArmorModel("black_bronze_crown", CrownModel::createLayer);
    public static final ModelLayerLocation BL_BR_CROWN_DECO = INSTANCE.addDecorationModel("black_bronze_crown", CrownModel::createLayer);

    public static final ModelLayerLocation BS_CROWN = INSTANCE.addArmorModel("black_steel_crown", CrownModel::createLayer);
    public static final ModelLayerLocation BS_CROWN_DECO = INSTANCE.addDecorationModel("black_steel_crown", CrownModel::createLayer);

    public static final ModelLayerLocation BLS_CROWN = INSTANCE.addArmorModel("blue_steel_crown", CrownModel::createLayer);
    public static final ModelLayerLocation BLS_CROWN_DECO = INSTANCE.addDecorationModel("blue_steel_crown", CrownModel::createLayer);

    public static final ModelLayerLocation RS_CROWN = INSTANCE.addArmorModel("red_steel_crown", CrownModel::createLayer);
    public static final ModelLayerLocation RS_CROWN_DECO = INSTANCE.addDecorationModel("red_steel_crown", CrownModel::createLayer);

    public static final ModelLayerLocation S_MINICROWN = INSTANCE.addArmorModel("silver_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation S_MINICROWN_DECO = INSTANCE.addDecorationModel("silver_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation ST_SILVER_MINICROWN = INSTANCE.addArmorModel("sterling_silver_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation ST_S_MINICROWN_DECO = INSTANCE.addDecorationModel("sterling_silver_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation P_MINICROWN = INSTANCE.addArmorModel("platinum_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation P_MINICROWN_DECO = INSTANCE.addDecorationModel("platinum_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation B_MINICROWN = INSTANCE.addArmorModel("brass_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation B_MINICROWN_DECO = INSTANCE.addDecorationModel("brass_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation RG_MINICROWN = INSTANCE.addArmorModel("rose_gold_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation RG_MINICROWN_DECO = INSTANCE.addDecorationModel("rose_gold_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation C_MINICROWN = INSTANCE.addArmorModel("copper_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation C_MINICROWN_DECO = INSTANCE.addDecorationModel("copper_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation BR_MINICROWN = INSTANCE.addArmorModel("bronze_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation BR_MINICROWN_DECO = INSTANCE.addDecorationModel("bronze_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation BI_BR_MINICROWN = INSTANCE.addArmorModel("bismuth_bronze_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation BI_BR_MINICROWN_DECO = INSTANCE.addDecorationModel("bismuth_bronze_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation BL_BR_MINICROWN = INSTANCE.addArmorModel("black_bronze_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation BL_BR_MINICROWN_DECO = INSTANCE.addDecorationModel("black_bronze_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation BS_MINICROWN = INSTANCE.addArmorModel("black_steel_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation BS_MINICROWN_DECO = INSTANCE.addDecorationModel("black_steel_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation BLS_MINICROWN = INSTANCE.addArmorModel("blue_steel_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation BLS_MINICROWN_DECO = INSTANCE.addDecorationModel("blue_steel_minicrown", MiniCrownModel::createLayer);

    public static final ModelLayerLocation RS_MINICROWN = INSTANCE.addArmorModel("red_steel_minicrown", MiniCrownModel::createLayer);
    public static final ModelLayerLocation RS_MINICROWN_DECO = INSTANCE.addDecorationModel("red_steel_minicrown", MiniCrownModel::createLayer);

    public ModModel(String modId) {
        super(modId);
    }
}
