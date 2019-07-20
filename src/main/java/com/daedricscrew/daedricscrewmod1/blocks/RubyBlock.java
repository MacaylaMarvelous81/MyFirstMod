package com.daedricscrew.daedricscrewmod1.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends Block {
    public RubyBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(3.0f)
                .lightValue(14)
        );
        setRegistryName("rubyblock");
    }
}
