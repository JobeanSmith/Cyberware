package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/item")
@SessionAttributes({Constant.CART})
public class ItemController {
    @ModelAttribute(Constant.CART)
    public Cart cart() {
        return new Cart();
    }

    @RequestMapping(value = "/{categoryIdentifier}", method = RequestMethod.GET)
    public String getItemPage(@PathVariable int categoryIdentifier, Model model) {
        //languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        //model.addAttribute("items", itemDAO.getAllItemsByCategoryIdentifier(categoryIdentifier));
        //model.addAttribute("category", categoryTranslationDAO.getCategoryTranslationNameByCategoryIdentifier(categoryIdentifier, languageName));
        return "integrated:item";
    }
}
