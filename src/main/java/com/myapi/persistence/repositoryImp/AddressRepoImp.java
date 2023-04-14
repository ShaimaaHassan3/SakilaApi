package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.address.Address;
import com.myapi.persistence.repository.AddressRepo;

import java.util.Set;

public class AddressRepoImp extends BaseRepoImp<Address> implements AddressRepo {


    @Override
    public Set<Address> getAllAddresses() {
        return getAll(new Address());
    }

    @Override
    public Address getAddressById(int ID) {
        return getById(ID);
    }

    @Override
    public void deleteAddress(Address address) {
        delete(address);
    }

    @Override
    public Address createAddress(Address address) {
        return save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        return update(address);
    }
}


