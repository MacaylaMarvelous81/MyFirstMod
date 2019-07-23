package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RidingPass extends Item {
    public RidingPass() {
        super(new Properties()
                .group(DaedricScrewMod1.setup.itemGroup)
        );
        setRegistryName("ridingpass");
    }
    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
        player.startRiding(entity);
        return true;
    }
}