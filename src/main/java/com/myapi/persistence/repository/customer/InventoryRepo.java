package com.myapi.persistence.repository.customer;

import com.myapi.persistence.entities.Inventory;

public interface InventoryRepo {
    public Inventory getInventory(int inventoryId);
}
