package net.witchkings.knightsofterrafirma.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.RequiresRestart;

@Config(
        name = "armor"
)
public class ConfigArmor implements ConfigData {
    @CollapsibleObject
    public static BlackSteelKnightConfig knightBlackSteel = new BlackSteelKnightConfig();
    @CollapsibleObject
    public static BlackSteelArmetConfig armetBlackSteel = new BlackSteelArmetConfig();
    @CollapsibleObject
    public static BlackSteelStechhelmConfig stechhelmBlackSteel = new BlackSteelStechhelmConfig();
    @CollapsibleObject
    public static BlackSteelJoustingConfig joustingBlackSteel = new BlackSteelJoustingConfig();
    @CollapsibleObject
    public static BlackSteelSalletConfig salletBlackSteel = new BlackSteelSalletConfig();
    @CollapsibleObject
    public static BlackSteelGothicConfig gothicBlackSteel = new BlackSteelGothicConfig();
    @CollapsibleObject
    public static BlackSteelMaximilianHelmetConfig maximilianHelmetBlackSteel = new BlackSteelMaximilianHelmetConfig();
    @CollapsibleObject
    public static BlackSteelMaximilianConfig maximilianBlackSteel = new BlackSteelMaximilianConfig();
    @CollapsibleObject
    public static BlackSteelKettlehatConfig kettlehatBlackSteel = new BlackSteelKettlehatConfig();
    @CollapsibleObject
    public static BlackSteelPlatemailConfig platemailBlackSteel = new BlackSteelPlatemailConfig();
    @CollapsibleObject
    public static BlackSteelBarbuteConfig barbuteBlackSteel = new BlackSteelBarbuteConfig();
    @CollapsibleObject
    public static BlackSteelHalfarmorConfig halfarmorBlackSteel = new BlackSteelHalfarmorConfig();
    @CollapsibleObject
    public static BlackSteelKastenbrustConfig kastenbrustBlackSteel = new BlackSteelKastenbrustConfig();
    @CollapsibleObject
    public static BlackSteelGrandBascinetConfig grandBascinetBlackSteel = new BlackSteelGrandBascinetConfig();

    @CollapsibleObject
    public static CeremonialArmetConfig ceremonialArmet = new CeremonialArmetConfig();
    @CollapsibleObject
    public static CeremonialConfig ceremonial = new CeremonialConfig();
    
    public ConfigArmor() {
    }

    public static class BlackSteelKnightConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 335;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 315;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 230;
        @RequiresRestart
        public int bootsDefense = 2;

        public BlackSteelKnightConfig() {
        }
    }

    public static class BlackSteelArmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlackSteelArmetConfig() {
        }
    }

    public static class BlackSteelStechhelmConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 2.0F;
        @RequiresRestart
        public int helmetDurability = 385;
        @RequiresRestart
        public int helmetDefense = 4;

        public BlackSteelStechhelmConfig() {
        }
    }

    public static class BlackSteelJoustingConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 2.0F;
        @RequiresRestart
        public int chestplateDurability = 500;
        @RequiresRestart
        public int chestplateDefense = 9;
        @RequiresRestart
        public int leggingsDurability = 440;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 345;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlackSteelJoustingConfig() {
        }
    }

    public static class BlackSteelSalletConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlackSteelSalletConfig() {
        }
    }

    public static class BlackSteelGothicConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 335;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 315;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 230;
        @RequiresRestart
        public int bootsDefense = 2;

        public BlackSteelGothicConfig() {
        }
    }

    public static class BlackSteelMaximilianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.8F;
        @RequiresRestart
        public int helmetDurability = 385;
        @RequiresRestart
        public int helmetDefense = 4;

        public BlackSteelMaximilianHelmetConfig() {
        }
    }

    public static class BlackSteelMaximilianConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.8F;
        @RequiresRestart
        public int chestplateDurability = 500;
        @RequiresRestart
        public int chestplateDefense = 9;
        @RequiresRestart
        public int leggingsDurability = 440;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 345;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlackSteelMaximilianConfig() {
        }
    }
    public static class BlackSteelKettlehatConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int helmetDurability = 240;
        @RequiresRestart
        public int helmetDefense = 2;

        public BlackSteelKettlehatConfig() {
        }
    }

    public static class BlackSteelPlatemailConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int chestplateDurability = 290;
        @RequiresRestart
        public int chestplateDefense = 6;
        @RequiresRestart
        public int leggingsDurability = 230;
        @RequiresRestart
        public int leggingsDefense = 4;
        @RequiresRestart
        public int bootsDurability = 200;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlackSteelPlatemailConfig() {
        }
    }

    public static class BlackSteelBarbuteConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int helmetDurability = 170;
        @RequiresRestart
        public int helmetDefense = 2;

        public BlackSteelBarbuteConfig() {
        }
    }

    public static class BlackSteelHalfarmorConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int chestplateDurability = 315;
        @RequiresRestart
        public int chestplateDefense = 6;

        public BlackSteelHalfarmorConfig() {
        }
    }

    public static class CeremonialArmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public CeremonialArmetConfig() {
        }
    }

    public static class CeremonialConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 335;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int bootsDurability = 230;
        @RequiresRestart
        public int bootsDefense = 2;

        public CeremonialConfig() {
        }
    }

    public static class BlackSteelKastenbrustConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 335;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 315;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 230;
        @RequiresRestart
        public int bootsDefense = 2;

        public BlackSteelKastenbrustConfig() {
        }
    }

    public static class BlackSteelGrandBascinetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlackSteelGrandBascinetConfig() {
        }
    }
}
