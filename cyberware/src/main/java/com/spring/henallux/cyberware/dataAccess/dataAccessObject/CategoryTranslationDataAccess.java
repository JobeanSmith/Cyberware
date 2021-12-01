package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.entity.CategoryTranslationEntity;
import com.spring.henallux.cyberware.dataAccess.entity.CustomerEntity;
import com.spring.henallux.cyberware.dataAccess.repository.CategoryTranslationRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import com.spring.henallux.cyberware.model.main.Category;
import com.spring.henallux.cyberware.model.main.CategoryTranslation;
import com.spring.henallux.cyberware.model.main.Customer;
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

    public ArrayList<CategoryTranslation> getAllCategoriesByLanguageName(String languageName) {
        ArrayList<CategoryTranslation> categories = new ArrayList<>();
        for (CategoryTranslationEntity categoryTranslationEntity: categoryTranslationRepository.findAllByLanguageName(languageName)) {
            categories.add(converter.categoryTranslationEntityToCategoryTranslationModel(categoryTranslationEntity));
        }
        return categories;
    }
}