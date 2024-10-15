package org.multioder.juiceofthefruits.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multioder.juiceofthefruits.Main;
import org.multioder.juiceofthefruits.common.item.ItemDrinkable;

import java.util.ArrayList;
import java.util.Optional;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MODID);

    public static final DeferredItem<?> BLACKBERRY = ITEMS.register("blackberry",() -> new ItemNameBlockItem(ModBlocks.BLACKBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> BLACKCURRANT = ITEMS.register("blackcurrant",() -> new ItemNameBlockItem(ModBlocks.BLACKCURRANT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> BLUEBERRY = ITEMS.register("blueberry",() -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> CHERRY = ITEMS.register("cherry",() -> new ItemNameBlockItem(ModBlocks.CHERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> LEMON = ITEMS.register("lemon",() -> new ItemNameBlockItem(ModBlocks.LEMON_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> LIME = ITEMS.register("lime",() -> new ItemNameBlockItem(ModBlocks.LIME_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> MANGO = ITEMS.register("mango",() -> new ItemNameBlockItem(ModBlocks.MANGO_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> ORANGE = ITEMS.register("orange",() -> new ItemNameBlockItem(ModBlocks.ORANGE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> PEAR = ITEMS.register("pear",() -> new ItemNameBlockItem(ModBlocks.PEAR_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> REDCURRANT = ITEMS.register("redcurrant",() -> new ItemNameBlockItem(ModBlocks.REDCURRANT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> STRAWBERRY = ITEMS.register("strawberry",() -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));

    public static final DeferredItem<?> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice", ItemDrinkable::new);
    public static final DeferredItem<?> BLACKCURRANT_JUICE = ITEMS.register("blackcurrant_juice", ItemDrinkable::new);
    public static final DeferredItem<?> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", ItemDrinkable::new);
    public static final DeferredItem<?> CHERRY_JUICE = ITEMS.register("cherry_juice", ItemDrinkable::new);
    public static final DeferredItem<?> LEMON_JUICE = ITEMS.register("lemon_juice", ItemDrinkable::new);
    public static final DeferredItem<?> LIME_JUICE = ITEMS.register("lime_juice", ItemDrinkable::new);
    public static final DeferredItem<?> MANGO_JUICE = ITEMS.register("mango_juice", ItemDrinkable::new);
    public static final DeferredItem<?> ORANGE_JUICE = ITEMS.register("orange_juice", ItemDrinkable::new);
    public static final DeferredItem<?> PEAR_JUICE = ITEMS.register("pear_juice", ItemDrinkable::new);
    public static final DeferredItem<?> REDCURRANT_JUICE = ITEMS.register("redcurrant_juice", ItemDrinkable::new);
    public static final DeferredItem<?> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", ItemDrinkable::new);
}
