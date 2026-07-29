package strawbriars.terracedgardens.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import strawbriars.terracedgardens.TerracedGardens;
import strawbriars.terracedgardens.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup TERRACED_GARDENS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TerracedGardens.MOD_ID, "terraced_gardens_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_SILVER))
                    .displayName(Text.translatable("itemgroup.terracedgardens.terraced_gardens_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.RAW_SILVER);
                    }).build());

    public static final ItemGroup TERRACED_GARDENS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TerracedGardens.MOD_ID, "terraced_gardens_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SILVER_BLOCK))
                    .displayName(Text.translatable("itemgroup.terracedgardens.terraced_gardens_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TerracedGardens.LOGGER.info("Registering Item Groups for " + TerracedGardens.MOD_ID);
    }
}
