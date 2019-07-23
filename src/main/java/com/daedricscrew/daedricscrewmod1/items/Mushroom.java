package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.*;
import net.minecraft.world.World;

import java.util.List;
import java.util.stream.Stream;

public class Mushroom extends ScrewFoodItem {
    public Mushroom() {
        super("mushroom", 5, 3.0F);
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if(entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            player.heal(5.0F);
            // FIXME chat message appears 2 times
            // TODO use something other than a command
            DaedricScrewMod1.proxy.getClientPlayerReal().sendChatMessage("/tellraw @s {\"color\":\"red\",\"text\":\"You ate a mushy mushroom and now you feel better!\"}");
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}