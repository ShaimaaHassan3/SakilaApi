package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.PersistenceManager;
import com.myapi.persistence.entities.film.Category;
import com.myapi.persistence.repository.CategoryRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class CategoryRepoImp extends BaseRepoImp<Category> implements CategoryRepo {
    EntityManager entityManager;

    public CategoryRepoImp() {
        entityManager = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
    }

    @Override
    public Category getCategoryById(int catID) {
        return getById(catID);
    }

    @Override
    public Category getCategoryByName(String catName) {
        String queryString = "From Category c where c.name = : catName";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("catName", catName);
        return (Category) query.getSingleResult();
    }
}
