package com.ax4987.magicandordinary.potion;

import com.ax4987.magicandordinary.MAGICandordinary;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class PotionChineseMoslaHerb extends Potion {
    public static final ResourceLocation ICON = new ResourceLocation(MAGICandordinary.MODID +":textures/gui/potion_icons.png");
    public PotionChineseMoslaHerb() {
        super(false, 0x800080); //第一个参数表示药水效果是否为负面效果，这里我们设置为false；第二个参数表示药水的颜色
        setRegistryName(MAGICandordinary.MODID,"mosla_herb"); //设置药水效果的注册名字
        setPotionName("potion.mosla_herb"); //设置药水效果的本地化名字
    }
    @Override
    public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier){
        if (entityLivingBaseIn instanceof EntityPlayer){
            ((EntityPlayer)entityLivingBaseIn).getFoodStats().addStats(amplifier + 1, 1.0F);
        }
    }
    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 40 == 0;
    }
    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect effect, net.minecraft.client.Minecraft mc) {
        mc.getTextureManager().bindTexture(PotionChineseMoslaHerb.ICON);
        mc.currentScreen.drawTexturedModalRect(x+6,y+7,0,0,18,18);
    }

}
