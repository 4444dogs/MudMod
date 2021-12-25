
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mudmodbeta.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mudmodbeta.entity.FireflyEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MudModBetaModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<FireflyEntity> FIREFLY = register("firefly",
			EntityType.Builder.<FireflyEntity>of(FireflyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(FireflyEntity::new).sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FireflyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FIREFLY, FireflyEntity.createAttributes().build());
	}
}
