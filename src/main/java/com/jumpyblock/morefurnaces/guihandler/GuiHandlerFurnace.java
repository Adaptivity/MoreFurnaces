package com.jumpyblock.morefurnaces.guihandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.jumpyblock.morefurnaces.furnaces.brickfurnace.ContainerBrickOven;
import com.jumpyblock.morefurnaces.furnaces.brickfurnace.GuiBrickOven;
import com.jumpyblock.morefurnaces.furnaces.brickfurnace.TileEntityBrickOven;
import com.jumpyblock.morefurnaces.furnaces.cactusfurnace.ContainerCactusOven;
import com.jumpyblock.morefurnaces.furnaces.cactusfurnace.GuiCactusOven;
import com.jumpyblock.morefurnaces.furnaces.cactusfurnace.TileEntityCactusOven;
import com.jumpyblock.morefurnaces.furnaces.diamondfurnace.ContainerDiamondOven;
import com.jumpyblock.morefurnaces.furnaces.diamondfurnace.GuiDiamondOven;
import com.jumpyblock.morefurnaces.furnaces.diamondfurnace.TileEntityDiamondOven;
import com.jumpyblock.morefurnaces.furnaces.goldfurnace.ContainerGoldOven;
import com.jumpyblock.morefurnaces.furnaces.goldfurnace.GuiGoldOven;
import com.jumpyblock.morefurnaces.furnaces.goldfurnace.TileEntityGoldOven;
import com.jumpyblock.morefurnaces.furnaces.ironfurnace.ContainerIronOven;
import com.jumpyblock.morefurnaces.furnaces.ironfurnace.GuiIronOven;
import com.jumpyblock.morefurnaces.furnaces.ironfurnace.TileEntityIronOven;
import com.jumpyblock.morefurnaces.furnaces.netherrackfurnace.ContainerNetherrackOven;
import com.jumpyblock.morefurnaces.furnaces.netherrackfurnace.GuiNetherrackOven;
import com.jumpyblock.morefurnaces.furnaces.netherrackfurnace.TileEntityNetherrackOven;
import com.jumpyblock.morefurnaces.furnaces.obsidianfurnace.ContainerObsidianOven;
import com.jumpyblock.morefurnaces.furnaces.obsidianfurnace.GuiObsidianOven;
import com.jumpyblock.morefurnaces.furnaces.obsidianfurnace.TileEntityObsidianOven;
import com.jumpyblock.morefurnaces.furnaces.quartzfurnace.ContainerQuartzOven;
import com.jumpyblock.morefurnaces.furnaces.quartzfurnace.GuiQuartzOven;
import com.jumpyblock.morefurnaces.furnaces.quartzfurnace.TileEntityQuartzOven;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerFurnace implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getTileEntity(x, y, z);
		switch(id)
		{
		case 0: return new ContainerIronOven(player.inventory, (TileEntityIronOven) tile_entity);
		case 1: return new ContainerGoldOven(player.inventory, (TileEntityGoldOven) tile_entity);
		case 2: return new ContainerDiamondOven(player.inventory, (TileEntityDiamondOven) tile_entity);
		case 3: return new ContainerBrickOven(player.inventory, (TileEntityBrickOven) tile_entity);
		case 4: return new ContainerNetherrackOven(player.inventory, (TileEntityNetherrackOven) tile_entity);
		case 5: return new ContainerObsidianOven(player.inventory, (TileEntityObsidianOven) tile_entity);
		case 6: return new ContainerQuartzOven(player.inventory, (TileEntityQuartzOven) tile_entity);
		case 7: return new ContainerCactusOven(player.inventory, (TileEntityCactusOven) tile_entity);
		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getTileEntity(x, y, z);
		switch(id)
		{
		case 0: return new GuiIronOven(player.inventory, (TileEntityIronOven) tile_entity);
		case 1: return new GuiGoldOven(player.inventory, (TileEntityGoldOven) tile_entity);
		case 2: return new GuiDiamondOven(player.inventory, (TileEntityDiamondOven) tile_entity);
		case 3: return new GuiBrickOven(player.inventory, (TileEntityBrickOven) tile_entity);
		case 4: return new GuiNetherrackOven(player.inventory, (TileEntityNetherrackOven) tile_entity);
		case 5: return new GuiObsidianOven(player.inventory, (TileEntityObsidianOven) tile_entity);
		case 6: return new GuiQuartzOven(player.inventory, (TileEntityQuartzOven) tile_entity);
		case 7: return new GuiCactusOven(player.inventory, (TileEntityCactusOven) tile_entity);
		}
		return null;
	}
}
