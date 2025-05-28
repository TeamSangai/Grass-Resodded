package geoves.resodded.item;

import geoves.resodded.GrassResodded;
import geoves.resodded.item.custom.DryGrassSodItem;
import geoves.resodded.item.custom.GrassSodItem;
import geoves.resodded.item.custom.SeaGrassSodItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ResoddedItems {

    public static final  Item GRASS_SOD = registerItem("grass_sod",
            new GrassSodItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GrassResodded.MOD_ID, "grass_sod")))));

    public static final  Item DRY_GRASS_SOD = registerItem("dry_grass_sod",
            new DryGrassSodItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GrassResodded.MOD_ID, "dry_grass_sod")))));

    public static final  Item SEA_GRASS_SOD = registerItem("sea_grass_sod",
            new SeaGrassSodItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(GrassResodded.MOD_ID, "sea_grass_sod")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GrassResodded.MOD_ID, name), item);
    }
    public static void registerResoddedItems() {
        GrassResodded.LOGGER.info("fetching the sod.");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register( entries -> {
            entries.add(ResoddedItems.GRASS_SOD); entries.add(ResoddedItems.DRY_GRASS_SOD); entries.add(ResoddedItems.SEA_GRASS_SOD);
        });
    }
}
