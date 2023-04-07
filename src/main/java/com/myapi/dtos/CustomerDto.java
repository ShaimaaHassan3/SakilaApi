package com.myapi.dtos;

import com.myapi.dtos.AddressDto;
import com.myapi.dtos.PaymentDto;
import com.myapi.dtos.StoreDto;
import com.myapi.persistence.entities.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

/**
 * A DTO for the {@link Customer} entity
 */
@Data
@NoArgsConstructor
public class CustomerDto implements Serializable {
    private  Integer id;
    private  StoreDto store;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  AddressDto address;
    private  Instant createDate;
    private  Instant lastUpdate;
    private  Set<PaymentDto> payments;
}