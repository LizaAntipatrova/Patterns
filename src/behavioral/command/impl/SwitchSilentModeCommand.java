package behavioral.command.impl;

import behavioral.command.Command;
import behavioral.command.Volume;

public class SwitchSilentModeCommand implements Command {
    Volume volume;

    public SwitchSilentModeCommand(Volume volume) {
        this.volume = volume;
    }

    @Override
    public void execute() {
        volume.switchToSilentMode();
    }
}
