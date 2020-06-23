package com.misterspalding.fortunate.items;

import com.misterspalding.fortunate.HowFortunate.ModItemGroup;
import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.item.Item;

public class ItemChunk extends Item {

	public ItemChunk(String name) {
		super(new Item.Properties()

				.group(ModItemGroup.instance)

		);

		ItemDec.metalChunks.add(name);

	}

}
