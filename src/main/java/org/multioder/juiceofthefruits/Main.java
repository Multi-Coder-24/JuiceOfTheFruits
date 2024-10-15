package org.multioder.juiceofthefruits;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.multioder.juiceofthefruits.common.init.ModBlocks;
import org.multioder.juiceofthefruits.common.init.ModItems;
import org.slf4j.Logger;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "juiceofthefruits";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Main(IEventBus modEventBus, ModContainer modContainer)
    {
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey().equals(CreativeModeTabs.FOOD_AND_DRINKS))
        {
            event.accept(ModItems.BLACKBERRY);
            event.accept(ModItems.BLACKCURRANT);
            event.accept(ModItems.BLUEBERRY);
            event.accept(ModItems.CHERRY);
            event.accept(ModItems.LEMON);
            event.accept(ModItems.LIME);
            event.accept(ModItems.MANGO);
            event.accept(ModItems.ORANGE);
            event.accept(ModItems.PEAR);
            event.accept(ModItems.REDCURRANT);
            event.accept(ModItems.STRAWBERRY);

            event.accept(ModItems.BLACKBERRY_JUICE);
            event.accept(ModItems.BLACKCURRANT_JUICE);
            event.accept(ModItems.BLUEBERRY_JUICE);
            event.accept(ModItems.CHERRY_JUICE);
            event.accept(ModItems.LEMON_JUICE);
            event.accept(ModItems.LIME_JUICE);
            event.accept(ModItems.MANGO_JUICE);
            event.accept(ModItems.ORANGE_JUICE);
            event.accept(ModItems.PEAR_JUICE);
            event.accept(ModItems.REDCURRANT_JUICE);
            event.accept(ModItems.STRAWBERRY_JUICE);
        }
    }
}