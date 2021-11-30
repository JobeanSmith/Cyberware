package com.spring.henallux.cyberware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/item")
public class ItemController {
    @RequestMapping(method = RequestMethod.GET)
    public String getItemPage() {
        return "integrated:item";
    }
}
