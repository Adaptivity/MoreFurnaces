package com.volt.dev.morefurnaces.guihandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.volt.dev.morefurnaces.brickfurnace.ContainerBrickOven;
import com.volt.dev.morefurnaces.brickfurnace.GuiBrickOven;
import com.volt.dev.morefurnaces.brickfurnace.TileEntityBrickOven;
import com.volt.dev.morefurnaces.diamondfurnace.ContainerDiamondOven;
import com.volt.dev.morefurnaces.diamondfurnace.GuiDiamondOven;
import com.volt.dev.morefurnaces.diamondfurnace.TileEntityDiamondOven;
import com.volt.dev.morefurnaces.goldfurnace.ContainerGoldOven;
import com.volt.dev.morefurnaces.goldfurnace.GuiGoldOven;
import com.volt.dev.morefurnaces.goldfurnace.TileEntityGoldOven;
import com.volt.dev.morefurnaces.ironfurnace.ContainerIronOven;
import com.volt.dev.morefurnaces.ironfurnace.GuiIronOven;
import com.volt.dev.morefurnaces.ironfurnace.TileEntityIronOven;
import com.volt.dev.morefurnaces.netherrackfurnace.ContainerNetherrackOven;
import com.volt.dev.morefurnaces.netherrackfurnace.GuiNetherrackOven;
import com.volt.dev.morefurnaces.netherrackfurnace.TileEntityNetherrackOven;
import com.volt.dev.morefurnaces.obsidianfurnace.ContainerObsidianOven;
import com.volt.dev.morefurnaces.obsidianfurnace.GuiObsidianOven;
import com.volt.dev.morefurnaces.obsidianfurnace.TileEntityObsidianOven;
import com.volt.dev.morefurnaces.quartzfurnace.ContainerQuartzOven;
import com.volt.dev.morefurnaces.quartzfurnace.GuiQuartzOven;
import com.volt.dev.morefurnaces.quartzfurnace.TileEntityQuartzOven;
import com.volt.dev.morefurnaces.redstonefurnace.ContainerRedstoneOven;
import com.volt.dev.morefurnaces.redstonefurnace.GuiRedstoneOven;
import com.volt.dev.morefurnaces.redstonefurnace.TileEntityRedstoneOven;

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
		case 7: return new ContainerRedstoneOven(player.inventory, (TileEntityRedstoneOven) tile_entity);
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
		case 7: return new GuiRedstoneOven(player.inventory, (TileEntityRedstoneOven) tile_entity);
		}
		return null;
	}
}
