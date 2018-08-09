package main.commandpattern.command.stereo;

import main.commandpattern.command.Command;
import main.commandpattern.receiver.Stereo;

/**
 * Created by Stephen on 8/6/18.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
