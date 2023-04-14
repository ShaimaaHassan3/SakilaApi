package com.myapi.api.soapApi.addressservices;

import com.myapi.dtos.StoreDto;
import com.myapi.dtos.address.AddressDto;
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

    public AddressDto getAddressById(int ID) {
        return addressService.getAddressById(ID);
    }

//    public AddressDto NewAddress(AddressDto addressDto) {
//        return addressService.addNewAddress(addressDto);
//    }

    public Set<StoreDto> getAllStoriesInAddress(int ID) {
        return addressService.getAllStoriesInAddress(ID);
    }
}
