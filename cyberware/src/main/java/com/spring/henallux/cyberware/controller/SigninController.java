package com.spring.henallux.cyberware.controller;

import com.spring.henallux.cyberware.dataAccess.dataAccessObject.CustomerDAO;
import com.spring.henallux.cyberware.dataAccess.utility.CustomerManager;
import com.spring.henallux.cyberware.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/signin")
public class SigninController {
    private CustomerDAO customerDAO;

    @Autowired
    public SigninController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getSigninPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "integrated:signin";
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String postSigninForm(@Valid @ModelAttribute(value = "customer") Customer customer,
                                 final BindingResult errors, HttpServletRequest request) {
        if (!errors.hasErrors()) {
            if (isCustomerUnique(customer)) {
                String clearPassword = customer.getPassword();
                CustomerManager.encodePassword(customer);
                CustomerManager.addAccountStatus(customer);
                customerDAO.saveCustomer(customer);
                try {
                    request.login(customer.getUsername(), clearPassword);
                } catch (ServletException servletException) {
                    servletException.printStackTrace();
                }
                return "redirect:/";
            }
        }
        return "integrated:signin";
    }

    private boolean isCustomerUnique(Customer customer) {
        if (!customerDAO.doesUsernameAlreadyExists(customer.getUsername())) {
            if (!CustomerManager.isPhoneNumberNull(customer)) {
                //return !(customerDAO.doesPhoneNumberAlreadyExists(customer.getPhoneNumber()));
                if (!(customerDAO.doesPhoneNumberAlreadyExists(customer.getPhoneNumber()))) {
                    return true;
                } else {
                    System.out.println("phone already exists");
                    return false;
                }
            }
            return true;
        }
        System.out.println("username already exists");
        return false;
    }
}
