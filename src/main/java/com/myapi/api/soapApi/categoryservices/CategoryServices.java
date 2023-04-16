package com.myapi.api.soapApi.categoryservices;

import com.myapi.dtos.film.CategoryDto;
import com.myapi.services.CategoryService;
import jakarta.jws.WebService;

@WebService(name = "CategoryWebServices")
public class CategoryServices {
    CategoryService service;

    public CategoryServices() {
        service = new CategoryService();
    }

    public CategoryDto getCategoryById(int catID) {
        return service.getCategoryById(catID);
    }
}
