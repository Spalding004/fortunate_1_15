package com.misterspalding.fortunate.events.loot_modifiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;
import com.misterspalding.fortunate.HowFortunate;
import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class MetalFortuneModifier extends LootModifier {

	public MetalFortuneModifier(ILootCondition[] conditionsIn) {
		super(conditionsIn);

	}

	@Nonnull
	@Override
	public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
		Random random = new Random();
		String broken = generatedLoot.toString();
		
		ItemStack ctxTool = context.get(LootParameters.TOOL);
		if (generatedLoot.size() == 0) {

			return generatedLoot;

		}
		//System.out.println(broken);
		ArrayList<ItemStack> ret = checkloots(generatedLoot, broken);

		if (generatedLoot.get(0).getItem() == ret.get(0).getItem()
				|| EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, ctxTool) != 0) {

			return generatedLoot;

		} else {

			int enchant_level = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, ctxTool);
			ArrayList<ItemStack> stack_ret = new ArrayList<ItemStack>();
			int base_count = generatedLoot.size();
			stack_ret.add(new ItemStack(ret.get(0).getItem(), base_count + random.nextInt(1 + enchant_level)));
			return stack_ret;
		}
	}

	/*
	 * 
	 * 
	 * I have no doubt that this is NOT a recommended way to use the global loot
	 * modifier system.
	 * 
	 * If Draco18s saw this I'm sure he'd have very strong words.
	 * 
	 * Do as I say, not as I do.
	 * 
	 * 
	 */

	private static ArrayList<ItemStack> getReturnStack(String checkedOre, Item toReturn) {

		ArrayList<ItemStack> listReturn = new ArrayList<ItemStack>();
		toReturn = getChunkItem(checkedOre);
		listReturn.add(new ItemStack(toReturn));
		return listReturn;

	}

	private ArrayList<ItemStack> checkloots(List<ItemStack> generatedLoot, String broken) {
		
		Item toReturn = generatedLoot.get(0).getItem();

		for (int x = 0; x < ItemDec.metalChunks.size(); x++) {
			String checkedOre = ItemDec.metalChunks.get(x);
			if (oreMatch(broken, checkedOre)) {
				return getReturnStack(checkedOre, toReturn);
			}

		}

		return (ArrayList<ItemStack>) generatedLoot;

	}

	public static boolean oreMatch(String broken, String checkedOre) {
		if ((	   broken.contains(checkedOre + "_ore") 
				|| broken.contains("ore_" + checkedOre)
				|| broken.contains(checkedOre + "_oreb")
				|| broken.contains("ore_"+checkedOre+"b")
				) && !broken.contains("crimson")) {
			return true;
		}

		return false;

	}

	private static Item getChunkItem(String checkedOre) {

		return ForgeRegistries.ITEMS.getValue(new ResourceLocation(HowFortunate.MOD_ID, checkedOre + "_chunk"));

	}

	public static class Serializer extends GlobalLootModifierSerializer<MetalFortuneModifier> {
		@Override
		public MetalFortuneModifier read(ResourceLocation name, JsonObject json, ILootCondition[] conditionsIn) {
			return new MetalFortuneModifier(conditionsIn);
		}
	}
}
