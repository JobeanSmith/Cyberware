package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.ItemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/item")
public class ItemController {
    private ItemDAO itemDAO;

    @Autowired
    public ItemController(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getItemPage(Model model) {
        model.addAttribute("items", itemDAO.getAllItems());
        return "integrated:item";
    }
}
