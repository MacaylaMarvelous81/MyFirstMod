package com.daedricscrew.daedricscrewmod1.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Basketball extends Block {
    public Basketball() {
        super(Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(0.5f)
                .lightValue(14)
        );
        setRegistryName("basketball");
    }
}
