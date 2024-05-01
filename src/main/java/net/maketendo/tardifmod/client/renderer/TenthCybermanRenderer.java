
package net.maketendo.tardifmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.maketendo.tardifmod.entity.TenthCybermanEntity;
import net.maketendo.tardifmod.client.model.Modelmondasian_cybervillager;

public class TenthCybermanRenderer extends MobRenderer<TenthCybermanEntity, Modelmondasian_cybervillager<TenthCybermanEntity>> {
	public TenthCybermanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmondasian_cybervillager(context.bakeLayer(Modelmondasian_cybervillager.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TenthCybermanEntity entity) {
		return new ResourceLocation("tardif_mod:textures/entities/mondasian_cybervillager.png");
	}
}
