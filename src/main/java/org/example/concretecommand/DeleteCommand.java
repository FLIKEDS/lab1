package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;

public class DeleteCommand implements Command {
    Device device;
    public DeleteCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.delete();
    }
}
