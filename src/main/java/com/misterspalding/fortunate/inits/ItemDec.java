package com.misterspalding.fortunate.inits;

import java.util.ArrayList;

import com.misterspalding.fortunate.HowFortunate;
import com.misterspalding.fortunate.items.ItemChunk;
import com.misterspalding.fortunate.items.ItemChunkColored;
import com.misterspalding.fortunate.items.ItemIngotColored;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemDec {

	public static ArrayList<Item> colorItems = new ArrayList<Item>();
	public static ArrayList<Item> colorIngots = new ArrayList<Item>();
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HowFortunate.MOD_ID);
	
	public static final RegistryObject<Item> IRON_CHUNK = ITEMS.register("iron_chunk", () -> new ItemChunk());
	public static final RegistryObject<Item> GOLD_CHUNK = ITEMS.register("gold_chunk", () -> new ItemChunk());
	public static final RegistryObject<Item> COPPER_CHUNK = ITEMS.register("copper_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new ItemIngotColored());
	
}
