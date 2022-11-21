package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;

public class AddCommand implements Command {
    Device device;
    public AddCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.addDevice();
    }
}
