package com.blockypenguin.penguinnet.common;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonLoad implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Penguinnet Common");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}