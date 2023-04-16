package com.myapi.api.soapApi.categoryservices;

import com.myapi.dtos.film.CategoryDto;
import com.myapi.dtos.film.FilmDto;
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

    @WebMethod(operationName = "newCategory")
    public CategoryDto addCategory(CategoryDto categoryDto) {
        return service.addCategory(categoryDto);
    }

    @WebMethod(operationName = "updateCategory")
    public CategoryDto updateCategory(CategoryDto categoryDto) {
        return service.updateCategory(categoryDto);
    }

    @WebMethod(operationName = "films")
    public Set<FilmDto> getFilmsByCategory(String catName) {
        return service.getFilmsByCategory(catName);
    }

    @WebMethod(operationName = "filmNumber")
    public String getNumberOfFilmsByCategory(String catName) {
        return "There Is " + service.getNumberOfFilmsByCategory(catName) + " In " + catName + " Category";
    }
}
