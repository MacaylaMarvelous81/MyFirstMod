package com.daedricscrew.daedricscrewmod1.items;

import com.daedricscrew.daedricscrewmod1.DaedricScrewMod1;
import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {
    @ObjectHolder("daedricscrewmod1:firstitem")
    public static FirstItem FIRSTITEM;
    @ObjectHolder("daedricscrewmod1:pizza")
    public static Pizza PIZZA;
    @ObjectHolder("daedricscrewmod1:spaghettibowl")
    public static SpaghettiBowl SPAGHETTIBOWL;
    @ObjectHolder("daedricscrewmod1:ediblewind")
    public static EdibleWind EDIBLEWIND;
    @ObjectHolder("daedricscrewmod1:ruby")
    public static Ruby RUBY;
}
