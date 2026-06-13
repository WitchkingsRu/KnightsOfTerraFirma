package net.witchkings.knightsofterrafirma.client.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;



public class BlackSteelKnightArmor {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -8.0F, -9.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 5.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.9F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -1.6F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F))
				.texOffs(54, 9).mirror().addBox(-4.0F, -1.0F, 2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 12).mirror().addBox(-4.3F, -0.99F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-0.95F, -3.0F, 2.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 9).mirror().addBox(-4.0F, -1.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 0).mirror().addBox(-1.0F, -4.25F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-0.95F, -3.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-0.96F, -3.0F, -3.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 9).mirror().addBox(-4.0F, -1.0F, -3.51F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-0.95F, -4.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_r1 = right_arm.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(33, 6).addBox(-1.2F, -2.1F, -3.98F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2404F, -0.3403F, 0.5F, 0.0F, 0.0F, -1.2217F));

		PartDefinition right_r2 = right_arm.addOrReplaceChild("right_r2", CubeListBuilder.create().texOffs(33, 6).addBox(-2.0F, -3.2F, -3.99F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.266F, -0.9787F, 0.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -1.6F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.7F)).mirror(false)
				.texOffs(46, 0).addBox(-1.0F, -4.25F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-1.04F, -3.0F, -3.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-1.05F, -3.0F, 2.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(0.0F, -1.0F, -3.51F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(0.0F, -1.0F, 2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(52, 12).addBox(3.3F, -0.99F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(-1.0F, -2.0F, -3.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-1.05F, -4.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 9).addBox(0.0F, -1.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-1.05F, -3.0F, -3.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_r1 = left_arm.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(33, 6).mirror().addBox(-1.0F, -3.2F, -3.99F, 3.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.266F, -0.9787F, 0.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition left_r2 = left_arm.addOrReplaceChild("left_r2", CubeListBuilder.create().texOffs(33, 6).mirror().addBox(-1.8F, -2.1F, -3.98F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2404F, -0.3403F, 0.5F, 0.0F, 0.0F, 1.2217F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.71F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-3.9F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.71F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

}