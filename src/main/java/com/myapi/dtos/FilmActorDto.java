package com.myapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link com.myapi.persistence.entities.FilmActor} entity
 */
@Data
@NoArgsConstructor
public class FilmActorDto implements Serializable {
    private  FilmActorIdDto id;
    private  ActorDto actor;
    private  Date lastUpdate;

    /**
     * A DTO for the {@link com.myapi.persistence.entities.FilmActorId} entity
     */
    @Data
    @NoArgsConstructor
    public static class FilmActorIdDto implements Serializable {
        private  Integer actorId;
        private  Integer filmId;
    }
}