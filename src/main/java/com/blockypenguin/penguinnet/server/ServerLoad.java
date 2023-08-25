package com.blockypenguin.penguinnet.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.DedicatedServerModInitializer;

public class ServerLoad implements DedicatedServerModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Penguinnet Server");

	@Override
	public void onInitializeServer() {
		LOGGER.info("Hello Fabric world!");
	}
}