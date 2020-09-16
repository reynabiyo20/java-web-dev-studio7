package org.launchcode.studio7;

public class Vinyls extends BaseDisk implements Spinnable {
    public Vinyls(double transferRate, String encryptionType, double capacity, String content, double storegeUsed) {
        super(transferRate, encryptionType, capacity, content, storegeUsed);
    }

    @Override
    public void spinSpeed() {
        System.out.println("45");
    }

    @Override
    public void storesData() {
        System.out.println("Not for long");
    }

    @Override
    public void readsData() {
        System.out.println("yup");
    }

    @Override
    public void deletesData() {
        System.out.println("1 time");
    }
}
