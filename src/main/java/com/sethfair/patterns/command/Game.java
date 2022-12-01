package com.sethfair.patterns.command;

public class Game {
    Character character;
    Command runCommand;
    Command jumpCommand;

    public Game(GameController controller) {
        character = new Character();
        runCommand = new RunCommand(character);
        jumpCommand = new JumpCommand(character);

        controller.registerKey("w", jumpCommand);
        controller.registerKey("d", runCommand);
    }
}
