package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.model.CategoryTranslation;

import java.util.ArrayList;

public interface CategoryTranslationDAO {
    ArrayList<CategoryTranslation> getAllCategoryTranslationsByLanguageName(String languageName);
    String getCategoryTranslationNameByCategoryIdentifier(Integer categoryIdentifier, String languageName);
}