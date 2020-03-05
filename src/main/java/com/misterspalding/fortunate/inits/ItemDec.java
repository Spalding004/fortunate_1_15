package com.misterspalding.fortunate.inits;

import com.misterspalding.fortunate.Main;
import com.misterspalding.fortunate.items.ItemChunk;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid=Main.MOD_ID, bus = Bus.MOD)
public class ItemDec {

	public static ItemChunk iron_chunk;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new ItemChunk("iron_chunk"));
		
	}
	
}
