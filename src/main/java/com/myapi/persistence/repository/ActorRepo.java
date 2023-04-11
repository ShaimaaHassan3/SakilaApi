package com.myapi.persistence.repository;

import com.myapi.persistence.entities.Actor;
import org.checkerframework.checker.units.qual.A;

public interface ActorRepo {
    Actor getActorById(int Id);
}
