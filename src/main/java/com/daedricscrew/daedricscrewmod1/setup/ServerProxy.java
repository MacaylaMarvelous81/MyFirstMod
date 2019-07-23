package com.daedricscrew.daedricscrewmod1.setup;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public void init() {

    }

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }
    @Override
    public PlayerEntity getClientPlayer() {
        throw new IllegalStateException("Only run this on the client!");
    }

    @Override
    public ClientPlayerEntity getClientPlayerReal() {
        throw new IllegalStateException("Only run this on the client!");
    }
}
