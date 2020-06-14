package com.misterspalding.fortunate;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.misterspalding.fortunate.events.loot_modifiers.GoldFortuneModifier;
import com.misterspalding.fortunate.events.loot_modifiers.IronFortuneModifier;
import com.misterspalding.fortunate.inits.ItemDec;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fortunate")
@Mod.EventBusSubscriber(modid = HowFortunate.MOD_ID, bus = Bus.MOD)
public class HowFortunate
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static final String MOD_ID = "fortunate";
    public static HowFortunate instance;
    final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


    public HowFortunate() {
        
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::enqueueIMC);
    	modEventBus.addListener(this::processIMC);
    	modEventBus.addListener(this::doClientStuff);
    	
    	ItemDec.ITEMS.register(modEventBus);

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
    
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        
            event.getRegistry().register(new IronFortuneModifier.Serializer().setRegistryName(new ResourceLocation(HowFortunate.MOD_ID,"fortunate_iron")));
            event.getRegistry().register(new GoldFortuneModifier.Serializer().setRegistryName(new ResourceLocation(HowFortunate.MOD_ID,"fortunate_gold")));
            
    }
    
 public static class ModItemGroup extends ItemGroup {
    	
    	private ModItemGroup(int index, String label) {
    		
    		super(index, label);
    		
    	}
    	
    	@Override
    	public ItemStack createIcon() {
    		
    	return new ItemStack(ItemDec.IRON_CHUNK.get());
    		
    	}
    	
    	public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length, "mod_creative_tab");
    	
    }
    
   
}
