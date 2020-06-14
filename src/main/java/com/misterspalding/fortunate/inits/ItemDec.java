package com.misterspalding.fortunate.inits;

import com.misterspalding.fortunate.HowFortunate;
import com.misterspalding.fortunate.items.ItemChunk;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemDec {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HowFortunate.MOD_ID);
	
	public static final RegistryObject<Item> IRON_CHUNK = ITEMS.register("iron_chunk", () -> new ItemChunk());
	public static final RegistryObject<Item> GOLD_CHUNK = ITEMS.register("gold_chunk", () -> new ItemChunk());
	
	
}
