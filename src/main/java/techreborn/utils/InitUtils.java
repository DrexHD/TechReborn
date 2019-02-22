package techreborn.utils;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import techreborn.TechReborn;

public class InitUtils {
	public static <I extends Item> I setup(I item, String name) {
		item.setRegistryName(new ResourceLocation(TechReborn.MOD_ID, name));
		return item;
	}

	public static <B extends Block> B setup(B block, String name) {
		block.setRegistryName(new ResourceLocation(TechReborn.MOD_ID, name));
		return block;
	}
}