package com.volt.dev.morefurnaces.main;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.volt.dev.morefurnaces.creativetab.FurnaceTab;
import com.volt.dev.morefurnaces.creativetab.placeholder.FurnaceTabPH;
import com.volt.dev.morefurnaces.furnaces.brickfurnace.BrickOven;
import com.volt.dev.morefurnaces.furnaces.brickfurnace.RenderBrickOven;
import com.volt.dev.morefurnaces.furnaces.brickfurnace.TileEntityBrickOven;
import com.volt.dev.morefurnaces.furnaces.diamondfurnace.DiamondOven;
import com.volt.dev.morefurnaces.furnaces.diamondfurnace.RenderDiamondOven;
import com.volt.dev.morefurnaces.furnaces.diamondfurnace.TileEntityDiamondOven;
import com.volt.dev.morefurnaces.furnaces.goldfurnace.GoldOven;
import com.volt.dev.morefurnaces.furnaces.goldfurnace.RenderGoldOven;
import com.volt.dev.morefurnaces.furnaces.goldfurnace.TileEntityGoldOven;
import com.volt.dev.morefurnaces.furnaces.ironfurnace.IronOven;
import com.volt.dev.morefurnaces.furnaces.ironfurnace.RenderIronOven;
import com.volt.dev.morefurnaces.furnaces.ironfurnace.TileEntityIronOven;
import com.volt.dev.morefurnaces.furnaces.netherrackfurnace.NetherrackOven;
import com.volt.dev.morefurnaces.furnaces.netherrackfurnace.RenderNetherrackOven;
import com.volt.dev.morefurnaces.furnaces.netherrackfurnace.TileEntityNetherrackOven;
import com.volt.dev.morefurnaces.furnaces.obsidianfurnace.ObsidianOven;
import com.volt.dev.morefurnaces.furnaces.obsidianfurnace.RenderObsidianOven;
import com.volt.dev.morefurnaces.furnaces.obsidianfurnace.TileEntityObsidianOven;
import com.volt.dev.morefurnaces.furnaces.quartzfurnace.QuartzOven;
import com.volt.dev.morefurnaces.furnaces.quartzfurnace.RenderQuartzOven;
import com.volt.dev.morefurnaces.furnaces.quartzfurnace.TileEntityQuartzOven;
import com.volt.dev.morefurnaces.guihandler.GuiHandlerFurnace;
import com.volt.dev.morefurnaces.main.proxies.CommonProxy;
import com.volt.dev.morefurnaces.main.references.References;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

// Mod Information
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class MoreFurnaces {
	// Client and Server Proxy locations
	@SidedProxy(clientSide = "com.volt.dev.morefurnaces.main.proxies.ClientProxy", serverSide = "com.volt.dev.morefurnaces.main.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	// Mod Instance
	@Instance("MoreFurnaces")
	public static MoreFurnaces instance;
	
	// Creative Tab Declaration
	public static CreativeTabs furnaceTab;
	public static Item furnaceTabPH;
	
	// Iron Furnace Declaration
	public static Block ironOven;
	public static Block ironOvenActive;
	
	// Gold Furnace Declaration
	public static Block goldOven;
	public static Block goldOvenActive;
	
	// Diamond Furnace Declaration
	public static Block diamondOven;
	public static Block diamondOvenActive;
	
	// Brick Furnace Declaration
	public static Block brickOven;
	public static Block brickOvenActive;
	
	// Netherrack Furnace Declaration
	public static Block netherrackOven;
	public static Block netherrackOvenActive;
	
	// Obsidian Furnace Declaration
	public static Block obsidianOven;
	public static Block obsidianOvenActive;
	
	// Quartz Furnace Declaration
	public static Block quartzOven;
	public static Block quartzOvenActive;
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		// Creative Tab
		furnaceTab = new FurnaceTab(CreativeTabs.getNextID(), "FurnaceTab");
		furnaceTabPH = new FurnaceTabPH().setUnlocalizedName("FurnaceTabPH").setTextureName("MoreFurnaces:FurnaceTabPH");
		
		GameRegistry.registerItem(furnaceTabPH, "FurnaceTabPH");
		
		// Iron Furnace
		ironOven = new IronOven(false).setHardness(4.0F).setResistance(15.0F).setBlockName("ironOven").setCreativeTab(furnaceTab);
		ironOvenActive = new IronOven(true).setHardness(4.0F).setResistance(15.0F).setBlockName("ironOvenActive");
		
		GameRegistry.registerBlock(ironOven, "ironOven");
		GameRegistry.registerBlock(ironOvenActive, "ironOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityIronOven.class, "tileEntityIronOven");
		
		GameRegistry.addRecipe(new ItemStack(ironOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Items.iron_ingot
		});
		GameRegistry.addRecipe(new ItemStack(ironOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Items.iron_ingot, 'B', Blocks.furnace
		});
		
		RenderingRegistry.registerBlockHandler(2105, RenderIronOven.INSTANCE);
		
		// Gold Furnace
		goldOven = new GoldOven(false).setHardness(2.0F).setResistance(5.0F).setBlockName("goldOven").setCreativeTab(furnaceTab);
		goldOvenActive = new GoldOven(true).setHardness(2.0F).setResistance(5.0F).setBlockName("goldOvenActive");
		
		GameRegistry.registerBlock(goldOven, "goldOven");
		GameRegistry.registerBlock(goldOvenActive, "goldOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityGoldOven.class, "tileEntityGoldOven");
		
		GameRegistry.addRecipe(new ItemStack(goldOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Items.gold_ingot
		});
		GameRegistry.addRecipe(new ItemStack(goldOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Items.gold_ingot, 'B', Blocks.furnace
		});
		GameRegistry.addRecipe(new ItemStack(goldOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Items.gold_ingot, 'B', ironOven
		});
		
		RenderingRegistry.registerBlockHandler(2106, RenderGoldOven.INSTANCE);
		
		// Diamond Furnace
		diamondOven = new DiamondOven(false).setHardness(6.0F).setResistance(20.0F).setBlockName("diamondOven").setCreativeTab(furnaceTab);
		diamondOvenActive = new DiamondOven(true).setHardness(6.0F).setResistance(20.0F).setBlockName("diamondOvenActive");
		
		GameRegistry.registerBlock(diamondOven, "diamondOven");
		GameRegistry.registerBlock(diamondOvenActive, "diamondOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityDiamondOven.class, "tileEntityDiamondOven");
		
		GameRegistry.addRecipe(new ItemStack(diamondOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Items.diamond
		});
		GameRegistry.addRecipe(new ItemStack(diamondOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Items.diamond, 'B', Blocks.furnace
		});
		GameRegistry.addRecipe(new ItemStack(diamondOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Items.diamond, 'B', goldOven
		});
		
		RenderingRegistry.registerBlockHandler(2107, RenderDiamondOven.INSTANCE);
		
		// Brick Furnace
		brickOven = new BrickOven(false).setHardness(4.5F).setResistance(15.0F).setBlockName("brickOven").setCreativeTab(furnaceTab);
		brickOvenActive = new BrickOven(true).setHardness(4.5F).setResistance(15.5F).setBlockName("brickOvenActive");
		
		GameRegistry.registerBlock(brickOven, "brickOven");
		GameRegistry.registerBlock(brickOvenActive, "brickOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityBrickOven.class, "tileEntityBrickOven");
		
		GameRegistry.addRecipe(new ItemStack(brickOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Blocks.brick_block
		});
		GameRegistry.addRecipe(new ItemStack(brickOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Blocks.brick_block, 'B', Blocks.furnace
		});
		
		RenderingRegistry.registerBlockHandler(2108, RenderBrickOven.INSTANCE);
		
		// Netherrack Furnace
		netherrackOven = new NetherrackOven(false).setHardness(1.0F).setResistance(0.1F).setBlockName("netherrackOven").setCreativeTab(furnaceTab);
		netherrackOvenActive = new NetherrackOven(true).setHardness(1.0F).setResistance(0.1F).setBlockName("netherrackOvenActive");
		
		GameRegistry.registerBlock(netherrackOven, "netherrackOven");
		GameRegistry.registerBlock(netherrackOvenActive, "netherrackOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityNetherrackOven.class, "tileEntityNetherrackOven");
		
		GameRegistry.addRecipe(new ItemStack(netherrackOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Blocks.netherrack
		});
		GameRegistry.addRecipe(new ItemStack(netherrackOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Blocks.netherrack, 'B', Blocks.furnace
		});
		
		RenderingRegistry.registerBlockHandler(2109, RenderNetherrackOven.INSTANCE);
		
		// Obsidian Furnace Block
		obsidianOven = new ObsidianOven(false).setHardness(50F).setResistance(6000F).setBlockName("obsidianOven").setCreativeTab(furnaceTab);
		obsidianOvenActive = new ObsidianOven(true).setHardness(50F).setResistance(6000F).setBlockName("obsidianOvenActive");
		
		GameRegistry.registerBlock(obsidianOven, "obsidianOven");
		GameRegistry.registerBlock(obsidianOvenActive, "obsidianOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityObsidianOven.class, "tileEntityObsidianOven");
		
		GameRegistry.addRecipe(new ItemStack(obsidianOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(obsidianOven, 1), new Object[] {
			
			"AAA",
			"ABA",
			"AAA",
			'A', Blocks.obsidian, 'B', Blocks.furnace
		});
		
		RenderingRegistry.registerBlockHandler(2110, RenderObsidianOven.INSTANCE);
		
		// Quartz Furnace Block
		quartzOven = new QuartzOven(false).setHardness(3.2F).setResistance(10.0F).setBlockName("quartzOven").setCreativeTab(furnaceTab);
		quartzOvenActive = new QuartzOven(true).setHardness(3.2F).setResistance(10.0F).setBlockName("quartzOvenActive");
		
		GameRegistry.registerBlock(quartzOven, "quartzOven");
		GameRegistry.registerBlock(quartzOvenActive, "quartzOvenActive");
		
		GameRegistry.registerTileEntity(TileEntityQuartzOven.class, "tileEntityQuartzOven");
		
		GameRegistry.addRecipe(new ItemStack(quartzOven, 1), new Object[] {
			"AAA",
			"A A",
			"AAA",
			'A', Blocks.quartz_block
		});
		GameRegistry.addRecipe(new ItemStack(quartzOven, 1), new Object[] {
			"AAA",
			"ABA",
			"AAA",
			'A', Blocks.quartz_block, 'B', Blocks.furnace
		});
		
		RenderingRegistry.registerBlockHandler(2111, RenderQuartzOven.INSTANCE);
		
		// Register GuiHandler
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandlerFurnace());
	}
}