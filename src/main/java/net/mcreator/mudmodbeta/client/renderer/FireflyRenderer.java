package net.mcreator.mudmodbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mudmodbeta.entity.FireflyEntity;
import net.mcreator.mudmodbeta.client.model.Modelcustom_model;

public class FireflyRenderer extends MobRenderer<FireflyEntity, Modelcustom_model<FireflyEntity>> {
	public FireflyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FireflyEntity entity) {
		return new ResourceLocation("mud_mod_beta:textures/custom_model.png");
	}
}
