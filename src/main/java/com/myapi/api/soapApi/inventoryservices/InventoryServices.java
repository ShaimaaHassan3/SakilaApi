package com.myapi.api.soapApi.inventoryservices;

import com.myapi.dtos.InventoryDto;
import com.myapi.services.InventoryService;
import jakarta.jws.WebService;

@WebService(name = "InventoryWebServices")
public class InventoryServices {
    InventoryService service;

    public InventoryServices() {
        service = new InventoryService();
    }

    public InventoryDto getInventory(int inventoryId) {
        return service.getInventory(inventoryId);
    }
}
