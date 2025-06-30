package ua.phoen1x.block;

import eu.pb4.polymer.blocks.api.BlockModelType;
import eu.pb4.polymer.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ua.phoen1x.ColorfulLamp;

public class PolyRedstoneLamp extends RedstoneLampBlock implements PolymerTexturedBlock {
    private final BlockState modelOn;
    private final BlockState modelOff;
    public static final BooleanProperty LIT = Properties.LIT;

    public PolyRedstoneLamp(Settings settings, String path) {
        super(settings);
        this.modelOn = PolymerBlockResourceUtils.requestBlock(
                BlockModelType.FULL_BLOCK,
                PolymerBlockModel.of(Identifier.of(ColorfulLamp.MOD_ID, "block/" + path + "_on"))
        );
        this.modelOff = PolymerBlockResourceUtils.requestBlock(
                BlockModelType.FULL_BLOCK,
                PolymerBlockModel.of(Identifier.of(ColorfulLamp.MOD_ID, "block/" + path + "_off"))
        );
        this.setDefaultState(this.getDefaultState().with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            world.playSound(null, pos, SoundEvents.BLOCK_GLASS_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return state.get(LIT) ? modelOn : modelOff;
    }
}