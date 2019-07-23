package com.daedricscrew.daedricscrewmod1.setup;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {
    void init();
    World getClientWorld();
    PlayerEntity getClientPlayer();
    ClientPlayerEntity getClientPlayerReal();
}
