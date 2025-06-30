package ua.phoen1x.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import ua.phoen1x.ColorfulLamp;
import ua.phoen1x.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        lampRecipe(ModBlocks.RED_LAMP_ITEM, Items.RED_DYE, exporter);
        lampRecipe(ModBlocks.YELLOW_LAMP_ITEM, Items.YELLOW_DYE, exporter);
        lampRecipe(ModBlocks.GREEN_LAMP_ITEM, Items.GREEN_DYE, exporter);
        lampRecipe(ModBlocks.ORANGE_LAMP_ITEM, Items.ORANGE_DYE, exporter);
        lampRecipe(ModBlocks.LIME_LAMP_ITEM, Items.LIME_DYE, exporter);
        lampRecipe(ModBlocks.CYAN_LAMP_ITEM, Items.CYAN_DYE, exporter);
        lampRecipe(ModBlocks.BLUE_LAMP_ITEM, Items.BLUE_DYE, exporter);
        lampRecipe(ModBlocks.LIGHT_BLUE_LAMP_ITEM, Items.LIGHT_BLUE_DYE, exporter);
        lampRecipe(ModBlocks.PURPLE_LAMP_ITEM, Items.PURPLE_DYE, exporter);
        lampRecipe(ModBlocks.MAGENTA_LAMP_ITEM, Items.MAGENTA_DYE, exporter);
        lampRecipe(ModBlocks.PINK_LAMP_ITEM, Items.PINK_DYE, exporter);
        lampRecipe(ModBlocks.BROWN_LAMP_ITEM, Items.BROWN_DYE, exporter);
        lampRecipe(ModBlocks.BLACK_LAMP_ITEM, Items.BLACK_DYE, exporter);
        lampRecipe(ModBlocks.LIGHT_GRAY_LAMP_ITEM, Items.LIGHT_GRAY_DYE, exporter);
        lampRecipe(ModBlocks.WHITE_LAMP_ITEM, Items.WHITE_DYE, exporter);
    }

    private void lampRecipe(Item output, Item dye, RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, output, 1)
                .input(dye)
                .input(Items.REDSTONE_LAMP)
                .criterion(hasItem(dye), conditionsFromItem(dye))
                .offerTo(exporter, Identifier.of(ColorfulLamp.MOD_ID, getRecipeName(output)));
    }
}