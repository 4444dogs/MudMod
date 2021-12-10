
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudmodbeta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MudModBetaModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("mud_mod_beta", "break.sculk"), new SoundEvent(new ResourceLocation("mud_mod_beta", "break.sculk")));
		REGISTRY.put(new ResourceLocation("mud_mod_beta", "step.sculk"), new SoundEvent(new ResourceLocation("mud_mod_beta", "step.sculk")));
		REGISTRY.put(new ResourceLocation("mud_mod_beta", "place.sculk"), new SoundEvent(new ResourceLocation("mud_mod_beta", "place.sculk")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
