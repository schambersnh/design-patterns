package main.commandpattern;

import main.commandpattern.command.ceilingfan.CeilingFanOffCommand;
import main.commandpattern.command.ceilingfan.CeilingFanOnCommand;
import main.commandpattern.command.garage.GarageDoorDownCommand;
import main.commandpattern.command.garage.GarageDoorUpCommand;
import main.commandpattern.command.light.LightOffCommand;
import main.commandpattern.command.light.LightOnCommand;
import main.commandpattern.command.stereo.StereoOffCommand;
import main.commandpattern.command.stereo.StereoOnWithCDCommand;
import main.commandpattern.receiver.CeilingFan;
import main.commandpattern.receiver.GarageDoor;
import main.commandpattern.receiver.Light;
import main.commandpattern.receiver.Stereo;
import main.commandpattern.remote.RemoteControl;
import main.commandpattern.remote.SimpleRemoteControl;

/**
 * Created by Stephen on 8/6/18.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
