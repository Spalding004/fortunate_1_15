package com.misterspalding.fortunate;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.misterspalding.fortunate.events.loot_modifiers.MetalFortuneModifier;
import com.misterspalding.fortunate.inits.ItemDec;
import com.misterspalding.fortunate.items.ItemChunkColored;
import com.misterspalding.fortunate.items.ItemIngotColored;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
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
public class HowFortunate {
	// Directly reference a log4j logger.
	@SuppressWarnings("unused")
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

	private void setup(final FMLCommonSetupEvent event) {

	}
	
	@OnlyIn(Dist.CLIENT)
	private void doClientStuff(final FMLClientSetupEvent event) {
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

	private void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private void processIMC(final InterModProcessEvent event) {
	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {

	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {

	}

	@SubscribeEvent
	public static void registerModifierSerializers(
			@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {

		event.getRegistry().register(new MetalFortuneModifier.Serializer()
				.setRegistryName(new ResourceLocation(HowFortunate.MOD_ID, "fortunate_metals")));

	}

	public static class ModItemGroup extends ItemGroup {

		private ModItemGroup(int index, String label) {

			super(index, label);

		}

		@Override
		public ItemStack createIcon() {

			return new ItemStack(ItemDec.IRON_CHUNK.get());

		}

		public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length,
				"fortunate.mod_creative_tab");

	}

}
