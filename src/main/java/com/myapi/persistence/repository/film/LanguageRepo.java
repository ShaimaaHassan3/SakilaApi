package com.myapi.persistence.repository.film;

import com.myapi.persistence.entities.film.Language;

import java.util.Set;

public interface LanguageRepo {
    public Language getLanguageById(String languageName);
    public Set<Language> getAllLanguage();
}
