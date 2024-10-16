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
import com.magistuarmory.antiquelegacy.client.render.model.armor.*;
import com.magistuarmory.antiquelegacy.client.render.model.decoration.*;

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

    public static final ModelLayerLocation ATTIC_HELMET_LOCATION = INSTANCE.addArmorModel("attic_helmet", AtticHelmetModel::createLayer);
    public static final ModelLayerLocation BELL_CUIRASS_LOCATION = INSTANCE.addArmorModel("bell_cuirass", BellCuirassModel::createLayer);
    public static final ModelLayerLocation BEOTIAN_HELMET_LOCATION = INSTANCE.addArmorModel("beotian_helmet", BeotianHelmetModel::createLayer);
    public static final ModelLayerLocation BRONZED_GALLEA_LOCATION = INSTANCE.addArmorModel("bronzed_gallea", GalleaModel::createLayer);
    public static final ModelLayerLocation RIDGE_HELMET_LOCATION = INSTANCE.addArmorModel("ridge_helmet", RidgeHelmetModel::createLayer);
    public static final ModelLayerLocation COOLUS_LOCATION = INSTANCE.addArmorModel("coolus", CoolusModel::createLayer);
    public static final ModelLayerLocation INTERCISA_LOCATION = INSTANCE.addArmorModel("intercisa", IntercisaModel::createLayer);
    public static final ModelLayerLocation MELOS_LOCATION = INSTANCE.addArmorModel("melos", MelosModel::createLayer);
    public static final ModelLayerLocation MONTEFORTINO_HELMET_LOCATION = INSTANCE.addArmorModel("montefortino_helmet", MontefortinoHelmetModel::createLayer);
    public static final ModelLayerLocation MUSCLE_CUIRASS_LOCATION = INSTANCE.addArmorModel("muscle_cuirass", MuscleCuirassModel::createLayer);
    public static final ModelLayerLocation NIEDERBIEBER_HELMET_LOCATION = INSTANCE.addArmorModel("niederbieber_helmet", NiederbieberHelmetModel::createLayer);
    public static final ModelLayerLocation PHRYGIAN_HELMET_LOCATION = INSTANCE.addArmorModel("phrygian_helmet", PhrygianHelmetModel::createLayer);
    public static final ModelLayerLocation PILOS_LOCATION = INSTANCE.addArmorModel("pilos", PilosModel::createLayer);
    public static final ModelLayerLocation SQUAMATA_LOCATION = INSTANCE.addArmorModel("squamata", SquamataModel::createLayer);
    public static final ModelLayerLocation ROMAN_PARADE_HELMET_LOCATION = INSTANCE.addArmorModel("roman_parade_helmet", RomanParadeHelmetModel::createLayer);
    public static final ModelLayerLocation APULO_CORINTHIAN_HELMET_LOCATION = INSTANCE.addArmorModel("apulo_corinthian_helmet", ApuloCorinthianHelmetModel::createLayer);
    public static final ModelLayerLocation CORINTHIAN_HELMET_LOCATION = INSTANCE.addArmorModel("corinthian_helmet", CorinthianHelmetModel::createLayer);
    public static final ModelLayerLocation GALLEA_LOCATION = INSTANCE.addArmorModel("gallea", GalleaModel::createLayer);
    public static final ModelLayerLocation GILDED_GALLEA_LOCATION = INSTANCE.addArmorModel("gilded_gallea", GildedGalleaModel::createLayer);
    public static final ModelLayerLocation GREEK_GREAVES_LOCATION = INSTANCE.addArmorModel("greek_greaves", GreekGreavesModel::createLayer);
    public static final ModelLayerLocation HAMATA_LOCATION = INSTANCE.addArmorModel("hamata", HamataModel::createLayer);
    public static final ModelLayerLocation HEDDERNHEIM_HELMET_LOCATION = INSTANCE.addArmorModel("heddernheim_helmet", HeddernheimHelmetModel::createLayer);
    public static final ModelLayerLocation ILLIRIAN_HELMET_LOCATION = INSTANCE.addArmorModel("illirian_helmet", IllirianHelmetModel::createLayer);
    public static final ModelLayerLocation MURMILLO_HELMET_LOCATION = INSTANCE.addArmorModel("murmillo_helmet", MurmilloHelmetModel::createLayer);
    public static final ModelLayerLocation MUSCULATA_LOCATION = INSTANCE.addArmorModel("musculata", MusculataModel::createLayer);
    public static final ModelLayerLocation OFFICER_SQUAMATA_LOCATION = INSTANCE.addArmorModel("officer_squamata", OfficerSquamataModel::createLayer);
    public static final ModelLayerLocation OPEN_ATTIC_HELMET_LOCATION = INSTANCE.addArmorModel("open_attic_helmet", AtticHelmetModel::createLayer);
    public static final ModelLayerLocation PROVOCATOR_HELMET_LOCATION = INSTANCE.addArmorModel("provocator_helmet", ProvocatorHelmetModel::createLayer);
    public static final ModelLayerLocation SECUTOR_HELMET_LOCATION = INSTANCE.addArmorModel("secutor_helmet", SecutorHelmetModel::createLayer);
    public static final ModelLayerLocation SEGMENTATA_LOCATION = INSTANCE.addArmorModel("segmentata", SegmentataModel::createLayer);
    public static final ModelLayerLocation THRACIAN_HELMET_LOCATION = INSTANCE.addArmorModel("thracian_helmet", ThracianHelmetModel::createLayer);
    public static final ModelLayerLocation LEFT_GLADIATOR_SHOULDER_PAD_LOCATION = INSTANCE.addArmorModel("left_gladiator_shoulder_pad", LeftGladiatorShoulderPadModel::createLayer);
    public static final ModelLayerLocation RIGHT_GLADIATOR_SHOULDER_PAD_LOCATION = INSTANCE.addArmorModel("right_gladiator_shoulder_pad", RightGladiatorShoulderPadModel::createLayer);
    public static final ModelLayerLocation BRONZE_LEFT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("bronze_left_hand_manika", LeftHandManikaModel::createLayer);
    public static final ModelLayerLocation BRONZE_RIGHT_HAND_MANIKA_LOCATION = INSTANCE.addArmorModel("bronze_right_hand_manika", RightHandManikaModel::createLayer);
    public static final ModelLayerLocation THORAX_LOCATION = INSTANCE.addArmorModel("thorax", ThoraxModel::createLayer);
    public static final ModelLayerLocation SANDALS_LOCATION = INSTANCE.addArmorModel("sandals", SandalsModel::createLayer);
    public static final ModelLayerLocation LAUREL_WREATH_LOCATION = INSTANCE.addArmorModel("laurel_wreath", LaurelWreathModel::createLayer);
    public static final ModelLayerLocation KUBAN_HELMET_LOCATION = INSTANCE.addArmorModel("kuban_helmet", KubanHelmetModel::createLayer);
    public static final ModelLayerLocation SCYTHIAN_SCALE_HELMET_LOCATION = INSTANCE.addArmorModel("scythian_scale_helmet", ScythianScaleHelmetModel::createLayer);
    public static final ModelLayerLocation PHRYGIAN_CAP_LOCATION = INSTANCE.addArmorModel("phrygian_cap", PhrygianCapModel::createLayer);
    public static final ModelLayerLocation LA_GORGE_MEILLET_LOCATION = INSTANCE.addArmorModel("la_gorge_meillet", LaGorgeMeilletModel::createLayer);
    public static final ModelLayerLocation WATERLOO_HELMET_LOCATION = INSTANCE.addArmorModel("waterloo_helmet", WaterlooHelmetModel::createLayer);

    public ModModel(String modId) {
        super(modId);
    }
}
