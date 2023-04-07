package com.myapi.dtos;

import com.myapi.persistence.entities.Film;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * A DTO for the {@link Film} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto implements Serializable {
    private  Integer id;
    private  String title;
    private  String description;
    private  Integer releaseYear;

}