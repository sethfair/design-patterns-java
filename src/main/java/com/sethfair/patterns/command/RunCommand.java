package com.sethfair.patterns.command;

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
