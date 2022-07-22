package net.shiba73.betterpotions;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterPotions implements ModInitializer {
	public static final String MOD_ID = "betterpotions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModPotions.registerPotions();
	}
}
