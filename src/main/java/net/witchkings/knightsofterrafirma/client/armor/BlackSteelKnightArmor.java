package net.witchkings.knightsofterrafirma.client.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;



public class BlackSteelKnightArmor {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -8.0F, -9.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 5.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -1.6F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
				.texOffs(54, 9).mirror().addBox(-5.0F, -1.0F, 2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 12).mirror().addBox(-5.3F, -0.99F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-1.95F, -3.0F, 2.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 9).mirror().addBox(-5.0F, -1.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 0).mirror().addBox(-2.0F, -4.25F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-1.95F, -3.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-1.96F, -3.0F, -3.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 9).mirror().addBox(-5.0F, -1.0F, -3.51F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-1.95F, -4.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_r1 = RightArm.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(33, 6).addBox(-1.2F, -2.1F, -3.98F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2404F, -0.3403F, 0.5F, 0.0F, 0.0F, -1.2217F));

		PartDefinition right_r2 = RightArm.addOrReplaceChild("right_r2", CubeListBuilder.create().texOffs(33, 6).addBox(-2.0F, -3.2F, -3.99F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.266F, -0.9787F, 0.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -1.6F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
				.texOffs(46, 0).addBox(0.0F, -4.25F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-0.04F, -3.0F, -3.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-0.05F, -3.0F, 2.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(1.0F, -1.0F, -3.51F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(1.0F, -1.0F, 2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 12).addBox(4.3F, -0.99F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(0.0F, -2.0F, -3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-0.05F, -4.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(1.0F, -1.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-0.05F, -3.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_r1 = LeftArm.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(33, 6).mirror().addBox(-1.0F, -3.2F, -3.99F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.266F, -0.9787F, 0.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition left_r2 = LeftArm.addOrReplaceChild("left_r2", CubeListBuilder.create().texOffs(33, 6).mirror().addBox(-1.8F, -2.1F, -3.98F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2404F, -0.3403F, 0.5F, 0.0F, 0.0F, 1.2217F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}