package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.CustomerDto;
import com.myapi.dtos.FilmDto;
import com.myapi.persistence.entities.Film;
import com.myapi.persistence.repositoryImp.FilmRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class FilmService implements FilmServicesIn {
    ModelMapper modelMapper;
    FilmRepoImp service;

    public FilmService() {
        modelMapper = new ModelMapper();
        service = new FilmRepoImp();
    }

    public Set<FilmDto> getAllFilms() {
        Type type = new TypeToken<Set<FilmDto>>() {
        }.getType();
        return modelMapper.map(service.getAllFilms(), type);
    }

    public FilmDto getFilmById(int id) {
       FilmDto filmDto =  modelMapper.map(service.getFilmById(id), FilmDto.class);
        return filmDto;
    }

    public FilmDto saveFilm(FilmDto filmDto) {
        return modelMapper.map(service.saveFilm(modelMapper.map(filmDto, Film.class)), FilmDto.class);
    }

    public void deleteFilm(int id) {
        service.deleteFilm(id);
    }

    public FilmDto updateFilm(FilmDto film) {
        return modelMapper.map(service.updateFilm(modelMapper.map(film, Film.class)), FilmDto.class);
    }
}
