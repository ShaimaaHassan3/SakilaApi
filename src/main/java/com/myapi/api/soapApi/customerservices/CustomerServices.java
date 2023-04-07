package com.myapi.api.soapApi.customerservices;

import com.myapi.dtos.FilmDto;
import com.myapi.persistence.entities.Film;
import com.myapi.services.CustomerService;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "CustomerWebServices")
public class CustomerServices {

    public Set<FilmDto> getAllRentalFilm(int customerID) {
        CustomerService customerService = new CustomerService();
        Set<FilmDto> films = customerService.getRentalFilms(411);
        return films;
    }

}
