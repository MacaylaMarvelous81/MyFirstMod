package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class Pizza extends Item {
    public Pizza() {
        super(new Properties()
                .group(DaedricScrewMod1.setup.itemGroup)
                .rarity(Rarity.COMMON)
                .food(new Food.Builder()
                        .saturation(0.0f)
                        .hunger(0)
                        .meat()
                        .build()
                )
        );
        setRegistryName("pizza");
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