package com.myapi.persistence.repository;

import com.myapi.persistence.entities.Address;
import com.myapi.persistence.entities.Customer;

import java.util.Set;

public interface AddressRepo {

    public Set<Address> getAllCustomers();

    public Address getAddressById(int ID);

    public void deleteAddress(Address customer);

    public Address createAddress(Address customer);

    public Address updateAddress(Address customer);
}
