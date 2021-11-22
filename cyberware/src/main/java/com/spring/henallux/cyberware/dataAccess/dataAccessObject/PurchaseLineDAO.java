package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.PurchaseLineRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PurchaseLineDAO implements PurchaseLineDataAccess {
    private PurchaseLineRepository purchaseLineRepository;
    private ModelEntityConverter converter;

    @Autowired
    public PurchaseLineDAO(PurchaseLineRepository purchaseLineRepository, ModelEntityConverter converter) {
        this.purchaseLineRepository = purchaseLineRepository;
        this.converter = converter;
    }
}