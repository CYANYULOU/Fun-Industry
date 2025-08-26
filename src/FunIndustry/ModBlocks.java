
package FunIndustry;

import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.meta.BuildVisibility;

/*
public class ModBlocks {
    public static Wall ZineWall;

}
*/
public class ModBlocks {
    public static Wall ZincWall;

    public static void load() {
        ZincWall = new Wall("zinc-wall"){{
            requirements(Category.defense, BuildVisibility.shown, new ItemStack[]{});
            health = 2500;
            size = 2;
            buildCostMultiplier = 2f;
        }};
    }

}
