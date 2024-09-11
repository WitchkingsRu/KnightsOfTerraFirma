package net.witchkings.knightsofterrafirma.client.armor;
// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidArmorModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class BlackSteelKnightArmor {
//	<T extends LivingEntity> extends HumanoidModel<T>
//	private final ModelPart head;
//	private final ModelPart body;
//	private final ModelPart left_arm;
//	private final ModelPart right_arm;
//	private final ModelPart right_leg;
//	private final ModelPart left_leg;
//
//	public BlackSteelKnightArmor(ModelPart root) {
//		super(root);
//		this.head = root.getChild("head");
//		this.body = root.getChild("body");
//		this.left_arm = root.getChild("left_arm");
//		this.right_arm = root.getChild("right_arm");
//		this.right_leg = root.getChild("right_leg");
//		this.left_leg = root.getChild("left_leg");
//	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, -8.0F, -9.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 0.0F, 5.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -4.25F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-0.05F, -3.0F, -2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 8).addBox(1.0F, -1.0F, -2.93F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 12).addBox(4.3F, -0.99F, -1.92F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 8).addBox(1.0F, -1.0F, 1.98F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 1).addBox(-0.05F, -3.0F, 1.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 16).mirror().addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_r1 = left_arm.addOrReplaceChild("left_r1", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-1.8F, -2.1F, -3.44F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.2404F, -0.3403F, 0.5F, 0.0F, 0.0F, 1.2217F));

		PartDefinition left_r2 = left_arm.addOrReplaceChild("left_r2", CubeListBuilder.create().texOffs(36, 6).mirror().addBox(-1.0F, -3.2F, -3.45F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.266F, -0.9787F, 0.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(54, 8).mirror().addBox(-5.0F, -1.0F, -2.93F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 12).mirror().addBox(-5.3F, -0.99F, -1.92F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-1.95F, -3.0F, -2.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(54, 8).mirror().addBox(-5.0F, -1.0F, 1.98F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(48, 0).mirror().addBox(-2.0F, -4.25F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 1).mirror().addBox(-1.95F, -3.0F, 1.99F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_r1 = right_arm.addOrReplaceChild("right_r1", CubeListBuilder.create().texOffs(36, 6).addBox(-1.2F, -2.1F, -3.44F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.2404F, -0.3403F, 0.5F, 0.0F, 0.0F, -1.2217F));

		PartDefinition right_r2 = right_arm.addOrReplaceChild("right_r2", CubeListBuilder.create().texOffs(36, 6).addBox(-2.0F, -3.2F, -3.45F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.266F, -0.9787F, 0.5F, 0.0F, 0.0F, -0.5236F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 16).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//	}

//	@Override
//	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
}