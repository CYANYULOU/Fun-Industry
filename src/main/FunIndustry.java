package main;

import mindustry.mod.Mod;

public class FunIndustry extends Mod{

    @Override
    public void loadContent(){
        main.content.ModItem.load();
    }
}
