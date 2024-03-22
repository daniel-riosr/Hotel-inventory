/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dlope
 */
public class ManageInventory {
    private int largeRooms;
    private int mediumRooms;
    private int smallRooms;
    private List<Room> rooms;
    private InventoryItem inventory;
    

    public ManageInventory(int largeRooms, int mediumRooms, int smallRooms) {
        this.largeRooms = largeRooms;
        this.mediumRooms = mediumRooms;
        this.smallRooms = smallRooms;
        this.rooms = createRooms();
    }
    
    public List<Room> createRooms() {
    List<Room> generatedRooms = new ArrayList<>();

    for (int i = 1; i <= largeRooms; i++) {
        RoomType typeA = new RoomType(4, 4);
        Room room = new Room("A", i, true, 1, typeA);
        generatedRooms.add(room);
    }

    for (int i = 1; i <= mediumRooms; i++) {
        RoomType typeB = new RoomType(2, 2);
        Room room = new Room("B", i, true, 2, typeB);
        generatedRooms.add(room);
    }

    for (int i = 1; i <= smallRooms; i++) {
        RoomType typeC = new RoomType(1, 1);
        Room room = new Room("C", i, true, 3, typeC);
        generatedRooms.add(room);
    }

    return generatedRooms;
}
        
    public List<Room> listAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.getStatus()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public List<Room> listUnavailableRooms() {
        List<Room> unavailableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (!room.getStatus()) {
                unavailableRooms.add(room);
            }
        }
        return unavailableRooms;
    }
    
    public List<Room> listUnavailableRoomsPerMaintenance() {
        List<Room> unavailableRooms = new ArrayList<>();

        for (Room room : rooms) {
            if (room.isMaintenance()) {
                unavailableRooms.add(room);
            }
        }
        return unavailableRooms;
    }
    
    public void modifyRoomStatus(List<Room> availableRooms, String type, int roomNo, boolean newStatus, boolean maintenance) {
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.getRoomNo() == roomNo) {
                room.setStatus(newStatus);
                room.setMaintenance(maintenance);
                return;
            }
        }
        System.out.println("Habitación " + type + roomNo + " no encontrada");
    }
    
}
