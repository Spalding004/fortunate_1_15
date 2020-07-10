package com.misterspalding.fortunate.events;

import com.misterspalding.fortunate.inits.ItemDec;
import com.misterspalding.fortunate.items.ItemChunkColored;
import com.misterspalding.fortunate.items.ItemChunkColored.ColorHandler;
import com.misterspalding.fortunate.items.ItemIngotColored;

import net.minecraft.item.Item;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ColorHandlerReg {

	@OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerItemColorHandlers(final ColorHandlerEvent.Item event) {
		int lengthChunk = ItemDec.colorItems.size();
		for (int x = 0; x < lengthChunk; x++) {
			event.getItemColors().register(new ItemChunkColored.ColorHandler(), new Item[] { (Item) ItemDec.colorItems.get(x) });
		
		}
		
		int lengthIngot = ItemDec.colorIngots.size();
		for (int x = 0; x < lengthIngot; x++) {

			event.getItemColors().register(new ItemIngotColored.ColorHandler(), new Item[] { (Item) ItemDec.colorIngots.get(x) });

		}
    }
	
}
