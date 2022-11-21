package org.example.recivercommand;

import java.util.Arrays;
import java.util.Scanner;

public class Device {
    Device[] device  = new Device[10];
    private String name;
    private int capacity;
    private String color;
    private int weight;
    private boolean onOff;

    /*public Device(String name, int capacity, String color, int weight, boolean onOff) {
        this.name = name;
        this.capacity = capacity;
        this.color = color;
        this.weight = weight;
        this.onOff = onOff;
    }*/

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    @Override
    public String toString() {
        return "Devices{" +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", onOff=" + onOff +
                '}';
    }

    public static void searchNameDevice(String name, Device[] device){
        for (int i = 0; i < 3; i++) {
            if (device[i].getName().equals(name)){
                System.out.println(device[i].toString());
            }
        }
    }
    public static void searchOnDevice(Device[] device){
        System.out.println(device.length);
    }
    public void addDevice(){
        Scanner in = new Scanner(System.in);
        //for (int i = 0; i < device.length; i++) {
            //if (device[i] == null){
        int i = 0;
                this.device[i].setName(in.nextLine());
                this.device[i].setCapacity(in.nextInt());
                this.device[i].setColor(in.nextLine());
                this.device[i].setWeight(in.nextInt());
                this.device[i].setOnOff(in.hasNext());
            //}
        //}
    }

    public void search(){
        System.out.println("Пошук...");
    }
    public void add(){
        System.out.println("Добавляємо...");
    }
    public void delete(){
        System.out.println("Видаляємо...");
    }

}
