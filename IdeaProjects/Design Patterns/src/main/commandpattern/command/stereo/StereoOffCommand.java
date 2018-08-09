package main.commandpattern.command.stereo;

import main.commandpattern.command.Command;
import main.commandpattern.receiver.Stereo;

/**
 * Created by Stephen on 8/6/18.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
