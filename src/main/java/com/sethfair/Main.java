package com.sethfair;

import com.sethfair.command.Game;
import com.sethfair.command.GameController;

class Main {
    public static void main(String[]args){
        commandPattern();
    }

    private static void commandPattern() {
        GameController controller = new GameController();
        Game game = new Game(controller);

        controller.handleDKey();
        controller.handleWKey();
    }
}