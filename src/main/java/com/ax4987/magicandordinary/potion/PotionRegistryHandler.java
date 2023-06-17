package com.ax4987.magicandordinary.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PotionRegistryHandler {
    @SubscribeEvent
    public static void onPotionRegistration(RegistryEvent.Register<Potion> event){
        event.getRegistry().register(new PotionChineseMoslaHerb());
    }
}
