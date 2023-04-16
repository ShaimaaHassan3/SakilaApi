package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.StaffDto;
import com.myapi.dtos.StoreDetailDto;
import com.myapi.dtos.customer.PaymentDto;
import com.myapi.persistence.entities.Store;
import com.myapi.persistence.repository.StoreRepo;
import com.myapi.persistence.repositoryImp.StoreRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class StoreService {
    StoreRepo storeRepo;
    ModelMapper modelMapper;

    public StoreService() {
        storeRepo = new StoreRepoImp();
        modelMapper = new ModelMapper();
    }

    public StoreDetailDto getStoreByID(int ID) {
        return modelMapper.map(storeRepo.getStoreById(ID), StoreDetailDto.class);
    }

    public Set<StoreDetailDto> getAllStories() {
        Type type = new TypeToken<Set<StoreDetailDto>>() {
        }.getType();
        return modelMapper.map(storeRepo.getAllStories(), type);
    }

    public StaffDto gatManager(int storeId) {
        return modelMapper.map(storeRepo.getManager(storeId), StaffDto.class);
    }

    public StoreDetailDto addStore(StoreDetailDto storeDetailDto) {
        Store store = modelMapper.map(storeDetailDto, Store.class);
        return modelMapper.map(storeRepo.addStore(store), StoreDetailDto.class);
    }
}
