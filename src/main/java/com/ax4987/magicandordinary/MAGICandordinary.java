package com.ax4987.magicandordinary;



import com.ax4987.magicandordinary.gui.hud.HUDRenderer;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber

@Mod(modid = MAGICandordinary.MODID, name = MAGICandordinary.NAME, version = MAGICandordinary.VERSION)
public class MAGICandordinary {
    public static final String MODID = "magicandordinary";
    public static final String NAME = "Magic And Ordinary";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new HUDRenderer());
        if (event.getSide() == Side.SERVER) {
            MinecraftForge.EVENT_BUS.register(MAGICandordinary.class);
        }
    }


}


