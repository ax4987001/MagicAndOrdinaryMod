package com.ax4987.magicandordinary.Item.food;

import com.ax4987.magicandordinary.MAGICandordinary;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFoodProperty extends ItemFood {
    private static Potion potionIn = null;
    private static int duration = 0;
    private static int amplifier = 0;
    ItemFoodProperty(String name , int max , CreativeTabs tabs, int health, float saturation, boolean isWolfFood,boolean isAlwaysEdible,Potion potion,int durationIn,int amplifierIn){
        super(health,saturation,isWolfFood);
        this.setCreativeTab(tabs);
        this.setUnlocalizedName(MAGICandordinary.MODID+"."+name);
        this.setRegistryName(name);
        this.setMaxStackSize(max);
        if (isAlwaysEdible){
            setAlwaysEdible();
        }
        potionIn = potion;
        duration = durationIn;
        amplifier = amplifierIn;
    }
 ItemFoodProperty(String name , int max , CreativeTabs tabs, int health, float saturation, boolean isWolfFood,boolean isAlwaysEdible){
        super(health,saturation,isWolfFood);
        this.setCreativeTab(tabs);
        this.setUnlocalizedName(MAGICandordinary.MODID+"."+name);
        this.setRegistryName(name);
        this.setMaxStackSize(max);
        if (isAlwaysEdible){
            setAlwaysEdible();
        }
    }
    public static void setPotion(Potion potion,int durationIn,int amplifierIn){
        potionIn = potion;
        duration = durationIn;
        amplifier = amplifierIn;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if(potionIn != null) {
            player.addPotionEffect(new PotionEffect(potionIn, duration, amplifier));
            super.onFoodEaten(stack, worldIn, player);
        }
    }
}
