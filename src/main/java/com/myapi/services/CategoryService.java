package com.myapi.services;

import com.myapi.dtos.film.CategoryDto;
import com.myapi.persistence.repository.CategoryRepo;
import com.myapi.persistence.repositoryImp.CategoryRepoImp;
import org.modelmapper.ModelMapper;

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
}
