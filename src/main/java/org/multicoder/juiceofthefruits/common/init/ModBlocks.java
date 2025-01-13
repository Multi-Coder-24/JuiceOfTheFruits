package org.multicoder.juiceofthefruits.common.init;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.juiceofthefruits.Juiceofthefruits;
import org.multicoder.juiceofthefruits.common.block.*;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(Juiceofthefruits.MODID);

    public static final DeferredHolder<Block,Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", () -> new BaseBushBlock(ModItems.BLACKBERRY));
    public static final DeferredHolder<Block,Block> BLACKCURRANT_BUSH = BLOCKS.register("blackcurrant_bush", () -> new BaseBushBlock(ModItems.BLACKCURRANT));
    public static final DeferredHolder<Block,Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush",() -> new BaseBushBlock(ModItems.BLUEBERRY));
    public static final DeferredHolder<Block,Block> CHERRY_BUSH = BLOCKS.register("cherry_bush",() -> new BaseBushBlock(ModItems.CHERRY));
    public static final DeferredHolder<Block,Block> LEMON_BUSH = BLOCKS.register("lemon_bush",() -> new BaseBushBlock(ModItems.LEMON));
    public static final DeferredHolder<Block,Block> LIME_BUSH = BLOCKS.register("lime_bush",() -> new BaseBushBlock(ModItems.LIME));
    public static final DeferredHolder<Block,Block> MANGO_BUSH = BLOCKS.register("mango_bush",() -> new BaseBushBlock(ModItems.MANGO));
    public static final DeferredHolder<Block,Block> ORANGE_BUSH = BLOCKS.register("orange_bush",() -> new BaseBushBlock(ModItems.ORANGE));
    public static final DeferredHolder<Block,Block> PEAR_BUSH = BLOCKS.register("pear_bush",() -> new BaseBushBlock(ModItems.PEAR));
    public static final DeferredHolder<Block,Block> REDCURRANT_BUSH = BLOCKS.register("redcurrant_bush",() -> new BaseBushBlock(ModItems.REDCURRANT));
    public static final DeferredHolder<Block,Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",() -> new BaseBushBlock(ModItems.STRAWBERRY));
    public static final DeferredHolder<Block,Block> DRAGON_FRUIT_BUSH = BLOCKS.register("dragon_fruit_bush",() -> new BaseBushBlock(ModItems.DRAGON_FRUIT));
    public static final DeferredHolder<Block,Block> APRICOT_BUSH = BLOCKS.register("apricot_bush",() -> new BaseBushBlock(ModItems.APRICOT));
    public static final DeferredHolder<Block,Block> CRANBERRY_BUSH = BLOCKS.register("cranberry_bush",() -> new BaseBushBlock(ModItems.CRANBERRY));
    public static final DeferredHolder<Block,Block> ELDERBERRY_BUSH = BLOCKS.register("elderberry_bush",() -> new BaseBushBlock(ModItems.ELDERBERRY));
    public static final DeferredHolder<Block,Block> FIG_BUSH = BLOCKS.register("fig_bush",() -> new BaseBushBlock(ModItems.FIG));
    public static final DeferredHolder<Block,Block> GOOSEBERRY_BUSH = BLOCKS.register("gooseberry_bush",() -> new BaseBushBlock(ModItems.GOOSEBERRY));
    public static final DeferredHolder<Block,Block> GRAPEFRUIT_BUSH = BLOCKS.register("grapefruit_bush",() -> new BaseBushBlock(ModItems.GRAPEFRUIT));
    public static final DeferredHolder<Block,Block> GUAVA_BUSH = BLOCKS.register("guava_bush",() -> new BaseBushBlock(ModItems.GUAVA));
    public static final DeferredHolder<Block,Block> JACK_FRUIT_BUSH = BLOCKS.register("jack_fruit_bush",() -> new BaseBushBlock(ModItems.JACK_FRUIT_JUICE));
    public static final DeferredHolder<Block,Block> KIWI_BUSH = BLOCKS.register("kiwi_bush",() -> new BaseBushBlock(ModItems.KIWI));
    public static final DeferredHolder<Block,Block> NECTARINE_BUSH = BLOCKS.register("nectarine_bush",() -> new BaseBushBlock(ModItems.NECTARINE));
    public static final DeferredHolder<Block,Block> PAPAYA_BUSH = BLOCKS.register("papaya_bush",() -> new BaseBushBlock(ModItems.PAPAYA));
    public static final DeferredHolder<Block,Block> PASSION_FRUIT_BUSH = BLOCKS.register("passion_fruit_bush",() -> new BaseBushBlock(ModItems.PASSION_FRUIT));
    public static final DeferredHolder<Block,Block> PINEAPPLE_BUSH = BLOCKS.register("pineapple_bush",() -> new BaseBushBlock(ModItems.PINEAPPLE));
    public static final DeferredHolder<Block,Block> PLUM_BUSH = BLOCKS.register("plum_bush",() -> new BaseBushBlock(ModItems.PLUM));
    public static final DeferredHolder<Block,Block> STAR_FRUIT_BUSH = BLOCKS.register("star_fruit_bush",() -> new BaseBushBlock(ModItems.STAR_FRUIT));
    public static final DeferredHolder<Block,Block> YUZU_BUSH = BLOCKS.register("yuzu_bush",() -> new BaseBushBlock(ModItems.YUZU));

}
