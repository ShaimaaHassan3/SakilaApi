package com.myapi.persistence.repository.customer;

import com.myapi.persistence.entities.customer.Rental;

public interface RentalRepo {

    public Rental getRental(int rentalId);
}
