
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudmodbeta.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mudmodbeta.block.SculkBlock;
import net.mcreator.mudmodbeta.block.MudBricksBlock;
import net.mcreator.mudmodbeta.block.MudBlock;
import net.mcreator.mudmodbeta.block.MangroveTrapdoorBlock;
import net.mcreator.mudmodbeta.block.MangroveStairsBlock;
import net.mcreator.mudmodbeta.block.MangroveSlabBlock;
import net.mcreator.mudmodbeta.block.MangrovePropaguleBlock;
import net.mcreator.mudmodbeta.block.MangrovePressurePlateBlock;
import net.mcreator.mudmodbeta.block.MangrovePlanksBlock;
import net.mcreator.mudmodbeta.block.MangroveLogBlock;
import net.mcreator.mudmodbeta.block.MangroveLeavesBlock;
import net.mcreator.mudmodbeta.block.MangroveFenceGateBlock;
import net.mcreator.mudmodbeta.block.MangroveFenceBlock;
import net.mcreator.mudmodbeta.block.MangroveDoorBlock;
import net.mcreator.mudmodbeta.block.MangroveButtonBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MudModBetaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MUD = register(new MudBlock());
	public static final Block MUD_BRICKS = register(new MudBricksBlock());
	public static final Block MANGROVE_LOG = register(new MangroveLogBlock());
	public static final Block MANGROVE_LEAVES = register(new MangroveLeavesBlock());
	public static final Block MANGROVE_PLANKS = register(new MangrovePlanksBlock());
	public static final Block MANGROVE_PROPAGULE = register(new MangrovePropaguleBlock());
	public static final Block MANGROVE_SLAB = register(new MangroveSlabBlock());
	public static final Block MANGROVE_STAIRS = register(new MangroveStairsBlock());
	public static final Block MANGROVE_FENCE = register(new MangroveFenceBlock());
	public static final Block MANGROVE_BUTTON = register(new MangroveButtonBlock());
	public static final Block MANGROVE_PRESSURE_PLATE = register(new MangrovePressurePlateBlock());
	public static final Block MANGROVE_DOOR = register(new MangroveDoorBlock());
	public static final Block MANGROVE_TRAPDOOR = register(new MangroveTrapdoorBlock());
	public static final Block MANGROVE_FENCE_GATE = register(new MangroveFenceGateBlock());
	public static final Block SCULK = register(new SculkBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MangroveLeavesBlock.registerRenderLayer();
			MangrovePropaguleBlock.registerRenderLayer();
			MangroveFenceBlock.registerRenderLayer();
			MangroveButtonBlock.registerRenderLayer();
			MangrovePressurePlateBlock.registerRenderLayer();
			MangroveDoorBlock.registerRenderLayer();
			MangroveTrapdoorBlock.registerRenderLayer();
			MangroveFenceGateBlock.registerRenderLayer();
		}
	}
}
