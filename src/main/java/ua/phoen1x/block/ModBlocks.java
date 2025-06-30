package ua.phoen1x.block;

import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static ua.phoen1x.ColorfulLamp.MOD_ID;

public class ModBlocks {
    public static final Block RED_LAMP = registerBlock("red_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "red_redstone_lamp"));
    public static final Block YELLOW_LAMP = registerBlock("yellow_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "yellow_redstone_lamp"));
    public static final Block GREEN_LAMP = registerBlock("green_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "green_redstone_lamp"));
    public static final Block ORANGE_LAMP = registerBlock("orange_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "orange_redstone_lamp"));
    public static final Block LIME_LAMP = registerBlock("lime_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "lime_redstone_lamp"));
    public static final Block CYAN_LAMP = registerBlock("cyan_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "cyan_redstone_lamp"));
    public static final Block BLUE_LAMP = registerBlock("blue_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "blue_redstone_lamp"));
    public static final Block LIGHT_BLUE_LAMP = registerBlock("light_blue_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "light_blue_redstone_lamp"));
    public static final Block PURPLE_LAMP = registerBlock("purple_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "purple_redstone_lamp"));
    public static final Block MAGENTA_LAMP = registerBlock("magenta_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "magenta_redstone_lamp"));
    public static final Block PINK_LAMP = registerBlock("pink_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "pink_redstone_lamp"));
    public static final Block BROWN_LAMP = registerBlock("brown_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "brown_redstone_lamp"));
    public static final Block BLACK_LAMP = registerBlock("black_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "black_redstone_lamp"));
    public static final Block LIGHT_GRAY_LAMP = registerBlock("light_gray_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "light_gray_redstone_lamp"));
    public static final Block WHITE_LAMP = registerBlock("white_redstone_lamp", new PolyRedstoneLamp(Block.Settings.copy(Blocks.REDSTONE_LAMP).luminance(state -> state.get(PolyRedstoneLamp.LIT) ? 15 : 0), "white_redstone_lamp"));

    public static final BlockItem RED_LAMP_ITEM = registerBlockItem("red_redstone_lamp", new TexturedPolyBlockItem(RED_LAMP, new Item.Settings(), "block/red_redstone_lamp_off"));
    public static final BlockItem YELLOW_LAMP_ITEM = registerBlockItem("yellow_redstone_lamp", new TexturedPolyBlockItem(YELLOW_LAMP, new Item.Settings(), "block/yellow_redstone_lamp_off"));
    public static final BlockItem GREEN_LAMP_ITEM = registerBlockItem("green_redstone_lamp", new TexturedPolyBlockItem(GREEN_LAMP, new Item.Settings(), "block/green_redstone_lamp_off"));
    public static final BlockItem ORANGE_LAMP_ITEM = registerBlockItem("orange_redstone_lamp", new TexturedPolyBlockItem(ORANGE_LAMP, new Item.Settings(), "block/orange_redstone_lamp_off"));
    public static final BlockItem LIME_LAMP_ITEM = registerBlockItem("lime_redstone_lamp", new TexturedPolyBlockItem(LIME_LAMP, new Item.Settings(), "block/lime_redstone_lamp_off"));
    public static final BlockItem CYAN_LAMP_ITEM = registerBlockItem("cyan_redstone_lamp", new TexturedPolyBlockItem(CYAN_LAMP, new Item.Settings(), "block/cyan_redstone_lamp_off"));
    public static final BlockItem BLUE_LAMP_ITEM = registerBlockItem("blue_redstone_lamp", new TexturedPolyBlockItem(BLUE_LAMP, new Item.Settings(), "block/blue_redstone_lamp_off"));
    public static final BlockItem LIGHT_BLUE_LAMP_ITEM = registerBlockItem("light_blue_redstone_lamp", new TexturedPolyBlockItem(LIGHT_BLUE_LAMP, new Item.Settings(), "block/light_blue_redstone_lamp_off"));
    public static final BlockItem PURPLE_LAMP_ITEM = registerBlockItem("purple_redstone_lamp", new TexturedPolyBlockItem(PURPLE_LAMP, new Item.Settings(), "block/purple_redstone_lamp_off"));
    public static final BlockItem MAGENTA_LAMP_ITEM = registerBlockItem("magenta_redstone_lamp", new TexturedPolyBlockItem(MAGENTA_LAMP, new Item.Settings(), "block/magenta_redstone_lamp_off"));
    public static final BlockItem PINK_LAMP_ITEM = registerBlockItem("pink_redstone_lamp", new TexturedPolyBlockItem(PINK_LAMP, new Item.Settings(), "block/pink_redstone_lamp_off"));
    public static final BlockItem BROWN_LAMP_ITEM = registerBlockItem("brown_redstone_lamp", new TexturedPolyBlockItem(BROWN_LAMP, new Item.Settings(), "block/brown_redstone_lamp_off"));
    public static final BlockItem BLACK_LAMP_ITEM = registerBlockItem("black_redstone_lamp", new TexturedPolyBlockItem(BLACK_LAMP, new Item.Settings(), "block/black_redstone_lamp_off"));
    public static final BlockItem LIGHT_GRAY_LAMP_ITEM = registerBlockItem("light_gray_redstone_lamp", new TexturedPolyBlockItem(LIGHT_GRAY_LAMP, new Item.Settings(), "block/light_gray_redstone_lamp_off"));
    public static final BlockItem WHITE_LAMP_ITEM = registerBlockItem("white_redstone_lamp", new TexturedPolyBlockItem(WHITE_LAMP, new Item.Settings(), "block/white_redstone_lamp_off"));

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

    public static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    public static BlockItem registerBlockItem(String name, BlockItem item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
}