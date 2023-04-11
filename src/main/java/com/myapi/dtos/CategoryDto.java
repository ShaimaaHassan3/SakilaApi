package com.myapi.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Category} entity
 */
@Data
@NoArgsConstructor
public class CategoryDto implements Serializable {
    private  Short id;
    private  String name;
    private  Date lastUpdate;
}