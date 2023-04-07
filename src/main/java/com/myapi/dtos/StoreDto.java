package com.myapi.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Store} entity
 */
@Data
public class StoreDto implements Serializable {
    private final Short id;
    private final Instant lastUpdate;
}