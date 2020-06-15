package com.misterspalding.fortunate.items;

import com.misterspalding.fortunate.HowFortunate.ModItemGroup;

import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.world.BossInfo.Color;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemChunkColored extends Item {

		
	
		public ItemChunkColored() {
		      super(new Item.Properties()
		    		  .group(ModItemGroup.instance)
		    		  );
	}
	
		 	@OnlyIn(Dist.CLIENT)
		   public int getColor(int tintIndex) {
		      
		 		int color = DyeColor.WHITE.ordinal();
		 		
		 		if (tintIndex == 1) {
		 			
		 			
		 			
		 		}
		 		
		 		return color;
		   }
		
}
