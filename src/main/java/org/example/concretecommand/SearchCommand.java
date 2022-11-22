package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;
import org.example.recivercommand.DeviceService;

import java.util.List;

public class SearchCommand implements Command {
    List<Device> devices;
    DeviceService deviceService = new DeviceService();
    public SearchCommand(List<Device> devices) {
        this.devices = devices;
    }
    @Override
    public void execute() {
        deviceService.search(devices);
    }
}
