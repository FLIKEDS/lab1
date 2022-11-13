package org.example.invokerpackage;

import org.example.interfacecomand.Command;

import java.util.ArrayList;
import java.util.List;

public class DeviceOperation {
    private final List<Command> commands = new ArrayList<>();
    public void executeOperation(Command command){
        commands.add(command);
    }
}
