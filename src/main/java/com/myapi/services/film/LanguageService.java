package com.myapi.services.film;

import com.myapi.dtos.film.LanguageDto;
import com.myapi.persistence.repository.film.LanguageRepo;
import com.myapi.persistence.repositoryImp.film.LanguageRepoImp;
import org.modelmapper.ModelMapper;

public class LanguageService {
    LanguageRepo languageRepo;
    ModelMapper modelMapper;

    public LanguageService() {
        languageRepo = new LanguageRepoImp();
        modelMapper = new ModelMapper();
    }

    public LanguageDto getLanguage(String languageName) {
        return modelMapper.map(languageRepo.getLanguageById(languageName), LanguageDto.class);
    }
}
