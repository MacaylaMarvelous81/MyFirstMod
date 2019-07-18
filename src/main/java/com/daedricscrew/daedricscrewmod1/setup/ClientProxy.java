package com.daedricscrew.daedricscrewmod1.setup;
import net.minecraft.world.World;
import net.minecraft.client.Minecraft;

public class ClientProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
