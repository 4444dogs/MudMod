
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudmodbeta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mudmodbeta.item.MudBrickItem;
import net.mcreator.mudmodbeta.item.MudBlobItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MudModBetaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MUD = register(MudModBetaModBlocks.MUD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MUD_BLOB = register(new MudBlobItem());
	public static final Item MUD_BRICK = register(new MudBrickItem());
	public static final Item MUD_BRICKS = register(MudModBetaModBlocks.MUD_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_LOG = register(MudModBetaModBlocks.MANGROVE_LOG, CreativeModeTab.TAB_MATERIALS);
	public static final Item MANGROVE_LEAVES = register(MudModBetaModBlocks.MANGROVE_LEAVES, CreativeModeTab.TAB_MATERIALS);
	public static final Item MANGROVE_PLANKS = register(MudModBetaModBlocks.MANGROVE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_PROPAGULE = register(MudModBetaModBlocks.MANGROVE_PROPAGULE, CreativeModeTab.TAB_DECORATIONS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
