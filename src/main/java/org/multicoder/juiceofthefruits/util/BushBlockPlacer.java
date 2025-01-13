package org.multicoder.juiceofthefruits.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.multicoder.juiceofthefruits.common.init.ModBlocks;
import org.multicoder.juiceofthefruits.common.init.ModItems;

import java.util.Objects;

public class BushBlockPlacer
{
    public static Block getBlockFromFruit(Item fruit)
    {
        if(Objects.equals(fruit, ModItems.APRICOT.get())) {
            return ModBlocks.APRICOT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.BLACKBERRY.get())) {
            return ModBlocks.BLACKBERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.BLACKCURRANT.get())) {
            return ModBlocks.BLACKCURRANT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.BLUEBERRY.get())) {
            return ModBlocks.BLUEBERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.CHERRY.get())) {
            return ModBlocks.CHERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.CRANBERRY.get())) {
            return ModBlocks.CRANBERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.DRAGON_FRUIT.get())) {
            return ModBlocks.DRAGON_FRUIT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.ELDERBERRY.get())) {
            return ModBlocks.ELDERBERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.FIG.get())) {
            return ModBlocks.FIG_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.GOOSEBERRY.get())) {
            return ModBlocks.GOOSEBERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.GRAPEFRUIT.get())) {
            return ModBlocks.GRAPEFRUIT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.GUAVA.get())) {
            return ModBlocks.GUAVA_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.JACK_FRUIT.get())) {
            return ModBlocks.JACK_FRUIT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.KIWI.get())) {
            return ModBlocks.KIWI_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.LEMON.get())) {
            return ModBlocks.LEMON_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.LIME.get())) {
            return ModBlocks.LIME_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.MANGO_JUICE.get())) {
            return ModBlocks.MANGO_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.NECTARINE.get())) {
            return ModBlocks.NECTARINE_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.ORANGE.get())) {
            return ModBlocks.ORANGE_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.PAPAYA.get())) {
            return ModBlocks.PAPAYA_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.PASSION_FRUIT.get())) {
            return ModBlocks.PASSION_FRUIT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.PEAR.get())) {
            return ModBlocks.PEAR_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.PINEAPPLE.get())) {
            return ModBlocks.PINEAPPLE_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.PLUM.get())) {
            return ModBlocks.PLUM_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.REDCURRANT.get())) {
            return ModBlocks.REDCURRANT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.STAR_FRUIT.get())) {
            return ModBlocks.STAR_FRUIT_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.STRAWBERRY.get())) {
            return ModBlocks.STRAWBERRY_BUSH.get();
        }
        if(Objects.equals(fruit, ModItems.YUZU.get())) {
            return ModBlocks.YUZU_BUSH.get();
        }
        return ModBlocks.APRICOT_BUSH.get();
    }
}
