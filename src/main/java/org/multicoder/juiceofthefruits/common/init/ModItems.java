package org.multicoder.juiceofthefruits.common.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.juiceofthefruits.Juiceofthefruits;
import org.multicoder.juiceofthefruits.common.item.ItemDrinkable;

import java.util.ArrayList;
import java.util.Optional;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(Juiceofthefruits.MODID);

    public static final DeferredHolder<Item,Item> BLACKBERRY = ITEMS.register("blackberry",() -> new BlockItem(ModBlocks.BLACKBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"blackberry")))));
    public static final DeferredHolder<Item,Item> BLACKCURRANT = ITEMS.register("blackcurrant",() -> new BlockItem(ModBlocks.BLACKCURRANT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"blackcurrant")))));
    public static final DeferredHolder<Item,Item> BLUEBERRY = ITEMS.register("blueberry",() -> new BlockItem(ModBlocks.BLUEBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"blueberry")))));
    public static final DeferredHolder<Item,Item> CHERRY = ITEMS.register("cherry",() -> new BlockItem(ModBlocks.CHERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"cherry")))));
    public static final DeferredHolder<Item,Item> LEMON = ITEMS.register("lemon",() -> new BlockItem(ModBlocks.LEMON_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"lemon")))));
    public static final DeferredHolder<Item,Item> LIME = ITEMS.register("lime",() -> new BlockItem(ModBlocks.LIME_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"lime")))));
    public static final DeferredHolder<Item,Item> MANGO = ITEMS.register("mango",() -> new BlockItem(ModBlocks.MANGO_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"mango")))));
    public static final DeferredHolder<Item,Item> ORANGE = ITEMS.register("orange",() -> new BlockItem(ModBlocks.ORANGE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"orange")))));
    public static final DeferredHolder<Item,Item> PEAR = ITEMS.register("pear",() -> new BlockItem(ModBlocks.PEAR_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"pear")))));
    public static final DeferredHolder<Item,Item> REDCURRANT = ITEMS.register("redcurrant",() -> new BlockItem(ModBlocks.REDCURRANT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"redcurrant")))));
    public static final DeferredHolder<Item,Item> STRAWBERRY = ITEMS.register("strawberry",() -> new BlockItem(ModBlocks.STRAWBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"strawberry")))));
    public static final DeferredHolder<Item,Item> DRAGON_FRUIT = ITEMS.register("dragon_fruit",() -> new BlockItem(ModBlocks.DRAGON_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"dragon_fruit")))));
    public static final DeferredHolder<Item,Item> APRICOT = ITEMS.register("apricot",() -> new BlockItem(ModBlocks.APRICOT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"apricot")))));
    public static final DeferredHolder<Item,Item> CRANBERRY = ITEMS.register("cranberry",() -> new BlockItem(ModBlocks.CRANBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"cranberry")))));
    public static final DeferredHolder<Item,Item> ELDERBERRY = ITEMS.register("elderberry",() -> new BlockItem(ModBlocks.ELDERBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"elderberry")))));
    public static final DeferredHolder<Item,Item> FIG = ITEMS.register("fig",() -> new BlockItem(ModBlocks.FIG_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"fig")))));
    public static final DeferredHolder<Item,Item> GOOSEBERRY = ITEMS.register("gooseberry",() -> new BlockItem(ModBlocks.GOOSEBERRY_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"gooseberry")))));
    public static final DeferredHolder<Item,Item> GRAPEFRUIT = ITEMS.register("grapefruit",() -> new BlockItem(ModBlocks.GRAPEFRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"grapefruit")))));
    public static final DeferredHolder<Item,Item> GUAVA = ITEMS.register("guava",() -> new BlockItem(ModBlocks.GUAVA_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"guava")))));
    public static final DeferredHolder<Item,Item> JACK_FRUIT = ITEMS.register("jack_fruit",() -> new BlockItem(ModBlocks.JACK_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"jack_fruit")))));
    public static final DeferredHolder<Item,Item> KIWI = ITEMS.register("kiwi",() -> new BlockItem(ModBlocks.KIWI_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"kiwi")))));
    public static final DeferredHolder<Item,Item> NECTARINE = ITEMS.register("nectarine",() -> new BlockItem(ModBlocks.NECTARINE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"nectarine")))));
    public static final DeferredHolder<Item,Item> PAPAYA = ITEMS.register("papaya",() -> new BlockItem(ModBlocks.PAPAYA_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"papaya")))));
    public static final DeferredHolder<Item,Item> PASSION_FRUIT = ITEMS.register("passion_fruit",() -> new BlockItem(ModBlocks.PASSION_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"passion_fruit")))));
    public static final DeferredHolder<Item,Item> PINEAPPLE = ITEMS.register("pineapple",() -> new BlockItem(ModBlocks.PINEAPPLE_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"pineapple")))));
    public static final DeferredHolder<Item,Item> PLUM = ITEMS.register("plum",() -> new BlockItem(ModBlocks.PLUM_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"plum")))));
    public static final DeferredHolder<Item,Item> STAR_FRUIT = ITEMS.register("star_fruit",() -> new BlockItem(ModBlocks.STAR_FRUIT_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"star_fruit")))));
    public static final DeferredHolder<Item,Item> YUZU = ITEMS.register("yuzu",() -> new BlockItem(ModBlocks.YUZU_BUSH.get(),new Item.Properties().food(new FoodProperties(6,0.8f,true)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Juiceofthefruits.MODID,"yuzu")))));

    public static final DeferredHolder<Item,Item> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice", () -> new ItemDrinkable("blackberry_juice"));
    public static final DeferredHolder<Item,Item> BLACKCURRANT_JUICE = ITEMS.register("blackcurrant_juice", () -> new ItemDrinkable("blackcurrant_juice"));
    public static final DeferredHolder<Item,Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", () -> new ItemDrinkable("blueberry_juice"));
    public static final DeferredHolder<Item,Item> CHERRY_JUICE = ITEMS.register("cherry_juice", () -> new ItemDrinkable("cherry_juice"));
    public static final DeferredHolder<Item,Item> LEMON_JUICE = ITEMS.register("lemon_juice", () -> new ItemDrinkable("lemon_juice"));
    public static final DeferredHolder<Item,Item> LIME_JUICE = ITEMS.register("lime_juice", () -> new ItemDrinkable("lime_juice"));
    public static final DeferredHolder<Item,Item> MANGO_JUICE = ITEMS.register("mango_juice", () -> new ItemDrinkable("mango_juice"));
    public static final DeferredHolder<Item,Item> ORANGE_JUICE = ITEMS.register("orange_juice",() -> new  ItemDrinkable("orange_juice"));
    public static final DeferredHolder<Item,Item> PEAR_JUICE = ITEMS.register("pear_juice", () -> new ItemDrinkable("pear_juice"));
    public static final DeferredHolder<Item,Item> REDCURRANT_JUICE = ITEMS.register("redcurrant_juice", () -> new ItemDrinkable("redcurrant_juice"));
    public static final DeferredHolder<Item,Item>STRAWBERRY_JUICE = ITEMS.register("strawberry_juice", () -> new ItemDrinkable("strawberry_juice"));
    public static final DeferredHolder<Item,Item> DRAGON_FRUIT_JUICE = ITEMS.register("dragon_fruit_juice", () -> new ItemDrinkable("dragon_fruit_juice"));
    public static final DeferredHolder<Item,Item> APRICOT_JUICE = ITEMS.register("apricot_juice", () -> new ItemDrinkable("apricot_juice"));
    public static final DeferredHolder<Item,Item> CRANBERRY_JUICE = ITEMS.register("cranberry_juice", () -> new ItemDrinkable("cranberry_juice"));
    public static final DeferredHolder<Item,Item> ELDERBERRY_JUICE = ITEMS.register("elderberry_juice",() -> new  ItemDrinkable("elderberry_juice"));
    public static final DeferredHolder<Item,Item> FIG_JUICE = ITEMS.register("fig_juice",() -> new  ItemDrinkable("fig_juice"));
    public static final DeferredHolder<Item,Item> GOOSEBERRY_JUICE = ITEMS.register("gooseberry_juice",() -> new  ItemDrinkable("gooseberry_juice"));
    public static final DeferredHolder<Item,Item> GRAPEFRUIT_JUICE = ITEMS.register("grapefruit_juice",() -> new  ItemDrinkable("grapefruit_juice"));
    public static final DeferredHolder<Item,Item> GUAVA_JUICE = ITEMS.register("guava_juice",() -> new  ItemDrinkable("guava_juice"));
    public static final DeferredHolder<Item,Item> JACK_FRUIT_JUICE = ITEMS.register("jack_fruit_juice",() -> new  ItemDrinkable("jack_fruit_juice"));
    public static final DeferredHolder<Item,Item> KIWI_JUICE = ITEMS.register("kiwi_juice",() -> new  ItemDrinkable("kiwi_juice"));
    public static final DeferredHolder<Item,Item> NECTARINE_JUICE = ITEMS.register("nectarine_juice",() -> new  ItemDrinkable("nectarine_juice"));
    public static final DeferredHolder<Item,Item> PAPAYA_JUICE = ITEMS.register("papaya_juice",() -> new  ItemDrinkable("papaya_juice"));
    public static final DeferredHolder<Item,Item> PASSION_FRUIT_JUICE = ITEMS.register("passion_fruit_juice",() -> new  ItemDrinkable("passion_fruit_juice"));
    public static final DeferredHolder<Item,Item> PINEAPPLE_JUICE = ITEMS.register("pineapple_juice",() -> new  ItemDrinkable("pineapple_juice"));
    public static final DeferredHolder<Item,Item> PLUM_JUICE = ITEMS.register("plum_juice",() -> new  ItemDrinkable("plum_juice"));
    public static final DeferredHolder<Item,Item> STAR_FRUIT_JUICE = ITEMS.register("star_fruit_juice",() -> new  ItemDrinkable("star_fruit_juice"));
    public static final DeferredHolder<Item,Item> YUZU_JUICE = ITEMS.register("yuzu_juice",() -> new  ItemDrinkable("yuzu_juice"));


}
