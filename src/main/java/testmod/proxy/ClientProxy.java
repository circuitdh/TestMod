package testmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import testmod.items._items;

public class ClientProxy extends CommonProxy{

	public void preinit(FMLPreInitializationEvent e){
		super.preinit(e);
	}
	
	public void init(FMLInitializationEvent e){
		super.init(e);
		
		_items.registerRenders();
		_items.registerRenders();
	}
	
	public void postinit(FMLPostInitializationEvent e){
		super.postinit(e);
	}
}