package com.daedricscrew.daedricscrewmod1.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Popcorn extends Block {
    public Popcorn() {
        super(Properties.create(Material.WOOL)
                .sound(SoundType.CLOTH)
                .hardnessAndResistance(0.5f)
                .lightValue(14)
        );
        setRegistryName("popcorn");
    }
}