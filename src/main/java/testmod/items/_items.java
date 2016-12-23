package testmod.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import testmod.ModInfo;

public class _items {
	
	//Creating the item
	public static Item  itemTest;
	
	//Registry of the items using the method at the bottom 
	public static final void preinit(){
		//[the name of the item created above] = registerItem(new [the Item class.  Use "Item" if none is needed](), "[the name of the item created above]");
		itemTest = registerItem(new ItemTest(), "itemTest");
	}
	
	//The method that register the renders of all the items 
	public static final void registerRenders() {
		registerRender(itemTest);
	}
	
	//the method that contains the code that registers the render of each item
	public static final void registerRender(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0, 
				new ModelResourceLocation(ModInfo.modid + ":" + i.getRegistryName().getResourcePath(), "inventory"));
	}
	//The method that registers the items 
	public static final Item registerItem(Item i, String n) {
		ResourceLocation r = new ResourceLocation(ModInfo.modid, n);
		
		i.setUnlocalizedName(n);
		i.setRegistryName(r);
		
		GameRegistry.register(i);
		
		return i;
	}
}
