package testmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import testmod.blocks._blocks;
import testmod.items._items;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent e){
		_items.preinit();
		_blocks.preinit();
	}
	
	public void init(FMLInitializationEvent e){
		
	}
	
	public void postinit(FMLPostInitializationEvent e){
		
	}
}
