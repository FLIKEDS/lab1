package org.example.recivercommand;

import java.util.List;
import java.util.Scanner;

public class DeviceService {
    /*public static void searchNameDevice(String name, Device[] device) {
        for (int i = 0; i < 3; i++) {
            if (device[i].getName().equals(name)) {
                System.out.println(device[i].toString());
            }
        }
    }*/

    public static void onDevice(List<Device> devices) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть назву девайсу");
        String name = in.nextLine();
        for (Device device : devices) {
            if (device.getName().equals(name)){
                if (!device.isOnOff()){
                    device.setOnOff(true);
                    System.out.println("Девайс включився!");
                } else {
                    System.out.println("Девайс включений!");
                }
            }
        }

    }

    public void addDevice(List<Device> devices) {
        Device device = new Device();
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть назву: ");
        device.setName(in.nextLine());
        System.out.println("Введіть Ємність: ");
        device.setCapacity(in.nextInt());
        System.out.println("Введіть колір: ");
        device.setColor(in.next());
        System.out.println("Введіть ширину: ");
        device.setWeight(in.nextInt());
        System.out.println("Введіть true або false - де true включений, а false виключений: ");
        device.setOnOff(in.nextBoolean());

        devices.add(device);
        System.out.println("Девайс добавлено!");
    }

    public void search(List<Device> devices) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть назву девайсу");
        String name = in.nextLine();
        for (Device device : devices) {
            if (device.getName().equals(name)){
                System.out.println(device);
            }
        }
    }
    public void printAll(List<Device> devices){
        System.out.println("Пошук...");
        for (Device device : devices) {
            System.out.println(device);
        }
    }
    public void delete() {
        System.out.println("Видаляємо...");
    }

    public void takeAllCap(List<Device> devices){
        int result = 0;
        for (Device device : devices) {
            result += device.getCapacity();
        }
        System.out.println(result);
    }
}
