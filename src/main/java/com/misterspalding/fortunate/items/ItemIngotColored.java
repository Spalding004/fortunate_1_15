package com.misterspalding.fortunate.items;

import java.awt.Color;

import com.misterspalding.fortunate.HowFortunate.ModItemGroup;
import com.misterspalding.fortunate.inits.ItemDec;
import com.misterspalding.fortunate.lists.ColorList;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngotColored extends Item {

	public ItemIngotColored() {
		super(new Item.Properties().group(ModItemGroup.instance));

		ItemDec.colorIngots.add(this);

	}

	public static class ColorHandler implements IItemColor {
		public int getColor(ItemStack stack, int tintIndex) {
			int color = Color.WHITE.getRGB();

			if (tintIndex == 0)
				color = ColorList.getColor(stack);

			return color;
		}

	}
}
