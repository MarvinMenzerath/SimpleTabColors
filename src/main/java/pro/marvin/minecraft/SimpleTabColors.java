package pro.marvin.minecraft;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleTabColors extends JavaPlugin implements Listener {

	/**
	 * Register the 'PlayerJoinEvent' and start a repeating Task, which updates the colored names every second (20 Ticks)
	 */
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
			for (Player player : getServer().getOnlinePlayers())
				updateName(player);
		}, 0L, 20L);
	}

	/**
	 * Run the 'updateName(Player player)' method whenever a new player joins the server after a small delay of one tick
	 */
	@EventHandler
	public void onPlayerJoin(final PlayerJoinEvent event) {
		getServer().getScheduler().scheduleSyncDelayedTask(this, () -> updateName(event.getPlayer()), 1);
	}

	/**
	 * Colors the name of the specified Player in the TabList according to the Player's permission
	 * Also shorts the 'DisplayName' to fit with the two-digit ColorCode
	 */
	public void updateName(Player player) {
		String name = player.getDisplayName();
		for (ChatColor color : ChatColor.values()) {
			String permission = "simpletabcolors." + color.getChar();
			if (player.hasPermission(permission)) {
				if (name.length() > 14) {
					name = color + name.substring(0, 14);
				} else {
					name = color + name;
				}
				player.setPlayerListName(name);
				return;
			}
		}
	}
}