package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CategoryTranslationDAO;
import com.spring.henallux.cyberware.dataAccess.dataAccessObject.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/item")
public class ItemController {
    private ItemDAO itemDAO;
    private CategoryTranslationDAO categoryTranslationDAO;

    @Autowired
    public ItemController(ItemDAO itemDAO, CategoryTranslationDAO categoryTranslationDAO) {
        this.itemDAO = itemDAO;
        this.categoryTranslationDAO = categoryTranslationDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getItemPage(Model model) {
        model.addAttribute("items", itemDAO.getAllItems());
        model.addAttribute("category", null);
        return "integrated:item";
    }

    @RequestMapping(value = "/{categoryIdentifier}", method = RequestMethod.GET)
    public String getItemByCategoryPage(@PathVariable int categoryIdentifier, Model model) {
        String languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        model.addAttribute("items", itemDAO.getAllItemsByCategoryIdentifier(categoryIdentifier));
        model.addAttribute("category", categoryTranslationDAO.getCategoryTranslationNameByCategoryIdentifier(categoryIdentifier, languageName));
        return "integrated:item";
    }
}
