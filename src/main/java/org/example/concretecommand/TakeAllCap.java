package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;
import org.example.recivercommand.DeviceService;

import java.util.List;

public class TakeAllCap implements Command {
    List<Device> devices;
    DeviceService deviceService = new DeviceService();
    public TakeAllCap(List<Device> devices) {
        this.devices = devices;
    }
    @Override
    public void execute() {
        deviceService.takeAllCap(devices);
    }
}
