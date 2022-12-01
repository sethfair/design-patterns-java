package com.sethfair.command;

import java.util.HashMap;

public class GameController {
    HashMap<String, Command> commands = new HashMap<>();

    void registerKey(String key, Command c) {
        commands.put(key.toLowerCase(), c);
    }

    public void handleWKey() {
        commands.get("w").execute();
    }

    public void handleDKey() {
        commands.get("d").execute();
    }
}
