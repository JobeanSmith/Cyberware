package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CategoryTranslationDAO;
import com.spring.henallux.cyberware.dataAccess.dataAccessObject.ItemDAO;
import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/catalog")
@SessionAttributes({Constant.CART})
public class CatalogController {
    private ItemDAO itemDAO;
    private CategoryTranslationDAO categoryTranslationDAO;
    private String languageName;

    @Autowired
    public CatalogController(ItemDAO itemDAO, CategoryTranslationDAO categoryTranslationDAO) {
        this.itemDAO = itemDAO;
        this.categoryTranslationDAO = categoryTranslationDAO;
    }

    @ModelAttribute(Constant.CART)
    public Cart cart() {
        return new Cart();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCatalogPage(Model model) {
        languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        model.addAttribute("items", itemDAO.getAllItems());
        model.addAttribute("category", null);
        model.addAttribute("categoryTranslations", categoryTranslationDAO.getAllCategoryTranslationsByLanguageName(languageName));
        return "integrated:catalog";
    }

    @RequestMapping(value = "/{categoryIdentifier}", method = RequestMethod.GET)
    public String getCatalogByCategoryPage(@PathVariable int categoryIdentifier, Model model) {
        languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        model.addAttribute("items", itemDAO.getAllItemsByCategoryIdentifier(categoryIdentifier));
        model.addAttribute("category", categoryTranslationDAO.getCategoryTranslationNameByCategoryIdentifier(categoryIdentifier, languageName));
        return "integrated:catalog";
    }
}
