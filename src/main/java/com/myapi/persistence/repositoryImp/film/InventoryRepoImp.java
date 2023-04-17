package com.myapi.persistence.repositoryImp.film;

import com.myapi.persistence.entities.Inventory;
import com.myapi.persistence.entities.film.Film;
import com.myapi.persistence.repository.film.InventoryRepo;
import com.myapi.persistence.repositoryImp.BaseRepoImp;

import java.util.Set;

public class InventoryRepoImp extends BaseRepoImp<Inventory> implements InventoryRepo {
    @Override
    public Inventory getInventory(int inventoryId) {
        return getById(inventoryId);
    }

    @Override
    public Film getFilm(int inventoryId) {
        Inventory inventory = getInventory(inventoryId);
        return inventory.getFilm();
    }

    @Override
    public Set<Inventory> getAllInventory() {
        return getAll(new Inventory());
    }
}
