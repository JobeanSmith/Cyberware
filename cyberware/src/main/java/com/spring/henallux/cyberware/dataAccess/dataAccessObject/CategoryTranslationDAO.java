package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.model.main.CategoryTranslation;

import java.util.ArrayList;

public interface CategoryTranslationDAO {
    ArrayList<CategoryTranslation> getAllCategories(String language_name);
}