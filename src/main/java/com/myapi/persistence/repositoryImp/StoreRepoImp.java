package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.Film;
import com.myapi.persistence.entities.Store;
import com.myapi.persistence.repository.FilmRepo;
import com.myapi.persistence.repository.StoreRepo;

public class StoreRepoImp extends BaseRepoImp<Store> implements StoreRepo {
    @Override
    public Store getStoreById(int ID) {
        return getById(ID);
    }
}
