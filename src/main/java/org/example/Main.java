package org.example;

import org.example.concretecommand.AddCommand;
import org.example.concretecommand.DeleteCommand;
import org.example.concretecommand.SearchCommand;
import org.example.concretecommand.ToStringCommand;
import org.example.invokerpackage.DeviceOperation;
import org.example.recivercommand.Device;

public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[10];
        DeviceOperation deviceOperation = new DeviceOperation();
        deviceOperation.executeOperation(new SearchCommand(devices[0]));
        //deviceOperation.executeOperation(new ToStringCommand(devices[0]));
    }
}