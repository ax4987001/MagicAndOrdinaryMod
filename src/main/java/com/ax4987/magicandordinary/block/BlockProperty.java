package com.ax4987.magicandordinary.block;

import com.ax4987.magicandordinary.MAGICandordinary;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockProperty extends Block {
    public BlockProperty(Material materialIn, String name, String tool, int level, float hardness, CreativeTabs tabs){
        super(materialIn);
        this.setCreativeTab(tabs);
        this.setUnlocalizedName(MAGICandordinary.MODID+"."+name);
        this.setRegistryName(name);
        this.setHarvestLevel(tool,level);
        this.setHardness(hardness);

    }

}
