package ua.phoen1x.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import ua.phoen1x.ColorfulLamp;
import ua.phoen1x.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        registerLamp(blockStateModelGenerator, ModBlocks.RED_LAMP, "red_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.YELLOW_LAMP, "yellow_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.GREEN_LAMP, "green_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.ORANGE_LAMP, "orange_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.LIME_LAMP, "lime_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.CYAN_LAMP, "cyan_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.BLUE_LAMP, "blue_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.LIGHT_BLUE_LAMP, "light_blue_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.PURPLE_LAMP, "purple_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.MAGENTA_LAMP, "magenta_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.PINK_LAMP, "pink_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.BROWN_LAMP, "brown_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.BLACK_LAMP, "black_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.LIGHT_GRAY_LAMP, "light_gray_redstone_lamp");
        registerLamp(blockStateModelGenerator, ModBlocks.WHITE_LAMP, "white_redstone_lamp");
    }

    private void registerLamp(BlockStateModelGenerator blockStateModelGenerator, net.minecraft.block.Block block, String name) {
        Identifier textureOff = Identifier.of(ColorfulLamp.MOD_ID, "block/" + name + "_off");
        Identifier textureOn = Identifier.of(ColorfulLamp.MOD_ID, "block/" + name + "_on");

        Identifier modelOffId = blockStateModelGenerator.createSubModel(block, "_off", Models.CUBE_ALL, texture -> new TextureMap().put(TextureKey.ALL, textureOff));
        Identifier modelOnId = blockStateModelGenerator.createSubModel(block, "_on", Models.CUBE_ALL, texture -> new TextureMap().put(TextureKey.ALL, textureOn));
        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(block)
                        .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, modelOnId, modelOffId))
        );
        blockStateModelGenerator.registerParentedItemModel(block.asItem(), modelOffId);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}