package behavioral.command.impl;

import behavioral.command.Command;
import behavioral.command.Volume;

public class VolumeUpCommand implements Command {
    Volume volume;

    public VolumeUpCommand(Volume volume) {
        this.volume = volume;
    }

    @Override
    public void execute() {
        volume.increaseVolume();
    }
}
