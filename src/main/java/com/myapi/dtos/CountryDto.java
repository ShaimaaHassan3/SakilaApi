package com.myapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Country} entity
 */
@Data
@NoArgsConstructor
public class CountryDto implements Serializable {
    private  Integer id;
    private  String country;
    private Date lastUpdate;
}