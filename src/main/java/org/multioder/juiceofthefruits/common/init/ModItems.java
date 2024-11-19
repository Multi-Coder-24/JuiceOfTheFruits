package org.multioder.juiceofthefruits.common.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
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
    public static final DeferredItem<?> DRAGON_FRUIT = ITEMS.register("dragon_fruit",() -> new ItemNameBlockItem(ModBlocks.DRAGON_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> APRICOT = ITEMS.register("apricot",() -> new ItemNameBlockItem(ModBlocks.APRICOT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> CRANBERRY = ITEMS.register("cranberry",() -> new ItemNameBlockItem(ModBlocks.CRANBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> ELDERBERRY = ITEMS.register("elderberry",() -> new ItemNameBlockItem(ModBlocks.ELDERBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> FIG = ITEMS.register("fig",() -> new ItemNameBlockItem(ModBlocks.FIG_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> GOOSEBERRY = ITEMS.register("gooseberry",() -> new ItemNameBlockItem(ModBlocks.GOOSEBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> GRAPEFRUIT = ITEMS.register("grapefruit",() -> new ItemNameBlockItem(ModBlocks.GRAPEFRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> GUAVA = ITEMS.register("guava",() -> new ItemNameBlockItem(ModBlocks.GUAVA_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> JACK_FRUIT = ITEMS.register("jack_fruit",() -> new ItemNameBlockItem(ModBlocks.JACK_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> KIWI = ITEMS.register("kiwi",() -> new ItemNameBlockItem(ModBlocks.KIWI_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> NECTARINE = ITEMS.register("nectarine",() -> new ItemNameBlockItem(ModBlocks.NECTARINE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> PAPAYA = ITEMS.register("papaya",() -> new ItemNameBlockItem(ModBlocks.PAPAYA_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> PASSION_FRUIT = ITEMS.register("passion_fruit",() -> new ItemNameBlockItem(ModBlocks.PASSION_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> PINEAPPLE = ITEMS.register("pineapple",() -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> PLUM = ITEMS.register("plum",() -> new ItemNameBlockItem(ModBlocks.PLUM_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> STAR_FRUIT = ITEMS.register("star_fruit",() -> new ItemNameBlockItem(ModBlocks.STAR_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));
    public static final DeferredItem<?> YUZU = ITEMS.register("yuzu",() -> new ItemNameBlockItem(ModBlocks.YUZU_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true,1f, Optional.empty(),new ArrayList<>()))));

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
    public static final DeferredItem<?> DRAGON_FRUIT_JUICE = ITEMS.register("dragon_fruit_juice", ItemDrinkable::new);
    public static final DeferredItem<?> APRICOT_JUICE = ITEMS.register("apricot_juice", ItemDrinkable::new);
    public static final DeferredItem<?> CRANBERRY_JUICE = ITEMS.register("cranberry_juice", ItemDrinkable::new);
    public static final DeferredItem<?> ELDERBERRY_JUICE = ITEMS.register("elderberry_juice", ItemDrinkable::new);
    public static final DeferredItem<?> FIG_JUICE = ITEMS.register("fig_juice", ItemDrinkable::new);
    public static final DeferredItem<?> GOOSEBERRY_JUICE = ITEMS.register("gooseberry_juice", ItemDrinkable::new);
    public static final DeferredItem<?> GRAPEFRUIT_JUICE = ITEMS.register("grapefruit_juice", ItemDrinkable::new);
    public static final DeferredItem<?> GUAVA_JUICE = ITEMS.register("guava_juice", ItemDrinkable::new);
    public static final DeferredItem<?> JACK_FRUIT_JUICE = ITEMS.register("jack_fruit_juice", ItemDrinkable::new);
    public static final DeferredItem<?> KIWI_JUICE = ITEMS.register("kiwi_juice", ItemDrinkable::new);
    public static final DeferredItem<?> NECTARINE_JUICE = ITEMS.register("nectarine_juice", ItemDrinkable::new);
    public static final DeferredItem<?> PAPAYA_JUICE = ITEMS.register("papaya_juice", ItemDrinkable::new);
    public static final DeferredItem<?> PASSION_FRUIT_JUICE = ITEMS.register("passion_fruit_juice", ItemDrinkable::new);
    public static final DeferredItem<?> PINEAPPLE_JUICE = ITEMS.register("pineapple_juice", ItemDrinkable::new);
    public static final DeferredItem<?> PLUM_JUICE = ITEMS.register("plum_juice", ItemDrinkable::new);
    public static final DeferredItem<?> STAR_FRUIT_JUICE = ITEMS.register("star_fruit_juice", ItemDrinkable::new);
    public static final DeferredItem<?> YUZU_JUICE = ITEMS.register("yuzu_juice", ItemDrinkable::new);
}
