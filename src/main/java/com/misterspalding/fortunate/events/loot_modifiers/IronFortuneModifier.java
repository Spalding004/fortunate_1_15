package com.misterspalding.fortunate.events.loot_modifiers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;

import com.google.gson.JsonObject;
import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;

public class IronFortuneModifier extends LootModifier {
    public IronFortuneModifier(ILootCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Nonnull
    @Override
    public List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context) {
    	Random random = new Random();
    	
    	ItemStack ctxTool = context.get(LootParameters.TOOL);
    	ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
    	int enchant_level =  EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, ctxTool);
        generatedLoot.forEach((stack) -> ret.add(new ItemStack(ItemDec.IRON_CHUNK.get(), 1 + random.nextInt(1+enchant_level))));
        return ret;
    }

   

    public static class Serializer extends GlobalLootModifierSerializer<IronFortuneModifier> {
        @Override
        public IronFortuneModifier read(ResourceLocation name, JsonObject json, ILootCondition[] conditionsIn) {
            return new IronFortuneModifier(conditionsIn);
        }
    }
}
