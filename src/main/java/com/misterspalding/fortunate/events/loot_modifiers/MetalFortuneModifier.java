package com.misterspalding.fortunate.events.loot_modifiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;
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
    	ArrayList<ItemStack> ret = checkloots(generatedLoot, broken);
    		if (generatedLoot.get(0).getItem() == ret.get(0).getItem() || EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, ctxTool) != 0) {
    			
    			return generatedLoot;
    			
    		} else {
    	
    	int enchant_level =  EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, ctxTool);
    	ArrayList<ItemStack> stack_ret = new ArrayList<ItemStack>();
    	int base_count = generatedLoot.size();
    	stack_ret.add(new ItemStack(ret.get(0).getItem(),  base_count + random.nextInt(1+enchant_level)));
    	return stack_ret;
    		}
    }

    /*
     * 
     * 
     * I have no doubt that this is NOT a recommended way to use the global loot modifier system.
     * 
     * If Draco18s saw this I'm sure he'd have very strong words.
     * 
     * Do as I say, not as I do. 
     * 
     * 
     */
   

    private ArrayList<ItemStack> checkloots(List<ItemStack> generatedLoot, String broken) {
    	ArrayList<ItemStack> listReturn = new ArrayList<ItemStack>();
    	Item toReturn = generatedLoot.get(0).getItem();
    	
    	String checkedOre = "copper";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.COPPER_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "iron";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.IRON_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "gold";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.GOLD_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "lead";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.LEAD_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "silver";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.SILVER_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "platinum";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.PLATINUM_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "nickel";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.NICKEL_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "tin";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.TIN_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "cobalt";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.COBALT_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "osmium";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.OSMIUM_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "aluminum";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.ALUMINUM_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	checkedOre = "zinc";
    	if (broken.contains(checkedOre+"_ore") || broken.contains("ore_" + checkedOre)) {
    		toReturn = ItemDec.ZINC_CHUNK.get();
    		listReturn.add(new ItemStack(toReturn));
    		return listReturn;
    	}
    	
    	return (ArrayList<ItemStack>) generatedLoot;
    	
		
		
	}



	public static class Serializer extends GlobalLootModifierSerializer<MetalFortuneModifier> {
        @Override
        public MetalFortuneModifier read(ResourceLocation name, JsonObject json, ILootCondition[] conditionsIn) {
            return new MetalFortuneModifier(conditionsIn);
        }
    }
}
