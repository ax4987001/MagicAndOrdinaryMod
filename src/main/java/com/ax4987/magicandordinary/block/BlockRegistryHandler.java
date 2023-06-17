package com.ax4987.magicandordinary.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;


@Mod.EventBusSubscriber
public class BlockRegistryHandler {
//    public static final BlockProperty EXP = new BlockProperty(material,"exp","tool",level,hardness);
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Block> event){
        IForgeRegistry<Block> registry = event.getRegistry();
//        registry.register(WXP);
    }
}
