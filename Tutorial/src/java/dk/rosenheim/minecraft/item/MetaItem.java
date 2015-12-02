package dk.rosenheim.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MetaItem extends Item{
	public MetaItem(String unlocalizedName) {
		super();
		this.setHasSubtypes(true);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public IIcon[] icons = new IIcon[6];
}
