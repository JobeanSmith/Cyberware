package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CategoryTranslationDAO;
import com.spring.henallux.cyberware.model.main.Item;
import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import com.spring.henallux.cyberware.model.form.ItemForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/item")
@SessionAttributes({Constant.CART, Constant.SELECTED_ITEM})
public class ItemController {
    private CategoryTranslationDAO categoryTranslationDAO;

    @Autowired
    public ItemController(CategoryTranslationDAO categoryTranslationDAO) {
        this.categoryTranslationDAO = categoryTranslationDAO;
    }

    @ModelAttribute(Constant.CART)
    public Cart cart() {
        return new Cart();
    }

    @ModelAttribute(Constant.SELECTED_ITEM)
    public Item item() {
        return new Item();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getItemPage(Model model, @ModelAttribute(value = Constant.SELECTED_ITEM) Item selectedItem) {
        int categoryIdentifier = selectedItem.getCategory().getIdentifier();
        String languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        model.addAttribute(Constant.ITEM_FORM, new ItemForm());
        model.addAttribute(Constant.CATEGORY, categoryTranslationDAO.getCategoryTranslationNameByCategoryIdentifier(categoryIdentifier, languageName));
        return "integrated:item";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String postItemForm(@ModelAttribute(value = Constant.SELECTED_ITEM) Item selectedItem,
                               @ModelAttribute(value = Constant.CART) Cart cart,
                               @Valid @ModelAttribute(value = Constant.ITEM_FORM) ItemForm itemForm,
                               final BindingResult errors) {
        if (!errors.hasErrors()) {
            cart.addCartLine(selectedItem, itemForm.getQuantity());
            return "redirect:/cart";
        }
        return "integrated:item";
    }
}