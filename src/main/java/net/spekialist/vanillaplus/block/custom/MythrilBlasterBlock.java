package net.spekialist.vanillaplus.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class MythrilBlasterBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public MythrilBlasterBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(13, 0, 0, 16, 3, 3),
            Block.createCuboidShape(13, 0, 13, 16, 3, 16),
            Block.createCuboidShape(0, 0, 13, 3, 3, 16),
            Block.createCuboidShape(0, 0, 0, 3, 3, 3),
            Block.createCuboidShape(3, 2, 4, 13, 6, 5),
            Block.createCuboidShape(2, 0, 1, 14, 2, 14),
            Block.createCuboidShape(3, 0, 15, 13, 2, 16),
            Block.createCuboidShape(3, 2, 5, 13, 14, 14),
            Block.createCuboidShape(3, 0, 14, 13, 7, 15),
            Block.createCuboidShape(4, 13, 7, 12, 15, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(13, 0, 13, 16, 3, 16),
            Block.createCuboidShape(0, 0, 13, 3, 3, 16),
            Block.createCuboidShape(0, 0, 0, 3, 3, 3),
            Block.createCuboidShape(13, 0, 0, 16, 3, 3),
            Block.createCuboidShape(11, 2, 3, 12, 6, 13),
            Block.createCuboidShape(2, 0, 2, 15, 2, 14),
            Block.createCuboidShape(0, 0, 3, 1, 2, 13),
            Block.createCuboidShape(2, 2, 3, 11, 14, 13),
            Block.createCuboidShape(1, 0, 3, 2, 7, 13),
            Block.createCuboidShape(3, 13, 4, 9, 15, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(0, 0, 13, 3, 3, 16),
            Block.createCuboidShape(0, 0, 0, 3, 3, 3),
            Block.createCuboidShape(13, 0, 0, 16, 3, 3),
            Block.createCuboidShape(13, 0, 13, 16, 3, 16),
            Block.createCuboidShape(3, 2, 11, 13, 6, 12),
            Block.createCuboidShape(2, 0, 2, 14, 2, 15),
            Block.createCuboidShape(3, 0, 0, 13, 2, 1),
            Block.createCuboidShape(3, 2, 2, 13, 14, 11),
            Block.createCuboidShape(3, 0, 1, 13, 7, 2),
            Block.createCuboidShape(4, 13, 3, 12, 15, 9)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(0, 0, 0, 3, 3, 3),
            Block.createCuboidShape(13, 0, 0, 16, 3, 3),
            Block.createCuboidShape(13, 0, 13, 16, 3, 16),
            Block.createCuboidShape(0, 0, 13, 3, 3, 16),
            Block.createCuboidShape(4, 2, 3, 5, 6, 13),
            Block.createCuboidShape(1, 0, 2, 14, 2, 14),
            Block.createCuboidShape(15, 0, 3, 16, 2, 13),
            Block.createCuboidShape(5, 2, 3, 14, 14, 13),
            Block.createCuboidShape(14, 0, 3, 15, 7, 13),
            Block.createCuboidShape(7, 13, 4, 13, 15, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
