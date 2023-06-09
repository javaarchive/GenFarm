package net.fabricmc.example;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("genfarm");

	GeneratorCore gc;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		if(FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT){
			LOGGER.warn("Client gen not impl");
		}else{
			LOGGER.info("Initilaizing server generator...");
			gc = new GeneratorCoreServer();
		}
		if(gc != null){
			gc.init();
		}
		LOGGER.info("Hello Fabric world!");
	}
}
