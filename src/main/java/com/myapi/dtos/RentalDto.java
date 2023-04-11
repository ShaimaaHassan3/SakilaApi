package com.myapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Rental} entity
 */
@Data
@NoArgsConstructor
public class RentalDto implements Serializable {
    private Integer id;
    private Date rentalDate;
    private InventoryDto inventory;
    private Date returnDate;
    private Date lastUpdate;
}