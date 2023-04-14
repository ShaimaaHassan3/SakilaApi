package com.myapi.services.film;

import com.myapi.dtos.FilmDto;

import java.util.Set;

public interface FilmServicesIn {
    public Set<FilmDto> getAllFilms();
}
