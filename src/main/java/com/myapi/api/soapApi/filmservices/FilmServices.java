package com.myapi.api.soapApi.filmservices;

import com.myapi.dtos.film.ActorDto;
import com.myapi.dtos.film.CategoryDto;
import com.myapi.dtos.film.FilmDto;
import com.myapi.dtos.StoreDto;
import com.myapi.services.film.ProxyFilmService;
import com.myapi.services.film.FilmService;
import com.myapi.services.film.FilmServicesIn;
import com.myapi.services.util.exception.NotFoundException;
import jakarta.jws.WebService;

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

    public FilmDto getFilmById(int id) throws NotFoundException {
        return service.getFilmById(id);
    }

    public FilmDto saveFilm(FilmDto filmDto) throws NotFoundException {
        return service.saveFilm(filmDto);
    }

    public void deleteFilm(int id) {
        service.deleteFilm(id);
    }

    public FilmDto updateFilm(FilmDto film) throws NotFoundException {
        return service.updateFilm(film);
    }

    public FilmDto getFilmByName(String title) throws NotFoundException {
        return service.getFilmByName(title);
    }

    public Set<ActorDto> getAllFilmActorsByFilm(int filmId) {
        return service.getAllFilmActorsByFilm(filmId);
    }

    public Set<FilmDto> getAllFilmsReleaseYear(Integer ReleaseYear) throws NotFoundException {
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
