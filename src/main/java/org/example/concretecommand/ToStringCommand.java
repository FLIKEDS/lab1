package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;
import org.example.recivercommand.DeviceService;
import java.util.List;

public class ToStringCommand implements Command {
    List<Device> devices;
    DeviceService deviceService = new DeviceService();
        public ToStringCommand(List<Device> devices) {
            this.devices = devices;
        }
        @Override
        public void execute() {
            deviceService.printAll(devices);

        }
    }

