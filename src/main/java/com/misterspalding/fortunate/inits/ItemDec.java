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
@ObjectHolder(Main.MOD_ID)
public class ItemDec {

	@ObjectHolder("fortunate:iron_chunk")
	public static ItemChunk iron_chunk = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().register(new ItemChunk("iron_chunk"));
		
	}
	
}
