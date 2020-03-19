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
     * @param stage Generation Stage
     * @param feature Generation Feature
     * @param biomes Biomes to generate to
     */
    public static void Generate(Decoration stage, ConfiguredFeature<?, ?> feature, Biome... biomes) {
        for(Biome biome : biomes) {
            biome.addFeature(stage, feature);
        }
    }

    /**
     * Generates an ore on the specified biomes.
     * @param target The target block to replace (eg. Stone)
     * @param state The state of the block to replace with
     * @param veinSize The size of the vien.
     * @param chunkCount for chance
     * @param unk1 something
     * @param unk2 something
     * @param max Max height to generate to
     * @param biomes Biomes to generate to
     */
    public static void GenerateOre(FillerBlockType target, BlockState state, int veinSize, int chunkCount, int unk1, int unk2, int max, Biome... biomes) {
        Generate(Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(target, state, veinSize)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(chunkCount, unk1, unk2, max))), biomes);
    }
    /**
     * Generates an ore on all biomes.
     * @param target The target block to replace (eg. Stone)
     * @param state The state of the block to replace with
     * @param veinSize The size of the vien.
     * @param chunkCount for chance
     * @param unk1 something
     * @param unk2 something
     * @param max Max height to generate to
     */
    public static void GenerateOre(FillerBlockType target, BlockState state, int veinSize, int chunkCount, int unk1, int unk2, int max) {
        Biome[] biomes = {};
        GameRegistry.findRegistry(Biome.class).getValues().toArray(biomes);
        Generate(Decoration.UNDERGROUND_DECORATION, Feature.ORE.withConfiguration(new OreFeatureConfig(target, state, veinSize)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(chunkCount, unk1, unk2, max))), biomes);
    }
}
