package com.myapi.api.soapApi.addressservices;

import com.myapi.dtos.AddressDto;
import com.myapi.services.AddressService;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "AddressWebServices")
public class AddressServices {
    AddressService addressService;

    public AddressServices() {
        addressService = new AddressService();
    }

    public Set<AddressDto> getAllAddress() {
        return addressService.getAllAddresses();
    }
}
