package com.myapi.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Language} entity
 */
@Data
public class LanguageDto implements Serializable {
    private final Short id;
    private final String name;
    private final Instant lastUpdate;
}