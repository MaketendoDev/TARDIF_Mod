package net.maketendo.tardifmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.maketendo.tardifmod.world.inventory.CoordinateSelectGUIMenu;
import net.maketendo.tardifmod.procedures.RotateDisplayProcedure;
import net.maketendo.tardifmod.network.CoordinateSelectGUIButtonMessage;
import net.maketendo.tardifmod.TardifModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CoordinateSelectGUIScreen extends AbstractContainerScreen<CoordinateSelectGUIMenu> {
	private final static HashMap<String, Object> guistate = CoordinateSelectGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox X_Coord;
	EditBox Y_Coord;
	EditBox Z_Coord;
	Checkbox Calculate_Y;
	Button button_save;
	Button button_randomize;
	Button button_rotate;

	public CoordinateSelectGUIScreen(CoordinateSelectGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tardif_mod:textures/screens/coordinate_select_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		X_Coord.render(guiGraphics, mouseX, mouseY, partialTicks);
		Y_Coord.render(guiGraphics, mouseX, mouseY, partialTicks);
		Z_Coord.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/coordinates_pannel_gui.png"), this.leftPos + 1, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (X_Coord.isFocused())
			return X_Coord.keyPressed(key, b, c);
		if (Y_Coord.isFocused())
			return Y_Coord.keyPressed(key, b, c);
		if (Z_Coord.isFocused())
			return Z_Coord.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		X_Coord.tick();
		Y_Coord.tick();
		Z_Coord.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String X_CoordValue = X_Coord.getValue();
		String Y_CoordValue = Y_Coord.getValue();
		String Z_CoordValue = Z_Coord.getValue();
		super.resize(minecraft, width, height);
		X_Coord.setValue(X_CoordValue);
		Y_Coord.setValue(Y_CoordValue);
		Z_Coord.setValue(Z_CoordValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.coordinate_select_gui.label_coordinate_selector"), 6, 6, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.coordinate_select_gui.label_x"), 5, 29, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.coordinate_select_gui.label_y"), 5, 48, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.coordinate_select_gui.label_z"), 5, 67, -12829636, false);
		guiGraphics.drawString(this.font,

				RotateDisplayProcedure.execute(world), 66, 114, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		X_Coord = new EditBox(this.font, this.leftPos + 17, this.topPos + 25, 118, 18, Component.translatable("gui.tardif_mod.coordinate_select_gui.X_Coord")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.X_Coord").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.X_Coord").getString());
				else
					setSuggestion(null);
			}
		};
		X_Coord.setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.X_Coord").getString());
		X_Coord.setMaxLength(32767);
		guistate.put("text:X_Coord", X_Coord);
		this.addWidget(this.X_Coord);
		Y_Coord = new EditBox(this.font, this.leftPos + 17, this.topPos + 44, 118, 18, Component.translatable("gui.tardif_mod.coordinate_select_gui.Y_Coord")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.Y_Coord").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.Y_Coord").getString());
				else
					setSuggestion(null);
			}
		};
		Y_Coord.setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.Y_Coord").getString());
		Y_Coord.setMaxLength(32767);
		guistate.put("text:Y_Coord", Y_Coord);
		this.addWidget(this.Y_Coord);
		Z_Coord = new EditBox(this.font, this.leftPos + 17, this.topPos + 63, 118, 18, Component.translatable("gui.tardif_mod.coordinate_select_gui.Z_Coord")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.Z_Coord").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.Z_Coord").getString());
				else
					setSuggestion(null);
			}
		};
		Z_Coord.setSuggestion(Component.translatable("gui.tardif_mod.coordinate_select_gui.Z_Coord").getString());
		Z_Coord.setMaxLength(32767);
		guistate.put("text:Z_Coord", Z_Coord);
		this.addWidget(this.Z_Coord);
		button_save = Button.builder(Component.translatable("gui.tardif_mod.coordinate_select_gui.button_save"), e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new CoordinateSelectGUIButtonMessage(0, x, y, z));
				CoordinateSelectGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 80, this.topPos + 137, 46, 20).build();
		guistate.put("button:button_save", button_save);
		this.addRenderableWidget(button_save);
		button_randomize = Button.builder(Component.translatable("gui.tardif_mod.coordinate_select_gui.button_randomize"), e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new CoordinateSelectGUIButtonMessage(1, x, y, z));
				CoordinateSelectGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 5, this.topPos + 137, 72, 20).build();
		guistate.put("button:button_randomize", button_randomize);
		this.addRenderableWidget(button_randomize);
		button_rotate = Button.builder(Component.translatable("gui.tardif_mod.coordinate_select_gui.button_rotate"), e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new CoordinateSelectGUIButtonMessage(2, x, y, z));
				CoordinateSelectGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 109, 56, 20).build();
		guistate.put("button:button_rotate", button_rotate);
		this.addRenderableWidget(button_rotate);
		Calculate_Y = new Checkbox(this.leftPos + 8, this.topPos + 85, 20, 20, Component.translatable("gui.tardif_mod.coordinate_select_gui.Calculate_Y"), false);
		guistate.put("checkbox:Calculate_Y", Calculate_Y);
		this.addRenderableWidget(Calculate_Y);
	}
}
