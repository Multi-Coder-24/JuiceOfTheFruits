package org.multicoder.juiceofthefruits.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.juiceofthefruits.Juiceofthefruits;
import org.multicoder.juiceofthefruits.common.item.ItemDrinkable;

import java.util.ArrayList;
import java.util.Optional;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(Juiceofthefruits.MODID);

    public static final DeferredHolder<Item,Item> BLACKBERRY = ITEMS.register("blackberry",() -> new ItemNameBlockItem(ModBlocks.BLACKBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> BLACKCURRANT = ITEMS.register("blackcurrant",() -> new ItemNameBlockItem(ModBlocks.BLACKCURRANT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> BLUEBERRY = ITEMS.register("blueberry",() -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> CHERRY = ITEMS.register("cherry",() -> new ItemNameBlockItem(ModBlocks.CHERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> LEMON = ITEMS.register("lemon",() -> new ItemNameBlockItem(ModBlocks.LEMON_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> LIME = ITEMS.register("lime",() -> new ItemNameBlockItem(ModBlocks.LIME_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> MANGO = ITEMS.register("mango",() -> new ItemNameBlockItem(ModBlocks.MANGO_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> ORANGE = ITEMS.register("orange",() -> new ItemNameBlockItem(ModBlocks.ORANGE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> PEAR = ITEMS.register("pear",() -> new ItemNameBlockItem(ModBlocks.PEAR_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> REDCURRANT = ITEMS.register("redcurrant",() -> new ItemNameBlockItem(ModBlocks.REDCURRANT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> STRAWBERRY = ITEMS.register("strawberry",() -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> DRAGON_FRUIT = ITEMS.register("dragon_fruit",() -> new ItemNameBlockItem(ModBlocks.DRAGON_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> APRICOT = ITEMS.register("apricot",() -> new ItemNameBlockItem(ModBlocks.APRICOT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> CRANBERRY = ITEMS.register("cranberry",() -> new ItemNameBlockItem(ModBlocks.CRANBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> ELDERBERRY = ITEMS.register("elderberry",() -> new ItemNameBlockItem(ModBlocks.ELDERBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> FIG = ITEMS.register("fig",() -> new ItemNameBlockItem(ModBlocks.FIG_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> GOOSEBERRY = ITEMS.register("gooseberry",() -> new ItemNameBlockItem(ModBlocks.GOOSEBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> GRAPEFRUIT = ITEMS.register("grapefruit",() -> new ItemNameBlockItem(ModBlocks.GRAPEFRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> GUAVA = ITEMS.register("guava",() -> new ItemNameBlockItem(ModBlocks.GUAVA_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> JACK_FRUIT = ITEMS.register("jack_fruit",() -> new ItemNameBlockItem(ModBlocks.JACK_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> KIWI = ITEMS.register("kiwi",() -> new ItemNameBlockItem(ModBlocks.KIWI_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> NECTARINE = ITEMS.register("nectarine",() -> new ItemNameBlockItem(ModBlocks.NECTARINE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> PAPAYA = ITEMS.register("papaya",() -> new ItemNameBlockItem(ModBlocks.PAPAYA_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> PASSION_FRUIT = ITEMS.register("passion_fruit",() -> new ItemNameBlockItem(ModBlocks.PASSION_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> PINEAPPLE = ITEMS.register("pineapple",() -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> PLUM = ITEMS.register("plum",() -> new ItemNameBlockItem(ModBlocks.PLUM_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> STAR_FRUIT = ITEMS.register("star_fruit",() -> new ItemNameBlockItem(ModBlocks.STAR_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredHolder<Item,Item> YUZU = ITEMS.register("yuzu",() -> new ItemNameBlockItem(ModBlocks.YUZU_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));

    public static final DeferredHolder<Item,Item> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> BLACKCURRANT_JUICE = ITEMS.register("blackcurrant_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> CHERRY_JUICE = ITEMS.register("cherry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> LEMON_JUICE = ITEMS.register("lemon_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> LIME_JUICE = ITEMS.register("lime_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> MANGO_JUICE = ITEMS.register("mango_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> ORANGE_JUICE = ITEMS.register("orange_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> PEAR_JUICE = ITEMS.register("pear_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> REDCURRANT_JUICE = ITEMS.register("redcurrant_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item>STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> DRAGON_FRUIT_JUICE = ITEMS.register("dragon_fruit_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> APRICOT_JUICE = ITEMS.register("apricot_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> CRANBERRY_JUICE = ITEMS.register("cranberry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> ELDERBERRY_JUICE = ITEMS.register("elderberry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> FIG_JUICE = ITEMS.register("fig_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> GOOSEBERRY_JUICE = ITEMS.register("gooseberry_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> GRAPEFRUIT_JUICE = ITEMS.register("grapefruit_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> GUAVA_JUICE = ITEMS.register("guava_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> JACK_FRUIT_JUICE = ITEMS.register("jack_fruit_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> KIWI_JUICE = ITEMS.register("kiwi_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> NECTARINE_JUICE = ITEMS.register("nectarine_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> PAPAYA_JUICE = ITEMS.register("papaya_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> PASSION_FRUIT_JUICE = ITEMS.register("passion_fruit_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> PINEAPPLE_JUICE = ITEMS.register("pineapple_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> PLUM_JUICE = ITEMS.register("plum_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> STAR_FRUIT_JUICE = ITEMS.register("star_fruit_juice", ItemDrinkable::new);
    public static final DeferredHolder<Item,Item> YUZU_JUICE = ITEMS.register("yuzu_juice", ItemDrinkable::new);


}
