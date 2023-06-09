package com.myapi.api.soapApi.inventoryservices;

import com.myapi.dtos.InventoryDto;
import com.myapi.dtos.StoreDto;
import com.myapi.dtos.film.FilmDto;
import com.myapi.services.InventoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "InventoryWebServices")
public class InventoryServices {
    InventoryService service;

    public InventoryServices() {
        service = new InventoryService();
    }

    @WebMethod(operationName = "inventory")
    public InventoryDto getInventory(int inventoryId) {
        return service.getInventory(inventoryId);
    }

    @WebMethod(operationName = "film")
    public FilmDto getFilm(int inventoryId) {
        return service.getFilm(inventoryId);
    }

    @WebMethod(operationName = "inventories")
    public Set<InventoryDto> getAllInventory() {
        return service.getAllInventory();
    }

    @WebMethod(operationName = "store")
    public StoreDto getStore(int inventoryId) {
        return service.getStore(inventoryId);
    }

    @WebMethod(operationName = "newInventory")
    public InventoryDto addInventory(InventoryDto inventory) {
        return service.addInventory(inventory);
    }

    @WebMethod(operationName = "updateInventory")
    public InventoryDto updateInventory(InventoryDto inventory) {
        return service.updateInventory(inventory);
    }
}
