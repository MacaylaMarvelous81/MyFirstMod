package com.daedricscrew.daedricscrewmod1;

import com.daedricscrew.daedricscrewmod1.blocks.*;
import com.daedricscrew.daedricscrewmod1.items.FirstItem;
import com.daedricscrew.daedricscrewmod1.setup.ClientProxy;
import com.daedricscrew.daedricscrewmod1.setup.IProxy;
import com.daedricscrew.daedricscrewmod1.setup.ModSetup;
import com.daedricscrew.daedricscrewmod1.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.item.Item;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("daedricscrewmod1")
public class DaedricScrewMod1
{
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    public static ModSetup setup = new ModSetup();
    private static final Logger LOGGER = LogManager.getLogger();

    public DaedricScrewMod1() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        setup.init();
        proxy.init();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            blockRegistryEvent.getRegistry().register(new FirstBlock());
            blockRegistryEvent.getRegistry().register(new Basketball());
            blockRegistryEvent.getRegistry().register(new Popcorn());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            Item.Properties creativeTab = new Item.Properties()
                    .group(setup.itemGroup);
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, creativeTab).setRegistryName("firstblock"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.BASKETBALL, creativeTab).setRegistryName("basketball"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.POPCORN, creativeTab).setRegistryName("popcorn"));
            itemRegistryEvent.getRegistry().register(new FirstItem());
        }
        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> tileEntityRegistryEvent) {
            tileEntityRegistryEvent.getRegistry().register(TileEntityType.Builder.create(FirstBlockTile::new, ModBlocks.FIRSTBLOCK).build(null).setRegistryName("firstblock"));
        }
    }
}