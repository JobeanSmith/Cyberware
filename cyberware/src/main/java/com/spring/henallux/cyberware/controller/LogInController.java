package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.model.main.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String getLoginPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "integrated:login";
    }
}
