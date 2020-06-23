package com.misterspalding.fortunate.items;

import com.misterspalding.fortunate.HowFortunate.ModItemGroup;
import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.item.Item;

public class ItemChunkSpecial extends Item {

	public ItemChunkSpecial(String name) {
		super(new Item.Properties().group(ModItemGroup.instance));

		ItemDec.metalChunks.add(name);
	}

}
