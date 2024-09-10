package net.witchkings.knightsofterrafirma.recipe;

import com.google.gson.JsonObject;
import net.dries007.tfc.common.recipes.*;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import net.dries007.tfc.common.capabilities.forge.ForgingBonus;
import net.dries007.tfc.common.recipes.inventory.EmptyInventory;
import net.dries007.tfc.common.recipes.outputs.ItemStackProvider;
import net.dries007.tfc.util.JsonHelpers;

public class OverwritedWelding extends WeldingRecipe {
    private final ResourceLocation id;
    private final Ingredient firstInput, secondInput;
    private final int tier;
    private final ItemStackProvider output;
    private final boolean combineForgingBonus;

    public OverwritedWelding(ResourceLocation id, Ingredient firstInput, Ingredient secondInput, int tier, ItemStackProvider output, boolean combineForgingBonus)
    {
        super(id, firstInput, secondInput, tier, output, combineForgingBonus);
        this.id = id;
        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.tier = tier;
        this.output = output;
        this.combineForgingBonus = combineForgingBonus;
    }

    /**
     * @return {@code true} if an anvil of {@code anvilTier} can perform this recipe.
     */
    public boolean isCorrectTier(int anvilTier)
    {
        return anvilTier >= tier;
    }

    public int getTier()
    {
        return tier;
    }

    /**
     * This is used when querying the matching recipe for a stack.
     * As such it doesn't check if the recipe is complete, but only if the recipe could be completed.
     */
    @Override
    public boolean matches(WeldingRecipe.Inventory inventory, Level level) {
        ItemStack left = inventory.getLeft();
        ItemStack right = inventory.getRight();
        return this.firstInput.test(left) && this.secondInput.test(right) || this.firstInput.test(right) && this.secondInput.test(left);
    }

    @Override
    public ItemStack assemble(WeldingRecipe.Inventory inventory, RegistryAccess registryAccess) {
        ItemStack stack = this.output.getSingleStack(inventory.getLeft());
        if (this.combineForgingBonus) {
            ForgingBonus left = ForgingBonus.get(inventory.getLeft());
            ForgingBonus right = ForgingBonus.get(inventory.getRight());
            if (left.ordinal() > right.ordinal()) {
                ForgingBonus.set(stack, left);
            } else {
                ForgingBonus.set(stack, right);
            }
        }

        return stack;
    }

    @Override
    public ItemStack getResultItem(@Nullable RegistryAccess access)
    {
        return output.getEmptyStack();
    }

    @Override
    public ResourceLocation getId()
    {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer()
    {
        return TFCRecipeSerializers.WELDING.get();
    }

    @Override
    public RecipeType<?> getType()
    {
        return TFCRecipeTypes.WELDING.get();
    }

    public Ingredient getFirstInput()
    {
        return firstInput;
    }

    public Ingredient getSecondInput()
    {
        return secondInput;
    }

    public boolean shouldCombineForgingBonus()
    {
        return combineForgingBonus;
    }

    public interface Inventory extends EmptyInventory
    {
        ItemStack getLeft();

        ItemStack getRight();

        int getTier();
    }

    public static class Serializer extends RecipeSerializerImpl<OverwritedWelding> {
        public Serializer() {
        }

        public OverwritedWelding fromJson(ResourceLocation recipeId, JsonObject json) {
            Ingredient firstInput = Ingredient.fromJson(JsonHelpers.get(json, "first_input"));
            Ingredient secondInput = Ingredient.fromJson(JsonHelpers.get(json, "second_input"));
            int tier = JsonHelpers.getAsInt(json, "tier", -1);
            ItemStackProvider output = ItemStackProvider.fromJson(JsonHelpers.getAsJsonObject(json, "result"));
            boolean combineForging = JsonHelpers.getAsBoolean(json, "combine_forging_bonus", false);
            return new OverwritedWelding(recipeId, firstInput, secondInput, tier, output, combineForging);
        }

        public @Nullable OverwritedWelding fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buffer) {
            Ingredient firstInput = Ingredient.fromNetwork(buffer);
            Ingredient secondInput = Ingredient.fromNetwork(buffer);
            int tier = buffer.readVarInt();
            ItemStackProvider output = ItemStackProvider.fromNetwork(buffer);
            boolean combineForging = buffer.readBoolean();
            return new OverwritedWelding(recipeId, firstInput, secondInput, tier, output, combineForging);
        }

        public void toNetwork(FriendlyByteBuf buffer, OverwritedWelding recipe) {
            recipe.firstInput.toNetwork(buffer);
            recipe.secondInput.toNetwork(buffer);
            buffer.writeVarInt(recipe.tier);
            recipe.output.toNetwork(buffer);
            buffer.writeBoolean(recipe.combineForgingBonus);
        }
    }
}
