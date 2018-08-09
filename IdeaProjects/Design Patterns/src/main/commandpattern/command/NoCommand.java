package main.commandpattern.command;

/**
 * Created by Stephen on 8/6/18.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Unimplemented command");
    }
}
