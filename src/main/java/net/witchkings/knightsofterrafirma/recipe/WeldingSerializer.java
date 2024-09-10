package net.witchkings.knightsofterrafirma.recipe;

import java.util.function.Supplier;
import net.dries007.tfc.common.recipes.DelegateRecipe.Serializer;
import net.dries007.tfc.common.recipes.ExtraProductsCraftingRecipe.ExtraProductsSerializer;
import net.dries007.tfc.common.recipes.TFCRecipeSerializers;
import net.dries007.tfc.common.recipes.WeldingRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WeldingSerializer {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS;

    public WeldingSerializer() {}

    private static <S extends RecipeSerializer<?>> RegistryObject<S> register(String name, Supplier<S> factory) {
        return RECIPE_SERIALIZERS.register(name, factory);
    }

    // Register OverwritedWelding.Serializer as the serializer for welding
    public static final RegistryObject<RecipeSerializer<OverwritedWelding>> WELDING;

    static {
        RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, "knightsofterrafirma");
        WELDING = register("welding", OverwritedWelding.Serializer::new);
    }
}
