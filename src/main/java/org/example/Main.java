package org.example;

import org.example.concretecommand.AddCommand;
import org.example.invokerpackage.DeviceOperation;
import org.example.recivercommand.Device;

public class Main {
    public static void main(String[] args) {
        DeviceOperation deviceOperation = new DeviceOperation();
        deviceOperation.executeOperation(new AddCommand(new Device()));
    }
}