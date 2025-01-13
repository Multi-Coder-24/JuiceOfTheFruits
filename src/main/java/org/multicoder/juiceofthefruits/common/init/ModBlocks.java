package org.multicoder.juiceofthefruits.common.init;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.juiceofthefruits.Juiceofthefruits;
import org.multicoder.juiceofthefruits.common.block.*;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(Juiceofthefruits.MODID);

    public static final DeferredHolder<Block,Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", () -> new BlackberryBushBlock("blackberry_bush"));
    public static final DeferredHolder<Block,Block> BLACKCURRANT_BUSH = BLOCKS.register("blackcurrant_bush",() ->  new BlackcurrantBushBlock("blackcurrant_bush"));
    public static final DeferredHolder<Block,Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush",() -> new BlueberryBushBlock("blueberry_bush"));
    public static final DeferredHolder<Block,Block> CHERRY_BUSH = BLOCKS.register("cherry_bush",() -> new CherryBushBlock("cherry_bush"));
    public static final DeferredHolder<Block,Block> LEMON_BUSH = BLOCKS.register("lemon_bush",() -> new LemonBushBlock("lemon_bush"));
    public static final DeferredHolder<Block,Block> LIME_BUSH = BLOCKS.register("lime_bush",() ->new  LimeBushBlock("lime_bush"));
    public static final DeferredHolder<Block,Block> MANGO_BUSH = BLOCKS.register("mango_bush",() -> new MangoBushBlock("mango_bush"));
    public static final DeferredHolder<Block,Block> ORANGE_BUSH = BLOCKS.register("orange_bush",() -> new OrangeBushBlock("orange_bush"));
    public static final DeferredHolder<Block,Block> PEAR_BUSH = BLOCKS.register("pear_bush",() -> new PearBushBlock("pear_bush"));
    public static final DeferredHolder<Block,Block> REDCURRANT_BUSH = BLOCKS.register("redcurrant_bush",() -> new RedcurrantBushBlock("redcurrant_bush"));
    public static final DeferredHolder<Block,Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",() -> new StrawberryBushBlock("strawberry_bush"));
    public static final DeferredHolder<Block,Block> DRAGON_FRUIT_BUSH = BLOCKS.register("dragon_fruit_bush",() -> new DragonFruitBushBlock("dragon_fruit_bush"));
    public static final DeferredHolder<Block,Block> APRICOT_BUSH = BLOCKS.register("apricot_bush",() -> new ApricotBushBlock("apricot_bush"));
    public static final DeferredHolder<Block,Block> CRANBERRY_BUSH = BLOCKS.register("cranberry_bush",() -> new CranberryBushBlock("cranberry_bush"));
    public static final DeferredHolder<Block,Block> ELDERBERRY_BUSH = BLOCKS.register("elderberry_bush",() -> new ElderberryBushBlock("elderberry_bush"));
    public static final DeferredHolder<Block,Block> FIG_BUSH = BLOCKS.register("fig_bush",() -> new FigBushBlock("fig_bush"));
    public static final DeferredHolder<Block,Block> GOOSEBERRY_BUSH = BLOCKS.register("gooseberry_bush",() -> new GooseberryBushBlock("gooseberry_bush"));
    public static final DeferredHolder<Block,Block> GRAPEFRUIT_BUSH = BLOCKS.register("grapefruit_bush",() -> new GrapefruitBushBlock("grapefruit_bush"));
    public static final DeferredHolder<Block,Block> GUAVA_BUSH = BLOCKS.register("guava_bush",() -> new GuavaBushBlock("guava_bush"));
    public static final DeferredHolder<Block,Block> JACK_FRUIT_BUSH = BLOCKS.register("jack_fruit_bush",() -> new JackFruitBushBlock("jack_fruit_bush"));
    public static final DeferredHolder<Block,Block> KIWI_BUSH = BLOCKS.register("kiwi_bush",() -> new KiwiBushBlock("kiwi_bush"));
    public static final DeferredHolder<Block,Block> NECTARINE_BUSH = BLOCKS.register("nectarine_bush",() -> new NectarineBushBlock("nectarine_bush"));
    public static final DeferredHolder<Block,Block> PAPAYA_BUSH = BLOCKS.register("papaya_bush",() -> new PapayaBushBlock("papaya_bush"));
    public static final DeferredHolder<Block,Block> PASSION_FRUIT_BUSH = BLOCKS.register("passion_fruit_bush",() ->new  PassionFruitBushBlock("passion_fruit_bush"));
    public static final DeferredHolder<Block,Block> PINEAPPLE_BUSH = BLOCKS.register("pineapple_bush",() -> new PineappleBushBlock("pineapple_bush"));
    public static final DeferredHolder<Block,Block> PLUM_BUSH = BLOCKS.register("plum_bush",() -> new PlumBushBlock("plum_bush"));
    public static final DeferredHolder<Block,Block> STAR_FRUIT_BUSH = BLOCKS.register("star_fruit_bush",() -> new StarFruitBushBlock("star_fruit_bush"));
    public static final DeferredHolder<Block,Block> YUZU_BUSH = BLOCKS.register("yuzu_bush",() -> new YuzuBushBlock("yuzu_bush"));

}
