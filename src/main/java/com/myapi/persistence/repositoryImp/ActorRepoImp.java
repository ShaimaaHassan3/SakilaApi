package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.Actor;
import com.myapi.persistence.repository.ActorRepo;

import java.util.Set;

public class ActorRepoImp extends BaseRepoImp<Actor> implements ActorRepo {

    @Override
    public Actor getActorById(int Id) {
        return getById(Id);
    }

    @Override
    public Set<Actor> getAllActors() {
        return getAll(new Actor());
    }
}
