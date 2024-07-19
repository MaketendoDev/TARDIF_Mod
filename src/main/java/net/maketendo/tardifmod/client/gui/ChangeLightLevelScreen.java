package net.maketendo.tardifmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.tardifmod.world.inventory.ChangeLightLevelMenu;
import net.maketendo.tardifmod.network.ChangeLightLevelButtonMessage;
import net.maketendo.tardifmod.TardifModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ChangeLightLevelScreen extends AbstractContainerScreen<ChangeLightLevelMenu> {
	private final static HashMap<String, Object> guistate = ChangeLightLevelMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox LightLevel;
	Button button_set_level;

	public ChangeLightLevelScreen(ChangeLightLevelMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tardif_mod:textures/screens/change_light_level.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		LightLevel.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (LightLevel.isFocused())
			return LightLevel.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		LightLevel.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		LightLevel = new EditBox(this.font, this.leftPos + 27, this.topPos + 32, 118, 18, Component.translatable("gui.tardif_mod.change_light_level.LightLevel")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.change_light_level.LightLevel").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.change_light_level.LightLevel").getString());
				else
					setSuggestion(null);
			}
		};
		LightLevel.setSuggestion(Component.translatable("gui.tardif_mod.change_light_level.LightLevel").getString());
		LightLevel.setMaxLength(32767);
		guistate.put("text:LightLevel", LightLevel);
		this.addWidget(this.LightLevel);
		button_set_level = Button.builder(Component.translatable("gui.tardif_mod.change_light_level.button_set_level"), e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new ChangeLightLevelButtonMessage(0, x, y, z));
				ChangeLightLevelButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 70, 72, 20).build();
		guistate.put("button:button_set_level", button_set_level);
		this.addRenderableWidget(button_set_level);
	}
}
