package com.myapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Payment} entity
 */
@Data
@NoArgsConstructor
public class PaymentDto implements Serializable {
    private  Integer id;
    private  StaffDto staff;
    private  RentalDto rental;
    private  BigDecimal amount;
    private  Instant paymentDate;
    private  Instant lastUpdate;
}