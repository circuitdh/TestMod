package testmod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import testmod.ModInfo;
import testmod.items._items;

public class _blocks {

	public static BlockBase blockTest;
	
	public static final void preinit() {
		blockTest = registerBlock(new BlockTest(Material.GROUND), "blockTest");
	}
	
	public static final void registerRenders() {
		_items.registerRender(blockTest.i);
	}
	
	private static final BlockBase registerBlock(BlockBase b, String n) {
		ResourceLocation r = new ResourceLocation(ModInfo.modid, n);
		
		b.setUnlocalizedName(n);
		b.setRegistryName(r);
		b.i = new ItemBlock(b);
		
		GameRegistry.register(b);
		GameRegistry.register(b.i, r);
		return b;
	}
		
}
