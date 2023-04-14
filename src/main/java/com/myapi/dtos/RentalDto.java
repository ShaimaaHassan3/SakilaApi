package com.myapi.dtos;

import com.myapi.persistence.entities.customer.Rental;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link Rental} entity
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