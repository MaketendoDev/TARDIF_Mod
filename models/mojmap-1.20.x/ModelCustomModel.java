// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart body;
	private final ModelPart arm2;

	public ModelCustomModel(ModelPart root) {
		this.body = root.getChild("body");
		this.arm2 = root.getChild("arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(16, 20)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Chestunit = body.addOrReplaceChild("Chestunit",
				CubeListBuilder.create().texOffs(91, 85)
						.addBox(-1.0F, -23.0F, -5.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(99, 101)
						.addBox(1.0F, -23.0F, -5.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 38)
						.addBox(-4.0F, -23.0F, -5.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F,
				-10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition helmet = head.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F,
				-10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Handelbars = helmet.addOrReplaceChild("Handelbars",
				CubeListBuilder.create().texOffs(10, 18)
						.addBox(-7.0F, -28.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(4.0F, -28.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 79)
						.addBox(5.0F, -36.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 79)
						.addBox(-7.0F, -36.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 70)
						.addBox(-7.0F, -38.0F, -1.0F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 2)
						.addBox(-1.0F, -37.0F, 3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 38)
						.addBox(-1.0F, -33.0F, 3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -35.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(43, 107)
						.addBox(-2.5F, -14.0F, -5.0F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 82)
						.addBox(-2.5F, -14.0F, -4.0F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Handelbars.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 81)
						.addBox(-4.0F, -4.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(45, 51)
						.addBox(-4.0F, -4.0F, -1.0F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -36.0F, -2.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r2 = Handelbars.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(92, 122).addBox(-4.5F, -4.5F, -8.5F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0126F, 1.743F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Handelbars.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(68, 123).addBox(-4.5F, -2.5F, -0.5F, 9.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, -4.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition brim = head
				.addOrReplaceChild("brim",
						CubeListBuilder.create().texOffs(30, 47).addBox(-5.0F, -5.0F, -7.0F, 10.0F, 10.0F, 1.0F,
								new CubeDeformation(0.1F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F,
				-1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -22.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition arms_r1 = arms.addOrReplaceChild("arms_r1",
				CubeListBuilder.create().texOffs(0, 115).mirror()
						.addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.0F, -2.1213F, -2.1213F, 0.7854F, 0.0F, 0.0F));

		PartDefinition arms_r2 = arms.addOrReplaceChild("arms_r2",
				CubeListBuilder.create().texOffs(44, 22).addBox(-8.0F, -24.0F, -0.5F, 4.0F, 12.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 16.2635F, 14.1421F, 0.7854F, 0.0F, 0.0F));

		PartDefinition RightLeg = body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 22)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition LeftLeg = body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition arm2 = partdefinition.addOrReplaceChild("arm2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 17.75F, -15.75F, -0.7854F, 0.0F, 0.0F));

		PartDefinition arms_r3 = arm2.addOrReplaceChild("arms_r3",
				CubeListBuilder.create().texOffs(0, 115).mirror()
						.addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.0F, -24.1213F, -2.1213F, 0.7854F, 0.0F, 0.0F));

		PartDefinition arms_r4 = arm2.addOrReplaceChild("arms_r4",
				CubeListBuilder.create().texOffs(44, 22).mirror()
						.addBox(-2.0F, -6.0F, -2.5F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.5F, -19.8787F, 2.8284F, 0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}