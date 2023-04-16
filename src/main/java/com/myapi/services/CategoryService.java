package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.customer.PaymentDto;
import com.myapi.dtos.film.CategoryDto;
import com.myapi.persistence.entities.film.Category;
import com.myapi.persistence.repository.CategoryRepo;
import com.myapi.persistence.repositoryImp.CategoryRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class CategoryService {
    CategoryRepo categoryRepo;
    ModelMapper modelMapper;

    public CategoryService() {
        categoryRepo = new CategoryRepoImp();
        modelMapper = new ModelMapper();
    }

    public CategoryDto getCategoryById(int catID) {
        return modelMapper.map(categoryRepo.getCategoryById(catID), CategoryDto.class);
    }

    public CategoryDto getCategoryByName(String catName) {
        return modelMapper.map(categoryRepo.getCategoryByName(catName), CategoryDto.class);
    }

    public Set<CategoryDto> getAllCategories() {
        Type type = new TypeToken<Set<CategoryDto>>() {
        }.getType();
        return modelMapper.map(categoryRepo.getAllCategories(), type);
    }

    public CategoryDto addCategory(CategoryDto categoryDto) {
        Category category = modelMapper.map(categoryDto, Category.class);
        return modelMapper.map(categoryRepo.addCategory(category), CategoryDto.class);
    }
}
