package com.sikoneko.vikingaxe.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.sikoneko.vikingaxe.VikingAxeMod;

public class ModItems {
	public static final Item VIKING_AXE = new VikingAxeItem(
		ToolMaterials.DIAMOND,
		6.0f,
		-3.0f,
		new Item.Settings()
	);

	public static void registerItems() {
		Registry.register(Registries.ITEM, new Identifier(VikingAxeMod.MOD_ID, "viking_axe"), VIKING_AXE);
		
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(VIKING_AXE);
		});
	}
}
