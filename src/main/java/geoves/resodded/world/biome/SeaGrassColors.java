package geoves.resodded.world.biome;

import net.minecraft.world.biome.BiomeColors;

public class SeaGrassColors {
    private static int[] colorMap = new int[65536];

    public SeaGrassColors() {
    }

    public static void setColorMap(int[] map) {
        colorMap = map;
    }

    public static int getColor(double temperature, double downfall) {
        return BiomeColors.getColor(temperature, downfall, colorMap, -65281);
    }

    public static int getDefaultColor() {
        return getColor((double)0.5F, (double)1.0F);
    }
}

