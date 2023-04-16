package com.myapi.api.soapApi.storeServices;

import com.myapi.dtos.InventoryDto;
import com.myapi.dtos.StaffDto;
import com.myapi.dtos.StoreDetailDto;
import com.myapi.dtos.StoreDto;
import com.myapi.dtos.customer.CustomerDto;
import com.myapi.services.StoreService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "StoreWebServices")
public class StoreServices {
    StoreService service;

    public StoreServices() {
        service = new StoreService();
    }

    @WebMethod(operationName = "Store")
    public StoreDetailDto getStoreById(int ID) {
        return service.getStoreByID(ID);
    }

    @WebMethod(operationName = "Stories")
    public Set<StoreDetailDto> getAllStories(int ID) {
        return service.getAllStories();
    }

    @WebMethod(operationName = "manager")
    public StaffDto getManager(int ID) {
        return service.gatManager(ID);
    }

    @WebMethod(operationName = "newStore")
    public StoreDetailDto addStore(StoreDetailDto storeDetailDto) {
        System.out.println("Store : " + storeDetailDto);
        return service.addStore(storeDetailDto);
    }

    @WebMethod(operationName = "updateStore")
    public StoreDetailDto updateStore(StoreDetailDto storeDetailDto) {
        System.out.println("Store : " + storeDetailDto);
        return service.updateStore(storeDetailDto);
    }

    @WebMethod(operationName = "inventories")
    public Set<InventoryDto> getAllInventory(int storeId) {
        return service.getAllInventoryDtoSet(storeId);
    }

    @WebMethod(operationName = "staffs")
    public Set<StaffDto> getAllStaff(int storeID) {
        return service.getAllStaff(storeID);
    }

    @WebMethod(operationName = "customers")
    public Set<CustomerDto> getAllCustomer(int storeID) {
        return service.getAllCustomer(storeID);
    }
}
