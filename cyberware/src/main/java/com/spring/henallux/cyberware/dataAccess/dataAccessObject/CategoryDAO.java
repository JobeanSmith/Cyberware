package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.CategoryRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryDAO implements CategoryDataAccess {
    private CategoryRepository categoryRepository;
    private ModelEntityConverter converter;

    @Autowired
    public CategoryDAO(CategoryRepository categoryRepository, ModelEntityConverter converter) {
        this.categoryRepository = categoryRepository;
        this.converter = converter;
    }
}