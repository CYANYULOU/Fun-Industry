package FunIndustry;

import arc.util.Log;
import mindustry.mod.Mod;

public class FunIndustryMod extends Mod {

    public FunIndustryMod() {
        Log.info("Loaded FunIndustryMod constructor.");
    }

    @Override
    public void loadContent() {
        Log.info("Loading some FunIndustryMod content.");
        ModItems.load();
        ModLiquid.load();
        ModBlocks.load();
    }
}