package com.myapi.api.soapApi.rentalservices;

import com.myapi.dtos.StaffDto;
import com.myapi.dtos.customer.CustomerDto;
import com.myapi.dtos.customer.RentalDto;
import com.myapi.services.RentalService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "RentalWebServices")
public class RentalServices {
    RentalService service;

    public RentalServices() {
        service = new RentalService();
    }

    @WebMethod(operationName = "rental")
    public RentalDto getRental(int rentalID) {
        return service.getRental(rentalID);
    }

    @WebMethod(operationName = "rentals")
    public Set<RentalDto> getAllRental() {
        return service.getAllRental();
    }

    @WebMethod(operationName = "customerRental")
    public CustomerDto getCustomerWoRental(int rentalId) {
        return service.getCustomerWhoRental(rentalId);
    }

    @WebMethod(operationName = "staffRental")
    public StaffDto getStaffProcessedRental(int rentalId) {
        return service.getStaffRental(rentalId);
    }
}
