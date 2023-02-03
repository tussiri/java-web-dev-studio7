package org.launchcode.studio7;


public class CD extends BaseDisc implements OpticalDisc{

    public CD (String name, double storageCapacity) {
        super(500, storageCapacity, "CD", name);
    }
        public void playMusic(){
            System.out.println("Now Playing");

        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


