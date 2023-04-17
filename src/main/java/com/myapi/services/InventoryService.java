package com.myapi.services;

import com.myapi.dtos.InventoryDto;
import com.myapi.dtos.film.FilmDto;
import com.myapi.persistence.repository.film.InventoryRepo;
import com.myapi.persistence.repositoryImp.film.InventoryRepoImp;
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

    public FilmDto getFilm(int inventoryId) {
        return modelMapper.map(inventoryRepo.getFilm(inventoryId), FilmDto.class);
    }
}
