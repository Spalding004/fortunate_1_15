package com.misterspalding.fortunate.lists;

import java.awt.Color;

import net.minecraft.item.ItemStack;

public class ColorList {

	public static int ironColor = (new Color(215, 182, 161)).getRGB();
	public static int goldColor = (new Color(247, 214, 61)).getRGB();
	public static int copperColor = (new Color(252, 136, 90)).getRGB();
	public static int arditeColor = (new Color(215, 177, 0)).getRGB();
	public static int cobaltColor;
	public static int tinColor;
	public static int silverColor;
	public static int leadColor;
	public static int nickelColor;
	public static int aluminumColor;
	public static int platinumColor;
	public static int osmiumColor;
	public static int manganeseColor;
	public static int cinnabarColor;
	public static int iridiumColor;
	public static int uraniumColor;
	public static int siliconColor;
	public static int magnesiumColor;
	public static int lithiumColor;
	public static int thoriumColor;
	public static int boronColor;
	public static int yelloriteColor;
	public static int zincColor;
	public static int bauxiteColor;
	public static int bismuthColor;
	public static int tungstenColor;
	public static int mythrilColor;

	static {
		cobaltColor = (new Color(78, 109, 212)).getRGB();
		tinColor = (new Color(227, 238, 255)).getRGB();
		silverColor = (new Color(199, 215, 221)).getRGB();
		leadColor = (new Color(152, 185, 222)).getRGB();
		nickelColor = (new Color(202, 201, 171)).getRGB();
		aluminumColor = (new Color(177, 177, 182)).getRGB();
		platinumColor = (new Color(67, 190, 232)).getRGB();
		osmiumColor = (new Color(141, 175, 186)).getRGB();
		manganeseColor = (new Color(240, 188, 188)).getRGB();
		cinnabarColor = (new Color(94, 12, 12)).getRGB();
		iridiumColor = (new Color(182, 201, 232)).getRGB();
		uraniumColor = (new Color(58, 242, 94)).getRGB();
		siliconColor = (new Color(147, 81, 81)).getRGB();
		magnesiumColor = (new Color(224, 190, 214)).getRGB();
		lithiumColor = (new Color(219, 219, 219)).getRGB();
		thoriumColor = (new Color(0, 0, 0)).getRGB();
		boronColor = (new Color(109, 109, 109)).getRGB();
		yelloriteColor = (new Color(204, 255, 0)).getRGB();
		zincColor = (new Color(237, 220, 220)).getRGB();
		bauxiteColor = (new Color(234, 169, 186)).getRGB();
		bismuthColor = (new Color(230, 217, 229)).getRGB();
		tungstenColor = (new Color(120, 176, 145)).getRGB();
		mythrilColor = (new Color(58, 133, 214)).getRGB();
		
	}

	public static int getColor(ItemStack stack) {
		int returnColor = Color.WHITE.getRGB();

		if (stack.getItem().getRegistryName().toString().contains("copper")) {

			returnColor = ColorList.copperColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("tin")) {

			returnColor = ColorList.tinColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("silver")) {

			returnColor = ColorList.silverColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("lead")) {

			returnColor = ColorList.leadColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("nickel")) {

			returnColor = ColorList.nickelColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("platinum")) {

			returnColor = ColorList.platinumColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("cobalt")) {

			returnColor = ColorList.cobaltColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("osmium")) {

			returnColor = ColorList.osmiumColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("zinc")) {

			returnColor = ColorList.zincColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("aluminum")) {

			returnColor = ColorList.aluminumColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("uranium")) {

			returnColor = ColorList.uraniumColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("bauxite")) {

			returnColor = ColorList.bauxiteColor;

		}

		if (stack.getItem().getRegistryName().toString().contains("bismuth")) {

			returnColor = ColorList.bismuthColor;

		}
		
		if (stack.getItem().getRegistryName().toString().contains("tungsten")) {

			returnColor = ColorList.tungstenColor;

		}
		
		if (stack.getItem().getRegistryName().toString().contains("mythril")) {

			returnColor = ColorList.mythrilColor;

		}

		return returnColor;
	}

}
