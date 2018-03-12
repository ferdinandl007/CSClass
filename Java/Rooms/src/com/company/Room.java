package com.company;

public class Room {
    private String roomNumber;
    private int capacity;
    private boolean projection;

    public Room(String rm, int n, boolean p) {
        roomNumber = rm;
        capacity = n;
        projection = p;
    }
    public String getRoomNumber() {
        return "Room Number " + roomNumber;
    }

    public int getCapacity() {
        return capacity;

    }
    public boolean hasProjector() {
        return projection;
    }
}
