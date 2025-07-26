package ua.phoen1x.block;

import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ua.phoen1x.ColorfulLamp;

import java.util.function.Function;

import static ua.phoen1x.ColorfulLamp.MOD_ID;

public class ModBlocks {
    public static final Block RED_LAMP = registerBlock("red_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "red_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block YELLOW_LAMP = registerBlock("yellow_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "yellow_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block GREEN_LAMP = registerBlock("green_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "green_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block ORANGE_LAMP = registerBlock("orange_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "orange_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block LIME_LAMP = registerBlock("lime_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "lime_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block CYAN_LAMP = registerBlock("cyan_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "cyan_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block BLUE_LAMP = registerBlock("blue_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "blue_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block LIGHT_BLUE_LAMP = registerBlock("light_blue_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "light_blue_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block PURPLE_LAMP = registerBlock("purple_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "purple_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block MAGENTA_LAMP = registerBlock("magenta_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "magenta_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block PINK_LAMP = registerBlock("pink_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "pink_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block BROWN_LAMP = registerBlock("brown_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "brown_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block BLACK_LAMP = registerBlock("black_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "black_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block LIGHT_GRAY_LAMP = registerBlock("light_gray_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "light_gray_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));
    public static final Block WHITE_LAMP = registerBlock("white_redstone_lamp", settings -> new PolyRedstoneLamp(settings, "white_redstone_lamp"), Block.Settings.copy(Blocks.REDSTONE_LAMP));

    public static final BlockItem RED_LAMP_ITEM = registerBlockItem("red_redstone_lamp", settings -> new TexturedPolyBlockItem(RED_LAMP, settings), new Item.Settings());
    public static final BlockItem YELLOW_LAMP_ITEM = registerBlockItem("yellow_redstone_lamp", settings -> new TexturedPolyBlockItem(YELLOW_LAMP, settings), new Item.Settings());
    public static final BlockItem GREEN_LAMP_ITEM = registerBlockItem("green_redstone_lamp", settings -> new TexturedPolyBlockItem(GREEN_LAMP, settings), new Item.Settings());
    public static final BlockItem ORANGE_LAMP_ITEM = registerBlockItem("orange_redstone_lamp", settings -> new TexturedPolyBlockItem(ORANGE_LAMP, settings), new Item.Settings());
    public static final BlockItem LIME_LAMP_ITEM = registerBlockItem("lime_redstone_lamp", settings -> new TexturedPolyBlockItem(LIME_LAMP, settings), new Item.Settings());
    public static final BlockItem CYAN_LAMP_ITEM = registerBlockItem("cyan_redstone_lamp", settings -> new TexturedPolyBlockItem(CYAN_LAMP, settings), new Item.Settings());
    public static final BlockItem BLUE_LAMP_ITEM = registerBlockItem("blue_redstone_lamp", settings -> new TexturedPolyBlockItem(BLUE_LAMP, settings), new Item.Settings());
    public static final BlockItem LIGHT_BLUE_LAMP_ITEM = registerBlockItem("light_blue_redstone_lamp", settings -> new TexturedPolyBlockItem(LIGHT_BLUE_LAMP, settings), new Item.Settings());
    public static final BlockItem PURPLE_LAMP_ITEM = registerBlockItem("purple_redstone_lamp", settings -> new TexturedPolyBlockItem(PURPLE_LAMP, settings), new Item.Settings());
    public static final BlockItem MAGENTA_LAMP_ITEM = registerBlockItem("magenta_redstone_lamp", settings -> new TexturedPolyBlockItem(MAGENTA_LAMP, settings), new Item.Settings());
    public static final BlockItem PINK_LAMP_ITEM = registerBlockItem("pink_redstone_lamp", settings -> new TexturedPolyBlockItem(PINK_LAMP, settings), new Item.Settings());
    public static final BlockItem BROWN_LAMP_ITEM = registerBlockItem("brown_redstone_lamp", settings -> new TexturedPolyBlockItem(BROWN_LAMP, settings), new Item.Settings());
    public static final BlockItem BLACK_LAMP_ITEM = registerBlockItem("black_redstone_lamp", settings -> new TexturedPolyBlockItem(BLACK_LAMP, settings), new Item.Settings());
    public static final BlockItem LIGHT_GRAY_LAMP_ITEM = registerBlockItem("light_gray_redstone_lamp", settings -> new TexturedPolyBlockItem(LIGHT_GRAY_LAMP, settings), new Item.Settings());
    public static final BlockItem WHITE_LAMP_ITEM = registerBlockItem("white_redstone_lamp", settings -> new TexturedPolyBlockItem(WHITE_LAMP, settings), new Item.Settings());

    public static void registerBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModBlocks.RED_LAMP_ITEM, 1));
        builder.displayName(Text.translatable("item-group.colorful-lamp.blocks"));
        builder.entries((displayContext, entries) -> {
            entries.add(RED_LAMP_ITEM);
            entries.add(ORANGE_LAMP_ITEM);
            entries.add(YELLOW_LAMP_ITEM);
            entries.add(GREEN_LAMP_ITEM);
            entries.add(LIME_LAMP_ITEM);
            entries.add(CYAN_LAMP_ITEM);
            entries.add(BLUE_LAMP_ITEM);
            entries.add(LIGHT_BLUE_LAMP_ITEM);
            entries.add(PURPLE_LAMP_ITEM);
            entries.add(MAGENTA_LAMP_ITEM);
            entries.add(PINK_LAMP_ITEM);
            entries.add(BROWN_LAMP_ITEM);
            entries.add(BLACK_LAMP_ITEM);
            entries.add(LIGHT_GRAY_LAMP_ITEM);
            entries.add(WHITE_LAMP_ITEM);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(MOD_ID, "blocks"), polymerGroup);
    }

    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings){
        var key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(ColorfulLamp.MOD_ID, name));
        Block block = factory.apply(settings.registryKey(key));

        return Registry.register(Registries.BLOCK, key, block);
    }

    public static BlockItem registerBlockItem(String name, Function<Item.Settings, BlockItem> factory, Item.Settings settings){
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ColorfulLamp.MOD_ID, name));
        BlockItem item = factory.apply(settings.registryKey(key).useBlockPrefixedTranslationKey());

        return Registry.register(Registries.ITEM, key, item);
    }
}
