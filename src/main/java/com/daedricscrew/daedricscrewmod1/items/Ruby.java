package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import net.minecraft.item.Item;

public class Ruby extends Item {
    public Ruby() {
        super(new Item.Properties()
                .group(DaedricScrewMod1.setup.itemGroup)
        );
        setRegistryName("ruby");
    }
}
