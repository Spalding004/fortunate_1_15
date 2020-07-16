package com.misterspalding.fortunate.events;

import com.misterspalding.fortunate.inits.ItemDec;
import com.misterspalding.fortunate.items.ItemChunkColored;
import com.misterspalding.fortunate.items.ItemIngotColored;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

public class ColorHandlerReg {

	@OnlyIn(Dist.CLIENT)
    public static void registerItemColorHandlers() {
		int lengthChunk = ItemDec.colorItems.size();
		for (int x = 0; x < lengthChunk; x++) {

			Minecraft.getInstance().getItemColors().register(new ItemChunkColored.ColorHandler(),
					new Item[] { (Item) ItemDec.colorItems.get(x) });

		}

		int lengthIngot = ItemDec.colorIngots.size();
		for (int x = 0; x < lengthIngot; x++) {

			Minecraft.getInstance().getItemColors().register(new ItemIngotColored.ColorHandler(),
					new Item[] { (Item) ItemDec.colorIngots.get(x) });

		}
	}
}
