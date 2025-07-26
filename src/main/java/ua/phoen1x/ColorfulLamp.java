package ua.phoen1x;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.phoen1x.block.ModBlocks;

public class ColorfulLamp implements ModInitializer {
	public static final String MOD_ID = "colorful-lamp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.info("Successfully added mod assets for " + MOD_ID);
		} else {
			LOGGER.error("Failed to add mod assets for " + MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
		PolymerResourcePackUtils.addBridgedModelsFolder(id("block"));
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}