package com.myapi.dtos;

import com.myapi.persistence.entities.Film;
import com.myapi.persistence.entities.FilmActor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * A DTO for the {@link Film} entity
 */
@Data
@NoArgsConstructor
public class FilmDto implements Serializable {
    private  Integer id;
    private  String title;
    private  String description;
    private  Integer releaseYear;
    private LanguageDto language;
    private LanguageDto originalLanguage;
    private Short rentalDuration;
    private BigDecimal rentalRate;
    private Integer length;
    private BigDecimal replacementCost;
    private String rating;
    private String specialFeatures;
    private Date lastUpdate;


}