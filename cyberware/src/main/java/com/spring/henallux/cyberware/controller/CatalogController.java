package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CategoryTranslationDAO;
import com.spring.henallux.cyberware.dataAccess.dataAccessObject.ItemDAO;
import com.spring.henallux.cyberware.model.main.Item;
import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/catalog")
@SessionAttributes({Constant.CART, Constant.ITEM})
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

    @ModelAttribute(Constant.ITEM)
    public Item item() {
        return new Item();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCatalogPage(Model model) {
        languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        model.addAttribute(Constant.ITEMS, itemDAO.getAllItems());
        model.addAttribute(Constant.CATEGORY, null);
        model.addAttribute(Constant.CATEGORY_TRANSLATIONS, categoryTranslationDAO.getAllCategoryTranslationsByLanguageName(languageName));
        return "integrated:catalog";
    }

    @RequestMapping(value = "/{categoryIdentifier}", method = RequestMethod.GET)
    public String getCatalogByCategoryPage(@PathVariable int categoryIdentifier, Model model) {
        languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        model.addAttribute(Constant.ITEMS, itemDAO.getAllItemsByCategoryIdentifier(categoryIdentifier));
        model.addAttribute(Constant.CATEGORY, categoryTranslationDAO.getCategoryTranslationNameByCategoryIdentifier(categoryIdentifier, languageName));
        return "integrated:catalog";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String postCatalogForm(@ModelAttribute(value = Constant.ITEM) Item selectedItem) {
        selectedItem.setItem(itemDAO.getItemByIdentifier(selectedItem.getIdentifier()));
        return "redirect:/item";
    }
}
