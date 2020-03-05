package com.misterspalding.fortunate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.misterspalding.fortunate.inits.ItemDec;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fortunate")
public class Main
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MOD_ID = "fortunate";
    public static Main instance;

    public Main() {
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
          }

    private void processIMC(final InterModProcessEvent event)
    {
         }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        
    }

   
   
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
       
    }
    
    public static class ModItemGroup extends ItemGroup {
    	
   	public static final ModItemGroup MOD_ITEM_GROUP = new ModItemGroup(ItemGroup.GROUPS.length, "fortunate");
   	private ModItemGroup(int index, String label) {
   		super(index, label);
    		    		
   	}
    	
   	@Override
   	@OnlyIn(Dist.CLIENT)
   	public ItemStack createIcon() {
    	return new ItemStack(ItemDec.iron_chunk);
    	}
   	
    	
    }
   
}
