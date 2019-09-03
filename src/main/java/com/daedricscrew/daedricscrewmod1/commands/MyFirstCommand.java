package com.daedricscrew.daedricscrewmod1.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.MessageArgument;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class MyFirstCommand {
    public static void register(CommandDispatcher<CommandSource> dispatcher) {
        dispatcher.register(Commands.literal("myfirstcommand").requires((requirementTypes) -> {
            return requirementTypes.hasPermissionLevel(2);
        }).then(Commands.argument("appended", MessageArgument.message()).executes((commandData) -> {
            ITextComponent appended = MessageArgument.getMessage(commandData, "appended");
            ITextComponent message = new StringTextComponent("Made with /myfirstcommand: " + appended.getString());
            commandData.getSource().getServer().getPlayerList().sendMessage(message);
            return 1;
        })));
    }
}
