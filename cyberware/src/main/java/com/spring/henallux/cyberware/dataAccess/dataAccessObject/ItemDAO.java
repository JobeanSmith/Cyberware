package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.model.main.CategoryTranslation;
import com.spring.henallux.cyberware.model.main.Item;

import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<Item> getAllItems();
}