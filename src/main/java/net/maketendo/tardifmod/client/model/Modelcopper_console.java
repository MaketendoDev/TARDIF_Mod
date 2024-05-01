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

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcopper_console<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("tardif_mod", "modelcopper_console"), "main");
	public final ModelPart bb_main3;
	public final ModelPart bone2;

	public Modelcopper_console(ModelPart root) {
		this.bb_main3 = root.getChild("bb_main3");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main3 = partdefinition.addOrReplaceChild("bb_main3",
				CubeListBuilder.create().texOffs(0, 38).addBox(-8.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(60, 83).addBox(-7.0F, -36.8F, -4.5F, 14.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(60, 83)
						.addBox(-7.0F, -48.8F, -4.5F, 14.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 156).addBox(7.0F, -48.8F, -4.5F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 156)
						.addBox(7.0F, -36.8F, -4.5F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 156).addBox(7.0F, -60.8F, -4.5F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 153)
						.addBox(7.0F, -66.8F, -4.5F, 1.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(60, 83).addBox(-7.0F, -60.8F, -4.5F, 14.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(80, 21)
						.addBox(-7.0F, -66.8F, -4.5F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(84, 60).addBox(-7.0F, -24.8F, -4.5F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 27.0F, -1.0F));
		PartDefinition Rotor_r1 = bb_main3.addOrReplaceChild("Rotor_r1",
				CubeListBuilder.create().texOffs(20, 156).addBox(-0.5F, -6.0F, -7.0F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 162).addBox(-0.5F, -36.0F, -7.0F, 1.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 156)
						.addBox(-0.5F, -30.0F, -7.0F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(20, 156).addBox(-0.5F, -18.0F, -7.0F, 1.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5F, -30.8F, 2.5F, 0.0F, 3.1416F, 0.0F));
		PartDefinition Pannel8 = bb_main3.addOrReplaceChild("Pannel8", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Lock2 = bb_main3.addOrReplaceChild("Lock2", CubeListBuilder.create(), PartPose.offset(-2.0F, -18.8768F, -15.384F));
		PartDefinition Flicky4 = bb_main3.addOrReplaceChild("Flicky4", CubeListBuilder.create(), PartPose.offset(13.4505F, -18.1927F, 11.2298F));
		PartDefinition Flicky5 = bb_main3.addOrReplaceChild("Flicky5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Soundandscannr2 = bb_main3.addOrReplaceChild("Soundandscannr2", CubeListBuilder.create(), PartPose.offset(-15.1367F, -18.5347F, 6.4298F));
		PartDefinition Flicky6 = bb_main3.addOrReplaceChild("Flicky6", CubeListBuilder.create(), PartPose.offset(4.0F, -18.1927F, 17.2634F));
		PartDefinition Pannel14 = bb_main3.addOrReplaceChild("Pannel14", CubeListBuilder.create().texOffs(84, 76).addBox(4.4449F, -17.8507F, 21.7777F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.0F, 0.0F, -32.0F, 0.0F, -1.0472F, 0.0F));
		PartDefinition bb_main8_r1 = Pannel14.addOrReplaceChild("bb_main8_r1",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 98).addBox(-1.0F, -23.0F, -13.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(163, 75)
						.addBox(-0.5F, -24.5F, -14.9F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 76).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4449F, 0.0F, 40.9808F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r1 = Pannel14.addOrReplaceChild("bb_main10_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-8.0F, -31.28F, -25.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.5423F, 6.6334F, 51.3982F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main7_r1 = Pannel14.addOrReplaceChild("bb_main7_r1", CubeListBuilder.create().texOffs(32, 119).addBox(-1.0F, -31.28F, -4.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.9096F, 6.6334F, 36.7117F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main8_r2 = Pannel14.addOrReplaceChild("bb_main8_r2",
				CubeListBuilder.create().texOffs(0, 6).addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 51)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 11).addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 101)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(161, 101).addBox(0.5F, -25.0F, -5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(161, 101)
						.addBox(-0.5F, -25.0F, -5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(161, 101).addBox(-0.5F, -24.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(149, 15)
						.addBox(-2.0F, -23.5F, -11.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 0).addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21)
						.addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(16, 42)
						.addBox(-6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(40, 60).addBox(-5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(120, 0)
						.addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(40, 119).addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4449F, 0.0F, 40.9808F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main8_r3 = Pannel14.addOrReplaceChild("bb_main8_r3", CubeListBuilder.create().texOffs(161, 101).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4449F, -21.3124F, 27.9028F, 0.9599F, 0.0F, 0.0F));
		PartDefinition bb_main11_r1 = Pannel14.addOrReplaceChild("bb_main11_r1",
				CubeListBuilder.create().texOffs(87, 138).addBox(1.0F, -23.0F, -40.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(1.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8717F, 5.7266F, 53.5619F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main9_r1 = Pannel14.addOrReplaceChild("bb_main9_r1", CubeListBuilder.create().texOffs(12, 0).addBox(-34.0F, -24.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(42.3648F, 5.7266F, 23.3395F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main7_r2 = Pannel14.addOrReplaceChild("bb_main7_r2",
				CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -22.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(148, 64).addBox(-1.0F, -25.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(129, 62)
						.addBox(-1.0F, -25.0F, -11.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(2, 58).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4449F, 0.0F, 40.9808F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r4 = Pannel14.addOrReplaceChild("bb_main8_r4", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -5.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.786F, -13.2734F, 27.7152F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main7_r3 = Pannel14.addOrReplaceChild("bb_main7_r3", CubeListBuilder.create().texOffs(102, 80).addBox(-1.0F, 12.0F, -29.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.1038F, -2.2734F, 46.7677F, 0.0F, 0.5236F, -3.1416F));
		PartDefinition bb_main11_r2 = Pannel14.addOrReplaceChild("bb_main11_r2", CubeListBuilder.create().texOffs(189, 113).addBox(0.0F, -41.0F, 16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.2512F, 13.1751F, 38.8521F, -0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r2 = Pannel14.addOrReplaceChild("bb_main10_r2", CubeListBuilder.create().texOffs(189, 113).addBox(0.0F, -31.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.5814F, 5.6586F, 40.0122F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r3 = Pannel14.addOrReplaceChild("bb_main10_r3", CubeListBuilder.create().texOffs(189, 113).addBox(-1.0F, -32.0F, 39.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9858F, -1.2243F, 24.1331F, -0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r2 = Pannel14.addOrReplaceChild("bb_main9_r2", CubeListBuilder.create().texOffs(189, 113).addBox(-2.0F, -33.0F, -12.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0789F, 7.2789F, 41.3468F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main10_r4 = Pannel14.addOrReplaceChild("bb_main10_r4", CubeListBuilder.create().texOffs(189, 113).addBox(5.0F, -32.5F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.523F, 5.817F, 43.2377F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main9_r3 = Pannel14.addOrReplaceChild("bb_main9_r3", CubeListBuilder.create().texOffs(189, 113).addBox(17.5F, -36.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2282F, 13.7354F, 43.7876F, -0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main9_r4 = Pannel14.addOrReplaceChild("bb_main9_r4", CubeListBuilder.create().texOffs(189, 113).addBox(-2.0F, -29.5F, 37.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0554F, -2.8445F, 24.7177F, -0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r5 = Pannel14.addOrReplaceChild("bb_main8_r5",
				CubeListBuilder.create().texOffs(189, 113).addBox(-1.0F, -31.5F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(187, 101).addBox(-1.5F, -32.0F, -7.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0652F, 7.1997F, 38.859F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main12_r1 = Pannel14.addOrReplaceChild("bb_main12_r1",
				CubeListBuilder.create().texOffs(152, 224).addBox(-1.5F, -36.0F, 17.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 224).addBox(-3.5F, -36.0F, 17.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(141, 206)
						.addBox(-3.5F, -34.0F, 14.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(77, 111).addBox(-1.5F, -35.0F, 14.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0652F, 7.1997F, 38.859F, -0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r5 = Pannel14.addOrReplaceChild("bb_main9_r5", CubeListBuilder.create().texOffs(75, 111).addBox(-3.5F, -32.0F, 28.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(26.5734F, -0.6943F, 27.9736F, -0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r5 = Pannel14.addOrReplaceChild("bb_main10_r5", CubeListBuilder.create().texOffs(189, 113).addBox(-1.5F, -1.5F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(34.618F, -19.9142F, 43.4484F, 2.5625F, 1.5418F, 2.8247F));
		PartDefinition bb_main9_r6 = Pannel14.addOrReplaceChild("bb_main9_r6",
				CubeListBuilder.create().texOffs(161, 101).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 111).addBox(-1.0F, -0.5F, -5.5F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(35.8563F, -20.6252F, 43.9081F, 2.5625F, 1.5418F, 2.8247F));
		PartDefinition bb_main7_r4 = Pannel14.addOrReplaceChild("bb_main7_r4", CubeListBuilder.create().texOffs(187, 101).addBox(-2.5F, -32.0F, -2.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.9473F, 8.6615F, 35.7181F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main9_r7 = Pannel14.addOrReplaceChild("bb_main9_r7", CubeListBuilder.create().texOffs(144, 77).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.955F, -22.0325F, 27.2759F, -0.0524F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r6 = Pannel14.addOrReplaceChild("bb_main8_r6", CubeListBuilder.create().texOffs(149, 75).addBox(-0.5F, -2.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2518F, -21.525F, 27.5221F, 1.0385F, 0.5236F, 0.0F));
		PartDefinition bb_main7_r5 = Pannel14.addOrReplaceChild("bb_main7_r5", CubeListBuilder.create().texOffs(0, 77).addBox(-4.0F, -1.0F, -19.5F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.4449F, -22.1561F, 34.0915F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone16 = Pannel14.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Pannel34 = bb_main3.addOrReplaceChild("Pannel34", CubeListBuilder.create().texOffs(84, 76).addBox(6.0F, -17.8507F, 9.7969F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-16.0F, 0.0F, -30.0F));
		PartDefinition bb_main9_r8 = Pannel34.addOrReplaceChild("bb_main9_r8", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 98)
				.addBox(-1.0F, -23.0F, -13.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(58, 2).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 0.0F, 29.0F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main11_r3 = Pannel34.addOrReplaceChild("bb_main11_r3", CubeListBuilder.create().texOffs(24, 119).addBox(-8.0F, -31.28F, -25.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.0974F, 6.6334F, 39.4174F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r7 = Pannel34.addOrReplaceChild("bb_main8_r7", CubeListBuilder.create().texOffs(32, 119).addBox(-1.0F, -31.28F, -4.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.4648F, 6.6334F, 24.7309F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main9_r9 = Pannel34.addOrReplaceChild("bb_main9_r9",
				CubeListBuilder.create().texOffs(0, 6).addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 51)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 11).addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(82, 174)
						.addBox(-1.0F, -26.0F, -9.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(188, 57).addBox(-1.0F, -24.0F, -13.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(42, 101)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(57, 109).addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21)
						.addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51).addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(76, 0)
						.addBox(-6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(56, 139).addBox(-5.5F, -24.0F, -9.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 83)
						.addBox(-5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(83, 109).addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(180, 170)
						.addBox(-3.0F, -25.0F, -6.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 113).addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 0.0F, 29.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main11_r4 = Pannel34.addOrReplaceChild("bb_main11_r4", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4268F, 5.7266F, 41.5812F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main11_r5 = Pannel34.addOrReplaceChild("bb_main11_r5", CubeListBuilder.create().texOffs(150, 182).addBox(-0.5F, -1.5F, 3.9999F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4081F, -17.2734F, 6.4581F, -0.3008F, 0.4353F, -0.6342F));
		PartDefinition bb_main10_r6 = Pannel34.addOrReplaceChild("bb_main10_r6", CubeListBuilder.create().texOffs(12, 39).addBox(-34.0F, -24.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(43.9199F, 5.7266F, 11.3588F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r8 = Pannel34.addOrReplaceChild("bb_main8_r8",
				CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -22.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(117, 99).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, 0.0F, 29.0F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r10 = Pannel34.addOrReplaceChild("bb_main9_r10", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -5.0F, -6.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3411F, -13.2734F, 15.7344F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r9 = Pannel34.addOrReplaceChild("bb_main8_r9", CubeListBuilder.create().texOffs(102, 80).addBox(-1.0F, 12.0F, -29.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6589F, -2.2734F, 34.787F, 0.0F, 0.5236F, -3.1416F));
		PartDefinition bb_main8_r10 = Pannel34.addOrReplaceChild("bb_main8_r10", CubeListBuilder.create().texOffs(114, 35).addBox(-4.0F, -1.0F, -19.5F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.0F, -22.1561F, 22.1108F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone4 = Pannel34.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone8 = Pannel34.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(16.0F, 0.0F, 29.0F));
		PartDefinition bb_main9_r11 = bone8.addOrReplaceChild("bb_main9_r11",
				CubeListBuilder.create().texOffs(174, 220).addBox(0.0F, -24.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(174, 220).addBox(-3.0F, -24.0F, -5.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Pannel37 = bb_main3.addOrReplaceChild("Pannel37", CubeListBuilder.create().texOffs(122, 31).addBox(-10.8286F, -0.5785F, -4.7695F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8286F, -17.2722F, 19.4336F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bb_main10_r7 = Pannel37.addOrReplaceChild("bb_main10_r7",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 98).addBox(-1.0F, -23.0F, -13.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(107, 157)
						.addBox(-1.0F, -28.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(107, 157).addBox(-1.0F, -28.0F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(107, 157)
						.addBox(1.0F, -28.0F, -4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 151).addBox(-1.0F, -26.0F, -6.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 101)
						.addBox(-1.0F, -24.0F, -16.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8286F, 17.2722F, 14.4336F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main15_r1 = Pannel37.addOrReplaceChild("bb_main15_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-14.0F, 7.72F, -8.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7666F, 20.9056F, 20.8861F, -1.5708F, -0.5236F, 0.0F));
		PartDefinition bb_main16_r1 = Pannel37.addOrReplaceChild("bb_main16_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-17.0F, -19.28F, -13.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.331F, 25.9056F, 28.1046F, -1.5708F, -0.5236F, 0.0F));
		PartDefinition bb_main17_r1 = Pannel37.addOrReplaceChild("bb_main17_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-1.0F, -15.28F, -13.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8682F, 25.9056F, 23.5687F, -1.5708F, 0.5236F, 0.0F));
		PartDefinition bb_main16_r2 = Pannel37.addOrReplaceChild("bb_main16_r2", CubeListBuilder.create().texOffs(24, 119).addBox(-6.0F, -15.28F, -13.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4663F, 25.9056F, 23.0687F, -1.5708F, 0.5236F, 0.0F));
		PartDefinition bb_main15_r2 = Pannel37.addOrReplaceChild("bb_main15_r2", CubeListBuilder.create().texOffs(24, 119).addBox(-14.0F, -19.28F, -13.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.465F, 25.9056F, 28.6046F, -1.5708F, -0.5236F, 0.0F));
		PartDefinition bb_main14_r1 = Pannel37.addOrReplaceChild("bb_main14_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-17.0F, 17.72F, -13.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.6326F, 25.9056F, 30.0463F, -1.5708F, -0.5236F, 0.0F));
		PartDefinition bb_main17_r2 = Pannel37.addOrReplaceChild("bb_main17_r2",
				CubeListBuilder.create().texOffs(24, 119).addBox(-12.0F, -12.28F, -11.0F, 2.0F, 10.28F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 119).addBox(-15.0F, -12.28F, -11.0F, 2.0F, 10.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.113F, 23.9056F, 29.4336F, -1.5708F, -1.5708F, 0.0F));
		PartDefinition bb_main16_r3 = Pannel37.addOrReplaceChild("bb_main16_r3",
				CubeListBuilder.create().texOffs(24, 119).addBox(-12.0F, -46.28F, -11.0F, 2.0F, 10.28F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 119).addBox(-15.0F, -46.28F, -11.0F, 2.0F, 10.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.5098F, 23.9056F, 29.4336F, -1.5708F, -1.5708F, 0.0F));
		PartDefinition bb_main14_r2 = Pannel37.addOrReplaceChild("bb_main14_r2", CubeListBuilder.create().texOffs(24, 119).addBox(-14.0F, 32.72F, -11.0F, 2.0F, 11.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.5929F, 23.9056F, 29.5367F, -1.5708F, 0.5236F, 0.0F));
		PartDefinition bb_main13_r1 = Pannel37.addOrReplaceChild("bb_main13_r1", CubeListBuilder.create().texOffs(24, 119).addBox(-11.0F, 27.72F, -11.0F, 2.0F, 12.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.2269F, 23.9056F, 25.7066F, -1.5708F, 0.5236F, 0.0F));
		PartDefinition bb_main12_r2 = Pannel37.addOrReplaceChild("bb_main12_r2", CubeListBuilder.create().texOffs(24, 119).addBox(-8.0F, -31.28F, -25.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.2688F, 23.9056F, 24.851F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r12 = Pannel37.addOrReplaceChild("bb_main9_r12", CubeListBuilder.create().texOffs(32, 119).addBox(-1.0F, -31.28F, -4.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6362F, 23.9056F, 10.1645F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r8 = Pannel37.addOrReplaceChild("bb_main10_r8",
				CubeListBuilder.create().texOffs(0, 6).addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 51)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 11).addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 101)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21).addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(83, 109).addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(98, 113)
						.addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8286F, 17.2722F, 14.4336F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main12_r3 = Pannel37.addOrReplaceChild("bb_main12_r3", CubeListBuilder.create().texOffs(27, 39).addBox(1.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.4017F, 22.9988F, 27.0148F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main11_r6 = Pannel37.addOrReplaceChild("bb_main11_r6", CubeListBuilder.create().texOffs(12, 0).addBox(-34.0F, -24.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(27.0913F, 22.9988F, -3.2077F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r13 = Pannel37.addOrReplaceChild("bb_main9_r13",
				CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -22.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(171, 39).addBox(1.0F, -24.0F, -9.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(182, 49)
						.addBox(-1.0F, -25.0F, -13.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(182, 49).addBox(-1.0F, -25.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(181, 48)
						.addBox(-1.0F, -25.0F, -10.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(108, 133).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8286F, 17.2722F, 14.4336F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main10_r9 = Pannel37.addOrReplaceChild("bb_main10_r9", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -5.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4875F, 3.9988F, 1.168F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r14 = Pannel37.addOrReplaceChild("bb_main9_r14", CubeListBuilder.create().texOffs(102, 80).addBox(-1.0F, 12.0F, -29.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1697F, 14.9988F, 20.2205F, 0.0F, 0.5236F, -3.1416F));
		PartDefinition bb_main9_r15 = Pannel37.addOrReplaceChild("bb_main9_r15", CubeListBuilder.create().texOffs(0, 77).addBox(-4.0F, -1.0F, -19.5F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8286F, -4.8839F, 7.5443F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone7 = Pannel37.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-16.1714F, 17.2722F, -15.4336F));
		PartDefinition bone9 = Pannel37.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(-0.8286F, 17.2722F, 14.4336F));
		PartDefinition bb_main9_r16 = bone9.addOrReplaceChild("bb_main9_r16",
				CubeListBuilder.create().texOffs(73, 202).addBox(-3.0F, -23.5F, -8.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(57, 109).addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Pannel2 = bb_main3.addOrReplaceChild("Pannel2", CubeListBuilder.create().texOffs(84, 76).addBox(-6.0718F, -17.8507F, -12.0069F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, 11.0F, 0.0F, 2.0944F, 0.0F));
		PartDefinition bb_main9_r17 = Pannel2.addOrReplaceChild("bb_main9_r17",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 98).addBox(-1.0F, -23.0F, -13.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(4, 154)
						.addBox(-1.0F, -25.0F, -10.4F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 101).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9282F, 0.0F, 7.1962F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main11_r7 = Pannel2.addOrReplaceChild("bb_main11_r7", CubeListBuilder.create().texOffs(24, 119).addBox(-8.0F, -31.28F, -25.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0256F, 6.6334F, 17.6136F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r11 = Pannel2.addOrReplaceChild("bb_main8_r11", CubeListBuilder.create().texOffs(32, 119).addBox(-1.0F, -31.28F, -4.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.393F, 6.6334F, 2.9271F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main9_r18 = Pannel2.addOrReplaceChild("bb_main9_r18",
				CubeListBuilder.create().texOffs(0, 6).addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 51)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 11).addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 101)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(57, 109).addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(126, 205)
						.addBox(-6.0F, -23.0F, -18.0F, 12.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21).addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(83, 109).addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(98, 113)
						.addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9282F, 0.0F, 7.1962F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main8_r12 = Pannel2.addOrReplaceChild("bb_main8_r12", CubeListBuilder.create().texOffs(123, 178).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9282F, -20.5005F, -6.6505F, 0.5389F, -0.8413F, -0.4193F));
		PartDefinition bb_main11_r8 = Pannel2.addOrReplaceChild("bb_main11_r8", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6449F, 5.7266F, 19.7773F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r10 = Pannel2.addOrReplaceChild("bb_main10_r10", CubeListBuilder.create().texOffs(12, 0).addBox(-34.0F, -24.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.8481F, 5.7266F, -10.4451F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r13 = Pannel2.addOrReplaceChild("bb_main8_r13",
				CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -22.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(102, 41).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9282F, 0.0F, 7.1962F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r19 = Pannel2.addOrReplaceChild("bb_main9_r19", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -5.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7307F, -13.2734F, -6.0694F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main8_r14 = Pannel2.addOrReplaceChild("bb_main8_r14", CubeListBuilder.create().texOffs(102, 80).addBox(-1.0F, 12.0F, -29.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5871F, -2.2734F, 12.9831F, 0.0F, 0.5236F, -3.1416F));
		PartDefinition bb_main8_r15 = Pannel2.addOrReplaceChild("bb_main8_r15", CubeListBuilder.create().texOffs(0, 77).addBox(-4.0F, -1.0F, -19.5F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9282F, -22.1561F, 0.3069F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone3 = Pannel2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Pannel36 = bb_main3.addOrReplaceChild("Pannel36", CubeListBuilder.create().texOffs(84, 76).addBox(-13.0622F, -17.8507F, -12.5069F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 0.0F, -5.0F, 0.0F, 1.0472F, 0.0F));
		PartDefinition bb_main10_r11 = Pannel36.addOrReplaceChild("bb_main10_r11",
				CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 98).addBox(-1.0F, -23.0F, -13.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(205, 134)
						.addBox(-1.0F, -27.0F, -5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(125, 115).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0622F, 0.0F, 6.6962F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main12_r4 = Pannel36.addOrReplaceChild("bb_main12_r4", CubeListBuilder.create().texOffs(24, 119).addBox(-8.0F, -31.28F, -25.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0352F, 6.6334F, 17.1136F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r20 = Pannel36.addOrReplaceChild("bb_main9_r20", CubeListBuilder.create().texOffs(32, 119).addBox(-1.0F, -31.28F, -4.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5974F, 6.6334F, 2.4271F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r12 = Pannel36.addOrReplaceChild("bb_main10_r12",
				CubeListBuilder.create().texOffs(0, 6).addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 51)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 11).addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(50, 85).addBox(4.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(122, 18)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(97, 150).addBox(-1.0F, -23.5F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(98, 151)
						.addBox(-0.5F, -25.5F, -4.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 152).addBox(1.0F, -25.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 122)
						.addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21).addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(12, 91)
						.addBox(-4.0F, -25.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 91).addBox(-5.0F, -25.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 91)
						.addBox(-6.0F, -25.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39).addBox(-5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(83, 109)
						.addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(81, 122).addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0622F, 0.0F, 6.6962F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main12_r5 = Pannel36.addOrReplaceChild("bb_main12_r5", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.6353F, 5.7266F, 19.2773F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main11_r9 = Pannel36.addOrReplaceChild("bb_main11_r9", CubeListBuilder.create().texOffs(12, 0).addBox(-34.0F, -24.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(24.8578F, 5.7266F, -10.9451F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r21 = Pannel36.addOrReplaceChild("bb_main9_r21", CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -22.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(129, 62)
				.addBox(-1.0F, -25.0F, -9.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(102, 41).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0622F, 0.0F, 6.6962F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main10_r13 = Pannel36.addOrReplaceChild("bb_main10_r13", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -5.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7211F, -13.2734F, -6.5694F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r22 = Pannel36.addOrReplaceChild("bb_main9_r22", CubeListBuilder.create().texOffs(102, 80).addBox(-1.0F, 12.0F, -29.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4033F, -2.2734F, 12.4831F, 0.0F, 0.5236F, -3.1416F));
		PartDefinition bb_main11_r10 = Pannel36.addOrReplaceChild("bb_main11_r10", CubeListBuilder.create().texOffs(148, 74).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5831F, -22.6711F, -6.5985F, 0.4276F, 0.5236F, 0.0F));
		PartDefinition bb_main10_r14 = Pannel36.addOrReplaceChild("bb_main10_r14", CubeListBuilder.create().texOffs(143, 76).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.837F, -22.9635F, -4.7703F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r23 = Pannel36.addOrReplaceChild("bb_main9_r23", CubeListBuilder.create().texOffs(0, 77).addBox(-4.0F, -1.0F, -19.5F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0622F, -22.1561F, -0.1931F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone6 = Pannel36.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Pannel35 = bb_main3.addOrReplaceChild("Pannel35", CubeListBuilder.create().texOffs(84, 76).addBox(-9.8923F, -17.8507F, 2.9835F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0F, 0.0F, 15.0F, 0.0F, -2.0944F, 0.0F));
		PartDefinition bb_main10_r15 = Pannel35.addOrReplaceChild("bb_main10_r15", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 98)
				.addBox(-1.0F, -23.0F, -13.0F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(24, 101).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1077F, 0.0F, 22.1865F, 0.2967F, -0.5236F, 0.0F));
		PartDefinition bb_main12_r6 = Pannel35.addOrReplaceChild("bb_main12_r6", CubeListBuilder.create().texOffs(24, 119).addBox(-8.0F, -31.28F, -25.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.2051F, 6.6334F, 32.604F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r24 = Pannel35.addOrReplaceChild("bb_main9_r24", CubeListBuilder.create().texOffs(32, 119).addBox(-1.0F, -31.28F, -4.0F, 2.0F, 22.28F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5725F, 6.6334F, 17.9174F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main10_r16 = Pannel35.addOrReplaceChild("bb_main10_r16",
				CubeListBuilder.create().texOffs(0, 6).addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 12).addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(9, 51)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(42, 11).addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(4.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(96, 126)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(80, 21).addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 77).addBox(-6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-5.0F, -23.0F, -11.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(83, 109).addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(29, 132)
						.addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1077F, 0.0F, 22.1865F, 0.3491F, 0.0F, 0.0F));
		PartDefinition bb_main12_r7 = Pannel35.addOrReplaceChild("bb_main12_r7", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4655F, 5.7266F, 34.7677F, 0.0F, -0.5236F, 0.0F));
		PartDefinition bb_main11_r11 = Pannel35.addOrReplaceChild("bb_main11_r11", CubeListBuilder.create().texOffs(12, 0).addBox(-34.0F, -24.0F, -21.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(28.0276F, 5.7266F, 4.5453F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r25 = Pannel35.addOrReplaceChild("bb_main9_r25",
				CubeListBuilder.create().texOffs(102, 41).addBox(-1.0F, -22.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(102, 41).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1077F, 0.0F, 22.1865F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bb_main10_r17 = Pannel35.addOrReplaceChild("bb_main10_r17", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -5.0F, -7.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5512F, -13.2734F, 8.9209F, 0.0F, 0.5236F, 0.0F));
		PartDefinition bb_main9_r26 = Pannel35.addOrReplaceChild("bb_main9_r26", CubeListBuilder.create().texOffs(102, 80).addBox(-1.0F, 12.0F, -29.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2334F, -2.2734F, 27.9735F, 0.0F, 0.5236F, -3.1416F));
		PartDefinition bb_main10_r18 = Pannel35.addOrReplaceChild("bb_main10_r18",
				CubeListBuilder.create().texOffs(169, 33).addBox(5.0F, -24.0F, -11.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(179, 57).addBox(-6.0F, -24.0F, -1.0F, 1.0F, 1.0F, -1.9F, new CubeDeformation(0.0F)).texOffs(179, 57)
						.addBox(5.0F, -24.0F, -1.0F, 1.0F, 1.0F, -1.9F, new CubeDeformation(0.0F)).texOffs(169, 33).addBox(-6.0F, -24.0F, -11.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1077F, 0.0F, 22.1865F, 0.2967F, 0.0F, 0.0F));
		PartDefinition bb_main13_r2 = Pannel35.addOrReplaceChild("bb_main13_r2",
				CubeListBuilder.create().texOffs(1, 225).addBox(-5.0F, -9.0F, -11.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(45, 193).addBox(-5.0F, -8.0F, -11.0F, 10.0F, 16.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1624F, -13.6561F, 25.4972F, 1.5708F, 2.0944F, 0.0F));
		PartDefinition bb_main13_r3 = Pannel35.addOrReplaceChild("bb_main13_r3", CubeListBuilder.create().texOffs(42, 60).addBox(-6.0F, 8.0F, -11.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8543F, -13.6561F, 24.7419F, 1.5708F, 2.0944F, 0.0F));
		PartDefinition bb_main12_r8 = Pannel35.addOrReplaceChild("bb_main12_r8", CubeListBuilder.create().texOffs(45, 210).addBox(-5.0F, -15.0F, -10.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3998F, -12.6561F, 28.2419F, 1.5708F, 1.0472F, 0.0F));
		PartDefinition bb_main12_r9 = Pannel35.addOrReplaceChild("bb_main12_r9", CubeListBuilder.create().texOffs(42, 60).addBox(-5.0F, 8.0F, -11.0F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1457F, -13.6561F, 25.3632F, 1.5708F, 1.0472F, 0.0F));
		PartDefinition bb_main11_r12 = Pannel35.addOrReplaceChild("bb_main11_r12", CubeListBuilder.create().texOffs(42, 21).addBox(-4.0F, -8.0F, -11.0F, 8.0F, 17.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1077F, -13.6561F, 25.2973F, 1.5708F, 1.0472F, 0.0F));
		PartDefinition bb_main11_r13 = Pannel35.addOrReplaceChild("bb_main11_r13", CubeListBuilder.create().texOffs(42, 60).addBox(-6.0F, 23.0F, -19.5F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2417F, -22.1561F, 10.3078F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bb_main11_r14 = Pannel35.addOrReplaceChild("bb_main11_r14", CubeListBuilder.create().texOffs(2, 219).addBox(-4.0F, 1.0F, -19.5F, 10.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-4.0F, 2.0F, -19.5F, 10.0F, 17.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(125, 133).addBox(-3.0F, -1.0F, -19.5F, 8.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8923F, -22.1561F, 15.2973F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bone5 = Pannel35.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone10 = Pannel35.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.1077F, 0.0F, 22.1865F));
		PartDefinition bb_main10_r19 = bone10.addOrReplaceChild("bb_main10_r19", CubeListBuilder.create().texOffs(161, 195).addBox(0.0F, -26.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(163, 186)
				.addBox(-1.0F, -26.0F, -6.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(130, 59).addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition Toggle4 = bb_main3.addOrReplaceChild("Toggle4", CubeListBuilder.create(), PartPose.offset(-10.8262F, -20.4582F, -6.2505F));
		PartDefinition bone17 = bb_main3.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(-7.0F, 0.0F, 3.0F));
		PartDefinition Toggle5 = bb_main3.addOrReplaceChild("Toggle5", CubeListBuilder.create(), PartPose.offset(-17.0348F, -19.0046F, -3.4842F));
		PartDefinition bone18 = bb_main3.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offset(9.0F, -0.8507F, 1.2031F));
		PartDefinition Rotor2 = bb_main3.addOrReplaceChild("Rotor2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));
		PartDefinition Spinny2 = Rotor2.addOrReplaceChild("Spinny2", CubeListBuilder.create().texOffs(0, 101).addBox(-6.0F, -42.0F, 2.5F, 12.0F, 43.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -31.8F, 0.0F));
		PartDefinition cube_r1 = Spinny2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 101).addBox(-7.5F, -77.0F, 4.0F, 12.0F, 43.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 35.0F, 4.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Demat2 = bb_main3.addOrReplaceChild("Demat2", CubeListBuilder.create(), PartPose.offset(-4.5F, -19.9443F, -16.8367F));
		PartDefinition Lever2 = bb_main3.addOrReplaceChild("Lever2", CubeListBuilder.create(), PartPose.offset(13.7672F, -20.2863F, -7.9485F));
		PartDefinition bb_main = bb_main3.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 23.0F));
		PartDefinition bone = bb_main.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Pannel3 = bb_main3.addOrReplaceChild("Pannel3", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel4 = bb_main3.addOrReplaceChild("Pannel4", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel5 = bb_main3.addOrReplaceChild("Pannel5", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel6 = bb_main3.addOrReplaceChild("Pannel6", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel7 = bb_main3.addOrReplaceChild("Pannel7", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel9 = bb_main3.addOrReplaceChild("Pannel9", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel10 = bb_main3.addOrReplaceChild("Pannel10", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel11 = bb_main3.addOrReplaceChild("Pannel11", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel12 = bb_main3.addOrReplaceChild("Pannel12", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel13 = bb_main3.addOrReplaceChild("Pannel13", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel15 = bb_main3.addOrReplaceChild("Pannel15", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel16 = bb_main3.addOrReplaceChild("Pannel16", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel17 = bb_main3.addOrReplaceChild("Pannel17", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel18 = bb_main3.addOrReplaceChild("Pannel18", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel19 = bb_main3.addOrReplaceChild("Pannel19", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel20 = bb_main3.addOrReplaceChild("Pannel20", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel21 = bb_main3.addOrReplaceChild("Pannel21", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel22 = bb_main3.addOrReplaceChild("Pannel22", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel23 = bb_main3.addOrReplaceChild("Pannel23", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel24 = bb_main3.addOrReplaceChild("Pannel24", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel25 = bb_main3.addOrReplaceChild("Pannel25", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel26 = bb_main3.addOrReplaceChild("Pannel26", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel27 = bb_main3.addOrReplaceChild("Pannel27", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel28 = bb_main3.addOrReplaceChild("Pannel28", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel29 = bb_main3.addOrReplaceChild("Pannel29", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel30 = bb_main3.addOrReplaceChild("Pannel30", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel31 = bb_main3.addOrReplaceChild("Pannel31", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel32 = bb_main3.addOrReplaceChild("Pannel32", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition Pannel33 = bb_main3.addOrReplaceChild("Pannel33", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, 36.0F, 0.0F, -3.1416F, 0.0F));
		PartDefinition bb_main9_r27 = Pannel33.addOrReplaceChild("bb_main9_r27", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-1.0F, -19.0F, -9.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-16.0F, 0.0F, 29.0F, 0.2967F, 0.5236F, 0.0F));
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
