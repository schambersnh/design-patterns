package main.commandpattern.command.light;

import main.commandpattern.command.Command;
import main.commandpattern.receiver.Light;

/**
 * Created by Stephen on 8/6/18.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
