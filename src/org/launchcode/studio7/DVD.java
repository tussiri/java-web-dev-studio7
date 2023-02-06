package org.launchcode.studio7;

import java.sql.Time;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD(String name, double storageCapacity){
        super(1800, storageCapacity, "DVD", name);

    }
@Override
public void spinDisc(){
        System.out.println("A DVD spins at a rate of 57-1600 rpm.");
}

@Override
    public void readData(){
        System.out.println("Would you like to watch a movie?");
}

}
