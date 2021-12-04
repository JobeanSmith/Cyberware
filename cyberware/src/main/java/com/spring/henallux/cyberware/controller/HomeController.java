package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping(value = "/")
@SessionAttributes("cart")
public class HomeController {

    @ModelAttribute("cart")
    public Cart cart() {
        return new Cart();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getHomePage() {
        return "integrated:home";
    }
}