package net.witchkings.knightsofterrafirma.client.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class BlueSteelChestplate {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -8.0F, -9.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 5.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(1.01F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -1.4F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F))
		.texOffs(50, 8).addBox(-0.5F, -5.0F, -3.03F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(27, 7).addBox(-2.0F, -4.1F, -3.04F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(60, 1).addBox(-0.49F, -4.5F, -3.57F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 1).addBox(-0.49F, -4.5F, 2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 2).addBox(-2.0F, -3.8F, 2.49F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(53, 2).addBox(-2.0F, -3.8F, -3.56F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_r1 = RightArm.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(46, 2).addBox(0.0F, -2.0F, -0.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 2).addBox(0.0F, -2.0F, 5.48F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.0F, -3.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_r2 = RightArm.addOrReplaceChild("right_r2", CubeListBuilder.create().texOffs(32, 3).addBox(0.0F, -1.5F, -1.54F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 3).addBox(0.0F, -1.5F, -7.53F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, 4.0F, 0.0F, 0.0F, -1.3963F));

		PartDefinition right_r3 = RightArm.addOrReplaceChild("right_r3", CubeListBuilder.create().texOffs(39, 3).addBox(0.0F, -1.9F, -1.53F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 3).addBox(0.0F, -1.9F, -7.54F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 0.0F, 4.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition right_r4 = RightArm.addOrReplaceChild("right_r4", CubeListBuilder.create().texOffs(27, 7).addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8376F, -0.3917F, -2.01F, 0.0F, 0.0F, -1.3963F));

		PartDefinition right_r5 = RightArm.addOrReplaceChild("right_r5", CubeListBuilder.create().texOffs(27, 7).addBox(-1.0F, -0.8F, -0.97F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4053F, -1.8565F, -2.02F, 0.0F, 0.0F, -0.9163F));

		PartDefinition right_r6 = RightArm.addOrReplaceChild("right_r6", CubeListBuilder.create().texOffs(27, 7).addBox(-1.0F, -1.366F, -1.01F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.183F, -2.317F, -2.02F, 0.0F, 0.0F, -0.3491F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -1.4F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false)
		.texOffs(53, 2).mirror().addBox(0.0F, -3.8F, -3.56F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(60, 1).mirror().addBox(-0.51F, -4.5F, -3.57F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 2).mirror().addBox(0.0F, -3.8F, 2.49F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(60, 1).mirror().addBox(-0.51F, -4.5F, 2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(27, 7).mirror().addBox(0.0F, -4.1F, -3.04F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(50, 8).mirror().addBox(-0.5F, -5.0F, -3.03F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_r1 = LeftArm.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(27, 7).mirror().addBox(-1.0F, -1.366F, -1.01F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.183F, -2.317F, -2.02F, 0.0F, 0.0F, 0.3491F));

		PartDefinition left_r2 = LeftArm.addOrReplaceChild("left_r2", CubeListBuilder.create().texOffs(27, 7).mirror().addBox(-1.0F, -0.8F, -0.97F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.4053F, -1.8565F, -2.02F, 0.0F, 0.0F, 0.9163F));

		PartDefinition left_r3 = LeftArm.addOrReplaceChild("left_r3", CubeListBuilder.create().texOffs(27, 7).mirror().addBox(-1.0F, -0.7F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8376F, -0.3917F, -2.01F, 0.0F, 0.0F, 1.3963F));

		PartDefinition left_r4 = LeftArm.addOrReplaceChild("left_r4", CubeListBuilder.create().texOffs(32, 3).mirror().addBox(-2.0F, -1.5F, -1.54F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(32, 3).mirror().addBox(-2.0F, -1.5F, -7.53F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 1.0F, 4.0F, 0.0F, 0.0F, 1.3963F));

		PartDefinition left_r5 = LeftArm.addOrReplaceChild("left_r5", CubeListBuilder.create().texOffs(46, 2).mirror().addBox(-2.0F, -2.0F, -1.52F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 2).mirror().addBox(-2.0F, -2.0F, -7.55F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -1.0F, 4.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition left_r6 = LeftArm.addOrReplaceChild("left_r6", CubeListBuilder.create().texOffs(39, 3).mirror().addBox(-2.0F, -1.9F, -1.53F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(39, 3).mirror().addBox(-2.0F, -1.9F, -7.54F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, 0.0F, 4.0F, 0.0F, 0.0F, 0.9163F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.ZERO);

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}