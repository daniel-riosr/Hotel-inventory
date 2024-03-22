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
public class Room {
    private String type;
    private int roomNo;
    private boolean status;
    private int block;
    private boolean maintenance;
    private ManageInventory inventoryManager;
    private RoomType roomType;
    
    public Room(String type, int roomNo, boolean status, int block, RoomType roomType) {
        this.type = type;
        this.roomNo = roomNo;
        this.status = status;
        this.block = block;
        this.roomType = roomType;
    }

    public Room(String type, int roomNo, boolean status) {
        this.type = type;
        this.roomNo = roomNo;
        this.status = status;
    }

    public Room() {
    }
    
    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public boolean isMaintenance() {
        return maintenance;
    }

    public void setMaintenance(boolean maintenance) {
        this.maintenance = maintenance;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    
    public ManageInventory getInventoryManager() {
        return inventoryManager;
    }

    public void setInventoryManager(ManageInventory inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

    public void displayInventory() {
    if (roomType != null) {
        System.out.println("Inventario de la habitación " + type + roomNo + ":");
        for (InventoryItem item : roomType.getInventory()) {
            System.out.println("- " + item.getName() + ": " + item.getQuantity());
        }
    } else {
        System.out.println("No se ha asignado un tipo de habitación.");
    }
}
    
    @Override
    public String toString() {
    return "Tipo: " + type + ", Número: " + roomNo + ", Estado: " + (status ? "Disponible" : "No disponible");
    }


    public void modifyInventory(int option, int newQuantity) {
    String itemName;
    switch (option) {
        case 1:
            itemName = "Toalla";
            break;
        case 2:
            itemName = "Sábana";
            break;
        case 3:
            itemName = "Televisor";
            break;
        case 4:
            itemName = "Sofá";
            break;
        default:
            System.out.println("Opción de inventario no válida.");
            return;
    }
    
    for (InventoryItem item : roomType.getInventory()) {
        if (item.getName().equalsIgnoreCase(itemName)) {
            item.setQuantity(newQuantity);
            return;
        }
    }
    }
}

