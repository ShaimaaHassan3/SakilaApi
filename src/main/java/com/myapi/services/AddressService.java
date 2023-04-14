package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.AddressDto;
import com.myapi.persistence.entities.address.Address;
import com.myapi.persistence.repository.AddressRepo;
import com.myapi.persistence.repositoryImp.AddressRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class AddressService {
    ModelMapper modelMapper;
    AddressRepoImp addressRepo;

    public AddressService() {
        modelMapper = new ModelMapper();
        addressRepo = new AddressRepoImp();
    }

    public Set<AddressDto> getAllAddresses() {
        Type type = new TypeToken<Set<AddressDto>>() {
        }.getType();
        return modelMapper.map(addressRepo.getAllAddresses(), type);
    }
}
