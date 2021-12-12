package net.mcreator.mudmodbeta.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mud_mod_beta", "modelcustom_model"), "main");
	public final ModelPart voxel_file;

	public Modelcustom_model(ModelPart root) {
		this.voxel_file = root.getChild("voxel_file");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition voxel_file = partdefinition.addOrReplaceChild("voxel_file",
				CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -15.0F, 0.0F, 1.0F, 15.0F, 52.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-22.0F, -14.0F, 52.0F, 21.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-22.0F, -15.0F, 52.0F, 21.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.0F, -15.0F, 52.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -15.0F, 52.0F, 1.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.0F, -15.0F, 74.0F, 23.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-23.0F, -1.0F, 52.0F, 23.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		voxel_file.render(poseStack, buffer, packedLight, packedOverlay);
	}
}