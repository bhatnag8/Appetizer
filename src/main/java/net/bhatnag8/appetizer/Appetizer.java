package net.bhatnag8.appetizer;

import net.bhatnag8.appetizer.enchantment.ModEnchantments;
import net.bhatnag8.appetizer.util.ModCustomTrades;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Appetizer implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "appetizer";
    public static final Logger LOGGER = LoggerFactory.getLogger("appetizer");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModCustomTrades.registerCustomTrades();
		ModEnchantments.registerModEnchantments();
		LOGGER.info("Hello Fabric world!");
	}
}