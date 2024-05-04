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
	ImageButton imagebutton_moon;
	ImageButton imagebutton_overworld;
	ImageButton imagebutton_the_neather;
	ImageButton imagebutton_the_end;
	ImageButton imagebutton_mondas;

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
		imagebutton_moon = new ImageButton(this.leftPos + 215, this.topPos + 43, 26, 26, 0, 0, 26, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_moon.png"), 26, 52, e -> {
		});
		guistate.put("button:imagebutton_moon", imagebutton_moon);
		this.addRenderableWidget(imagebutton_moon);
		imagebutton_overworld = new ImageButton(this.leftPos + 250, this.topPos + 68, 51, 51, 0, 0, 51, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_overworld.png"), 51, 102, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new DimentionSelectionGuiButtonMessage(1, x, y, z));
				DimentionSelectionGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_overworld", imagebutton_overworld);
		this.addRenderableWidget(imagebutton_overworld);
		imagebutton_the_neather = new ImageButton(this.leftPos + 56, this.topPos + 143, 49, 49, 0, 0, 49, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_the_neather.png"), 49, 98, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new DimentionSelectionGuiButtonMessage(2, x, y, z));
				DimentionSelectionGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_the_neather", imagebutton_the_neather);
		this.addRenderableWidget(imagebutton_the_neather);
		imagebutton_the_end = new ImageButton(this.leftPos + 317, this.topPos + 12, 52, 52, 0, 0, 52, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_the_end.png"), 52, 104, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new DimentionSelectionGuiButtonMessage(3, x, y, z));
				DimentionSelectionGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_the_end", imagebutton_the_end);
		this.addRenderableWidget(imagebutton_the_end);
		imagebutton_mondas = new ImageButton(this.leftPos + 72, this.topPos + 20, 51, 51, 0, 0, 51, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_mondas.png"), 51, 102, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new DimentionSelectionGuiButtonMessage(4, x, y, z));
				DimentionSelectionGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_mondas", imagebutton_mondas);
		this.addRenderableWidget(imagebutton_mondas);
	}
}
