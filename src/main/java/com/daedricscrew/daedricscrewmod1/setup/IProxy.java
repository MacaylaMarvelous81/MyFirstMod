package com.daedricscrew.daedricscrewmod1.setup;
import net.minecraft.world.World;

public interface IProxy {
    void init();
    World getClientWorld();
}
