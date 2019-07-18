package com.daedricscrew.daedricscrewmod1.setup;

import com.daedricscrew.daedricscrewmod1.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {
    public ItemGroup itemGroup = new ItemGroup("daedricscrewmod1") {
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.BASKETBALL);
        }
    };
    public void init() {}
}