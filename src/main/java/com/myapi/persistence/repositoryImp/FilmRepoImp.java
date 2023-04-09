package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.PersistenceManager;
import com.myapi.persistence.entities.*;
import com.myapi.persistence.repository.FilmRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilmRepoImp extends BaseRepoImp<Film> implements FilmRepo {
    EntityManager entityManager;

    public FilmRepoImp() {

        entityManager = PersistenceManager.getInstance().getEntityManagerFactory().createEntityManager();

    }

    @Override
    public Set<Film> getAllFilms() {
        return getAll(new Film());
    }


    @Override
    public Film getFilmById(int id) {
        Film film = entityManager.find(Film.class, id);
        return film;
    }

    @Override
    public Film saveFilm(Film film) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(film);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
        return film;
    }


    @Override
    public void deleteFilm(int id) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            Film film = entityManager.find(Film.class, id);
            entityManager.remove(film);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
    }

    @Override
    public Film updateFilm(Film film) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.merge(film);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
        return film;
    }
}
