package com.daedricscrew.daedricscrewmod1.util;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GenerationUtil {
    /**
     * World generation method.
     * @param stage
     * @param feature
     * @param biomes
     */
    public static void Generate(Decoration stage, ConfiguredFeature<?, ?> feature, Biome... biomes) {
        for(Biome biome : biomes) {
            biome.addFeature(stage, feature);
        }
    }

    /**
     * Generates an ore on the specified biomes.
     * @param target
     * @param state
     * @param veinSize
     * @param chunkCount
     * @param unk1
     * @param unk2
     * @param max
     * @param biomes
     */
    public static void GenerateOre(FillerBlockType target, BlockState state, int veinSize, int chunkCount, int unk1, int unk2, int max, Biome... biomes) {
        Generate(Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(target, state, veinSize)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(chunkCount, unk1, unk2, max))), biomes);
    }
    /**
     * Generates an ore on all biomes.
     * @param target
     * @param state
     * @param veinSize
     * @param chunkCount
     * @param unk1
     * @param unk2
     * @param max
     */
    public static void GenerateOre(FillerBlockType target, BlockState state, int veinSize, int chunkCount, int unk1, int unk2, int max) {
        Biome[] biomes = {};
        Generate(Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(target, state, veinSize)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(chunkCount, unk1, unk2, max))), GameRegistry.findRegistry(Biome.class).getValues().toArray(biomes));
    }
}
