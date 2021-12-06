package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({Constant.CART})
@RequestMapping(value = "/cart")
public class CartController {

    @ModelAttribute(Constant.CART)
    public Cart cart() {
        return new Cart();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getCartPage() {
        return "integrated:cart";
    }
}
