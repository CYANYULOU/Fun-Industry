package main.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class ModItem{
    public static Item coin;
    
    public static void load(){
        coin = new Item("coin", Color.valueOf("fff200")){{

        }};
    }


}