package net.witchkings.knightsofterrafirma.config;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import org.checkerframework.checker.units.qual.C;

@Config(
        name = "knightsofterrafirma"
)
public class ConfigMain extends PartitioningSerializer.GlobalData {
    @CollapsibleObject
    public ConfigArmor armor = new ConfigArmor();
    public ConfigAntique antique_armor = new ConfigAntique();
    public ConfigMain() {
    }
}

