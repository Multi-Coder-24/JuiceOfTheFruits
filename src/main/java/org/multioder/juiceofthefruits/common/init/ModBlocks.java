package org.multioder.juiceofthefruits.common.init;

import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.multioder.juiceofthefruits.Main;
import org.multioder.juiceofthefruits.common.block.*;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Main.MODID);

    public static final DeferredBlock<?> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", BlackberryBushBlock::new);
    public static final DeferredBlock<?> BLACKCURRANT_BUSH = BLOCKS.register("blackcurrant_bush",BlackberryBushBlock::new);
    public static final DeferredBlock<?> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush",BlueberryBushBlock::new);
    public static final DeferredBlock<?> CHERRY_BUSH = BLOCKS.register("cherry_bush",CherryBushBlock::new);
    public static final DeferredBlock<?> LEMON_BUSH = BLOCKS.register("lemon_bush",LemonBushBlock::new);
    public static final DeferredBlock<?> LIME_BUSH = BLOCKS.register("lime_bush",LimeBushBlock::new);
    public static final DeferredBlock<?> MANGO_BUSH = BLOCKS.register("mango_bush",MangoBushBlock::new);
    public static final DeferredBlock<?> ORANGE_BUSH = BLOCKS.register("orange_bush",OrangeBushBlock::new);
    public static final DeferredBlock<?> PEAR_BUSH = BLOCKS.register("pear_bush",PearBushBlock::new);
    public static final DeferredBlock<?> REDCURRANT_BUSH = BLOCKS.register("redcurrant_bush",RedcurrantBushBlock::new);
    public static final DeferredBlock<?> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",StrawberryBushBlock::new);
    public static final DeferredBlock<?> DRAGON_FRUIT_BUSH = BLOCKS.register("dragon_fruit_bush",DragonFruitBushBlock::new);
    public static final DeferredBlock<?> APRICOT_BUSH = BLOCKS.register("apricot_bush",ApricotBushBlock::new);
    public static final DeferredBlock<?> CRANBERRY_BUSH = BLOCKS.register("cranberry_bush",CranberryBushBlock::new);
    public static final DeferredBlock<?> ELDERBERRY_BUSH = BLOCKS.register("elderberry_bush",ElderberryBushBlock::new);
    public static final DeferredBlock<?> FIG_BUSH = BLOCKS.register("fig_bush",FigBushBlock::new);
    public static final DeferredBlock<?> GOOSEBERRY_BUSH = BLOCKS.register("gooseberry_bush",GooseberryBushBlock::new);
    public static final DeferredBlock<?> GRAPEFRUIT_BUSH = BLOCKS.register("grapefruit_bush",GrapefruitBushBlock::new);
    public static final DeferredBlock<?> GUAVA_BUSH = BLOCKS.register("guava_bush",GuavaBushBlock::new);
    public static final DeferredBlock<?> JACK_FRUIT_BUSH = BLOCKS.register("jack_fruit_bush",JackFruitBushBlock::new);
    public static final DeferredBlock<?> KIWI_BUSH = BLOCKS.register("kiwi_bush",KiwiBushBlock::new);
    public static final DeferredBlock<?> NECTARINE_BUSH = BLOCKS.register("nectarine_bush",NectarineBushBlock::new);
    public static final DeferredBlock<?> PAPAYA_BUSH = BLOCKS.register("papaya_bush",PapayaBushBlock::new);
    public static final DeferredBlock<?> PASSION_FRUIT_BUSH = BLOCKS.register("passion_fruit_bush",PassionFruitBushBlock::new);
    public static final DeferredBlock<?> PINEAPPLE_BUSH = BLOCKS.register("pineapple_bush",PineappleBushBlock::new);
    public static final DeferredBlock<?> PLUM_BUSH = BLOCKS.register("plum_bush",PlumBushBlock::new);
    public static final DeferredBlock<?> STAR_FRUIT_BUSH = BLOCKS.register("star_fruit_bush",StarFruitBushBlock::new);
    public static final DeferredBlock<?> YUZU_BUSH = BLOCKS.register("yuzu_bush",YuzuBushBlock::new);

}
