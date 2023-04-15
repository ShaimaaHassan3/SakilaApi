package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.ActorDto;
import com.myapi.dtos.address.AddressDto;
import com.myapi.persistence.entities.Actor;
import com.myapi.persistence.repository.ActorRepo;
import com.myapi.persistence.repositoryImp.ActorRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class ActorService {
    ActorRepo actorRepo;
    ModelMapper modelMapper;

    public ActorService() {
        actorRepo = new ActorRepoImp();
        modelMapper = new ModelMapper();
    }

    public ActorDto getActorById(int ID) {
        return modelMapper.map(actorRepo.getActorById(ID), ActorDto.class);
    }

    public Set<ActorDto> getAllActors() {
        Type type = new TypeToken<Set<ActorDto>>() {
        }.getType();
        return modelMapper.map(actorRepo.getAllActors(), type);
    }

    public ActorDto addActor(ActorDto actorDto) {
        Actor actor = modelMapper.map(actorDto, Actor.class);
        return modelMapper.map(actorRepo.addActor(actor), ActorDto.class);
    }
}
