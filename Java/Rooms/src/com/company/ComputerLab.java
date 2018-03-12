package com.company;

public class ComputerLab extends Room {
    // RoomNumber, capacity, projection inherited
    private String os;

    public ComputerLab(String rm, boolean p, String os) {
        super(rm, 20, p);
        this.os = os;
    }
    public String getOS() {
        return os;
    }
    public void setOS(String update) {
        os = update;
    }

}
