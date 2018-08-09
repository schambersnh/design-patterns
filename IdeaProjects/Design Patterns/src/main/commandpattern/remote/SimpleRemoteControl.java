package main.commandpattern.remote;

import main.commandpattern.command.Command;

/**
 * Created by Stephen on 8/6/18.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
