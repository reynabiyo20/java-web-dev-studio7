package org.launchcode.studio7;

public class DVD extends BaseDisk implements Spinnable {

    public DVD(double transferRate, String encryptionType, double capacity, String content, double storageUsed) {
        super(transferRate, encryptionType, capacity, content, storageUsed);
    }

    @Override
    public void spinSpeed() {
        System.out.println("DVD spinSpeed lives!");
    }

    @Override
    public void storesData() {
        System.out.println("DVD storesData works!");
    }

    @Override
    public void readsData() {
        System.out.println("DVD readsData rocks!");
    }

    @Override
    public void deletesData() {
        System.out.println("DVD deletesData grinds!");
    }
}
