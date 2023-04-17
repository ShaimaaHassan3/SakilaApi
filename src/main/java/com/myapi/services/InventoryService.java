package com.myapi.services;

import com.myapi.dtos.InventoryDto;
import com.myapi.persistence.repository.customer.InventoryRepo;
import com.myapi.persistence.repositoryImp.customer.InventoryRepoImp;
import org.modelmapper.ModelMapper;

public class InventoryService {
    InventoryRepo inventoryRepo;
    ModelMapper modelMapper;

    public InventoryService() {
        inventoryRepo = new InventoryRepoImp();
        modelMapper = new ModelMapper();
    }

    public InventoryDto getInventory(int inventoryId) {
        return modelMapper.map(inventoryRepo.getInventory(inventoryId), InventoryDto.class);
    }
}
