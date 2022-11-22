package org.example.recivercommand;

import java.util.List;
import java.util.Scanner;

public class Device {
    private String name;
    private int capacity;
    private String color;
    private int weight;
    private boolean onOff;

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

}
