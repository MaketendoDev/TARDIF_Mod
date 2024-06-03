package net.maketendo.tardifmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.tardifmod.world.inventory.DimentionSelectionGuiMenu;
import net.maketendo.tardifmod.network.DimentionSelectionGuiButtonMessage;
import net.maketendo.tardifmod.TardifModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DimentionSelectionGuiScreen extends AbstractContainerScreen<DimentionSelectionGuiMenu> {
	private final static HashMap<String, Object> guistate = DimentionSelectionGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_overworld;

	public DimentionSelectionGuiScreen(DimentionSelectionGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 386;
		this.imageHeight = 215;
	}

	private static final ResourceLocation texture = new ResourceLocation("tardif_mod:textures/screens/dimention_selection_gui.png");

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

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/space.png"), this.leftPos + 4, this.topPos + 4, 0, 0, 376, 206, 376, 206);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/sun.png"), this.leftPos + 154, this.topPos + 71, 0, 0, 80, 80, 80, 80);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.dimention_selection_gui.label_select_dimention"), 8, 7, -2960686, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_overworld = new ImageButton(this.leftPos + 250, this.topPos + 68, 51, 51, 0, 0, 51, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_overworld.png"), 51, 102, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new DimentionSelectionGuiButtonMessage(0, x, y, z));
				DimentionSelectionGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overworld", imagebutton_overworld);
		this.addRenderableWidget(imagebutton_overworld);
	}
}
