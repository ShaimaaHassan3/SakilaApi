package com.myapi.persistence.repositoryImp.customer;

import com.myapi.persistence.entities.Inventory;
import com.myapi.persistence.entities.customer.Customer;
import com.myapi.persistence.repository.BaseRepo;
import com.myapi.persistence.repository.customer.CustomerRepo;
import com.myapi.persistence.repository.customer.InventoryRepo;
import com.myapi.persistence.repositoryImp.BaseRepoImp;

public class InventoryRepoImp extends BaseRepoImp<Inventory> implements InventoryRepo {
    @Override
    public Inventory getInventory(int inventoryId) {
        return getById(inventoryId);
    }
}
