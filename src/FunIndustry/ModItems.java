package FunIndustry;


import arc.graphics.Color;
import mindustry.type.Item;

public class ModItems {
    public static final Color ZincGray = new Color(195, 195, 195);
    public static final Color ThuliumBlue = new Color(154,218,234);
    public static Item zinc;
    public static Item brass;
    public static Item thulium;
    public static Item bitumen;
    public static void load() {
        zinc = new Item("zinc",Color.valueOf("A3A3A3"));
        thulium = new Item("thulium",Color.valueOf("99D9EA"));
        brass = new Item("brass",Color.valueOf("FFF200"));
        bitumen = new Item("bitumen",Color.valueOf("0F0F0F"));
    }

}