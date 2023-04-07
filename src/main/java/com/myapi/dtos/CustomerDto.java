package com.myapi.dtos;

import com.myapi.dtos.AddressDto;
import com.myapi.dtos.PaymentDto;
import com.myapi.dtos.StoreDto;
import com.myapi.persistence.entities.Customer;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

/**
 * A DTO for the {@link Customer} entity
 */
@Data
public class CustomerDto implements Serializable {
    private final Integer id;
    private final StoreDto store;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final AddressDto address;
    private final Instant createDate;
    private final Instant lastUpdate;
    private final Set<PaymentDto> payments;
}