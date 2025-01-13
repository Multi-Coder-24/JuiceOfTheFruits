package org.multicoder.juiceofthefruits;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.multicoder.juiceofthefruits.common.init.ModBlocks;
import org.multicoder.juiceofthefruits.common.init.ModItems;
import org.slf4j.Logger;

@Mod(Juiceofthefruits.MODID)
public class Juiceofthefruits {
    public static final String MODID = "juiceofthefruits";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Juiceofthefruits(IEventBus modEventBus, ModContainer modContainer)
    {
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey().equals(CreativeModeTabs.FOOD_AND_DRINKS))
        {
            ModItems.ITEMS.getEntries().forEach(entry -> event.accept(entry.get()));
        }
    }
}