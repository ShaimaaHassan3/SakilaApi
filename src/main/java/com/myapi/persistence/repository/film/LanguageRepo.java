package com.myapi.persistence.repository.film;

import com.myapi.persistence.entities.film.Language;

public interface LanguageRepo {
    public Language getLanguageById(String languageName);
}
