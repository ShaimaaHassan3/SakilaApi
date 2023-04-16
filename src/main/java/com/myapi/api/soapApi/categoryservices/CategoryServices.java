package com.myapi.api.soapApi.categoryservices;

import com.myapi.dtos.film.CategoryDto;
import com.myapi.services.CategoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "CategoryWebServices")
public class CategoryServices {
    CategoryService service;

    public CategoryServices() {
        service = new CategoryService();
    }

    public CategoryDto getCategoryById(int catID) {
        return service.getCategoryById(catID);
    }

    public CategoryDto getCategoryByName(String catName) {
        return service.getCategoryByName(catName);
    }

    @WebMethod(operationName = "categories")
    public Set<CategoryDto> getAllCategories() {
        return service.getAllCategories();
    }
}
