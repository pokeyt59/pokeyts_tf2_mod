
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pokeystfmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeysTfModModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PokeysTfModModItems.MEDIC_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("pokeys_tf_mod", "ammotf_2"),
				builder -> builder.title(Component.translatable("item_group.pokeys_tf_mod.ammotf_2")).icon(() -> new ItemStack(PokeysTfModModItems.SYRENGEAMMO.get())).displayItems((parameters, tabData) -> {
					tabData.accept(PokeysTfModModItems.SYRENGEAMMO.get());
					tabData.accept(PokeysTfModModItems.HWGAMMO.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("pokeys_tf_mod", "weaponstf_2"),
				builder -> builder.title(Component.translatable("item_group.pokeys_tf_mod.weaponstf_2")).icon(() -> new ItemStack(PokeysTfModModItems.HWGAMMO.get())).displayItems((parameters, tabData) -> {
					tabData.accept(PokeysTfModModItems.HEAVYTF_2MINIGUN.get());
				}).withSearchBar());
	}
}
