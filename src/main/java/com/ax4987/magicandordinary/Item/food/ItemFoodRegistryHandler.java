package com.ax4987.magicandordinary.Item.food;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber

public class ItemFoodRegistryHandler {
//    public static final ItemFood TRUMPET_VINE = new ItemFoodProperty("trumpet_vine",16,TabXianCao.TAB_XIAN_CAO,1,10f,false,true,new PotionTrumpetVine(),100,0);
    @SubscribeEvent
    public static void onRegistry (RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
//           registry.register(TRUMPET_VINE);
    }
    @SideOnly(Side.CLIENT)
    private static void modelRegistry(Item item){
        ModelResourceLocation ModelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0,ModelResourceLocation);
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModeRegistry(ModelRegistryEvent event){
//        modelRegistry(TRUMPET_VINE);
    }
}

