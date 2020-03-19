package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(DaedricScrewMod1.setup.itemGroup)
                .rarity(Rarity.COMMON)
        );
        setRegistryName("firstitem");
    }
}