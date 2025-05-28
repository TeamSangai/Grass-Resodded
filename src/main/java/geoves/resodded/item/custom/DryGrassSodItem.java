package geoves.resodded.item.custom;

import geoves.resodded.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class DryGrassSodItem extends Item {
    private static final Map<Block, Block> DRY_GRASS_SOD_MAP =
            Map.of(
                    Blocks.DIRT, ModBlocks.DRY_GRASS_DIRT_BLOCK,
                    Blocks.MUD, ModBlocks.DRY_GRASS_MUD_BLOCK,
                    Blocks.STONE, ModBlocks.DRY_GRASS_STONE_BLOCK,
                    Blocks.RED_SAND, ModBlocks.DRY_GRASS_RED_SAND_BLOCK,
                    Blocks.SAND, ModBlocks.DRY_GRASS_SAND_BLOCK
            );

    public DryGrassSodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block selectedblock = world.getBlockState(context.getBlockPos()).getBlock();

        if (DRY_GRASS_SOD_MAP.containsKey(selectedblock)) {
            if (!world.isClient()) {
                world.setBlockState(context.getBlockPos(), DRY_GRASS_SOD_MAP.get(selectedblock).getDefaultState());

                ItemStack sodstack = context.getStack();
                sodstack.decrementUnlessCreative(1, context.getPlayer());
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS);
            }
        }
        return super.useOnBlock(context);
    }
}
