package com.myapi.api.soapApi.rentalservices;

import com.myapi.dtos.InventoryDto;
import com.myapi.dtos.StaffDto;
import com.myapi.dtos.customer.CustomerDto;
import com.myapi.dtos.customer.RentalDto;
import com.myapi.persistence.entities.customer.Rental;
import com.myapi.services.RentalService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;
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

    @WebMethod(operationName = "inventoryRental")
    public InventoryDto getRentalInventory(int rentalId) {
        return service.getRentalInventory(rentalId);
    }

    @WebMethod(operationName = "rentalDate")
    public Date getRenatlDate(int rentalId) {
        return service.getRenatlDate(rentalId);
    }

    @WebMethod(operationName = "newRental")
    public RentalDto addRentalDto(RentalDto rentalDto) {
        System.out.println("Rental : " + rentalDto);
        return service.addRental(rentalDto);
    }
    @WebMethod(operationName = "updateRental")
    public RentalDto updateRentalDto(RentalDto rentalDto) {
        System.out.println("Rental : " + rentalDto);
        return service.updateRental(rentalDto);
    }
}
