package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.film.Category;
import com.myapi.persistence.repository.CategoryRepo;

public class CategoryRepoImp extends BaseRepoImp<Category> implements CategoryRepo {
    @Override
    public Category getCategoryById(int catID) {
        return getById(catID);
    }
}
