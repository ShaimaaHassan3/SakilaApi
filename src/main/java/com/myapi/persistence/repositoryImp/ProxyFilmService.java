package com.myapi.persistence.repositoryImp;

import com.myapi.dtos.FilmDto;
import com.myapi.persistence.entities.Film;
import com.myapi.services.FilmService;
import com.myapi.services.FilmServicesIn;

import java.util.Set;

public class ProxyFilmService implements FilmServicesIn {
    private FilmService realUserService;
    private Set<FilmDto> cachedFilms;

    public ProxyFilmService() {
        realUserService = new FilmService();
    }
    @Override
    public Set<FilmDto> getAllFilms() {
        if (cachedFilms == null) {
            cachedFilms = realUserService.getAllFilms();
        }
        return cachedFilms;
    }
}
