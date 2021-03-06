package com.daedricscrew.daedricscrewmod1.blocks;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;
public class ModBlocks {
    @ObjectHolder("daedricscrewmod1:firstblock")
    public static FirstBlock FIRSTBLOCK;
    @ObjectHolder("daedricscrewmod1:basketball")
    public static Basketball BASKETBALL;
    @ObjectHolder("daedricscrewmod1:popcorn")
    public static Popcorn POPCORN;
    @ObjectHolder("daedricscrewmod1:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
    @ObjectHolder("daedricscrewmod1:firstblock")
    public static ContainerType<FirstBlockContainer> FIRSTBLOCK_CONTAINER;
    @ObjectHolder("daedricscrewmod1:rubyblock")
    public static RubyBlock RUBYBLOCK;
    @ObjectHolder("daedricscrewmod1:rubyore")
    public static RubyOre RUBYORE;
    @ObjectHolder("daedricscrewmod1:donationbox")
    public static DonationBox DONATIONBOX;
    @ObjectHolder("daedricscrewmod1:donationbox")
    public static TileEntityType<DonationBoxTile> DONATIONBOX_TILE;
    @ObjectHolder("daedricscrewmod1:donationbox")
    public static ContainerType<DonationBoxContainer> DONATIONBOX_CONTAINER;
}