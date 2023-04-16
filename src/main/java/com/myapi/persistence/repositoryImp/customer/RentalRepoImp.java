package com.myapi.persistence.repositoryImp.customer;

import com.myapi.persistence.entities.customer.Rental;
import com.myapi.persistence.repository.customer.RentalRepo;
import com.myapi.persistence.repositoryImp.BaseRepoImp;

import java.util.Set;

public class RentalRepoImp extends BaseRepoImp<Rental> implements RentalRepo {
    @Override
    public Rental getRental(int rentalId) {
        return getById(rentalId);
    }

    @Override
    public Set<Rental> getAllRental() {
        return getAll(new Rental());
    }
}
