package net.maketendo.tardifmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.tardifmod.world.inventory.RefinaryGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class RefinaryGUIScreen extends AbstractContainerScreen<RefinaryGUIMenu> {
	private final static HashMap<String, Object> guistate = RefinaryGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_refine;

	public RefinaryGUIScreen(RefinaryGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tardif_mod:textures/screens/refinary_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/maingui.png"), this.leftPos + -68, this.topPos + -29, 0, 0, 296, 236, 296, 236);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/invslot.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/itemslot.png"), this.leftPos + 130, this.topPos + 34, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/itemslot.png"), this.leftPos + 25, this.topPos + 51, 0, 0, 18, 18, 18, 18);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/itemslot.png"), this.leftPos + 25, this.topPos + 26, 0, 0, 18, 18, 18, 18);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.refinary_gui.label_refinary_placholder"), -36, -2, -13477555, false);
	}

	@Override
	public void init() {
		super.init();
		button_refine = Button.builder(Component.translatable("gui.tardif_mod.refinary_gui.button_refine"), e -> {
		}).bounds(this.leftPos + 58, this.topPos + 32, 56, 20).build();
		guistate.put("button:button_refine", button_refine);
		this.addRenderableWidget(button_refine);
	}
}
