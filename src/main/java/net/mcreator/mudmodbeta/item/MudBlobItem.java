
package net.mcreator.mudmodbeta.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MudBlobItem extends Item {
	public MudBlobItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("mud_blob");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
