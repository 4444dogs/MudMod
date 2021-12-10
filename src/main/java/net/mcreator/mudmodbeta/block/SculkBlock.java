
package net.mcreator.mudmodbeta.block;

import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class SculkBlock extends Block {
	public SculkBlock() {
		super(BlockBehaviour.Properties.of(Material.DIRT)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("mud_mod_beta:break.sculk")),
						() -> new SoundEvent(new ResourceLocation("mud_mod_beta:step.sculk")),
						() -> new SoundEvent(new ResourceLocation("mud_mod_beta:place.sculk")),
						() -> new SoundEvent(new ResourceLocation("mud_mod_beta:step.sculk")),
						() -> new SoundEvent(new ResourceLocation("mud_mod_beta:step.sculk"))))
				.strength(1f, 10f).requiresCorrectToolForDrops());
		setRegistryName("sculk");
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem()instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
