package com.myapi.dtos;

import com.myapi.dtos.CityDto;
import com.myapi.dtos.StoreDto;
import com.myapi.persistence.entities.Address;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

/**
 * A DTO for the {@link Address} entity
 */
@Data
public class AddressDto implements Serializable {
    private final Integer id;
    private final String address;
    private final String address2;
    private final String district;
    private final CityDto city;
    private final String postalCode;
    private final String phone;
    private final Instant lastUpdate;
    private final Set<StoreDto> stores;
}