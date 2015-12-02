package dk.rosenheim.minecraft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import dk.rosenheim.minecraft.block.ModBlocks;
import dk.rosenheim.minecraft.crafting.ModCrafting;
import dk.rosenheim.minecraft.item.ModItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.Init();
    	ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
    	ModCrafting.init();
    }

    public void postInit(FMLPostInitializationEvent e) {
    	
    }
}
