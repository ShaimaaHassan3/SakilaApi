package com.myapi.persistence.repository.film;

import com.myapi.persistence.entities.Inventory;
import com.myapi.persistence.entities.film.Film;

public interface InventoryRepo {
    public Inventory getInventory(int inventoryId);
    public Film getFilm(int inventoryId);
}
