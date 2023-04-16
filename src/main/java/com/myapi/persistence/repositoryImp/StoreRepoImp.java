package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.PersistenceManager;
import com.myapi.persistence.entities.Staff;
import com.myapi.persistence.entities.Store;
import com.myapi.persistence.repository.StoreRepo;
import jakarta.persistence.EntityManager;

import java.util.Set;

public class StoreRepoImp extends BaseRepoImp<Store> implements StoreRepo {
    EntityManager entityManager;

    public StoreRepoImp() {
        entityManager = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
    }

    @Override
    public Store getStoreById(int ID) {
        return getById(ID);
    }

    @Override
    public Set<Store> getAllStories() {
        return getAll(new Store());
    }

    @Override
    public Staff getManager(int storeId) {
        Store store = entityManager.find(Store.class, storeId);
        return store.getManagerStaff();
    }
}
