package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CategoryTranslationDAO;
import com.spring.henallux.cyberware.dataAccess.dataAccessObject.ItemDAO;
import com.spring.henallux.cyberware.model.main.Item;
import com.spring.henallux.cyberware.model.main.PurchaseLine;
import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import com.spring.henallux.cyberware.model.other.ItemForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/item/{itemIdentifier}")
@SessionAttributes({Constant.CART})
public class ItemController {
    private ItemDAO itemDAO;
    private CategoryTranslationDAO categoryTranslationDAO;

    @Autowired
    public ItemController(ItemDAO itemDAO, CategoryTranslationDAO categoryTranslationDAO) {
        this.itemDAO = itemDAO;
        this.categoryTranslationDAO = categoryTranslationDAO;
    }

    @ModelAttribute(Constant.CART)
    public Cart cart() {
        return new Cart();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getItemPage(@PathVariable int itemIdentifier, Model model) {
        String languageName = LocaleContextHolder.getLocale().getDisplayLanguage();
        Item item = itemDAO.getItemByIdentifier(itemIdentifier);
        model.addAttribute(Constant.ITEM, item);
        model.addAttribute(Constant.ITEM_FORM, new ItemForm());
        model.addAttribute(Constant.CATEGORY, categoryTranslationDAO.getCategoryTranslationNameByCategoryIdentifier(item.getCategory().getIdentifier(), languageName));
        return "integrated:item";
    }

    @RequestMapping(value = "/addToCart", method = RequestMethod.POST)
    public String postItemForm(@PathVariable int itemIdentifier,
                               @ModelAttribute(value = Constant.CART) Cart cart,
                               @Valid @ModelAttribute(value = Constant.ITEM_FORM) ItemForm itemForm,
                               final BindingResult errors) {
        if (!errors.hasErrors()) {
            PurchaseLine purchaseLine;
            if (cart.getCart().get(itemIdentifier) == null) {
                Item item = itemDAO.getItemByIdentifier(itemIdentifier);
                purchaseLine = new PurchaseLine();
                purchaseLine.setItemPrice(item.getPrice());
                purchaseLine.setRequestedQuantity(itemForm.getQuantity());
                purchaseLine.setItem(item);
                cart.getCart().put(itemIdentifier, purchaseLine);
            } else {
                purchaseLine = cart.getCart().get(itemIdentifier);
                purchaseLine.setRequestedQuantity(purchaseLine.getRequestedQuantity() + itemForm.getQuantity());
            }
            return "redirect:/cart";
        }
        return "redirect:/item/" + itemIdentifier;
    }
}