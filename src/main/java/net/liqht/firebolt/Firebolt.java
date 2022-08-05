package net.liqht.firebolt;

import net.fabricmc.api.ModInitializer;
import net.liqht.firebolt.item.ModItems;
import net.liqht.firebolt.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Firebolt implements ModInitializer {
	public static final String MOD_ID = "firebolt";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
	}
}
