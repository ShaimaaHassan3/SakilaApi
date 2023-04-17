package com.myapi.api.soapApi.filmservices;

import com.myapi.dtos.film.ActorDto;
import com.myapi.dtos.film.CategoryDto;
import com.myapi.dtos.film.FilmDto;
import com.myapi.dtos.StoreDto;
import com.myapi.services.film.ProxyFilmService;
import com.myapi.services.film.FilmService;
import com.myapi.services.film.FilmServicesIn;
import com.myapi.services.util.exception.HandelException;
import jakarta.jws.WebService;
import jakarta.ws.rs.NotFoundException;

import java.util.Set;

@WebService(name = "FilmWebServices")
public class FilmServices {
    FilmService service;

    public FilmServices() {
        service = new FilmService();
    }

    public Set<FilmDto> getAllFilms() {
        FilmServicesIn serviceIn = new ProxyFilmService();
        return serviceIn.getAllFilms();
    }

    public FilmDto getFilmById(Integer id) throws HandelException {
//        if (!(id instanceof Integer))
//            throw new NotFoundException("Please Enter Integer Value");
        return service.getFilmById(id);
    }

    public FilmDto saveFilm(FilmDto filmDto) throws HandelException, IllegalAccessException {
        return service.saveFilm(filmDto);
    }

    public void deleteFilm(int id) {
        service.deleteFilm(id);
    }

    public FilmDto updateFilm(FilmDto film) throws HandelException {
        return service.updateFilm(film);
    }

    public FilmDto getFilmByName(String title) throws HandelException {
        return service.getFilmByName(title);
    }

    public Set<ActorDto> getAllFilmActorsByFilm(int filmId) {
        return service.getAllFilmActorsByFilm(filmId);
    }

    public Set<FilmDto> getAllFilmsReleaseYear(Integer ReleaseYear) throws HandelException {
        return service.getAllFilmsReleaseYear(ReleaseYear);
    }

    public Set<FilmDto> getAllFilmsLanguage(String languageName) {
        return service.getAllFilmsLanguage(languageName);
    }

    public Set<CategoryDto> getAllFilmCategories(int filmId) {
        return service.getAllFilmCategories(filmId);
    }

    public Set<StoreDto> getAllFilmStories(int filmId) {
        return service.getAllFilmStories(filmId);
    }
}
