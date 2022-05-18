package com.company;

public class Farm {
    private String ownerName;
    private String address;
    private int cows;
    private int horses;
    private int sheep;

    public Farm(String ownerName, String address, int cows, int horses, int sheep) {
        this.ownerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "OwnerName = " + ownerName + '\n' +
                "Address = " + address + '\n' +
                "Cows = " + cows +"\n"+
                "Horses = " + horses +"\n"+
                "Sheep = " + sheep ;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }
}
