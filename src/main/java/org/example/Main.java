package org.example;

import org.example.concretecommand.AddCommand;
import org.example.concretecommand.SearchCommand;
import org.example.invokerpackage.DeviceOperation;
import org.example.recivercommand.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exit;
        List<Device> devices = new ArrayList<>();
        DeviceOperation deviceOperation = new DeviceOperation();
        Scanner in = new Scanner(System.in);
        String s;
        s = in.next();
        do {
            if (s.equals("/add")) {
                deviceOperation.executeOperation(new AddCommand(devices));
                s = in.next();
            }
            if (s.equals("/search")) {
                deviceOperation.executeOperation(new SearchCommand(devices));
                s = in.next();
            }
            exit = s.equals("/exit");
        } while (!exit);
    }
}