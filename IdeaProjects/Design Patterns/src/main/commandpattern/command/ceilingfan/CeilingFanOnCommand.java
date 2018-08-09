package main.commandpattern.command.ceilingfan;

import main.commandpattern.command.Command;
import main.commandpattern.receiver.CeilingFan;

/**
 * Created by Stephen on 8/6/18.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
