package com.ax4987.magicandordinary.Item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;



@Mod.EventBusSubscriber

public class ItemRegistryHandler {
//    public static final ItemProperty exp = new ItemProperty("exp",max);
//    public static final ItemBlock EXP = new ItemBlock(BlockRegistryHandler.EXP);
    private static ItemBlock setName(ItemBlock item){
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }
    @SubscribeEvent
    public static void onRegistry (RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
//        registry.register();
//        registry.register(setName(EXP));
    }
    @SideOnly(Side.CLIENT)
    private static void modelRegistry(Item item){
        ModelResourceLocation ModelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,ModelResourceLocation);
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModeRegistry(ModelRegistryEvent event){
        //冰天雪莲
        //灵土
        //功法
    }
}
