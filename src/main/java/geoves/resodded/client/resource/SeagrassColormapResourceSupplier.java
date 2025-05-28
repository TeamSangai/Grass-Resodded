package geoves.resodded.client.resource;

import geoves.resodded.GrassResodded;
import net.minecraft.client.util.RawTextureDataLoader;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.SinglePreparationResourceReloader;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.world.biome.GrassColors;

import java.io.IOException;

public class SeagrassColormapResourceSupplier extends SinglePreparationResourceReloader<int[]> {
    private static final Identifier SEAGRASS_COLORMAP_LOC = Identifier.of(GrassResodded.MOD_ID, "textures/colormap/sea_grass.png");

    public SeagrassColormapResourceSupplier() {
    }

    @Override
    protected int[] prepare(ResourceManager manager, Profiler profiler) {
        return new int[0];
    }

    protected int[] tryLoad(ResourceManager resourceManager, Profiler profiler) {
        try {
            return RawTextureDataLoader.loadRawTextureData(resourceManager, SEAGRASS_COLORMAP_LOC);
        } catch (IOException iOException) {
            throw new IllegalStateException("Failed to load sea grass color texture", iOException);
        }
    }

    protected void apply(int[] is, ResourceManager resourceManager, Profiler profiler) {
        GrassColors.setColorMap(is);
    }
}

