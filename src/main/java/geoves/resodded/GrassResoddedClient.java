package geoves.resodded;

import geoves.resodded.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class GrassResoddedClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASS_MUD_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRASS_STONE_BLOCK, RenderLayer.getCutout());BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEA_GRASS_DIRT_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEA_GRASS_MUD_BLOCK, RenderLayer.getCutout());BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEA_GRASS_SAND_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEA_GRASS_STONE_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YARROW, RenderLayer.getCutout());BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SECENIO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KNIPHOFIA, RenderLayer.getCutout());BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOBE_THISTLE, RenderLayer.getCutout());
    }
}
