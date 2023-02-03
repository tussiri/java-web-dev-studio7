package org.launchcode.studio7;

import java.sql.Time;

public class DVD extends BaseDisc implements OpticalDisc{


    public DVD(String name, double storageCapacity){
        super(1800, storageCapacity, "DVD", name);

    }

    public void playMovie(){
        System.out.println("Now playing: ");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
