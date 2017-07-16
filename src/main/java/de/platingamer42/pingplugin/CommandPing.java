package de.platingamer42.pingplugin;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class CommandPing extends Command {
    CommandPing() {
        super("ping");
    }
    @Override
    public void execute(CommandSender sender, String[] args){
        if (!(sender instanceof ProxiedPlayer)){
            sender.sendMessage(new ComponentBuilder("Du musst ein Spieler sein," +
                    " um diesen Befehl ausführen zu können").color(ChatColor.RED).create());
            return;
        }
        ProxiedPlayer p = (ProxiedPlayer) sender;
        String s = String.format("Dein derzeitiger Ping ist: %s%sms", ChatColor.GREEN, p.getPing());
        sender.sendMessage(new ComponentBuilder(s).color(ChatColor.AQUA).create());
    }
}
