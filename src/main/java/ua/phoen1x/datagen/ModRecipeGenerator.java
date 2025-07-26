package ua.phoen1x.datagen;

import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

public class ModRecipeGenerator extends RecipeGenerator {
    private final RegistryEntryLookup<Item> itemLookup;

    protected ModRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        super(registries, exporter);
        itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
    }

    @Override
    public void generate() {
        lampRecipe(ua.phoen1x.block.ModBlocks.RED_LAMP_ITEM, Items.RED_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.YELLOW_LAMP_ITEM, Items.YELLOW_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.GREEN_LAMP_ITEM, Items.GREEN_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.ORANGE_LAMP_ITEM, Items.ORANGE_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.LIME_LAMP_ITEM, Items.LIME_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.CYAN_LAMP_ITEM, Items.CYAN_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.BLUE_LAMP_ITEM, Items.BLUE_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.LIGHT_BLUE_LAMP_ITEM, Items.LIGHT_BLUE_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.PURPLE_LAMP_ITEM, Items.PURPLE_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.MAGENTA_LAMP_ITEM, Items.MAGENTA_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.PINK_LAMP_ITEM, Items.PINK_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.BROWN_LAMP_ITEM, Items.BROWN_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.BLACK_LAMP_ITEM, Items.BLACK_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.LIGHT_GRAY_LAMP_ITEM, Items.LIGHT_GRAY_DYE, exporter);
        lampRecipe(ua.phoen1x.block.ModBlocks.WHITE_LAMP_ITEM, Items.WHITE_DYE, exporter);
    }

    private void lampRecipe(Item output, Item dye, RecipeExporter exporter) {
        createShapeless(RecipeCategory.REDSTONE, output, 1)
                .input(dye)
                .input(Items.REDSTONE_LAMP)
                .criterion(hasItem(dye), conditionsFromItem(dye))
                .offerTo(exporter);
    }
}