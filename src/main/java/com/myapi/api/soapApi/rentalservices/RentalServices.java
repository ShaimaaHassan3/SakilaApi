package com.myapi.api.soapApi.rentalservices;

import com.myapi.dtos.customer.RentalDto;
import com.myapi.services.RentalService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

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
}
