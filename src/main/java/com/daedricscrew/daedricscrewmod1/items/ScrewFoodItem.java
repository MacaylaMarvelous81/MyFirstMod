package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ScrewFoodItem extends Item {
    public ScrewFoodItem(String name, int hunger, float saturation) {
        super(new Properties()
                .group(DaedricScrewMod1.setup.itemGroup)
                .food(new Food.Builder()
                        .saturation(saturation)
                        .hunger(hunger)
                        .build()
                )
        );
        setRegistryName(name);
    }
}
