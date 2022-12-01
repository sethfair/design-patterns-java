package com.sethfair.command;

import com.sethfair.command.Character;
import com.sethfair.command.Command;

public class RunCommand implements Command {
    private final Character character;

    public RunCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        this.character.run();
    }
}
