package com.daedricscrew.daedricscrewmod1.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class Pizza extends ScrewFoodItem {
    public Pizza() {
        super("pizza", 6, 3.5f);
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if(entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            player.jump();
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}