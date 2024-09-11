package net.witchkings.knightsofterrafirma.item.armor;

import com.magistuarmory.item.armor.ArmorType;
import net.witchkings.knightsofterrafirma.KnightsOfTerraFirma;
import com.magistuarmory.config.ArmorConfig;
import dev.architectury.platform.Platform;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import static com.magistuarmory.item.armor.ArmorTypes.ARMOR_CONFIG;

public final class ModArmor {
    public static final ArmorType BLACKSTEEL_KNIGHT_CHESTPLATE = new ArmorType(new ResourceLocation("knightsofterrafirma", "blacksteel_knight_chestplate"), new ResourceLocation("knightsofterrafirma", "black_steel_knight_armor"), 1.25F, 0.5F, new Integer[]{230, 315, 335, 275}, new Integer[]{2, 5, 8, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKnightArmor, Platform.isForge() ? "forge:ingots/black_steel" : "c:black_steel_ingots");
    public static final ArmorType BLACKSTEEL_KNIGHT = new ArmorType(new ResourceLocation("knightsofterrafirma", "blacksteel_knight"), new ResourceLocation("default"), 1.25F, 0.5F, new Integer[]{230, 315, 335, 275}, new Integer[]{2, 5, 8, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKnightArmor, Platform.isForge() ? "forge:ingots/black_steel" : "c:black_steel_ingots");
    public static final ArmorType BLACKSTEEL_ARMET = new ArmorType(new ResourceLocation("knightsofterrafirma", "blacksteel_armet"), new ResourceLocation("knightsofterrafirma", "armet"), 1.25F, 0.5F, new Integer[]{230, 315, 335, 275}, new Integer[]{2, 5, 8, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON, ARMOR_CONFIG.enableKnightArmor, Platform.isForge() ? "forge:ingots/black_steel" : "c:black_steel_ingots");
    public ModArmor() { }

}
