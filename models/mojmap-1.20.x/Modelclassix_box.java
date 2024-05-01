// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelclassix_box<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "classix_box"), "main");
	private final ModelPart bb_main;

	public Modelclassix_box(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 93)
						.addBox(8.0F, -41.0F, -10.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 93)
						.addBox(-10.0F, -41.0F, -10.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -1.0F, -11.0F, 22.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(17, 45)
						.addBox(-9.0F, -33.0F, -8.0F, 1.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(8.0F, -33.0F, -8.0F, 1.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(34, 62)
						.addBox(-8.0F, -33.0F, 8.0F, 16.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 85)
						.addBox(-8.0F, -33.0F, -9.0F, 8.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 23)
						.addBox(0.0F, -33.0F, -9.0F, 8.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 62)
						.addBox(-11.0F, -38.0F, -9.0F, 2.0F, 5.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(-9.0F, -38.0F, -11.0F, 18.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-9.0F, -42.0F, -9.0F, 18.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(34, 45)
						.addBox(-8.0F, -43.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(-1.0F, -47.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -48.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(114, 43)
						.addBox(0.5F, -22.0F, -10.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 43)
						.addBox(-3.0F, -21.5F, -10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 101)
						.addBox(-0.5F, -33.0F, -10.0F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 101)
						.addBox(-10.0F, -33.0F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 101)
						.addBox(9.0F, -33.0F, -0.5F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 101)
						.addBox(-0.5F, -33.0F, 9.0F, 1.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(68, 62).addBox(-21.0F, -2.5F, -9.0F, 2.0F, 5.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -35.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(68, 62).addBox(-11.0F, -2.5F, 1.0F, 2.0F, 5.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0F, -35.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(8, 4).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3543F, -46.5F, -1.3528F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 8).addBox(0.0F, -0.5F, -0.5F, 0.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3536F, -46.5F, 1.3536F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3536F, -46.5F, 1.3536F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(2, 0).addBox(-5.0F, -47.0F, -1.0F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.122F, 0.0F, 2.5348F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(86, 85).addBox(-1.0F, -20.0F, -1.0F, 2.0F, 40.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -21.0F, 9.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 93).addBox(-1.0F, -20.0F, -1.0F, 2.0F, 40.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -21.0F, 9.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}