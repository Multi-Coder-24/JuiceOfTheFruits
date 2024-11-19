package org.multioder.juiceofthefruits.common.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.Optional;

public class ItemDrinkable extends Item
{

    public ItemDrinkable()
    {
        super(new Properties().stacksTo(1).food(new FoodProperties(8,1.6f,true,2.5f, Optional.empty(),new ArrayList<>())));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity living)
    {
        if(living instanceof Player player)
        {
            player.addItem(new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.finishUsingItem(stack, level, living);
    }
}
