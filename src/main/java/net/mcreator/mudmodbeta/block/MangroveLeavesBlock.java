
package net.mcreator.mudmodbeta.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.mudmodbeta.init.MudModBetaModBlocks;

import java.util.List;
import java.util.Collections;

public class MangroveLeavesBlock extends Block {
	public MangroveLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES).sound(new ForgeSoundType(1.0f, 1.0f,
				() -> new SoundEvent(new ResourceLocation("block.grass.break")), () -> new SoundEvent(new ResourceLocation("block.glass.step")),
				() -> new SoundEvent(new ResourceLocation("block.grass.place")), () -> new SoundEvent(new ResourceLocation("block.grass.hit")),
				() -> new SoundEvent(new ResourceLocation("block.grass.fall")))).strength(0.2f, 1f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		setRegistryName("mangrove_leaves");
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
		return Collections.singletonList(new ItemStack(Blocks.AIR));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(MudModBetaModBlocks.MANGROVE_LEAVES, renderType -> renderType == RenderType.cutout());
	}
}
