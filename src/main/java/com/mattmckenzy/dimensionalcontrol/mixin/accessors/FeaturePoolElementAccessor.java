package com.mattmckenzy.dimensionalcontrol.mixin.accessors;

import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.pools.FeaturePoolElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FeaturePoolElement.class)
public interface FeaturePoolElementAccessor
{
    @Accessor("feature")
    Holder<PlacedFeature> feature();
}
