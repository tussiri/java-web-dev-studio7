package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc{
private int spinDisc;
private double storageCapacity;
private String discType;
private String name;

    public BaseDisc(int spinDisc, double storageCapacity, String discType, String name) {
        this.spinDisc = spinDisc;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.name = name;
    }

    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning at " + spinDisc + " RPM.");
    }


    @Override
    public void readableDisc() {

    }

    @Override
    public String toString() {
        return "Disc Name: " + name +
                "\nDisc Type: " + discType  +
                "\nStorage Capacity: " + storageCapacity + "GB";

    }
}
