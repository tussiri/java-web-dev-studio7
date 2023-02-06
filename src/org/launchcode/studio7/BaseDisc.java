package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc{
private int spinDisc;
private double storageCapacity;
private String discType;
private String name;
private ArrayList<String> contents;

    public BaseDisc(int spinDisc, double storageCapacity, String discType, String name) {
        this.spinDisc = spinDisc;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.name = name;
    }

    @Override
    public void readableDisc() {

    }

    @Override
    public String toString() {
        return "Disc Name: " + name +
                "\nDisc Type: " + discType  +
                "\nStorage Capacity: " + storageCapacity+ "GB";

    }
}
