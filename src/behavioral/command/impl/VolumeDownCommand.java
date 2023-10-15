package behavioral.command.impl;

import behavioral.command.Command;
import behavioral.command.Volume;

public class VolumeDownCommand implements Command {
    Volume volume;

    public VolumeDownCommand(Volume volume) {
        this.volume = volume;
    }

    @Override
    public void execute() {
        volume.decreaseVolume();
    }
}
