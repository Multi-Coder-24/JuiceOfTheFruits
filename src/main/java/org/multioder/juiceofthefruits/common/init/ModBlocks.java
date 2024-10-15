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
}
