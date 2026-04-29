package com.sikoneko.vikingaxe;

import net.fabricmc.api.ModInitializer;
import com.sikoneko.vikingaxe.item.ModItems;

public class VikingAxeMod implements ModInitializer {
	public static final String MOD_ID = "viking-axe-mod";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
	}
}
