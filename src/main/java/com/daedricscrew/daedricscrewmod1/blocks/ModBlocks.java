package com.daedricscrew.daedricscrewmod1.blocks;
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
}