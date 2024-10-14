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
    public BlackSteelKnightConfig knightBlackSteel = new BlackSteelKnightConfig();
    @CollapsibleObject
    public BlackSteelArmetConfig armetBlackSteel = new BlackSteelArmetConfig();
    @CollapsibleObject
    public BlackSteelStechhelmConfig stechhelmBlackSteel = new BlackSteelStechhelmConfig();
    @CollapsibleObject
    public BlackSteelJoustingConfig joustingBlackSteel = new BlackSteelJoustingConfig();
    @CollapsibleObject
    public BlackSteelSalletConfig salletBlackSteel = new BlackSteelSalletConfig();
    @CollapsibleObject
    public BlackSteelGothicConfig gothicBlackSteel = new BlackSteelGothicConfig();
    @CollapsibleObject
    public BlackSteelMaximilianHelmetConfig maximilianHelmetBlackSteel = new BlackSteelMaximilianHelmetConfig();
    @CollapsibleObject
    public BlackSteelMaximilianConfig maximilianBlackSteel = new BlackSteelMaximilianConfig();
    @CollapsibleObject
    public BlackSteelBarbuteConfig barbuteBlackSteel = new BlackSteelBarbuteConfig();
    @CollapsibleObject
    public BlackSteelHalfarmorConfig halfarmorBlackSteel = new BlackSteelHalfarmorConfig();
    @CollapsibleObject
    public BlackSteelKastenbrustConfig kastenbrustBlackSteel = new BlackSteelKastenbrustConfig();
    @CollapsibleObject
    public BlackSteelGrandBascinetConfig grandBascinetBlackSteel = new BlackSteelGrandBascinetConfig();
    @CollapsibleObject
    public BlackSteelKettlehatConfig kettlehatBlackSteel = new BlackSteelKettlehatConfig();
    @CollapsibleObject
    public BlackSteelPlatemailConfig platemailBlackSteel = new BlackSteelPlatemailConfig();

    @CollapsibleObject
    public CeremonialArmetConfig ceremonialArmet = new CeremonialArmetConfig();
    @CollapsibleObject
    public CeremonialConfig ceremonial = new CeremonialConfig();

    @CollapsibleObject
    public BlueSteelKnightConfig knightBlueSteel = new BlueSteelKnightConfig();
    @CollapsibleObject
    public BlueSteelArmetConfig armetBlueSteel = new BlueSteelArmetConfig();
    @CollapsibleObject
    public BlueSteelStechhelmConfig stechhelmBlueSteel = new BlueSteelStechhelmConfig();
    @CollapsibleObject
    public BlueSteelJoustingConfig joustingBlueSteel = new BlueSteelJoustingConfig();
    @CollapsibleObject
    public BlueSteelSalletConfig salletBlueSteel = new BlueSteelSalletConfig();
    @CollapsibleObject
    public BlueSteelGothicConfig gothicBlueSteel = new BlueSteelGothicConfig();
    @CollapsibleObject
    public BlueSteelMaximilianHelmetConfig maximilianHelmetBlueSteel = new BlueSteelMaximilianHelmetConfig();
    @CollapsibleObject
    public BlueSteelMaximilianConfig maximilianBlueSteel = new BlueSteelMaximilianConfig();
    @CollapsibleObject
    public BlueSteelBarbuteConfig barbuteBlueSteel = new BlueSteelBarbuteConfig();
    @CollapsibleObject
    public BlueSteelHalfarmorConfig halfarmorBlueSteel = new BlueSteelHalfarmorConfig();
    @CollapsibleObject
    public BlueSteelKastenbrustConfig kastenbrustBlueSteel = new BlueSteelKastenbrustConfig();
    @CollapsibleObject
    public BlueSteelGrandBascinetConfig grandBascinetBlueSteel = new BlueSteelGrandBascinetConfig();

    @CollapsibleObject
    public RedSteelKnightConfig knightRedSteel = new RedSteelKnightConfig();
    @CollapsibleObject
    public RedSteelArmetConfig armetRedSteel = new RedSteelArmetConfig();
    @CollapsibleObject
    public RedSteelStechhelmConfig stechhelmRedSteel = new RedSteelStechhelmConfig();
    @CollapsibleObject
    public RedSteelJoustingConfig joustingRedSteel = new RedSteelJoustingConfig();
    @CollapsibleObject
    public RedSteelSalletConfig salletRedSteel = new RedSteelSalletConfig();
    @CollapsibleObject
    public RedSteelGothicConfig gothicRedSteel = new RedSteelGothicConfig();
    @CollapsibleObject
    public RedSteelMaximilianHelmetConfig maximilianHelmetRedSteel = new RedSteelMaximilianHelmetConfig();
    @CollapsibleObject
    public RedSteelMaximilianConfig maximilianRedSteel = new RedSteelMaximilianConfig();
    @CollapsibleObject
    public RedSteelBarbuteConfig barbuteRedSteel = new RedSteelBarbuteConfig();
    @CollapsibleObject
    public RedSteelHalfarmorConfig halfarmorRedSteel = new RedSteelHalfarmorConfig();
    @CollapsibleObject
    public RedSteelKastenbrustConfig kastenbrustRedSteel = new RedSteelKastenbrustConfig();
    @CollapsibleObject
    public RedSteelGrandBascinetConfig grandBascinetRedSteel = new RedSteelGrandBascinetConfig();

    public ConfigArmor() {
    }

    public static class BlackSteelKnightConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 850;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 800;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 700;
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
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlackSteelArmetConfig() {
        }
    }

    public static class BlackSteelStechhelmConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.5F;
        @RequiresRestart
        public int helmetDurability = 800;
        @RequiresRestart
        public int helmetDefense = 4;

        public BlackSteelStechhelmConfig() {
        }
    }

    public static class BlackSteelJoustingConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.5F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
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
        public int helmetDurability = 600;
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
        public int chestplateDurability = 850;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 800;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 700;
        @RequiresRestart
        public int bootsDefense = 2;

        public BlackSteelGothicConfig() {
        }
    }

    public static class BlackSteelMaximilianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.5F;
        @RequiresRestart
        public int helmetDurability = 800;
        @RequiresRestart
        public int helmetDefense = 4;

        public BlackSteelMaximilianHelmetConfig() {
        }
    }

    public static class BlackSteelMaximilianConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.5F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlackSteelMaximilianConfig() {
        }
    }

    public static class BlackSteelBarbuteConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int helmetDurability = 500;
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
        public int chestplateDurability = 750;
        @RequiresRestart
        public int chestplateDefense = 6;

        public BlackSteelHalfarmorConfig() {
        }
    }

    public static class BlackSteelKastenbrustConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 850;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 800;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 700;
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
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlackSteelGrandBascinetConfig() {
        }
    }

    public static class BlackSteelKettlehatConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlackSteelKettlehatConfig() {
        }
    }

    public static class BlackSteelPlatemailConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int chestplateDurability = 750;
        @RequiresRestart
        public int chestplateDefense = 6;
        @RequiresRestart
        public int leggingsDurability = 700;
        @RequiresRestart
        public int leggingsDefense = 5;
        @RequiresRestart
        public int bootsDurability = 600;
        @RequiresRestart
        public int bootsDefense = 2;

        public BlackSteelPlatemailConfig() {
        }
    }

    public static class CeremonialArmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 550;
        @RequiresRestart
        public int helmetDefense = 2;

        public CeremonialArmetConfig() {
        }
    }

    public static class CeremonialConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int chestplateDurability = 670;
        @RequiresRestart
        public int chestplateDefense = 7;
        @RequiresRestart
        public int bootsDurability = 460;
        @RequiresRestart
        public int bootsDefense = 2;

        public CeremonialConfig() {
        }
    }

    public static class BlueSteelKnightConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlueSteelKnightConfig() {
        }
    }

    public static class BlueSteelArmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int helmetDurability = 800;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlueSteelArmetConfig() {
        }
    }

    public static class BlueSteelStechhelmConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int helmetDurability = 1000;
        @RequiresRestart
        public int helmetDefense = 4;

        public BlueSteelStechhelmConfig() {
        }
    }

    public static class BlueSteelJoustingConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int chestplateDurability = 1500;
        @RequiresRestart
        public int chestplateDefense = 9;
        @RequiresRestart
        public int leggingsDurability = 1350;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 950;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlueSteelJoustingConfig() {
        }
    }

    public static class BlueSteelSalletConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlueSteelSalletConfig() {
        }
    }

    public static class BlueSteelGothicConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlueSteelGothicConfig() {
        }
    }

    public static class BlueSteelMaximilianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int helmetDurability = 1000;
        @RequiresRestart
        public int helmetDefense = 4;

        public BlueSteelMaximilianHelmetConfig() {
        }
    }

    public static class BlueSteelMaximilianConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int chestplateDurability = 1500;
        @RequiresRestart
        public int chestplateDefense = 9;
        @RequiresRestart
        public int leggingsDurability = 1350;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 950;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlueSteelMaximilianConfig() {
        }
    }

    public static class BlueSteelBarbuteConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 2;

        public BlueSteelBarbuteConfig() {
        }
    }

    public static class BlueSteelHalfarmorConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int chestplateDurability = 900;
        @RequiresRestart
        public int chestplateDefense = 6;

        public BlueSteelHalfarmorConfig() {
        }
    }

    public static class BlueSteelKastenbrustConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public BlueSteelKastenbrustConfig() {
        }
    }

    public static class BlueSteelGrandBascinetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public BlueSteelGrandBascinetConfig() {
        }
    }

    public static class RedSteelKnightConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public RedSteelKnightConfig() {
        }
    }

    public static class RedSteelArmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public RedSteelArmetConfig() {
        }
    }

    public static class RedSteelStechhelmConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int helmetDurability = 1000;
        @RequiresRestart
        public int helmetDefense = 4;

        public RedSteelStechhelmConfig() {
        }
    }

    public static class RedSteelJoustingConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int chestplateDurability = 1500;
        @RequiresRestart
        public int chestplateDefense = 9;
        @RequiresRestart
        public int leggingsDurability = 1350;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 950;
        @RequiresRestart
        public int bootsDefense = 3;

        public RedSteelJoustingConfig() {
        }
    }

    public static class RedSteelSalletConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public RedSteelSalletConfig() {
        }
    }

    public static class RedSteelGothicConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public RedSteelGothicConfig() {
        }
    }

    public static class RedSteelMaximilianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int helmetDurability = 1000;
        @RequiresRestart
        public int helmetDefense = 4;

        public RedSteelMaximilianHelmetConfig() {
        }
    }

    public static class RedSteelMaximilianConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3.0F;
        @RequiresRestart
        public int chestplateDurability = 1500;
        @RequiresRestart
        public int chestplateDefense = 9;
        @RequiresRestart
        public int leggingsDurability = 1350;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 950;
        @RequiresRestart
        public int bootsDefense = 3;

        public RedSteelMaximilianConfig() {
        }
    }

    public static class RedSteelBarbuteConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 2;

        public RedSteelBarbuteConfig() {
        }
    }

    public static class RedSteelHalfarmorConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 0.5F;
        @RequiresRestart
        public int chestplateDurability = 900;
        @RequiresRestart
        public int chestplateDefense = 6;

        public RedSteelHalfarmorConfig() {
        }
    }

    public static class RedSteelKastenbrustConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 3F;
        @RequiresRestart
        public int chestplateDurability = 1050;
        @RequiresRestart
        public int chestplateDefense = 8;
        @RequiresRestart
        public int leggingsDurability = 1000;
        @RequiresRestart
        public int leggingsDefense = 6;
        @RequiresRestart
        public int bootsDurability = 900;
        @RequiresRestart
        public int bootsDefense = 3;

        public RedSteelKastenbrustConfig() {
        }
    }

    public static class RedSteelGrandBascinetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 275;
        @RequiresRestart
        public int helmetDefense = 3;

        public RedSteelGrandBascinetConfig() {
        }
    }
    
}
