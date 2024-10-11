package net.witchkings.knightsofterrafirma.config;

import com.magistuarmory.config.ArmorConfig;
import com.magistuarmory.config.MobEquipmentConfig;
import com.magistuarmory.config.ShieldsConfig;
import com.magistuarmory.config.WeaponsConfig;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

@Config(
        name = "knightsofterrafirma"
)
public class GeneralConfig extends PartitioningSerializer.GlobalData {
//    @CollapsibleObject
//    public GeneralConfig general = new GeneralConfig();
//    @CollapsibleObject
//    public WeaponsConfig weapons = new WeaponsConfig();
//    @CollapsibleObject
//    public ShieldsConfig shields = new ShieldsConfig();
    @CollapsibleObject
    public ArmorConfig armor = new ArmorConfig();

    public GeneralConfig() {
    }
}

