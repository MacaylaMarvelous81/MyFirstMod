package com.daedricscrew.daedricscrewmod1.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class SpaghettiBowl extends ScrewFoodItem {
    public SpaghettiBowl() {
        super("spaghettibowl", 10, 5.0f);
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.BOWL));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}