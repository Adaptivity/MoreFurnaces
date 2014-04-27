package com.volt.dev.morefurnaces.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class HardenedRedstoneBlock extends Block
{
    public HardenedRedstoneBlock()
    {
        super(Material.rock);
        this.setHarvestLevel("pickaxe", 2);
    }

    public Block getBlockDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this;
    }
}