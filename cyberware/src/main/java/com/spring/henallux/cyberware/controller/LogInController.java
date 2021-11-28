package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.model.main.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/logIn")
public class LogInController {
    @RequestMapping(method = RequestMethod.GET)
    public String getLogInPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "integrated:logIn";
    }
}
