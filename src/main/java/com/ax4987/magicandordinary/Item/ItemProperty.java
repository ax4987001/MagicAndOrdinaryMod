package com.ax4987.magicandordinary.Item;

import com.ax4987.magicandordinary.MAGICandordinary;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemProperty extends Item {
    public ItemProperty(String name, int max, CreativeTabs tabs) {
        this.setCreativeTab(tabs);
        this.setUnlocalizedName(MAGICandordinary.MODID + "." + name);
        this.setRegistryName(name);
        this.setMaxStackSize(max);
    }
}



