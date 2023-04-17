package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.StaffDto;
import com.myapi.dtos.customer.CustomerDto;
import com.myapi.dtos.customer.PaymentDto;
import com.myapi.dtos.customer.RentalDto;
import com.myapi.persistence.repository.customer.RentalRepo;
import com.myapi.persistence.repositoryImp.customer.RentalRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class RentalService {
    RentalRepo rentalRepo;
    ModelMapper modelMapper;

    public RentalService() {
        rentalRepo = new RentalRepoImp();
        modelMapper = new ModelMapper();
    }

    public RentalDto getRental(int rentalId) {
        return modelMapper.map(rentalRepo.getRental(rentalId), RentalDto.class);
    }

    public Set<RentalDto> getAllRental() {
        Type type = new TypeToken<Set<RentalDto>>() {
        }.getType();
        return modelMapper.map(rentalRepo.getAllRental(), type);
    }

    public CustomerDto getCustomerWhoRental(int rentalId) {
        return modelMapper.map(rentalRepo.rentalCustomer(rentalId), CustomerDto.class);
    }

    public StaffDto getStaffRental(int rentalId) {
        return modelMapper.map(rentalRepo.rentalStaff(rentalId), StaffDto.class);
    }
}
