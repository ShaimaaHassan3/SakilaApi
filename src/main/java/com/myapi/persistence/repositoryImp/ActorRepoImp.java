package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.Actor;
import com.myapi.persistence.entities.Address;
import com.myapi.persistence.repository.ActorRepo;
import com.myapi.persistence.repository.AddressRepo;

public class ActorRepoImp extends BaseRepoImp<Actor> implements ActorRepo {

    @Override
    public Actor getActorById(int Id) {
        return getById(Id);
    }
}
