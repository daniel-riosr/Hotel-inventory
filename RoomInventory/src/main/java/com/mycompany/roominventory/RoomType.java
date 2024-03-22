/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roominventory;

/**
 *
 * @author dcrio
 */
import java.util.ArrayList;
import java.util.List;

public final class RoomType {
    protected List<InventoryItem> inventoryItems;

    public RoomType() {
        this.inventoryItems = new ArrayList<>();
        setDefaultInventory(0, 0);
    }

    public RoomType(int towelQuantity, int bedSheetQuantity) {
        this.inventoryItems = new ArrayList<>();
        setDefaultInventory(towelQuantity, bedSheetQuantity);
    }

    public void setDefaultInventory(int towelQuantity, int bedSheetQuantity) {
        inventoryItems.add(new Towel(towelQuantity));
        inventoryItems.add(new BedSheet(bedSheetQuantity));
        inventoryItems.add(new Television());
        inventoryItems.add(new Couch());
    }

    public List<InventoryItem> getInventory() {
        return inventoryItems;
    }
}