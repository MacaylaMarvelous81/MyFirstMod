package com.daedricscrew.daedricscrewmod1.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyOre extends Block {
    public RubyOre() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
        );
        setRegistryName("rubyore");
    }
}