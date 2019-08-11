package com.daedricscrew.daedricscrewmod1;

import com.daedricscrew.daedricscrewmod1.blocks.*;
import com.daedricscrew.daedricscrewmod1.items.*;
import com.daedricscrew.daedricscrewmod1.setup.ClientProxy;
import com.daedricscrew.daedricscrewmod1.setup.IProxy;
import com.daedricscrew.daedricscrewmod1.setup.ModSetup;
import com.daedricscrew.daedricscrewmod1.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.smartcardio.TerminalFactorySpi;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("daedricscrewmod1")
public class DaedricScrewMod1
{
    public static final String MODID = "daedricscrewmod1";
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
            blockRegistryEvent.getRegistry().register(new RubyBlock());
            blockRegistryEvent.getRegistry().register(new RubyOre());
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            Item.Properties creativeTab = new Item.Properties()
                    .group(setup.itemGroup);
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.FIRSTBLOCK, creativeTab).setRegistryName("firstblock"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.BASKETBALL, creativeTab).setRegistryName("basketball"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.POPCORN, creativeTab).setRegistryName("popcorn"));
            itemRegistryEvent.getRegistry().register(new FirstItem());
            itemRegistryEvent.getRegistry().register(new Pizza());
            itemRegistryEvent.getRegistry().register(new SpaghettiBowl());
            itemRegistryEvent.getRegistry().register(new EdibleWind());
            itemRegistryEvent.getRegistry().register(new Ruby());
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.RUBYBLOCK, creativeTab).setRegistryName("rubyblock"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.RUBYORE, creativeTab).setRegistryName("rubyore"));
            itemRegistryEvent.getRegistry().register(new SwordItem(ItemTier.DIAMOND, 5, -3.5F, creativeTab).setRegistryName("rubysword"));
            // TODO: Make ruby pickaxe
            itemRegistryEvent.getRegistry().register(new PoisonMushroom());
            itemRegistryEvent.getRegistry().register(new RidingPass());
            itemRegistryEvent.getRegistry().register(new Mushroom());
        }
        @SubscribeEvent
        public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> tileEntityRegistryEvent) {
            tileEntityRegistryEvent.getRegistry().register(TileEntityType.Builder.create(FirstBlockTile::new, ModBlocks.FIRSTBLOCK).build(null).setRegistryName("firstblock"));
        }
        @SubscribeEvent
        public static void onContainerRegistry(final RegistryEvent.Register<ContainerType<?>> containerRegistryEvent) {
            containerRegistryEvent.getRegistry().register((IForgeContainerType.create((windowId, inv, data) -> {
                BlockPos pos = data.readBlockPos();
                return new FirstBlockContainer(windowId, proxy.getClientWorld(), pos, inv, proxy.getClientPlayer());
            }).setRegistryName("firstblock")));
        }
    }
}