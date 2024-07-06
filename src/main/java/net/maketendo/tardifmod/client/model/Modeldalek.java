package net.maketendo.tardifmod.client.model;

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

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldalek<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("tardif_mod", "modeldalek"), "main");
	public final ModelPart bone;

	public Modeldalek(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(43, 18).addBox(9.5F, 1.0F, -8.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(9.5F, -4.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(14.5F, 1.0F, -8.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(14.5F, -4.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(14.5F, -9.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(16.0F, -9.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(8.0F, -9.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(8.0F, -9.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(9.5F, -9.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(9.5F, -4.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(9.5F, 1.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(14.5F, -9.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(14.5F, -4.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(14.5F, 1.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(8.0F, -4.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(8.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(8.0F, 1.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(8.0F, 1.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(16.0F, -9.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(16.0F, -4.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(16.0F, -4.0F, -4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(16.0F, 1.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(16.0F, 1.0F, 0.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18).addBox(9.5F, -9.0F, -6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(70, 107)
						.addBox(8.0F, 6.0F, -9.0F, 12.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(20, 79).addBox(10.0F, -12.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 79)
						.addBox(16.0F, -12.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(9.0F, -13.0F, -4.0F, 10.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(42, 65)
						.addBox(9.0F, -17.0F, -3.5F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 111).addBox(8.5F, -22.0F, -4.0F, 11.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(69, 0)
						.addBox(19.0F, -23.2929F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 0).addBox(8.0F, -23.2929F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(118, 0)
						.addBox(13.0F, -20.0F, -9.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(116, 12).addBox(13.5F, -19.5F, -10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(116, 12)
						.addBox(10.5F, -11.5F, -10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(116, 12).addBox(16.5F, -11.5F, -10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(97, 33)
						.addBox(16.0F, -12.0F, -10.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 113).addBox(13.0F, -20.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 34)
						.addBox(13.0F, -20.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(10.0F, -12.0F, -13.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(9.0F, -9.0F, -4.0F, 10.0F, 15.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(120, 63).addBox(9.0F, -9.0F, -8.0F, 0.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(120, 63)
						.addBox(19.0F, -9.0F, -8.0F, 0.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.0F, 16.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 77).addBox(4.99F, -1.0F, -8.5F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 77)
				.addBox(-4.989F, -1.0F, -8.5F, 0.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-5.0F, -1.0F, -8.5F, 10.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0F, -0.5308F, -5.234F, 1.309F, 0.0F, 0.0F));
		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(119, 15).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.0F, -11.0F, -11.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
