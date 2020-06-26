package com.misterspalding.fortunate.inits;

import java.util.ArrayList;

import com.misterspalding.fortunate.HowFortunate;
import com.misterspalding.fortunate.items.ItemChunk;
import com.misterspalding.fortunate.items.ItemChunkColored;
import com.misterspalding.fortunate.items.ItemChunkSpecial;
import com.misterspalding.fortunate.items.ItemIngotColored;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemDec {

	public static ArrayList<Item> colorItems = new ArrayList<Item>();
	public static ArrayList<Item> colorIngots = new ArrayList<Item>();
	public static ArrayList<String> metalChunks = new ArrayList<String>();
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, HowFortunate.MOD_ID);
	
	public static final RegistryObject<Item> IRON_CHUNK = ITEMS.register("iron_chunk", () -> new ItemChunk("iron"));
	public static final RegistryObject<Item> GOLD_CHUNK = ITEMS.register("gold_chunk", () -> new ItemChunk("gold"));
	
	public static final RegistryObject<Item> COPPER_CHUNK = ITEMS.register("copper_chunk", () -> new ItemChunkColored("copper"));
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> TIN_CHUNK = ITEMS.register("tin_chunk", () -> new ItemChunkColored("tin"));
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> SILVER_CHUNK = ITEMS.register("silver_chunk", () -> new ItemChunkColored("silver"));
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> LEAD_CHUNK = ITEMS.register("lead_chunk", () -> new ItemChunkColored("lead"));
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> NICKEL_CHUNK = ITEMS.register("nickel_chunk", () -> new ItemChunkColored("nickel"));
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> PLATINUM_CHUNK = ITEMS.register("platinum_chunk", () -> new ItemChunkColored("platinum"));
	public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> ZINC_CHUNK = ITEMS.register("zinc_chunk", () -> new ItemChunkColored("zinc"));
	public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new ItemIngotColored());

	public static final RegistryObject<Item> OSMIUM_CHUNK = ITEMS.register("osmium_chunk", () -> new ItemChunkColored("osmium"));
	public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> COBALT_CHUNK = ITEMS.register("cobalt_chunk", () -> new ItemChunkColored("cobalt"));
	public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> ALUMINUM_CHUNK = ITEMS.register("aluminum_chunk", () -> new ItemChunkColored("aluminum"));
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> URANIUM_CHUNK = ITEMS.register("uranium_chunk", () -> new ItemChunkColored("uranium"));
	public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> BAUXITE_CHUNK = ITEMS.register("bauxite_chunk", () -> new ItemChunkColored("bauxite"));

	public static final RegistryObject<Item> BISMUTH_CHUNK = ITEMS.register("bismuth_chunk", () -> new ItemChunkSpecial("bismuth"));
	public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot", () -> new ItemIngotColored());
	
	public static final RegistryObject<Item> TUNGSTEN_CHUNK = ITEMS.register("tungsten_chunk", () -> new ItemChunkColored("tungsten"));
	public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new ItemIngotColored());
}
