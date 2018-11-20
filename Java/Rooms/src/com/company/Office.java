package com.company;

public class Office extends Room {
    private String roomNumber;
    private int capacity;
    private String attribute;

    public Office(String rm,String name) {
        super(rm,1,false);
        roomNumber = rm;
        capacity = 1;
        attribute = name;

    }
    public String getRoomNumber() {
        return "Room Number " + roomNumber;
    }

    public int getCapacity() {
        return capacity;


    }

    public String getAttribute() {
        return attribute;
    }
}
