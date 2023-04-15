package com.myapi.services;

import com.myapi.dtos.ActorDto;
import com.myapi.persistence.repository.ActorRepo;
import com.myapi.persistence.repositoryImp.ActorRepoImp;
import org.modelmapper.ModelMapper;

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
}
