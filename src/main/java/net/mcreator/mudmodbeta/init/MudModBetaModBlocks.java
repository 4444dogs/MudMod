
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

import net.mcreator.mudmodbeta.block.MudBricksBlock;
import net.mcreator.mudmodbeta.block.MudBlock;
import net.mcreator.mudmodbeta.block.MangrovePropaguleBlock;
import net.mcreator.mudmodbeta.block.MangrovePlanksBlock;
import net.mcreator.mudmodbeta.block.MangroveLogBlock;
import net.mcreator.mudmodbeta.block.MangroveLeavesBlock;

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
		}
	}
}
