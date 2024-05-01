// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpolicebox_fourteen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "policebox_fourteen"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modelpolicebox_fourteen(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.0F, -12.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(35, 228)
						.addBox(-13.0F, -2.0F, -13.0F, 26.0F, 2.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(61, 44)
						.addBox(-13.0F, -40.0F, -13.0F, 26.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(160, 88)
						.addBox(0.0F, -34.0F, -10.0F, 10.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 0)
						.addBox(-10.0F, -34.0F, -10.0F, 10.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(152, 71)
						.addBox(-10.0F, -34.0F, -9.0F, 1.0F, 32.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(133, 71)
						.addBox(9.0F, -34.0F, -9.0F, 1.0F, 32.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(129, 88)
						.addBox(-10.0F, -34.0F, 9.0F, 20.0F, 32.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 167)
						.addBox(-12.0F, -42.0F, -12.0F, 4.0F, 40.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-11.0F, -43.0F, -11.0F, 22.0F, 3.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(108, 165)
						.addBox(-10.0F, -44.0F, -10.0F, 20.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(147, 218)
						.addBox(-12.0F, -40.0F, -12.0F, 24.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(15, 22)
						.addBox(-1.0F, -49.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 42)
						.addBox(0.0F, -23.0F, -10.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 36)
						.addBox(-2.0F, -22.0F, -10.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 18).addBox(1.0F, -45.0F, 4.0F, 0.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5355F, -3.0F, -1.1213F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(1, 18).addBox(1.0F, -46.0F, 0.0F, 0.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4142F, -2.0F, -1.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(1, 18).addBox(1.0F, -47.0F, 0.0F, 0.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, -2.4142F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(1, 18).addBox(1.0F, -48.0F, 4.0F, 0.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1213F, 0.0F, -2.5355F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = bb_main
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(25, 167).addBox(-12.0F, -42.0F, -12.0F, 4.0F, 40.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r6 = bb_main
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(25, 167).addBox(-12.0F, -42.0F, -12.0F, 4.0F, 40.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r7 = bb_main
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(25, 167).addBox(-12.0F, -42.0F, -12.0F, 4.0F, 40.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(61, 44).addBox(-23.0F, -3.0F, -16.0F, 26.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -37.0F, -10.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(61, 44).addBox(-0.5F, -3.0F, -12.5F, 26.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.5F, -37.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(61, 44).addBox(-1.0F, -3.0F, -13.0F, 26.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -37.0F, -12.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}