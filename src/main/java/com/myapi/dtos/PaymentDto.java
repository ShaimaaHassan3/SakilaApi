package com.myapi.dtos;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Payment} entity
 */
@Data
public class PaymentDto implements Serializable {
    private final Integer id;
    private final StaffDto staff;
    private final RentalDto rental;
    private final BigDecimal amount;
    private final Instant paymentDate;
    private final Instant lastUpdate;
}