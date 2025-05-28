package geoves.resodded.block;

import geoves.resodded.GrassResodded;
import geoves.resodded.block.custom.*;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.GrassColors;

public class ModBlocks {

    public static final Block DRY_GRASS_DIRT_BLOCK = registerBlock("dry_grass_dirt_block",
            new DryGrassWithDirt(DryGrassWithDirt.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_dirt_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block DRY_GRASS_MUD_BLOCK = registerBlock("dry_grass_mud_block",
            new DryGrassMudBlock(DryGrassMudBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_mud_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block GRASS_MUD_BLOCK = registerBlock("grass_mud_block",
            new GrassMudBlock(GrassMudBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "grass_mud_block"))).mapColor(MapColor.PALE_GREEN).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.WET_GRASS)));

    public static final Block GRASS_STONE_BLOCK = registerBlock("grass_stone_block",
            new GrassyStoneBlock(GrassyStoneBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "grass_stone_block"))).mapColor(MapColor.PALE_GREEN).ticksRandomly().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block DRY_GRASS_STONE_BLOCK = registerBlock("dry_grass_stone_block",
            new Block(DryGrassyStoneBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_stone_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block DRY_GRASS_SAND_BLOCK = registerBlock("dry_grass_sand_block",
            new DryGrassWithSand(new ColorCode(14406560), DryGrassWithSand.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_sand_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block DRY_GRASS_RED_SAND_BLOCK = registerBlock("dry_grass_red_sand_block",
            new DryGrassWithRedSand(new ColorCode(11098145), DryGrassWithRedSand.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "dry_grass_red_sand_block"))).mapColor(MapColor.RAW_IRON_PINK).ticksRandomly().strength(0.6F).sounds(BlockSoundGroup.GRASS)));

    public static final Block SEA_GRASS_MUD_BLOCK = registerBlock("sea_grass_mud_block",
            new SeaGrassMudBlock(SeaGrassMudBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "sea_grass_mud_block"))).mapColor(MapColor.EMERALD_GREEN).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.WET_GRASS)));

    public static final Block SEA_GRASS_DIRT_BLOCK = registerBlock("sea_grass_dirt_block",
            new SeaGrassMudBlock(SeaGrassMudBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "sea_grass_dirt_block"))).mapColor(MapColor.EMERALD_GREEN).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.WET_GRASS)));

    public static final Block SEA_GRASS_SAND_BLOCK = registerBlock("sea_grass_sand_block",
            new SeaGrassWithSand(new ColorCode(14406560), SeaGrassWithSand.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "sea_grass_sand_block"))).mapColor(MapColor.EMERALD_GREEN).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.WET_GRASS)));

    public static final Block SEA_GRASS_STONE_BLOCK = registerBlock("sea_grass_stone_block",
            new SeaGrassStoneBlock(SeaGrassStoneBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "sea_grass_stone_block"))).mapColor(MapColor.EMERALD_GREEN).ticksRandomly().strength(0.6f).sounds(BlockSoundGroup.CORAL)));


    public static final Block LAVENDER = registerBlock("lavender",
            new DryVegetationBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "lavender"))).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YARROW = registerBlock("yarrow",
            new DryVegetationBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "yarrow"))).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block KNIPHOFIA = registerBlock("kniphofia",
            new DryVegetationBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "kniphofia"))).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GLOBE_THISTLE = registerBlock("globe_thistle",
            new DryVegetationBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "globe_thistle"))).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SECENIO = registerBlock("secenio",
            new DryVegetationBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(GrassResodded.MOD_ID, "secenio"))).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).pistonBehavior(PistonBehavior.DESTROY)));


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
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getDefaultColor(), ModBlocks.SEA_GRASS_MUD_BLOCK,
                ModBlocks.GRASS_MUD_BLOCK, ModBlocks.SEA_GRASS_DIRT_BLOCK, ModBlocks.SEA_GRASS_SAND_BLOCK,ModBlocks.SEA_GRASS_STONE_BLOCK,

                ModBlocks.GRASS_STONE_BLOCK, Blocks.KELP_PLANT, Blocks.KELP, Blocks.SEAGRASS, Blocks.TALL_SEAGRASS);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.GRASS_MUD_BLOCK);entries.add(ModBlocks.GRASS_STONE_BLOCK);
            entries.add(ModBlocks.DRY_GRASS_DIRT_BLOCK);entries.add(ModBlocks.DRY_GRASS_SAND_BLOCK);
            entries.add(ModBlocks.DRY_GRASS_RED_SAND_BLOCK);entries.add(ModBlocks.DRY_GRASS_MUD_BLOCK);
            entries.add(ModBlocks.DRY_GRASS_STONE_BLOCK);entries.add(ModBlocks.SEA_GRASS_DIRT_BLOCK);
            entries.add(ModBlocks.SEA_GRASS_MUD_BLOCK);entries.add(ModBlocks.SEA_GRASS_SAND_BLOCK);
            entries.add(ModBlocks.SEA_GRASS_STONE_BLOCK);
            entries.add(ModBlocks.LAVENDER);entries.add(ModBlocks.YARROW);entries.add(ModBlocks.SECENIO);
            entries.add(ModBlocks.KNIPHOFIA);entries.add(ModBlocks.GLOBE_THISTLE);
        });
    }
}
