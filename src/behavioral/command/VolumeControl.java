package behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class VolumeControl {
    private final Map<String, Command> commandMap = new HashMap<>();

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Такой команды нет");
        }
    }
}
