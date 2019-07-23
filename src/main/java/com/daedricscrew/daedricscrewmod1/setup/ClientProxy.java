package com.daedricscrew.daedricscrewmod1.setup;
import com.daedricscrew.daedricscrewmod1.blocks.FirstBlockScreen;
import com.daedricscrew.daedricscrewmod1.blocks.ModBlocks;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory(ModBlocks.FIRSTBLOCK_CONTAINER, FirstBlockScreen::new);
    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
    @Override
    public PlayerEntity getClientPlayer() {
        return Minecraft.getInstance().player;
    }

    @Override
    public ClientPlayerEntity getClientPlayerReal() {
        return Minecraft.getInstance().player;
    }
}
