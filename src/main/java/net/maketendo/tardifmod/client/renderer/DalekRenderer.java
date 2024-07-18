
package net.maketendo.tardifmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.maketendo.tardifmod.entity.DalekEntity;
import net.maketendo.tardifmod.client.model.Modeldalek;

public class DalekRenderer extends MobRenderer<DalekEntity, Modeldalek<DalekEntity>> {
	public DalekRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldalek(context.bakeLayer(Modeldalek.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DalekEntity entity) {
		return new ResourceLocation("tardif_mod:textures/entities/dalek_texture.png");
	}
}
