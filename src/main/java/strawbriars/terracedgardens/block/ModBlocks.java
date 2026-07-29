package strawbriars.terracedgardens.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import strawbriars.terracedgardens.TerracedGardens;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TerracedGardens.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TerracedGardens.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TerracedGardens.LOGGER.info("Registering Mod Blocks for " + TerracedGardens.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SILVER_BLOCK);
            entries.add(ModBlocks.RAW_SILVER_BLOCK);
        });
    }
}
