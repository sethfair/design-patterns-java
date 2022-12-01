package com.sethfair.patterns.command;

public class JumpCommand implements Command{
    private final Character character;

    public JumpCommand(Character character) {
        this.character = character;
    }

    @Override
    public void execute() {
        this.character.jump();
    }
}
