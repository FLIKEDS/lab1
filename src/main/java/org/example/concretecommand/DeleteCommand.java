package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;
import org.example.recivercommand.DeviceService;

public class DeleteCommand implements Command {
    Device device;
    DeviceService deviceService = new DeviceService();
    public DeleteCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        deviceService.delete();
    }
}
