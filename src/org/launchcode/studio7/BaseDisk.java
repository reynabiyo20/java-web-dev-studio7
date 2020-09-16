package org.launchcode.studio7;

abstract class BaseDisk {

    double transferRate;
    String encryptionType;
    double capacity;
    String content;
    double storageUsed;

    public BaseDisk(double transferRate, String encryptionType, double capacity, String content, double storageUsed) {

        this.transferRate = transferRate;
        this.encryptionType = encryptionType;
        this.capacity = capacity;
        this.content = content;
        this.storageUsed = storageUsed;

    }

    public double getTransferRate() {
        return transferRate;
    }

    public String getEncryptionType() {
        return encryptionType;
    }


    public double getCapacity() {
        return capacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getStorageUsed() {
        return storageUsed;
    }

    public void setStorageUsed(double storageUsed) {
        this.storageUsed = storageUsed;
    }

    public double availableStorage() {
        return this.capacity - this.storageUsed;

    }

    public boolean enoughDiskSpaceAvailable(double fileSize) {
        if (this.availableStorage() >= fileSize) {
            return true;
        } else {
            return false;
        }
    }
}
