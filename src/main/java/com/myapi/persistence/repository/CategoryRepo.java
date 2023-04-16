package com.myapi.persistence.repository;

import com.myapi.persistence.entities.film.Category;

public interface CategoryRepo {
    public Category getCategoryById(int catID);
    public Category getCategoryByName(String catNAme);
}
