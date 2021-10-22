
package net.mcreator.mudmod.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.mudmod.MudModModElements;

import java.util.List;
import java.util.Collections;

@MudModModElements.ModElement.Tag
public class MangroveLeavesBlock extends MudModModElements.ModElement {
	@ObjectHolder("mud_mod:mangrove_leaves")
	public static final Block block = null;
	public MangroveLeavesBlock(MudModModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutout());
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.grass.break")),
							() -> new SoundEvent(new ResourceLocation("block.glass.step")),
							() -> new SoundEvent(new ResourceLocation("block.grass.place")),
							() -> new SoundEvent(new ResourceLocation("block.grass.hit")),
							() -> new SoundEvent(new ResourceLocation("block.grass.fall"))))
					.hardnessAndResistance(0.2f, 1f).setLightLevel(s -> 0).notSolid().setOpaque((bs, br, bp) -> false));
			setRegistryName("mangrove_leaves");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.AIR));
		}
	}
}
