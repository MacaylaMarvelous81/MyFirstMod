package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeItem;

public class PoisonMushroom extends Item {
    public PoisonMushroom() {
        super(new Item.Properties()
                .group(DaedricScrewMod1.setup.itemGroup)
                .food(new Food.Builder()
                        .saturation(0.0F)
                        .hunger(0)
                        .setAlwaysEdible()
                        .build()
                )
        );
        setRegistryName("poisonmushroom");
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            player.attackEntityFrom(new DamageSource("poisonmushroom"), 6);
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}