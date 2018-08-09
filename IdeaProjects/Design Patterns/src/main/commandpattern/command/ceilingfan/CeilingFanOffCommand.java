package main.commandpattern.command.ceilingfan;

import main.commandpattern.command.Command;
import main.commandpattern.receiver.CeilingFan;

/**
 * Created by Stephen on 8/6/18.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

}
