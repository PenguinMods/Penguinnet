package com.blockypenguin.penguinnet.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;

public class ClientLoad implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Penguinnet Client");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Hello Fabric world!");
	}
}