package de.platingamer42.pingplugin;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class CommandPing extends Command {
    public CommandPing() {
        super("ping");
    }
    @Override
    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer p = (ProxiedPlayer) sender;
        String s = String.format("Dein derzeitiger Ping ist: %sms", p.getPing());
        sender.sendMessage(new ComponentBuilder(s).create());
    }
}
