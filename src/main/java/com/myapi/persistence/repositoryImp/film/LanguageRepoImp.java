package com.myapi.persistence.repositoryImp.film;

import com.myapi.persistence.PersistenceManager;
import com.myapi.persistence.entities.Inventory;
import com.myapi.persistence.entities.film.Language;
import com.myapi.persistence.repository.BaseRepo;
import com.myapi.persistence.repository.film.InventoryRepo;
import com.myapi.persistence.repository.film.LanguageRepo;
import com.myapi.persistence.repositoryImp.BaseRepoImp;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.Set;

public class LanguageRepoImp extends BaseRepoImp<Language> implements LanguageRepo {
    EntityManager entityManager;

    public LanguageRepoImp() {
        entityManager = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();
    }

    @Override
    public Language getLanguageById(String languageName) {
        String queryString = "from Language l where l.name = : languageName";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("languageName", languageName);
        return (Language) query.getSingleResult();
    }

    @Override
    public Set<Language> getAllLanguage() {
        return getAll(new Language());
    }
}
