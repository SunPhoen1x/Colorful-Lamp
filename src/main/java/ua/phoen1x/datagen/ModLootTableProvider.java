package ua.phoen1x.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static ua.phoen1x.block.ModBlocks.*;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(RED_LAMP);
        addDrop(YELLOW_LAMP);
        addDrop(GREEN_LAMP);
        addDrop(ORANGE_LAMP);
        addDrop(LIME_LAMP);
        addDrop(CYAN_LAMP);
        addDrop(BLUE_LAMP);
        addDrop(LIGHT_BLUE_LAMP);
        addDrop(PURPLE_LAMP);
        addDrop(MAGENTA_LAMP);
        addDrop(PINK_LAMP);
        addDrop(BROWN_LAMP);
        addDrop(BLACK_LAMP);
        addDrop(LIGHT_GRAY_LAMP);
        addDrop(WHITE_LAMP);
    }
}