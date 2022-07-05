package net.killallhamsters.newmod;

import net.fabricmc.api.ModInitializer;
import net.killallhamsters.newmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HoneyWine implements ModInitializer {
    public static final String MOD_ID = "newmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();


    }
}