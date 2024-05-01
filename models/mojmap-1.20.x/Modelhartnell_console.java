// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhartnell_console<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hartnell_console"), "main");
	private final ModelPart bb_main2;
	private final ModelPart bb_main;
	private final ModelPart bone2;

	public Modelhartnell_console(ModelPart root) {
		this.bb_main2 = root.getChild("bb_main2");
		this.bb_main = root.getChild("bb_main");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main2 = partdefinition.addOrReplaceChild("bb_main2", CubeListBuilder.create().texOffs(122, 32)
				.addBox(-11.0F, -17.8507F, 18.2031F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(222, 232)
				.addBox(-10.0F, -17.8507F, -19.2031F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 93)
				.addBox(6.0F, -16.4826F, 7.2031F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(80, 156)
				.addBox(-2.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(40, 154)
				.addBox(-4.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(120, 152)
				.addBox(-6.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 152)
				.addBox(-8.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(120, 114)
				.addBox(-10.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(120, 76)
				.addBox(4.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(120, 38)
				.addBox(2.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(80, 118)
				.addBox(0.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(40, 116)
				.addBox(6.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
				.addBox(4.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(82, 0)
				.addBox(2.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(80, 80)
				.addBox(0.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(80, 42)
				.addBox(-2.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(40, 78)
				.addBox(-4.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
				.addBox(-6.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(42, 2)
				.addBox(-8.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(40, 40)
				.addBox(-10.0F, -16.4826F, -18.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(8.0F, -16.4826F, -18.0F, 3.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
				.addBox(8.0F, -16.4826F, -17.7969F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(160, 51)
				.addBox(5.0F, -16.0F, 7.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
				.addBox(-4.0F, -23.6129F, 5.8665F, 8.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 78)
				.addBox(-4.0F, -23.6129F, -7.8665F, 8.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(152, 230)
				.addBox(-4.0F, -23.6129F, -5.8665F, 8.0F, 21.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(114, 194)
				.addBox(-5.0F, -23.8F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 27.0F, 0.0F));

		PartDefinition bb_main2_r1 = bb_main2.addOrReplaceChild("bb_main2_r1",
				CubeListBuilder.create().texOffs(10, 12)
						.addBox(-4.0F, -24.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-3.0F, -24.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(2.0F, -24.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(2.0F, -24.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(96, 103)
						.addBox(-1.5F, -24.0F, -9.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 58)
						.addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(97, 13)
						.addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(160, 116)
						.addBox(4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(9, 88)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(49, 90)
						.addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(160, 128)
						.addBox(-6.0F, -23.0F, -11.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(84, 17)
						.addBox(-10.0F, -23.0F, -11.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 40)
						.addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(99, 63)
						.addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 114)
						.addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -24.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r2 = bb_main2.addOrReplaceChild("bb_main2_r2",
				CubeListBuilder.create().texOffs(96, 103)
						.addBox(-1.0F, -24.0F, -10.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(26, 31)
						.addBox(-0.5F, -25.0F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 103)
						.addBox(-6.0F, -24.0F, -10.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -24.0F, -3.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 154)
						.addBox(0.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(80, 156)
						.addBox(-2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(120, 156)
						.addBox(-4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(40, 64)
						.addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 20)
						.addBox(9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 106)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 101)
						.addBox(6.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 165)
						.addBox(4.0F, -23.0F, -11.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(18, 20)
						.addBox(-10.0F, -23.0F, -11.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 58)
						.addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(101, 22)
						.addBox(-7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(160, 166)
						.addBox(-6.0F, -23.0F, -11.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(160, 38)
						.addBox(2.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition bb_main2_r3 = bb_main2.addOrReplaceChild("bb_main2_r3",
				CubeListBuilder.create().texOffs(18, 24)
						.addBox(-11.0F, -23.0F, 10.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 26)
						.addBox(-9.0F, -23.0F, 7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 67)
						.addBox(-8.0F, -23.0F, 6.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(55, 58)
						.addBox(-7.0F, -23.0F, 3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 58)
						.addBox(-5.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(27, 12)
						.addBox(9.0F, -23.0F, 10.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 18)
						.addBox(6.0F, -23.0F, 4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(26, 68)
						.addBox(8.0F, -23.0F, 7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(94, 26)
						.addBox(7.0F, -23.0F, 6.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 57)
						.addBox(5.0F, -23.0F, 2.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(80, 40)
						.addBox(3.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-0.5F, -24.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 131)
						.addBox(1.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(120, 131)
						.addBox(-1.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 152)
						.addBox(-3.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -24.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r4 = bb_main2.addOrReplaceChild("bb_main2_r4",
				CubeListBuilder.create().texOffs(58, 49)
						.addBox(-10.0F, -23.0F, 8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(19, 38)
						.addBox(-7.0F, -23.0F, 4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(23, 101)
						.addBox(-8.0F, -23.0F, 6.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(160, 90)
						.addBox(-6.0F, -23.0F, 1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(80, 53)
						.addBox(-4.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(60, 8)
						.addBox(8.0F, -23.0F, 8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(7.0F, -23.0F, 5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(97, 0)
						.addBox(6.0F, -23.0F, 4.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(160, 154)
						.addBox(4.0F, -23.0F, 1.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(7.0F, -24.0F, 9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 13)
						.addBox(2.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 127)
						.addBox(0.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(0.0F, -24.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 129)
						.addBox(-2.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -24.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-2.0F, -24.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r5 = bb_main2.addOrReplaceChild("bb_main2_r5",
				CubeListBuilder.create().texOffs(8, 28)
						.addBox(-11.0F, -23.0F, 10.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-9.0F, -23.0F, 6.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-8.0F, -23.0F, 6.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(206, 55)
						.addBox(-7.0F, -23.0F, 3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 80)
						.addBox(-5.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(120, 51)
						.addBox(-1.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(95, 93)
						.addBox(5.0F, -23.0F, 3.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(106, 9)
						.addBox(7.0F, -23.0F, 6.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 58)
						.addBox(8.0F, -23.0F, 7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 31)
						.addBox(9.0F, -23.0F, 10.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 80)
						.addBox(3.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(120, 118)
						.addBox(1.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(122, 0)
						.addBox(-3.0F, -23.0F, 0.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-2.0F, -24.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition bb_main2_r6 = bb_main2.addOrReplaceChild("bb_main2_r6",
				CubeListBuilder.create().texOffs(82, 0)
						.addBox(3.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(29, 20)
						.addBox(9.0F, -23.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 57)
						.addBox(8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(101, 103)
						.addBox(7.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(82, 26)
						.addBox(5.0F, -23.0F, -11.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(19, 47)
						.addBox(-0.5F, -24.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 26)
						.addBox(3.0F, -24.0F, -8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(82, 13)
						.addBox(1.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(40, 116)
						.addBox(-1.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(29, 23)
						.addBox(-11.0F, -23.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 0)
						.addBox(-8.0F, -23.0F, -11.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 48)
						.addBox(-9.0F, -23.0F, -11.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 80)
						.addBox(-7.0F, -23.0F, -11.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 118)
						.addBox(-5.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(120, 38)
						.addBox(-3.0F, -23.0F, -11.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r7 = bb_main2.addOrReplaceChild("bb_main2_r7",
				CubeListBuilder.create().texOffs(19, 47).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -19.3898F, 13.9745F, -2.7925F, 0.0F, -3.1416F));

		PartDefinition bb_main2_r8 = bb_main2.addOrReplaceChild("bb_main2_r8",
				CubeListBuilder.create().texOffs(19, 47).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5F, -19.3898F, 13.9745F, -2.7925F, 0.0F, -3.1416F));

		PartDefinition bb_main2_r9 = bb_main2.addOrReplaceChild("bb_main2_r9",
				CubeListBuilder.create().texOffs(194, 232)
						.addBox(-5.0F, -23.0F, -13.0F, 8.0F, 21.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-5.0F, -23.0F, -1.0F, 8.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4465F, -0.6129F, -2.5672F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r10 = bb_main2.addOrReplaceChild("bb_main2_r10",
				CubeListBuilder.create().texOffs(40, 78).addBox(-3.0F, -34.0F, -6.0F, 8.0F, 21.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1164F, 10.3871F, 0.0672F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r11 = bb_main2.addOrReplaceChild("bb_main2_r11",
				CubeListBuilder.create().texOffs(0, 76).addBox(-4.0F, -31.0F, -5.0F, 8.0F, 21.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.4106F, 7.3871F, 5.4332F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r12 = bb_main2.addOrReplaceChild("bb_main2_r12",
				CubeListBuilder.create().texOffs(234, 2)
						.addBox(-4.0F, -23.0F, -1.0F, 8.0F, 21.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 78)
						.addBox(-4.0F, -23.0F, -3.0F, 8.0F, 21.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2145F, -0.6129F, -2.4332F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r13 = bb_main2.addOrReplaceChild("bb_main2_r13",
				CubeListBuilder.create().texOffs(80, 93).addBox(5.4282F, -22.1732F, -11.6522F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -1.0F, -8.0F, 0.3491F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r14 = bb_main2.addOrReplaceChild("bb_main2_r14",
				CubeListBuilder.create().texOffs(95, 40)
						.addBox(-14.0F, -16.0F, 10.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-10.0F, -17.0F, 13.0F, 2.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(-4.0F, -16.0F, 15.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-6.0F, -16.0F, 14.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-8.0F, -16.0F, 13.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(40, 103)
						.addBox(-12.0F, -16.0F, 12.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 40)
						.addBox(-18.0F, -16.0F, 11.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(25, 47)
						.addBox(-24.0F, -16.0F, 16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 8)
						.addBox(-22.0F, -16.0F, 14.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 103)
						.addBox(-20.0F, -16.0F, 13.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(95, 53)
						.addBox(-16.0F, -16.0F, 10.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.533F, -0.4826F, 11.2393F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r15 = bb_main2.addOrReplaceChild("bb_main2_r15",
				CubeListBuilder.create().texOffs(80, 64).addBox(-4.0F, 4.0F, -8.0F, 4.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.2942F, -24.0F, 3.634F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r16 = bb_main2.addOrReplaceChild("bb_main2_r16",
				CubeListBuilder.create().texOffs(0, 24)
						.addBox(5.0F, -0.5F, 4.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 41)
						.addBox(-3.0F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.1227F, -20.5437F, 6.9991F, -0.3491F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r17 = bb_main2.addOrReplaceChild("bb_main2_r17",
				CubeListBuilder.create().texOffs(0, 28).addBox(-0.5F, -24.0F, 3.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.819F, 1.7101F, 2.4139F, -0.3491F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r18 = bb_main2.addOrReplaceChild("bb_main2_r18",
				CubeListBuilder.create().texOffs(60, 0)
						.addBox(-1.0F, -10.0F, -20.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 40)
						.addBox(-1.0F, -9.0F, -27.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0203F, -1.5978F, 1.7672F, -0.2967F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r19 = bb_main2.addOrReplaceChild("bb_main2_r19",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2967F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r20 = bb_main2.addOrReplaceChild("bb_main2_r20",
				CubeListBuilder.create().texOffs(40, 40)
						.addBox(-1.0F, -7.0F, -28.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-1.0F, -8.0F, -26.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5816F, -3.218F, 0.0F, -0.2967F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r21 = bb_main2.addOrReplaceChild("bb_main2_r21",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2967F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r22 = bb_main2.addOrReplaceChild("bb_main2_r22",
				CubeListBuilder.create().texOffs(28, 38).addBox(1.0F, -29.0F, 35.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.609F, 10.7266F, -13.7152F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r23 = bb_main2.addOrReplaceChild("bb_main2_r23",
				CubeListBuilder.create().texOffs(28, 38).addBox(-1.0F, -29.0F, 33.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.3411F, 10.7266F, -10.9831F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r24 = bb_main2.addOrReplaceChild("bb_main2_r24",
				CubeListBuilder.create().texOffs(16, 57).addBox(-11.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8192F, 5.7266F, 18.5812F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r25 = bb_main2.addOrReplaceChild("bb_main2_r25",
				CubeListBuilder.create().texOffs(16, 57).addBox(-11.0F, -24.0F, -38.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5014F, 5.7266F, 8.5812F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r26 = bb_main2.addOrReplaceChild("bb_main2_r26",
				CubeListBuilder.create().texOffs(28, 38).addBox(-1.0F, -24.0F, 35.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6822F, 5.7266F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r27 = bb_main2.addOrReplaceChild("bb_main2_r27",
				CubeListBuilder.create().texOffs(16, 57).addBox(-1.0F, -24.0F, -33.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.6822F, 5.7266F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r28 = bb_main2.addOrReplaceChild("bb_main2_r28",
				CubeListBuilder.create().texOffs(160, 78)
						.addBox(-1.0F, -3.0F, 0.0F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2161F, -11.508F, 5.5704F, 0.2967F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r29 = bb_main2.addOrReplaceChild("bb_main2_r29",
				CubeListBuilder.create().texOffs(42, 18).addBox(-1.0F, -24.0F, 2.0F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2967F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r30 = bb_main2.addOrReplaceChild("bb_main2_r30",
				CubeListBuilder.create().texOffs(20, 12)
						.addBox(-1.0F, -5.0F, 2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-1.0F, -4.0F, 2.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.5085F, -9.5954F, 6.0768F, 0.2967F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r31 = bb_main2.addOrReplaceChild("bb_main2_r31",
				CubeListBuilder.create().texOffs(42, 18).addBox(-1.0F, -24.0F, 2.0F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2967F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r32 = bb_main2.addOrReplaceChild("bb_main2_r32",
				CubeListBuilder.create().texOffs(0, 38)
						.addBox(-1.0F, -7.0F, 17.0F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 101)
						.addBox(-1.0F, -8.0F, 17.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.4068F, -2.0486F, 0.0F, 0.2967F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r33 = bb_main2.addOrReplaceChild("bb_main2_r33",
				CubeListBuilder.create().texOffs(42, 18).addBox(-1.0F, -24.0F, 2.0F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2967F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r34 = bb_main2.addOrReplaceChild("bb_main2_r34",
				CubeListBuilder.create().texOffs(24, 76).addBox(-8.0F, -32.28F, 7.0F, 2.0F, 21.28F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0974F, 8.6334F, 3.439F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r35 = bb_main2.addOrReplaceChild("bb_main2_r35",
				CubeListBuilder.create().texOffs(24, 76).addBox(-8.0F, -31.28F, 14.0F, 2.0F, 21.28F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0705F, 7.6334F, 7.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r36 = bb_main2.addOrReplaceChild("bb_main2_r36",
				CubeListBuilder.create().texOffs(64, 78).addBox(-8.0F, -30.28F, -25.0F, 2.0F, 21.28F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.0974F, 6.6334F, 10.4174F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r37 = bb_main2.addOrReplaceChild("bb_main2_r37",
				CubeListBuilder.create().texOffs(24, 76).addBox(-1.0F, -33.28F, 7.0F, 2.0F, 21.28F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0352F, 9.6334F, -0.061F, 0.0F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r38 = bb_main2.addOrReplaceChild("bb_main2_r38",
				CubeListBuilder.create().texOffs(64, 78).addBox(-1.0F, -34.28F, -4.0F, 2.0F, 21.28F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9295F, 10.6334F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bb_main2_r39 = bb_main2.addOrReplaceChild("bb_main2_r39",
				CubeListBuilder.create().texOffs(64, 78).addBox(-1.0F, -30.28F, -4.0F, 2.0F, 21.28F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4648F, 6.6334F, -4.2691F, 0.0F, -0.5236F, 0.0F));

		PartDefinition bb_main2_r40 = bb_main2.addOrReplaceChild("bb_main2_r40",
				CubeListBuilder.create().texOffs(48, 26)
						.addBox(-1.0F, -6.0F, -24.0F, 2.0F, 2.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(40, 40)
						.addBox(-1.0F, -4.0F, -28.0F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.2294F, -6.087F, 3.8614F, -0.2967F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r41 = bb_main2.addOrReplaceChild("bb_main2_r41",
				CubeListBuilder.create().texOffs(18, 20).addBox(-1.0F, -8.0F, -21.0F, 2.0F, 4.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9903F, -6.2331F, 3.4473F, -0.2967F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r42 = bb_main2.addOrReplaceChild("bb_main2_r42",
				CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -24.0F, -16.0F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2967F, 0.5236F, 0.0F));

		PartDefinition bb_main2_r43 = bb_main2.addOrReplaceChild("bb_main2_r43",
				CubeListBuilder.create().texOffs(114, 210)
						.addBox(-2.0F, -13.6319F, 34.0F, 20.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(122, 32)
						.addBox(-3.0F, -15.0F, 35.0F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5466F, -2.8507F, -15.3267F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r44 = bb_main2.addOrReplaceChild("bb_main2_r44", CubeListBuilder.create()
				.texOffs(122, 0).addBox(0.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 30.0F, new CubeDeformation(0.0F))
				.texOffs(39, 231).addBox(19.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 35.0F, new CubeDeformation(0.0F))
				.texOffs(158, 0).addBox(18.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(160, 40).addBox(17.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(160, 78).addBox(16.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(160, 116).addBox(15.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(160, 154).addBox(14.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(0, 190).addBox(13.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(120, 190).addBox(12.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(38, 192).addBox(11.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(158, 192).addBox(10.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(76, 194).addBox(9.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(196, 2).addBox(8.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(196, 194).addBox(7.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(198, 42).addBox(6.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(198, 80).addBox(5.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(198, 118).addBox(4.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(198, 156).addBox(3.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(0, 228).addBox(2.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(114, 228).addBox(1.0F, -14.6319F, -24.0F, 1.0F, 2.0F, 36.0F, new CubeDeformation(0.0F))
				.texOffs(222, 232).addBox(0.0F, -16.0F, -25.0F, 21.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.0203F, -1.8507F, -5.7618F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bb_main2_r45 = bb_main2.addOrReplaceChild("bb_main2_r45",
				CubeListBuilder.create().texOffs(122, 32).addBox(-8.0F, -15.0F, 27.0F, 21.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1183F, -2.8507F, 1.8004F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r46 = bb_main2.addOrReplaceChild("bb_main2_r46",
				CubeListBuilder.create().texOffs(76, 232)
						.addBox(-16.0F, -22.6319F, -38.0F, 20.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
						.texOffs(114, 206).addBox(-16.0F, -23.0F, -39.0F, 20.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.1446F, 5.1493F, -4.7023F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r47 = bb_main2.addOrReplaceChild(
				"bb_main2_r47", CubeListBuilder.create().texOffs(194, 0).addBox(-22.0F, -15.0F, -1.0F, 44.0F, 0.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

		PartDefinition bb_main2_r48 = bb_main2.addOrReplaceChild(
				"bb_main2_r48", CubeListBuilder.create().texOffs(196, 40).addBox(-22.0F, -15.0F, -1.0F, 42.0F, 0.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition Lock = bb_main2.addOrReplaceChild("Lock", CubeListBuilder.create(),
				PartPose.offset(-2.0F, -18.8768F, -15.384F));

		PartDefinition Lock_r1 = Lock.addOrReplaceChild("Lock_r1",
				CubeListBuilder.create().texOffs(12, 20).addBox(-2.5F, -24.0F, -8.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 18.8768F, 15.384F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Flicky = bb_main2.addOrReplaceChild("Flicky", CubeListBuilder.create(),
				PartPose.offset(13.4505F, -18.1927F, 11.2298F));

		PartDefinition Flicky_r1 = Flicky.addOrReplaceChild("Flicky_r1",
				CubeListBuilder.create().texOffs(8, 20).addBox(2.5F, -24.0F, -10.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4505F, 18.1927F, -11.2298F, 0.3491F, -2.0944F, 0.0F));

		PartDefinition Flicky3 = bb_main2.addOrReplaceChild("Flicky3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Flicky3_r1 = Flicky3
				.addOrReplaceChild("Flicky3_r1",
						CubeListBuilder.create().texOffs(4, 20).addBox(-4.5F, -23.0F, 10.0F, 1.0F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Soundandscannr = bb_main2.addOrReplaceChild("Soundandscannr", CubeListBuilder.create(),
				PartPose.offset(-15.1367F, -18.5348F, 6.4298F));

		PartDefinition Soundandscannr_r1 = Soundandscannr.addOrReplaceChild("Soundandscannr_r1",
				CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -24.0F, 9.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.1367F, 18.5348F, -6.4298F, -0.3491F, -1.0472F, 0.0F));

		PartDefinition Flicky2 = bb_main2.addOrReplaceChild("Flicky2", CubeListBuilder.create(),
				PartPose.offset(4.0F, -18.1927F, 17.2634F));

		PartDefinition Flicky2_r1 = Flicky2.addOrReplaceChild("Flicky2_r1",
				CubeListBuilder.create().texOffs(0, 12).addBox(3.5F, -24.0F, 10.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 18.1927F, -17.2634F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Toggle2 = bb_main2.addOrReplaceChild("Toggle2", CubeListBuilder.create(),
				PartPose.offset(-10.8262F, -20.4582F, -6.2505F));

		PartDefinition Toggle2_r1 = Toggle2.addOrReplaceChild("Toggle2_r1",
				CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -24.0F, 4.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.8262F, 20.4582F, 6.2505F, -0.3491F, -2.0944F, 0.0F));

		PartDefinition bone6 = bb_main2.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-7.0F, 0.0F, 3.0F));

		PartDefinition bone6_r1 = bone6.addOrReplaceChild("bone6_r1",
				CubeListBuilder.create().texOffs(0, 39)
						.addBox(-2.5F, -24.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-2.5F, -24.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.181F, 1.7101F, -0.5861F, -0.3491F, -2.0944F, 0.0F));

		PartDefinition Toggle3 = bb_main2.addOrReplaceChild("Toggle3", CubeListBuilder.create(),
				PartPose.offset(-17.0348F, -19.0046F, -3.4842F));

		PartDefinition Toggle3_r1 = Toggle3.addOrReplaceChild("Toggle3_r1",
				CubeListBuilder.create().texOffs(0, 39).addBox(-0.5F, -24.0F, 3.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.2158F, 20.7147F, 5.8981F, -0.3491F, -2.0944F, 0.0F));

		PartDefinition Toggle = bb_main2.addOrReplaceChild("Toggle", CubeListBuilder.create(),
				PartPose.offset(-10.2477F, -20.5437F, 6.7826F));

		PartDefinition Toggle_r1 = Toggle.addOrReplaceChild("Toggle_r1",
				CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, 0.0F, 0.2165F, -0.3491F, -1.0472F, 0.0F));

		PartDefinition bone3 = bb_main2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(9.0F, -0.8507F, 1.2031F));

		PartDefinition Rotor = bb_main2.addOrReplaceChild("Rotor", CubeListBuilder.create().texOffs(347, 172)
				.addBox(-5.0F, -38.8F, -5.0F, 10.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition Spinny = Rotor.addOrReplaceChild("Spinny", CubeListBuilder.create().texOffs(74, 334).addBox(
				-4.0F, -6.0F, 0.0F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -31.8F, 0.0F));

		PartDefinition Spinny_r1 = Spinny.addOrReplaceChild("Spinny_r1",
				CubeListBuilder.create().texOffs(82, 334).addBox(-8.0F, -41.0F, 4.0F, 8.0F, 12.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 35.0F, 4.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition Demat = bb_main2.addOrReplaceChild("Demat", CubeListBuilder.create(),
				PartPose.offset(-4.5F, -19.9443F, -16.8367F));

		PartDefinition Demat_r1 = Demat
				.addOrReplaceChild("Demat_r1",
						CubeListBuilder.create().texOffs(26, 31).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Lever = bb_main2.addOrReplaceChild("Lever", CubeListBuilder.create(),
				PartPose.offset(13.7672F, -20.2863F, -7.9485F));

		PartDefinition Lever_r1 = Lever.addOrReplaceChild("Lever_r1",
				CubeListBuilder.create().texOffs(26, 31).addBox(-1.0F, -25.0F, -9.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7672F, 20.2863F, 7.9485F, 0.3491F, -1.0472F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = bb_main.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}