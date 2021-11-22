package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.LanguageRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LanguageDAO implements LanguageDataAccess {
    private LanguageRepository languageRepository;
    private ModelEntityConverter converter;

    @Autowired
    public LanguageDAO(LanguageRepository languageRepository, ModelEntityConverter converter) {
        this.languageRepository = languageRepository;
        this.converter = converter;
    }
}