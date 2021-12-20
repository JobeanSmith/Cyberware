package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.model.main.Item;
import com.spring.henallux.cyberware.model.other.Cart;
import com.spring.henallux.cyberware.model.other.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getCartPage(Model model) {
        model.addAttribute(Constant.ITEM, new Item());
        model.addAttribute(Constant.DISCOUNT, Constant.DISCOUNT_POURCENTAGE);
        return "integrated:cart";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String postAddOneToItemQuantityForm(@ModelAttribute(value = Constant.CART) Cart cart,
                                               @ModelAttribute(value = Constant.ITEM) Item item) {
        cart.addOneToItemQuantity(item.getIdentifier());
        return "redirect:/cart";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String postRemoveOneToItemQuantityForm(@ModelAttribute(value = Constant.CART) Cart cart,
                                                  @ModelAttribute(value = Constant.ITEM) Item item) {
        cart.removeOneToItemQuantity(item.getIdentifier());
        return "redirect:/cart";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String postDeleteCartLineForm(@ModelAttribute(value = Constant.CART) Cart cart,
                                         @ModelAttribute(value = Constant.ITEM) Item item) {
        cart.deleteCartLine(item.getIdentifier());
        return "redirect:/cart";
    }
}
