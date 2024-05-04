package net.maketendo.tardifmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.maketendo.tardifmod.world.inventory.MonitorGUIMenu;
import net.maketendo.tardifmod.procedures.TTCapsuleDisplayProcedure;
import net.maketendo.tardifmod.procedures.PoliceBoxDisplayProcedure;
import net.maketendo.tardifmod.procedures.PhoneboxDisplayProcedure;
import net.maketendo.tardifmod.procedures.ExteriorinputProcedure;
import net.maketendo.tardifmod.procedures.BinDisplayProcedure;
import net.maketendo.tardifmod.network.MonitorGUIButtonMessage;
import net.maketendo.tardifmod.TardifModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MonitorGUIScreen extends AbstractContainerScreen<MonitorGUIMenu> {
	private final static HashMap<String, Object> guistate = MonitorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_status_button;
	ImageButton imagebutton_down_scroll;
	ImageButton imagebutton_up_scroll;
	ImageButton imagebutton_galifrayan_symbol_ui;
	ImageButton imagebutton_galifrayan_symbol_ui1;

	public MonitorGUIScreen(MonitorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 295;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("tardif_mod:textures/screens/monitor_gui.png");

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

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/screen_gui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 295, 180, 295, 180);

		if (PhoneboxDisplayProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/policebox_display.png"), this.leftPos + 28, this.topPos + 78, 0, 0, 32, 74, 32, 74);
		}

		guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/galifraian_symbol_ui_big.png"), this.leftPos + 85, this.topPos + 42, 0, 0, 108, 107, 108, 107);

		if (TTCapsuleDisplayProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/ttcapsule_ui.png"), this.leftPos + 26, this.topPos + 74, 0, 0, 36, 78, 36, 78);
		}
		if (BinDisplayProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/bin_ui.png"), this.leftPos + 26, this.topPos + 74, 0, 0, 36, 78, 36, 78);
		}
		if (PoliceBoxDisplayProcedure.execute(world)) {
			guiGraphics.blit(new ResourceLocation("tardif_mod:textures/screens/policebox_ui.png"), this.leftPos + 26, this.topPos + 74, 0, 0, 36, 78, 36, 78);
		}
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
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.monitor_gui.label_status"), 95, 13, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.monitor_gui.label_empty"), 16, 45, -1, false);
		guiGraphics.drawString(this.font,

				ExteriorinputProcedure.execute(world), 17, 42, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.monitor_gui.label_tardis_systems"), 204, 146, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tardif_mod.monitor_gui.label_tardis_data"), 221, 118, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_status_button = new ImageButton(this.leftPos + 261, this.topPos + 13, 20, 20, 0, 0, 20, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_status_button.png"), 20, 40, e -> {
		});
		guistate.put("button:imagebutton_status_button", imagebutton_status_button);
		this.addRenderableWidget(imagebutton_status_button);
		imagebutton_down_scroll = new ImageButton(this.leftPos + 38, this.topPos + 155, 12, 7, 0, 0, 7, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_down_scroll.png"), 12, 14, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new MonitorGUIButtonMessage(1, x, y, z));
				MonitorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_down_scroll", imagebutton_down_scroll);
		this.addRenderableWidget(imagebutton_down_scroll);
		imagebutton_up_scroll = new ImageButton(this.leftPos + 38, this.topPos + 66, 12, 7, 0, 0, 7, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_up_scroll.png"), 12, 14, e -> {
			if (true) {
				TardifModMod.PACKET_HANDLER.sendToServer(new MonitorGUIButtonMessage(2, x, y, z));
				MonitorGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_up_scroll", imagebutton_up_scroll);
		this.addRenderableWidget(imagebutton_up_scroll);
		imagebutton_galifrayan_symbol_ui = new ImageButton(this.leftPos + 175, this.topPos + 137, 26, 27, 0, 0, 27, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_galifrayan_symbol_ui.png"), 26, 54, e -> {
		});
		guistate.put("button:imagebutton_galifrayan_symbol_ui", imagebutton_galifrayan_symbol_ui);
		this.addRenderableWidget(imagebutton_galifrayan_symbol_ui);
		imagebutton_galifrayan_symbol_ui1 = new ImageButton(this.leftPos + 192, this.topPos + 110, 26, 27, 0, 0, 27, new ResourceLocation("tardif_mod:textures/screens/atlas/imagebutton_galifrayan_symbol_ui1.png"), 26, 54, e -> {
		});
		guistate.put("button:imagebutton_galifrayan_symbol_ui1", imagebutton_galifrayan_symbol_ui1);
		this.addRenderableWidget(imagebutton_galifrayan_symbol_ui1);
	}
}
