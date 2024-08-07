package net.witchkings.knightsofterrafirma.client;

import com.magistuarmory.api.client.render.model.ModModelsProvider;
import com.magistuarmory.client.render.model.ModModels;
import com.magistuarmory.client.render.model.item.EllipticalShieldModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;

@OnlyIn(Dist.CLIENT)
public class ModModel extends ModModelsProvider {
    public static final ModModel INSTANCE = new ModModel(KnightsOfTerraFirma.MODID);
    public static final ModelLayerLocation ELLIPTICAL_SHIELD = INSTANCE.addModel("ellipticalshield", EllipticalShieldModel::createLayer);
    public ModModel(String modId) {
        super(modId);
    }
}
