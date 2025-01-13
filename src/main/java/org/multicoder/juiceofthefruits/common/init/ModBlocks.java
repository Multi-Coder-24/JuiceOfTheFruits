package org.multicoder.juiceofthefruits.common.init;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multicoder.juiceofthefruits.Juiceofthefruits;
import org.multicoder.juiceofthefruits.common.block.*;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(Juiceofthefruits.MODID);

    public static final DeferredHolder<Block,Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", BlackberryBushBlock::new);
    public static final DeferredHolder<Block,Block> BLACKCURRANT_BUSH = BLOCKS.register("blackcurrant_bush", BlackcurrantBushBlock::new);
    public static final DeferredHolder<Block,Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush",BlueberryBushBlock::new);
    public static final DeferredHolder<Block,Block> CHERRY_BUSH = BLOCKS.register("cherry_bush",CherryBushBlock::new);
    public static final DeferredHolder<Block,Block> LEMON_BUSH = BLOCKS.register("lemon_bush",LemonBushBlock::new);
    public static final DeferredHolder<Block,Block> LIME_BUSH = BLOCKS.register("lime_bush",LimeBushBlock::new);
    public static final DeferredHolder<Block,Block> MANGO_BUSH = BLOCKS.register("mango_bush",MangoBushBlock::new);
    public static final DeferredHolder<Block,Block> ORANGE_BUSH = BLOCKS.register("orange_bush",OrangeBushBlock::new);
    public static final DeferredHolder<Block,Block> PEAR_BUSH = BLOCKS.register("pear_bush",PearBushBlock::new);
    public static final DeferredHolder<Block,Block> REDCURRANT_BUSH = BLOCKS.register("redcurrant_bush",RedcurrantBushBlock::new);
    public static final DeferredHolder<Block,Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",StrawberryBushBlock::new);
    public static final DeferredHolder<Block,Block> DRAGON_FRUIT_BUSH = BLOCKS.register("dragon_fruit_bush",DragonFruitBushBlock::new);
    public static final DeferredHolder<Block,Block> APRICOT_BUSH = BLOCKS.register("apricot_bush",ApricotBushBlock::new);
    public static final DeferredHolder<Block,Block> CRANBERRY_BUSH = BLOCKS.register("cranberry_bush",CranberryBushBlock::new);
    public static final DeferredHolder<Block,Block> ELDERBERRY_BUSH = BLOCKS.register("elderberry_bush",ElderberryBushBlock::new);
    public static final DeferredHolder<Block,Block> FIG_BUSH = BLOCKS.register("fig_bush",FigBushBlock::new);
    public static final DeferredHolder<Block,Block> GOOSEBERRY_BUSH = BLOCKS.register("gooseberry_bush",GooseberryBushBlock::new);
    public static final DeferredHolder<Block,Block> GRAPEFRUIT_BUSH = BLOCKS.register("grapefruit_bush",GrapefruitBushBlock::new);
    public static final DeferredHolder<Block,Block> GUAVA_BUSH = BLOCKS.register("guava_bush",GuavaBushBlock::new);
    public static final DeferredHolder<Block,Block> JACK_FRUIT_BUSH = BLOCKS.register("jack_fruit_bush",JackFruitBushBlock::new);
    public static final DeferredHolder<Block,Block> KIWI_BUSH = BLOCKS.register("kiwi_bush",KiwiBushBlock::new);
    public static final DeferredHolder<Block,Block> NECTARINE_BUSH = BLOCKS.register("nectarine_bush",NectarineBushBlock::new);
    public static final DeferredHolder<Block,Block> PAPAYA_BUSH = BLOCKS.register("papaya_bush",PapayaBushBlock::new);
    public static final DeferredHolder<Block,Block> PASSION_FRUIT_BUSH = BLOCKS.register("passion_fruit_bush",PassionFruitBushBlock::new);
    public static final DeferredHolder<Block,Block> PINEAPPLE_BUSH = BLOCKS.register("pineapple_bush",PineappleBushBlock::new);
    public static final DeferredHolder<Block,Block> PLUM_BUSH = BLOCKS.register("plum_bush",PlumBushBlock::new);
    public static final DeferredHolder<Block,Block> STAR_FRUIT_BUSH = BLOCKS.register("star_fruit_bush",StarFruitBushBlock::new);
    public static final DeferredHolder<Block,Block> YUZU_BUSH = BLOCKS.register("yuzu_bush",YuzuBushBlock::new);

}
