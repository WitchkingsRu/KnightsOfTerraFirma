package net.witchkings.knightsofterrafirma.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

@Config(
        name = "knightsofterrafirma"
)
public class ConfigMain extends PartitioningSerializer.GlobalData {
//    @CollapsibleObject
//    public ConfigMain general = new ConfigMain();
//    @CollapsibleObject
//    public WeaponsConfig weapons = new WeaponsConfig();
//    @CollapsibleObject
//    public ShieldsConfig shields = new ShieldsConfig();
    @CollapsibleObject
    public ConfigArmor armor = new ConfigArmor();

    public ConfigMain() {
    }
}

