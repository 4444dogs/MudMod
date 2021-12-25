
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudmodbeta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mudmodbeta.item.WardenSpawnEggItem;
import net.mcreator.mudmodbeta.item.MudBrickItem;
import net.mcreator.mudmodbeta.item.MudBlobItem;
import net.mcreator.mudmodbeta.item.BucketofTadpoleItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MudModBetaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item MUD = register(MudModBetaModBlocks.MUD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MUD_BLOB = register(new MudBlobItem());
	public static final Item MUD_BRICK = register(new MudBrickItem());
	public static final Item MUD_BRICKS = register(MudModBetaModBlocks.MUD_BRICKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_LOG = register(MudModBetaModBlocks.MANGROVE_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_LEAVES = register(MudModBetaModBlocks.MANGROVE_LEAVES, CreativeModeTab.TAB_MATERIALS);
	public static final Item MANGROVE_PLANKS = register(MudModBetaModBlocks.MANGROVE_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_PROPAGULE = register(MudModBetaModBlocks.MANGROVE_PROPAGULE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item MANGROVE_SLAB = register(MudModBetaModBlocks.MANGROVE_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_STAIRS = register(MudModBetaModBlocks.MANGROVE_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_FENCE = register(MudModBetaModBlocks.MANGROVE_FENCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_BUTTON = register(MudModBetaModBlocks.MANGROVE_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_PRESSURE_PLATE = register(MudModBetaModBlocks.MANGROVE_PRESSURE_PLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_DOOR = register(MudModBetaModBlocks.MANGROVE_DOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_TRAPDOOR = register(MudModBetaModBlocks.MANGROVE_TRAPDOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item MANGROVE_FENCE_GATE = register(MudModBetaModBlocks.MANGROVE_FENCE_GATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item SCULK = register(MudModBetaModBlocks.SCULK, CreativeModeTab.TAB_REDSTONE);
	public static final Item BUCKETOF_TADPOLE = register(new BucketofTadpoleItem());
	public static final Item WARDEN_SPAWN_EGG = register(new WardenSpawnEggItem());
	public static final Item FIREFLY = register(
			new SpawnEggItem(MudModBetaModEntities.FIREFLY, -9457920, -15922164, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("firefly_spawn_egg"));

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
