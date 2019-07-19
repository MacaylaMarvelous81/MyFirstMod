package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class EdibleWind extends Item {
    public EdibleWind() {
        super(new Properties()
                .group(DaedricScrewMod1.setup.itemGroup)
                .food(new Food.Builder()
                        .saturation(0.0f)
                        .hunger(0)
                        .setAlwaysEdible()
                        .build()
                )
        );
        setRegistryName("ediblewind");
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