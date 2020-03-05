package com.misterspalding.fortunate.itemgroups;

import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ModItemGroup extends net.minecraft.item.ItemGroup {
	    private IItemProvider icon;
	    
	    public static ModItemGroup MOD_ITEM_GROUP = new ModItemGroup("fortunate", ItemDec.iron_chunk);

	    public ModItemGroup(String label, IItemProvider icon) {
	        super(label);
	        this.icon = icon;
	    }

	    @OnlyIn(Dist.CLIENT)
	    @Override
	    public ItemStack createIcon() {
	        return new ItemStack(icon);
	    }
	
	    
	
}
