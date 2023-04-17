package com.myapi.api.soapApi.languageservices;

import com.myapi.dtos.film.LanguageDto;
import com.myapi.services.film.LanguageService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "LanguageWebServices")
public class LanguageServices {
    LanguageService service;

    public LanguageServices() {
        service = new LanguageService();
    }

    @WebMethod(operationName = "language")
    public LanguageDto getLanguage(String languageName) {
        return service.getLanguage(languageName);
    }

    @WebMethod(operationName = "languages")
    public Set<LanguageDto> getAllLanguage() {
        return service.getAllLanguage();
    }

    @WebMethod(operationName = "newLanguage")
    public LanguageDto addLanguage(LanguageDto languageDto) {
        return service.addLanguage(languageDto);
    }
}
