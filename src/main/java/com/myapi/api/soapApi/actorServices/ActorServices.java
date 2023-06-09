package com.myapi.api.soapApi.actorServices;

import com.myapi.dtos.film.ActorDto;
import com.myapi.dtos.film.FilmDto;
import com.myapi.services.film.ActorService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "ActorWebServices")
public class ActorServices {
    ActorService service;

    public ActorServices() {
        service = new ActorService();
    }

    @WebMethod(operationName = "actor")
    public ActorDto getActor(int ID) {
        return service.getActorById(ID);
    }

    @WebMethod(operationName = "actors")
    public Set<ActorDto> getAllActors() {
        return service.getAllActors();
    }

    public ActorDto addActor(ActorDto actorDto) {
        return service.addActor(actorDto);
    }

    public ActorDto updateActor(ActorDto actorDto) {
        return service.updateActor(actorDto);
    }

    public Set<FilmDto> getAllFilms(int ID) {
        return service.getFilms(ID);
    }

    @WebMethod(operationName = "FilmsNumber")
    public String getNumberFilmOfActor(int actorId) {
        return "Number Of Films For This Actor " + service.getNumberFilmOfActor(actorId);
    }
}
