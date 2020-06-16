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
	
	public static final RegistryObject<Item> TIN_CHUNK = ITEMS.register("tin_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> SILVER_CHUNK = ITEMS.register("silver_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> LEAD_CHUNK = ITEMS.register("lead_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> NICKEL_CHUNK = ITEMS.register("nickel_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> PLATINUM_CHUNK = ITEMS.register("platinum_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> ZINC_CHUNK = ITEMS.register("zinc_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new ItemIngotColored());

	public static final RegistryObject<Item> OSMIUM_CHUNK = ITEMS.register("osmium_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> COBALT_CHUNK = ITEMS.register("cobalt_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> ALUMINUM_CHUNK = ITEMS.register("aluminum_chunk", () -> new ItemChunkColored());
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new ItemIngotColored());
}
