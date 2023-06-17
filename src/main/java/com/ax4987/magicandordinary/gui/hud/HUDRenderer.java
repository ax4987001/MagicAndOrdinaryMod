package com.ax4987.magicandordinary.gui.hud;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class HUDRenderer {
/*    private static final ResourceLocation ICON = new ResourceLocation(TUNGregnxian.MODID +":textures/gui/health_icon.png");
    @SubscribeEvent
    public static void onRenderGameOverlayPost(RenderGameOverlayEvent.Post event){
        Minecraft mc = Minecraft.getMinecraft();
        Entity entity = mc.getRenderViewEntity();
        if (entity instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) entity;
            //绘制
            ScaledResolution resolution = event.getResolution();
            float healthPercentage = player.getHealth() / player.getMaxHealth();
            int width = 100;
            int x = resolution.getScaledWidth() / 2 - width / 2;
            int y = resolution.getScaledHeight() + 5;
            String health = player.getHealth() + "/" + player.getMaxHealth();
            GlStateManager.enableBlend();
            mc.getTextureManager().bindTexture(ICON);
            int barWidth = (int) (width * healthPercentage);
            mc.ingameGUI.drawTexturedModalRect(x,y,0,0,102,12);
            mc.ingameGUI.drawTexturedModalRect(x+1,y+1,0,11,barWidth,10);
            mc.ingameGUI.drawString(mc.fontRenderer,health,x+46,y+5,0x00ff00);
        }
    }
    @SubscribeEvent
    public static void onRenderGameOverlay(RenderGameOverlayEvent.Pre event) {
        if (event.getType() == RenderGameOverlayEvent.ElementType.HEALTH) {
            event.setCanceled(true);
        }
    }*/

}
