package com.daedricscrew.daedricscrewmod1.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class EdibleWind extends ScrewFoodItem {
    public EdibleWind() {
        super("ediblewind", 0, 0f);
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            player.addPotionEffect(new EffectInstance(Effect.get(25), 100, 1));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}