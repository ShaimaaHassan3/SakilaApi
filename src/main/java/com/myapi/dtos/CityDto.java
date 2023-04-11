package com.myapi.dtos;

import com.myapi.persistence.entities.City;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

/**
 * A DTO for the {@link City} entity
 */
@Data
@NoArgsConstructor
public class CityDto implements Serializable {
    private Integer id;
    private String city;
    private Date lastUpdate;
}