package com.spring.henallux.cyberware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("cart")
@RequestMapping(value = "/cart")
public class CartController {
    @RequestMapping(method = RequestMethod.GET)
    public String getCartPage() {
        return "integrated:cart";
    }
}
