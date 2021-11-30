package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CategoryTranslationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {
    private CategoryTranslationDAO categoryTranslationDAO;

    @Autowired
    public CategoryController(CategoryTranslationDAO categoryTranslationDAO) {
        this.categoryTranslationDAO = categoryTranslationDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCategoryPage(Model model) {
        model.addAttribute("categories", categoryTranslationDAO.getAllCategories(LocaleContextHolder.getLocale().getDisplayLanguage().toLowerCase()));
        return "integrated:category";
    }
}
