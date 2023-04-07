package com.myapi.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Country} entity
 */
@Data
public class CountryDto implements Serializable {
    private final Integer id;
    private final String country;
    private final Instant lastUpdate;
}