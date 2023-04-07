package com.myapi.dtos;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Rental} entity
 */
@Data
public class RentalDto implements Serializable {
    private final Integer id;
    private final Instant rentalDate;
    private final InventoryDto inventory;
    private final Instant returnDate;
    private final Instant lastUpdate;
}