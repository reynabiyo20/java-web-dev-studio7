package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        Spinnable myCD = new CD (100,"WPA",1000, "Music", 50);
        Spinnable myDVD = new CD (800,"WPA2",10000, "Jaws", 50);
        Vinyls myVinyl = new Vinyls (45,"none",50,"Salt n Pepper", 45);


        myCD.deletesData();
        myCD.readsData();
        myCD.spinSpeed();
        myCD.storesData();

        myDVD.deletesData();
        myDVD.readsData();
        myDVD.spinSpeed();
        myDVD.storesData();


        myVinyl.deletesData();
        myVinyl.readsData();
        myVinyl.spinSpeed();
        myVinyl.storesData();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
