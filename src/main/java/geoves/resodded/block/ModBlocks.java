package geoves.resodded.block;

import geoves.resodded.GrassResodded;
import geoves.resodded.block.custom.DryGrassMudBlock;
import geoves.resodded.block.custom.DryGrassWithDirt;
import geoves.resodded.block.custom.DryGrassWithSand;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.MudBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block DRY_GRASS_DIRT_BLOCK = registerBlock("dry_grass_dirt_block",
            new Block(DryGrassWithDirt.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_dirt_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block DRY_GRASS_MUD_BLOCK = registerBlock("dry_grass_mud_block",
            new Block(MudBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_mud_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));


    public static final Block DRY_GRASS_SAND_BLOCK = registerBlock("dry_grass_sand_block",
            new Block(DryGrassWithSand.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_sand_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block DRY_GRASS_RED_SAND_BLOCK = registerBlock("dry_grass_red_sand_block",
            new Block(DryGrassWithSand.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_red_sand_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GrassResodded.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GrassResodded.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GrassResodded.MOD_ID, name)))
                        .useBlockPrefixedTranslationKey()));
    }

    public static void registerModBlocks() {
        GrassResodded.LOGGER.info("Registering Grass Blocks From " + GrassResodded.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.DRY_GRASS_DIRT_BLOCK); entries.add(ModBlocks.DRY_GRASS_SAND_BLOCK);
            entries.add(ModBlocks.DRY_GRASS_RED_SAND_BLOCK); entries.add(ModBlocks.DRY_GRASS_MUD_BLOCK);
        });
    }
}
