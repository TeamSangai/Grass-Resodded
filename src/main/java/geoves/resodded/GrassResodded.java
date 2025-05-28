package geoves.resodded;

import geoves.resodded.block.ModBlocks;
import geoves.resodded.item.ResoddedItems;
import geoves.resodded.world.gen.ModWorldGenerator;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrassResodded implements ModInitializer {
	public static final String MOD_ID = "grass-resodded";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ResoddedItems.registerResoddedItems();
		ModBlocks.registerModBlocks();
		ModWorldGenerator.generateModWorldGen();
		LOGGER.info("LOADS OF GRASSES!");
	}
}