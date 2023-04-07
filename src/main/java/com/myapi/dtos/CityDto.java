package com.myapi.dtos;

import com.myapi.persistence.entities.City;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link City} entity
 */
@Data
public class CityDto implements Serializable {
    private final Integer id;
    private final String city;
    private final Instant lastUpdate;
}