package org.multioder.juiceofthefruits.common.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.Optional;

public class ItemDrinkable extends Item
{

    public ItemDrinkable()
    {
        super(new Properties().stacksTo(1).food(new FoodProperties(8,1.6f,true,2.5f, Optional.of(new ItemStack(Items.GLASS_BOTTLE)),new ArrayList<>())));
    }
}
