package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        System.out.println("This is a test to see if the methods all print");
        DVD knivesOut = new DVD ("Knives Out", 5.7);
        knivesOut.readData();
        knivesOut.spinDisc();
        System.out.println(knivesOut.toString());

        CD theloniusMonk = new CD("Thelonious Alone in San Francisco", 700);
        System.out.println(theloniusMonk.toString());
        theloniusMonk.readData();
        theloniusMonk.spinDisc();
        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
