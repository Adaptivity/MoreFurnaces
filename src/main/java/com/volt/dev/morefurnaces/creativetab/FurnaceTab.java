package com.volt.dev.morefurnaces.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.volt.dev.morefurnaces.main.MoreFurnaces;

public class FurnaceTab extends CreativeTabs 
{
	public FurnaceTab(int par1, String par2Str)
	{
		super(par1, par2Str);
	}
	
	@Override
	public Item getTabIconItem()
	{
		return MoreFurnaces.furnaceTabPH;
	}
}
