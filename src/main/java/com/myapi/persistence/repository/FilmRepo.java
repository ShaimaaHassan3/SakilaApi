package com.myapi.persistence.repository;

import com.myapi.persistence.entities.Film;

import java.util.List;
import java.util.Set;

public interface FilmRepo {
    public Set<Film> getAllFilms();
    public Film getFilmById(int id);
    public Film saveFilm(Film film);
    public void deleteFilm(int id);
    public Film updateFilm(Film film);
}
