package org.multicoder.juiceofthefruits.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.multicoder.juiceofthefruits.Juiceofthefruits;

import java.util.ArrayList;
import java.util.Optional;

public class ItemDrinkable extends Item
{

    public ItemDrinkable(String name)
    {
        super(new Properties().food(new FoodProperties(8,1.6f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,name))));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity)
    {
        if(livingEntity instanceof Player player)
        {
            if(!player.isCreative()){
                player.addItem(new ItemStack(Items.GLASS_BOTTLE));
            }
        }
        return super.finishUsingItem(stack, level, livingEntity);
    }
}
