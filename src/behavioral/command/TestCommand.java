package behavioral.command;

import behavioral.command.impl.SwitchSilentModeCommand;
import behavioral.command.impl.VolumeDownCommand;
import behavioral.command.impl.VolumeUpCommand;

public class TestCommand {
    public static void main(String[] args) {
        Volume volume = new Volume();

        VolumeControl volumeControl = new VolumeControl();
        volumeControl.register("up", new VolumeUpCommand(volume));
        volumeControl.register("down", new VolumeDownCommand(volume));
        volumeControl.register("mute", new SwitchSilentModeCommand(volume));

        volumeControl.execute("mute");
        volumeControl.execute("mute");
        for (int i = 0; i < 11; i++) {
            volumeControl.execute("up");
        }
        volumeControl.execute("down");


    }
}
