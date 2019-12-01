package com.yungnickyoung.minecraft.bettercaves.config.cave;

import com.yungnickyoung.minecraft.bettercaves.enums.CaveBiomeSize;
import net.minecraftforge.common.config.Config;

public class ConfigCaves {
    @Config.Name("Type 1 Caves")
    @Config.Comment("Parameters used in the generation of caves made with cubic noise. Type 1 Caves are a little " +
            "less spacious than Type 2 Caves, and have more long, winding tunnels instead of large rooms. Does not " +
            "affect caverns found at low altitudes.")
    public ConfigCubicCave cubicCave = new ConfigCubicCave();

    @Config.Name("Type 2 Caves")
    @Config.Comment("Parameters used in the generation of caves made with simplex noise. Type 2 Caves tend to have " +
            "more open, spacious rooms than Type 1 Caves, with shorter winding passages. Does not include the " +
            "large caverns found at low altitudes.")
    public ConfigSimplexCave simplexCave = new ConfigSimplexCave();

    @Config.Name("Vanilla Caves")
    @Config.Comment("Settings controlling vanilla Minecraft cave generation.")
    public ConfigVanillaCave vanillaCave = new ConfigVanillaCave();

    @Config.Name("Cave Biome Size")
    @Config.Comment("Determines how large cave biomes are. Controls how long a cave system of a certain cave type" +
            " extends before intersecting with a cave system of another type. Larger Biome Size = more " +
            "cave interconnectivity for a given area, but possibly less variation.")
    @Config.RequiresWorldRestart
    public CaveBiomeSize caveBiomeSize = CaveBiomeSize.Large;

    @Config.Name("Cave Surface Cutoff Depth")
    @Config.Comment("The depth from a given point on the surface (or the Max Cave Altitude, whichever is " +
            "lower) at which caves start to close off. Decrease this to create more cave openings in the sides of " +
            "mountains. Increase to create less above-surface openings.")
    @Config.RequiresWorldRestart
    public int surfaceCutoff = 10;

    @Config.Name("Max Cave Altitude")
    @Config.Comment("The maximum altitude at which caves can generate")
    @Config.RequiresWorldRestart
    public int maxCaveAltitude = 128;
}
