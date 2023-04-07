package com.myapi.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Inventory} entity
 */
@Data
public class InventoryDto implements Serializable {
    private final FilmDto film;
    private final StoreDto store;
    private final Instant lastUpdate;
}