
package FunIndustry;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.gen.Sounds;
import mindustry.mod.Mod;
import mindustry.type.Category;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.blocks.distribution.OverflowGate;
import mindustry.world.blocks.liquid.Conduit;
import mindustry.world.blocks.liquid.LiquidRouter;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.DrawDefault;
import mindustry.world.draw.DrawFlame;
import mindustry.world.draw.DrawMulti;
import mindustry.world.meta.BuildVisibility;

import static mindustry.type.ItemStack.with;

/*
public class ModBlocks {
    public static Wall ZineWall;

}
*/
public class ModBlocks {
    //大型锌墙
    public static Wall LargeZincWall;
    //锌墙
    public static Wall ZincWall;
    //大型黄铜墙
    public static Wall LargeBrassWall;
    //黄铜墙
    public static Wall BrassWall;
    //黄铜冶炼厂
    public static GenericCrafter brassSmelter;
    //黄铜导管
    public static Conduit brassConduit;
    //黄铜导管阀
    //public static OverflowValve overflowValve;
    //public static Conduit underflowValve;
    //分馏塔
    public static GenericCrafter fractionatingtower;
    //黄铜液体路由器
    public static LiquidRouter brassliquidRouter;
    //黄铜传送带
    public static Conveyor brassConveyor;
    public static void load() {
        //锌墙
        ZincWall = new Wall("zinc-wall"){{
           requirements(Category.defense,with(ModItems.zinc,6));
           health = 500;
           size = 1;
           buildCostMultiplier = 0.65f;
        }};
        //大型锌墙
        LargeZincWall = new Wall("zinc-wall-large"){{
            requirements(Category.defense,with(ModItems.zinc,24));
            health = 2000;
            size = 2;
            buildCostMultiplier = 2.6f;
        }};
        //黄铜墙
        BrassWall = new Wall("brass-wall"){{
            requirements(Category.defense,with(ModItems.brass,6));
            health = 600;
            size = 1;
            buildCostMultiplier = 0.65f;
        }};
        //大型黄铜墙
        LargeBrassWall = new Wall("brass-wall-large"){{
            requirements(Category.defense,with(ModItems.brass,24));
            health = 2400;
            size = 2;
            buildCostMultiplier = 2.6f;
        }};
        //黄铜冶炼厂
        brassSmelter = new GenericCrafter("brass-smelter"){{
            requirements(Category.crafting, with(Items.copper, 20, Items.titanium, 15, Items.graphite,30));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(ModItems.brass, 2);
            craftTime = 40f;
            size = 2;
            hasPower = true;
            hasLiquids = false;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;

            consumeItems(with(ModItems.zinc, 1, Items.copper, 2));
            consumePower(0.50f);
        }};
        //黄铜导管
        brassConduit = new Conduit("brass-conduit"){{
            requirements(Category.liquid, with(ModItems.brass, 1, Items.metaglass, 1));
            liquidCapacity = 40f;
            liquidPressure = 1.025f;
            health = 150;
            explosivenessScale = flammabilityScale = 16f/40f;
        }};
        //黄铜导管阀
        /*
        overflowValve = new OverflowValve("overflow-valve"){{
            requirements(Category.liquid, with(ModItems.brass, 2, Items.metaglass, 2));
            buildCostMultiplier = 3f;
        }};

        underflowValve = new OverflowValve("underflow-valve"){{
            requirements(Category.liquid, with(ModItems.brass, 2, Items.metaglass, 2));
            buildCostMultiplier = 3f;
            invert = true;
        }};
        */
        //蒸馏塔
        
        fractionatingtower = new GenericCrafter("fractionating-tower"){{
            requirements(Category.crafting, with(ModItems.brass, 40, Items.graphite, 15, ModItems.zinc,30));
            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(ModItems.bitumen, 2);
            craftTime = 40f;
            size = 2;
            hasPower = true;
            hasLiquids = true;
            hasItems = true;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("ffef99")));
            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.07f;
            outputLiquid = new LiquidStack(ModLiquid.Fuel, 12f / 60f);
            outputsLiquid = true;

            consumeLiquid(Liquids.oil, 12f / 60f);
            consumePower(0.50f);
        }};
        
        //黄铜液体路由器
        brassliquidRouter = new LiquidRouter("brass-liquid-router"){{
            requirements(Category.liquid, with(ModItems.brass, 4, Items.metaglass, 2));
            liquidCapacity = 120f;
            underBullets = true;
            solid = false;
            health = 100;
            explosivenessScale = flammabilityScale = 20f/120f;
        }};
        //黄铜传送带
        brassConveyor = new Conveyor("brass-conveyor"){{
            requirements(Category.distribution, with(Items.copper, 1, Items.lead, 1, Items.titanium, 1));
            health = 200;
            speed = 0.16f;
            displayedSpeed = 20f;
        }};
    }

}
