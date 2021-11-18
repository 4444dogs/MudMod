
package net.mcreator.mudmodbeta.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.mudmodbeta.init.MudModBetaModItems;

import java.util.List;
import java.util.Collections;

public class MudBlock extends FallingBlock {
	public MudBlock() {
		super(Block.Properties.of(Material.DIRT).sound(SoundType.SLIME_BLOCK).strength(1f, 10f).lightLevel(s -> 0));
		setRegistryName("mud");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(MudModBetaModItems.MUD_BLOB, (int) (4)));
	}
}
