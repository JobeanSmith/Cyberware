package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.ItemRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemDAO implements ItemDataAccess {
    private ItemRepository itemRepository;
    private ModelEntityConverter converter;

    @Autowired
    public ItemDAO(ItemRepository itemRepository, ModelEntityConverter converter) {
        this.itemRepository = itemRepository;
        this.converter = converter;
    }
}