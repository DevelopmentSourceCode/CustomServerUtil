package net.snapecraft.CustomServerUtilv2.main;

import net.snapecraft.CustomServerUtilv2.commands.HomeCMD;
import net.snapecraft.CustomServerUtilv2.commands.TpaCMD;
import org.bukkit.plugin.java.JavaPlugin;

import net.snapecraft.CustomServerUtilv2.essentials.FlyCMD;
import net.snapecraft.CustomServerUtilv2.essentials.Gamemodes;
import net.snapecraft.CustomServerUtilv2.essentials.VanishCMD;
import net.snapecraft.CustomServerUtilv2.essentials.dayCMD;
import net.snapecraft.CustomServerUtilv2.essentials.sunCMD;


public class CustomServerUtilv2 extends JavaPlugin 
{
	private static CustomServerUtilv2 plugin;
	
	public final static String noPermission = "§cDu Hast nicht Die Berichtigung um Den Befehl Auszuführen";
	public final static String Prefix = "§7[§3Server§7]§5 > §r";
	public final String art = "\n" +
			"   _____          _                   _____                          _    _ _   _ _ \n" + 
			"  / ____|        | |                 / ____|                        | |  | | | (_) |\n" + 
			" | |    _   _ ___| |_ ___  _ __ ___ | (___   ___ _ ____   _____ _ __| |  | | |_ _| |\n" + 
			" | |   | | | / __| __/ _ \\| '_ ` _ \\ \\___ \\ / _ \\ '__\\ \\ / / _ \\ '__| |  | | __| | |\n" + 
			" | |___| |_| \\__ \\ || (_) | | | | | |____) |  __/ |   \\ V /  __/ |  | |__| | |_| | |\n" + 
			"  \\_____\\__,_|___/\\__\\___/|_| |_| |_|_____/ \\___|_|    \\_/ \\___|_|   \\____/ \\__|_|_|\n" + 
			"                                                                                    \n" ;
	
	@Override
	public void onEnable() 
	{
	
		plugin = this;
		registerCommands();
		registerConfig();
		
		System.out.println(art);
	}
	
	private void registerCommands()
	{
		getCommand("day").setExecutor(new dayCMD());
		getCommand("sun").setExecutor(new sunCMD());
		getCommand("c").setExecutor(new Gamemodes());
		getCommand("s").setExecutor(new Gamemodes());
		getCommand("sp").setExecutor(new Gamemodes());
		getCommand("tpa").setExecutor(new TpaCMD());
		getCommand("tpaccept").setExecutor(new TpaCMD());
		getCommand("tpdecline").setExecutor(new TpaCMD());
		getCommand("tpahere").setExecutor(new TpaCMD());
		getCommand("fly").setExecutor(new FlyCMD());
		getCommand("vanish").setExecutor(new VanishCMD());
		getCommand("homes").setExecutor(new HomeCMD());
		
		
	}
	
	public static CustomServerUtilv2 getPlugin() {
		return plugin;
	}
	
	private void registerConfig() 
	{
		this.getConfig().options().copyDefaults(true);
		saveConfig();
	}

	public static String getPrefix() {
		return Prefix;
		
	}	






}