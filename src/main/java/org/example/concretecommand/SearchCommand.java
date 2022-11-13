package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;

public class SearchCommand implements Command {
    Device device;
    public SearchCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.search();
    }
}
