package FunIndustry;

import arc.graphics.Color;
import mindustry.type.Liquid;

public class ModLiquid {
    public static Liquid CarbonDioxide;
    public static Liquid Fuel;
    public static void load() {
        CarbonDioxide = new Liquid("carbon-dioxide", Color.valueOf("ffffff"));
        Fuel = new Liquid("fuel", Color.valueOf("F5E6C8")) {
            {
                flammability = 2.0f;
                explosiveness = 2.0f;
            }
        };
    }
}
