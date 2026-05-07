package com.zyphron.memoryleakfix;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemoryLeakFix implements ModInitializer {

    public static final String MOD_ID = "memoryleakfix";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Memory Leak Fix loaded! Fixing leaks...");
    }
}
