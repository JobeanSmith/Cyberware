package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.CategoryTranslationRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}