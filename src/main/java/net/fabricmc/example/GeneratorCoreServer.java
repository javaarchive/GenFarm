package net.fabricmc.example;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

public class GeneratorCoreServer extends GeneratorCore {
    @Override
    public void init(){
        ServerLifecycleEvents.SERVER_STARTED.register(minecraftServer -> {
            minecraftServer.getWorlds().forEach(world -> {
                this.worlds.add(world);
            });
            this.postinit();
        });
    }
}
