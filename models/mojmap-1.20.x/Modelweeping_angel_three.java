// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelweeping_angel_three<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "weeping_angel_three"), "main");
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart helmet;
	private final ModelPart brim;
	private final ModelPart nose;
	private final ModelPart arms;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Wings;

	public Modelweeping_angel_three(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.helmet = root.getChild("helmet");
		this.brim = root.getChild("brim");
		this.nose = root.getChild("nose");
		this.arms = root.getChild("arms");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Wings = root.getChild("Wings");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(52, 18)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
						.addBox(-4.0F, -24.0F, -3.0F, 8.0F, 18.0F, 6.0F, new CubeDeformation(0.5F)).texOffs(100, 8)
						.addBox(-4.0F, -5.0F, -3.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 50).addBox(-4.0F,
				-10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition helmet = head.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(96, 110).addBox(-4.0F,
				-10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition brim = head.addOrReplaceChild("brim", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F,
				-1.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition arms = body.addOrReplaceChild("arms",
				CubeListBuilder.create().texOffs(54, 54)
						.addBox(-8.0F, -7.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 54)
						.mirror().addBox(4.0F, -7.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(54, 54).mirror().addBox(4.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(54, 54).mirror()
						.addBox(-8.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -17.8679F, -5.0958F, -0.829F, 0.0F, 0.0F));

		PartDefinition RightLeg = body.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 112)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition LeftLeg = body.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 112).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition Wings = partdefinition.addOrReplaceChild("Wings", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Wing2_r1 = Wings.addOrReplaceChild("Wing2_r1",
				CubeListBuilder.create().texOffs(18, 0).mirror()
						.addBox(-2.366F, -9.0F, -0.634F, 0.0F, 31.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.5626F, -25.5F, 5.763F, 0.0F, -0.9163F, 0.0F));

		PartDefinition Wing1_r1 = Wings.addOrReplaceChild("Wing1_r1",
				CubeListBuilder.create().texOffs(18, 0).addBox(-2.366F, -9.0F, -0.634F, 0.0F, 31.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4433F, -25.5F, 2.0088F, 0.0F, 0.9163F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}