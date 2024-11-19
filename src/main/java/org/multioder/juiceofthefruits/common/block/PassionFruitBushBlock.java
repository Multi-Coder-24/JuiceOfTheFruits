package org.multioder.juiceofthefruits.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import org.multioder.juiceofthefruits.common.init.ModItems;

public class PassionFruitBushBlock extends SweetBerryBushBlock
{
    public PassionFruitBushBlock()
    {
        super(Properties.of().mapColor(MapColor.PLANT).sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY).noCollission().noOcclusion());
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader p_304655_, BlockPos p_57257_, BlockState p_57258_) {
        return new ItemStack(ModItems.PASSION_FRUIT.get());
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState p_316134_, Level p_316429_, BlockPos p_316748_, Player p_316431_, BlockHitResult p_316474_) {
        int i = p_316134_.getValue(AGE);
        boolean flag = i == 3;
        if (i > 1) {
            int j = 1 + p_316429_.random.nextInt(2);
            popResource(p_316429_, p_316748_, new ItemStack(ModItems.PASSION_FRUIT.get(), j + (flag ? 1 : 0)));
            p_316429_.playSound(
                    null, p_316748_, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, 0.8F + p_316429_.random.nextFloat() * 0.4F
            );
            BlockState blockstate = p_316134_.setValue(AGE, Integer.valueOf(1));
            p_316429_.setBlock(p_316748_, blockstate, 2);
            p_316429_.gameEvent(GameEvent.BLOCK_CHANGE, p_316748_, GameEvent.Context.of(p_316431_, blockstate));
            return InteractionResult.sidedSuccess(p_316429_.isClientSide);
        } else {
            return super.useWithoutItem(p_316134_, p_316429_, p_316748_, p_316431_, p_316474_);
        }
    }
}
