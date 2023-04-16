package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.address.Address;
import com.myapi.persistence.entities.address.City;
import com.myapi.persistence.repository.AddressRepo;
import com.myapi.persistence.repository.CityRepo;

public class CityRepoImp extends BaseRepoImp<City> implements CityRepo {

    @Override
    public City getCityById(int ID) {
        return getById(ID);
    }
}
