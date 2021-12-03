package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.entity.CategoryTranslationEntity;
import com.spring.henallux.cyberware.dataAccess.repository.CategoryTranslationRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import com.spring.henallux.cyberware.model.CategoryTranslation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class CategoryTranslationDataAccess implements CategoryTranslationDAO {
    private CategoryTranslationRepository categoryTranslationRepository;
    private ModelEntityConverter converter;

    @Autowired
    public CategoryTranslationDataAccess(CategoryTranslationRepository categoryTranslationRepository, ModelEntityConverter converter) {
        this.categoryTranslationRepository = categoryTranslationRepository;
        this.converter = converter;
    }

    public ArrayList<CategoryTranslation> getAllCategoryTranslationsByLanguageName(String languageName) {
        ArrayList<CategoryTranslation> categoryTranslations = new ArrayList<>();
        for (CategoryTranslationEntity categoryTranslationEntity: categoryTranslationRepository.findAllByLanguageName(languageName)) {
            categoryTranslations.add(converter.categoryTranslationEntityToCategoryTranslationModel(categoryTranslationEntity));
        }
        return categoryTranslations;
    }

    public String getCategoryTranslationNameByCategoryIdentifier(Integer categoryIdentifier, String languageName) {
        return categoryTranslationRepository.findByCategoryIdentifierAndLanguageName(categoryIdentifier, languageName).getName();
    }
}