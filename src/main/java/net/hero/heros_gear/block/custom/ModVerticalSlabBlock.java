package net.hero.heros_gear.block.custom;

import com.mojang.serialization.MapCodec;
import net.hero.heros_gear.block.enums.VerticalSlabType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import static net.hero.heros_gear.property.ModProperties.VERTICAL_SLAB_TYPE;

/** Code by NemoNotFound
 * <a href="https://github.com/NemoNotFound/NemosVerticalSlabs">...</a>
 */

public class ModVerticalSlabBlock extends Block implements Waterloggable {

    public static final MapCodec<ModVerticalSlabBlock> CODEC = ModVerticalSlabBlock.createCodec(ModVerticalSlabBlock::new);
    public static EnumProperty<VerticalSlabType> TYPE = VERTICAL_SLAB_TYPE;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    protected static final VoxelShape FRONT_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 8);
    protected static final VoxelShape LEFT_SHAPE = Block.createCuboidShape(0, 0, 0, 8, 16, 16);
    protected static final VoxelShape RIGHT_SHAPE = Block.createCuboidShape(8, 0, 0, 16, 16, 16);
    protected static final VoxelShape BACK_SHAPE = Block.createCuboidShape(0, 0, 8, 16, 16, 16);
    private static final double leftArea = 0.333;
    private static final double rightArea = 0.666;

    public MapCodec<? extends ModVerticalSlabBlock> getCodec() {
        return CODEC;
    }

    public ModVerticalSlabBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(TYPE, VerticalSlabType.FRONT).with(WATERLOGGED, false));
    }

    @Override
    protected boolean hasSidedTransparency(BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VerticalSlabType slabType = state.get(TYPE);

        return switch (slabType) {
            case DOUBLE -> VoxelShapes.fullCube();
            case FRONT -> FRONT_SHAPE;
            case LEFT -> LEFT_SHAPE;
            case RIGHT -> RIGHT_SHAPE;
            case BACK -> BACK_SHAPE;
        };

    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);

        if (blockState.isOf(this)) {
            return blockState.with(TYPE, VerticalSlabType.DOUBLE).with(WATERLOGGED, false);
        }

        FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
        BlockState newblockState = this.getDefaultState().with(TYPE, VerticalSlabType.BACK).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        Direction direction = ctx.getSide();

        double zPos = ctx.getHitPos().z - (double)blockPos.getZ();
        double xPos = ctx.getHitPos().x - (double) blockPos.getX();

        if (direction == Direction.UP || direction == Direction.DOWN) {
            VerticalSlabType type = getVerticalSlabType(zPos, xPos);

            return newblockState.with(TYPE, type);
        }

        if (direction == Direction.SOUTH) {
            return getBlockStateForXPos(xPos, newblockState, VerticalSlabType.FRONT);
        } else if (direction == Direction.NORTH) {
            return getBlockStateForXPos(xPos, newblockState, VerticalSlabType.BACK);
        } else if (direction == Direction.WEST) {
            return getBlockStateForZPos(zPos, newblockState, VerticalSlabType.RIGHT);
        } else if (direction == Direction.EAST) {
            return getBlockStateForZPos(zPos, newblockState, VerticalSlabType.LEFT);
        }

        return newblockState;
    }

    private static VerticalSlabType getVerticalSlabType(double zPos, double xPos) {
        double diffZ = 1 - zPos;
        double diffX = 1 - xPos;
        VerticalSlabType type;

        if (zPos > 0.5) {
            if (xPos > 0.5) {
                type = diffX > diffZ ? VerticalSlabType.BACK : VerticalSlabType.RIGHT;
            } else {
                type = xPos > diffZ ? VerticalSlabType.BACK : VerticalSlabType.LEFT;
            }
        } else {
            if (xPos > 0.5) {
                type = diffX > zPos ? VerticalSlabType.FRONT : VerticalSlabType.RIGHT;
            } else {
                type = xPos > zPos ? VerticalSlabType.FRONT : VerticalSlabType.LEFT;
            }
        }

        return type;
    }

    private BlockState getBlockStateForXPos(double xPos, BlockState blockState, VerticalSlabType defaultSlabType) {
        if (xPos < leftArea) {
            return blockState.with(TYPE, VerticalSlabType.LEFT);
        }

        if (xPos > rightArea) {
            return blockState.with(TYPE, VerticalSlabType.RIGHT);
        }

        return blockState.with(TYPE, defaultSlabType);
    }

    private BlockState getBlockStateForZPos(double zPos, BlockState blockState, VerticalSlabType defaultSlabType) {
        if (zPos < leftArea) {
            return blockState.with(TYPE, VerticalSlabType.FRONT);
        }

        if (zPos > rightArea) {
            return blockState.with(TYPE, VerticalSlabType.BACK);
        }

        return blockState.with(TYPE, defaultSlabType);
    }

    @Override
    protected boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        VerticalSlabType slabType = state.get(TYPE);

        if (slabType == VerticalSlabType.DOUBLE || !itemStack.isOf(this.asItem())) {
            return false;
        }

        if (context.canReplaceExisting()) {
            Direction direction = context.getSide();

            if (slabType == VerticalSlabType.FRONT) {
                return direction == Direction.SOUTH;
            }

            if (slabType == VerticalSlabType.BACK) {
                return direction == Direction.NORTH;
            }

            if (slabType == VerticalSlabType.LEFT) {
                return direction == Direction.EAST;
            }

            if (slabType == VerticalSlabType.RIGHT) {
                return direction == Direction.WEST;
            }
        }

        return true;
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (isDoubleVerticalSlab(state)) {
            return Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState);
        }

        return false;
    }

    @Override
    public boolean canFillWithFluid(@Nullable PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        if (isDoubleVerticalSlab(state)) {
            return Waterloggable.super.canFillWithFluid(player, world, pos, state, fluid);
        }
        return false;
    }

    @Override
    protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return switch (type) {
            case LAND, AIR -> false;
            case WATER -> state.getFluidState().isIn(FluidTags.WATER);
        };
    }

    private boolean isDoubleVerticalSlab(BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }
}