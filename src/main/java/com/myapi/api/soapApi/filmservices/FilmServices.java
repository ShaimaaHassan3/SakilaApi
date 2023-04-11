package com.myapi.api.soapApi.filmservices;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.ActorDto;
import com.myapi.dtos.FilmDto;
import com.myapi.persistence.entities.FilmActor;
import com.myapi.persistence.repositoryImp.ProxyFilmService;
import com.myapi.services.FilmService;
import com.myapi.services.FilmServicesIn;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.List;
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

    public FilmDto getFilmById(int id) {
        return service.getFilmById(id);
    }

    public FilmDto saveFilm(FilmDto filmDto) {
        return service.saveFilm(filmDto);
    }

    public void deleteFilm(int id) {
        service.deleteFilm(id);
    }

    public FilmDto updateFilm(FilmDto film) {
        return service.updateFilm(film);
    }

    public FilmDto getFilmByName(String title) {
        return service.getFilmByName(title);
    }

    public Set<ActorDto> getAllFilmActorsByFilm(int filmId) {
        return service.getAllFilmActorsByFilm(filmId);
    }

    public Set<FilmDto> getAllFilmsReleaseYear(Integer ReleaseYear) {
        return service.getAllFilmsReleaseYear(ReleaseYear);
    }
}
