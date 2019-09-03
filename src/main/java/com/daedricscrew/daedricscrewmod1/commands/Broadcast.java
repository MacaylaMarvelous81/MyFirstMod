package com.daedricscrew.daedricscrewmod1.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.MessageArgument;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class Broadcast {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("broadcast").requires((requirementTypes) -> {
            return  requirementTypes.hasPermissionLevel(2);
        }).then(Commands.argument("message", MessageArgument.message()).executes((commandData) -> {
            ITextComponent message = MessageArgument.getMessage(commandData, "message");
            ITextComponent messagePrefix = new StringTextComponent("§c[§aBroadcast§c]§b " + message.getString());
            commandData.getSource().getServer().getPlayerList().sendMessage(messagePrefix);
            return 1;
        })));
    }
}
