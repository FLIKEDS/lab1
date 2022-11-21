package org.example.concretecommand;

import org.example.interfacecomand.Command;
import org.example.recivercommand.Device;

public class ToStringCommand implements Command {
        Device device;
        public ToStringCommand(Device device) {
            this.device = device;
        }
        @Override
        public void execute() {
            device.toString();

        }
    }

