package net.hero.heros_gear.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.WallBlock;

import java.util.Optional;

public class HanasOxidizableWallBlock extends WallBlock implements Oxidizable {
    public HanasOxidizableWallBlock(OxidationLevel unaffected, BlockState state, Settings settings) {
        super(settings);
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return null;
    }

    public Optional<BlockState> getDegradationLevel(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).map(block -> block.getStateWithProperties(state));
    }

}
