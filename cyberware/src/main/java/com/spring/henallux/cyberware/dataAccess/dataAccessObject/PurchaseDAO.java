package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.PurchaseRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PurchaseDAO implements PurchaseDataAccess {
    private PurchaseRepository purchaseRepository;
    private ModelEntityConverter converter;

    @Autowired
    public PurchaseDAO(PurchaseRepository purchaseRepository, ModelEntityConverter converter) {
        this.purchaseRepository = purchaseRepository;
        this.converter = converter;
    }
}