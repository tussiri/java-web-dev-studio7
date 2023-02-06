package org.launchcode.studio7;


public class CD extends BaseDisc implements OpticalDisc{

    public CD (String name, double storageCapacity) {
        super(500, storageCapacity, "CD", name);
    }
        public void playMusic(){
            System.out.println("Now Playing");

        }

    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning at 200-500 RPM.");
    }

    @Override
    public void readData(){
        System.out.println("Would you like to play music?");
    }

}

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


