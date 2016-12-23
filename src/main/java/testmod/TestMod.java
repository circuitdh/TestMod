package testmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import testmod.proxy.CommonProxy;

@Mod(name = ModInfo.name,version = ModInfo.version, modid = ModInfo.modid)
public class TestMod {

	@Instance
	public static TestMod instance;
	
	@SidedProxy(clientSide = ModInfo.clientProxy, serverSide = ModInfo.serverProxy) 
	public static CommonProxy proxy; 
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e){ proxy.preinit(e); }
	
	@EventHandler
	public void init(FMLInitializationEvent e){ proxy.init(e); }
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent e){ proxy.postinit(e); }
}
