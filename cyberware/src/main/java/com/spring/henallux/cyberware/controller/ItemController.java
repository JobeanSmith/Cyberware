package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.ItemDAO;
import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/item")
@SessionAttributes({Constant.CART})
public class ItemController {
    private ItemDAO itemDAO;

    @Autowired
    public ItemController(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @ModelAttribute(Constant.CART)
    public Cart cart() {
        return new Cart();
    }

    @RequestMapping(value = "/{itemIdentifier}", method = RequestMethod.GET)
    public String getItemPage(@PathVariable int itemIdentifier, Model model) {
        model.addAttribute("item", itemDAO.getItemByIdentifier(itemIdentifier));
        return "integrated:item";
    }
}
