package org.launchcode.studio7;

public class CD extends BaseDisk implements Spinnable {


    public CD(double transferRate, String encryptionType, double capacity, String content, double storageUsed) {
        super(transferRate, encryptionType, capacity, content, storageUsed);
    }

    @Override
    public void spinSpeed() {
        System.out.println("CD spinSpeed lives!");
    }

    @Override
    public void storesData() {
        System.out.println("CD storesData works!");
    }

    @Override
    public void readsData() {
        System.out.println("CD readsData rocks!");
    }

    @Override
    public void deletesData() {
        System.out.println("CD deletesData grinds!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
