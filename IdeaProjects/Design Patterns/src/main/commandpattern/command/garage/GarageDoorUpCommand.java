package main.commandpattern.command.garage;

import main.commandpattern.command.Command;
import main.commandpattern.receiver.GarageDoor;

/**
 * Created by Stephen on 8/6/18.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
