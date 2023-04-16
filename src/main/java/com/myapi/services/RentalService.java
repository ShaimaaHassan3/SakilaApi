package com.myapi.services;

import com.myapi.dtos.customer.RentalDto;
import com.myapi.persistence.repository.customer.RentalRepo;
import com.myapi.persistence.repositoryImp.customer.RentalRepoImp;
import org.modelmapper.ModelMapper;

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
}
