//package com.axperty.storagedelight.block;
//
//import com.axperty.storagedelight.block.entity.PantryCabinetBlockEntity;
//import com.mojang.serialization.MapCodec;
//import net.minecraft.core.BlockPos;
//import net.minecraft.core.Direction;
//import net.minecraft.server.level.ServerLevel;
//import net.minecraft.stats.Stats;
//import net.minecraft.util.RandomSource;
//import net.minecraft.world.Containers;
//import net.minecraft.world.InteractionResult;
//import net.minecraft.world.entity.monster.piglin.PiglinAi;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.item.context.BlockPlaceContext;
//import net.minecraft.world.level.BlockGetter;
//import net.minecraft.world.level.Level;
//import net.minecraft.world.level.block.BaseEntityBlock;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Mirror;
//import net.minecraft.world.level.block.Rotation;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.block.state.StateDefinition;
//import net.minecraft.world.level.block.state.properties.*;
//import net.minecraft.world.phys.BlockHitResult;
//import net.minecraft.world.phys.shapes.CollisionContext;
//import net.minecraft.world.phys.shapes.VoxelShape;
//
//import javax.annotation.Nullable;
//
//@SuppressWarnings("deprecation")
//public class PantryCabinetBlock extends BaseEntityBlock
//{
//    public static final MapCodec<PantryCabinetBlock> CODEC = simpleCodec(PantryCabinetBlock::new);
//    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
//    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;
//    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
//
//    public MapCodec<PantryCabinetBlock> codec() {
//        return CODEC;
//    }
//
//    public PantryCabinetBlock(Properties properties) {
//        super(properties);
//        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(OPEN, false));
//    }
//
//    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
//        if (level instanceof ServerLevel serverlevel) {
//            BlockEntity var8 = level.getBlockEntity(pos);
//            if (var8 instanceof PantryCabinetBlockEntity pantryCabinetBlockEntity) {
//                player.openMenu(pantryCabinetBlockEntity);
//                player.awardStat(Stats.OPEN_BARREL);
//                PiglinAi.angerNearbyPiglins(serverlevel, player, true);
//            }
//        }
//
//        return InteractionResult.SUCCESS;
//    }
//
//    protected void affectNeighborsAfterRemoval(BlockState state, ServerLevel level, BlockPos pos, boolean movedByPiston) {
//        Containers.updateNeighboursAfterDestroy(state, level, pos);
//    }
//
//    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
//        BlockEntity blockentity = level.getBlockEntity(pos);
//        if (blockentity instanceof PantryCabinetBlockEntity) {
//            ((PantryCabinetBlockEntity)blockentity).recheckOpen();
//        }
//
//    }
//
//    @Nullable
//    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
//        return new PantryCabinetBlockEntity(pos, state);
//    }
//
//    protected boolean hasAnalogOutputSignal(BlockState state) {
//        return true;
//    }
//
//    protected int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos, Direction direction) {
//        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(level.getBlockEntity(pos));
//    }
//
//    protected BlockState rotate(BlockState state, Rotation rotation) {
//        return (BlockState)state.setValue(FACING, rotation.rotate((Direction)state.getValue(FACING)));
//    }
//
//    protected BlockState mirror(BlockState state, Mirror mirror) {
//        return state.rotate(mirror.getRotation((Direction)state.getValue(FACING)));
//    }
//
//    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
//        builder.add(new Property[]{FACING, OPEN});
//    }
//
//    public BlockState getStateForPlacement(BlockPlaceContext context) {
//        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
//    }
//
//    @Override
//    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
//        // This tells the game the hitbox is 16x32x16
//        return Block.box(0.0D, 0.0D, 0.0D, 16.0D, 32.0D, 16.0D);
//    }
//}