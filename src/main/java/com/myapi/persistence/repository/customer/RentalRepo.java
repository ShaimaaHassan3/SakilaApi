package com.myapi.persistence.repository.customer;

import com.myapi.persistence.entities.customer.Rental;

import java.util.Set;

public interface RentalRepo {

    public Rental getRental(int rentalId);
    public Set<Rental> getAllRental();
}
