package com.myapi.api.soapApi.storeServices;

import com.myapi.dtos.StaffDto;
import com.myapi.dtos.StoreDetailDto;
import com.myapi.dtos.StoreDto;
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
}
