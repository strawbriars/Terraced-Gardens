package strawbriars.terracedgardens;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import strawbriars.terracedgardens.block.ModBlocks;
import strawbriars.terracedgardens.item.ModItemGroups;
import strawbriars.terracedgardens.item.ModItems;

public class TerracedGardens implements ModInitializer {
	public static final String MOD_ID = "terracedgardens";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
