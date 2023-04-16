package com.myapi.persistence.repository;

import com.myapi.persistence.entities.film.Category;

import java.util.Set;

public interface CategoryRepo {
    public Category getCategoryById(int catID);
    public Category getCategoryByName(String catNAme);
    public Set<Category> getAllCategories();
    public Category addCategory(Category category);
}
