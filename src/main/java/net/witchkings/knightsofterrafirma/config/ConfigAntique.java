package net.witchkings.knightsofterrafirma.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.shedaniel.autoconfig.annotation.ConfigEntry.Gui.RequiresRestart;

@Config(
        name = "antique"
)
public class ConfigAntique implements ConfigData{
    @CollapsibleObject
    public AtticHelmetConfig AtticHelmetConfig = new AtticHelmetConfig();
    @CollapsibleObject
    public BellCuirassConfig BellCuirassConfig = new BellCuirassConfig();
    @CollapsibleObject
    public BeotianHelmetConfig BeotianHelmetConfig = new BeotianHelmetConfig();
    @CollapsibleObject
    public GalleaConfig GalleaConfig = new GalleaConfig();
    @CollapsibleObject
    public RidgeHelmetConfig RidgeHelmetConfig = new RidgeHelmetConfig();
    @CollapsibleObject
    public CoolusConfig CoolusConfig = new CoolusConfig();
    @CollapsibleObject
    public IntercisaConfig IntercisaConfig = new IntercisaConfig();
    @CollapsibleObject
    public MelosConfig MelosConfig = new MelosConfig();
    @CollapsibleObject
    public MontefortinoHelmetConfig MontefortinoHelmetConfig = new MontefortinoHelmetConfig();
    @CollapsibleObject
    public MusculeCuirassConfig MusculeCuirassConfig = new MusculeCuirassConfig();
    @CollapsibleObject
    public NiederbieberHelmetConfig NiederbieberHelmetConfig = new NiederbieberHelmetConfig();
    @CollapsibleObject
    public PhyrigianHelmetConfig PhyrigianHelmetConfig = new PhyrigianHelmetConfig();
    @CollapsibleObject
    public PilosClosetConfig PilosClosetConfig = new PilosClosetConfig();
    @CollapsibleObject
    public PilosConfig PilosConfig = new PilosConfig();
    @CollapsibleObject
    public SquamataConfig SquamataConfig = new SquamataConfig();
    @CollapsibleObject
    public RomanParadeHelmetConfig RomanParadeHelmetConfig = new RomanParadeHelmetConfig();
    @CollapsibleObject
    public ApuloCorinthianHelmetConfig ApuloCorinthianHelmetConfig = new ApuloCorinthianHelmetConfig();
    @CollapsibleObject
    public ChalcidianHelmetConfig ChalcidianHelmetConfig = new ChalcidianHelmetConfig();
    @CollapsibleObject
    public CorinthianHelmetConfig CorinthianHelmetConfig = new CorinthianHelmetConfig();
    @CollapsibleObject
    public GreekGreavesConfig GreekGreavesConfig = new GreekGreavesConfig();
    @CollapsibleObject
    public HamataConfig HamataConfig = new HamataConfig();
    @CollapsibleObject
    public HamataOptioConfig HamataOptioConfig = new HamataOptioConfig();
    @CollapsibleObject
    public HeddernheimHelmetConfig HeddernheimHelmetConfig = new HeddernheimHelmetConfig();
    @CollapsibleObject
    public IllirianHelmetConfig IllirianHelmetConfig = new IllirianHelmetConfig();
    @CollapsibleObject
    public IronNiederbieberHelmetConfig IronNiederbieberHelmetConfig = new IronNiederbieberHelmetConfig();
    @CollapsibleObject
    public MurmilloHelmetConfig MurmilloHelmetConfig = new MurmilloHelmetConfig();
    @CollapsibleObject
    public MusculataConfig MusculataConfig = new MusculataConfig();
    @CollapsibleObject
    public OfficerSquamataConfig OfficerSquamataConfig = new OfficerSquamataConfig();
    @CollapsibleObject
    public OpenAtticHelmetConfig OpenAtticHelmetConfig = new OpenAtticHelmetConfig();
    @CollapsibleObject
    public ProvocatorHelmetConfig ProvocatorHelmetConfig = new ProvocatorHelmetConfig();
    @CollapsibleObject
    public SecutorHelmetConfig SecutorHelmetConfig = new SecutorHelmetConfig();
    @CollapsibleObject
    public SegmentataConfig SegmentataConfig = new SegmentataConfig();
    @CollapsibleObject
    public ThracianHelmetConfig ThracianHelmetConfig = new ThracianHelmetConfig();
    @CollapsibleObject
    public CardiophylaxConfig CardiophylaxConfig = new CardiophylaxConfig();
    @CollapsibleObject
    public LeftGladiatorShoulderConfig LeftGladiatorShoulderConfig = new LeftGladiatorShoulderConfig();
    @CollapsibleObject
    public RightGladiatorShoulderConfig RightGladiatorShoulderConfig = new RightGladiatorShoulderConfig();
    @CollapsibleObject
    public LeftManikaConfig LeftManikaConfig = new LeftManikaConfig();
    @CollapsibleObject
    public RightManikaConfig RightManikaConfig = new RightManikaConfig();
    @CollapsibleObject
    public ScaleThoraxConfig ScaleThoraxConfig = new ScaleThoraxConfig();
    @CollapsibleObject
    public KubanHelmetConfig KubanHelmetConfig = new KubanHelmetConfig();
    @CollapsibleObject
    public ScythianScaleThoraxConfig ScythianScaleThoraxConfig = new ScythianScaleThoraxConfig();
    @CollapsibleObject
    public ScythianAtticHelmetConfig ScythianAtticHelmetConfig = new ScythianAtticHelmetConfig();
    @CollapsibleObject
    public ScythianScaleHelmetConfig ScythianScaleHelmetConfig = new ScythianScaleHelmetConfig();
    @CollapsibleObject
    public RomanGreavesConfig RomanGreavesConfig = new RomanGreavesConfig();
    @CollapsibleObject
    public CelticMontefortinoConfig CelticMontefortinoConfig = new CelticMontefortinoConfig();
    @CollapsibleObject
    public LaGorgeMelletConfig LaGorgeMelletConfig = new LaGorgeMelletConfig();
    @CollapsibleObject
    public SavaHelmetConfig SavaHelmetConfig = new SavaHelmetConfig();
    @CollapsibleObject
    public WaterlooHelmetConfig WaterlooHelmetConfig = new WaterlooHelmetConfig();

    public static class AtticHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public AtticHelmetConfig() {
        }
    }

    public static class BellCuirassConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public BellCuirassConfig() {
        }
    }

    public static class BeotianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public BeotianHelmetConfig() {
        }
    }

    public static class GalleaConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public GalleaConfig() {
        }
    }

    public static class RidgeHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public RidgeHelmetConfig() {
        }
    }

    public static class CoolusConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public CoolusConfig() {
        }
    }

    public static class IntercisaConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public IntercisaConfig() {
        }
    }

    public static class MelosConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public MelosConfig() {
        }
    }

    public static class MontefortinoHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public MontefortinoHelmetConfig() {
        }
    }

    public static class MusculeCuirassConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public MusculeCuirassConfig() {
        }
    }

    public static class NiederbieberHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public NiederbieberHelmetConfig() {
        }
    }

    public static class PhyrigianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public PhyrigianHelmetConfig() {
        }
    }

    public static class PilosClosetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public PilosClosetConfig() {
        }
    }

    public static class PilosConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public PilosConfig() {
        }
    }

    public static class SquamataConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public SquamataConfig() {
        }
    }

    public static class RomanParadeHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public RomanParadeHelmetConfig() {
        }
    }

    public static class ApuloCorinthianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ApuloCorinthianHelmetConfig() {
        }
    }

    public static class ChalcidianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ChalcidianHelmetConfig() {
        }
    }

    public static class CorinthianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public CorinthianHelmetConfig() {
        }
    }

    public static class GreekGreavesConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public GreekGreavesConfig() {
        }
    }

    public static class HamataConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public HamataConfig() {
        }
    }

    public static class HamataOptioConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public HamataOptioConfig() {
        }
    }

    public static class HeddernheimHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public HeddernheimHelmetConfig() {
        }
    }

    public static class IllirianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public IllirianHelmetConfig() {
        }
    }

    public static class IronNiederbieberHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public IronNiederbieberHelmetConfig() {
        }
    }

    public static class MurmilloHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public MurmilloHelmetConfig() {
        }
    }

    public static class MusculataConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public MusculataConfig() {
        }
    }

    public static class OfficerSquamataConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public OfficerSquamataConfig() {
        }
    }

    public static class OpenAtticHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public OpenAtticHelmetConfig() {
        }
    }

    public static class ProvocatorHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ProvocatorHelmetConfig() {
        }
    }

    public static class SecutorHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public SecutorHelmetConfig() {
        }
    }

    public static class SegmentataConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public SegmentataConfig() {
        }
    }

    public static class ThracianHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ThracianHelmetConfig() {
        }
    }

    public static class CardiophylaxConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public CardiophylaxConfig() {
        }
    }

    public static class LeftGladiatorShoulderConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public LeftGladiatorShoulderConfig() {
        }
    }

    public static class RightGladiatorShoulderConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public RightGladiatorShoulderConfig() {
        }
    }

    public static class LeftManikaConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public LeftManikaConfig() {
        }
    }

    public static class RightManikaConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public RightManikaConfig() {
        }
    }

    public static class ScaleThoraxConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ScaleThoraxConfig() {
        }
    }

    public static class KubanHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public KubanHelmetConfig() {
        }
    }

    public static class ScythianScaleThoraxConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ScythianScaleThoraxConfig() {
        }
    }

    public static class ScythianAtticHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ScythianAtticHelmetConfig() {
        }
    }

    public static class ScythianScaleHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public ScythianScaleHelmetConfig() {
        }
    }

    public static class RomanGreavesConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public RomanGreavesConfig() {
        }
    }

    public static class CelticMontefortinoConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public CelticMontefortinoConfig() {
        }
    }

    public static class LaGorgeMelletConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public LaGorgeMelletConfig() {
        }
    }

    public static class SavaHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public SavaHelmetConfig() {
        }
    }

    public static class WaterlooHelmetConfig {
        @RequiresRestart
        public boolean enabled = true;
        @RequiresRestart
        public float toughness = 1.25F;
        @RequiresRestart
        public int helmetDurability = 600;
        @RequiresRestart
        public int helmetDefense = 3;

        public WaterlooHelmetConfig() {
        }
    }
}
