package com.myapi.dtos;

import com.myapi.dtos.CityDto;
import com.myapi.dtos.StoreDto;
import com.myapi.persistence.entities.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

/**
 * A DTO for the {@link Address} entity
 */
@Data
@NoArgsConstructor
public class AddressDto implements Serializable {
    private  Integer id;
    private  String address;
    private  String address2;
    private  String district;
    private  CityDto city;
    private  String postalCode;
    private  String phone;
    private Date lastUpdate;
}