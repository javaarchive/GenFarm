package net.fabricmc.example;

import java.util.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.WorldChunk;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

public class GeneratorCore {
    List<World> worlds = new ArrayList<>();

    public void init(){
        // idk
    }

    public void postinit(){
        for(World w: this.worlds){
            // detect overworld test
            ExampleMod.LOGGER.info("World: " + (w.getDimensionKey() == DimensionTypes.OVERWORLD));
        }
    }

    public void genIndex(int wid, int i, int j){
        World w = this.worlds.get(wid);
    }
}
