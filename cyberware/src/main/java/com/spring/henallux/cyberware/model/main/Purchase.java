package com.spring.henallux.cyberware.model.main;

import com.spring.henallux.cyberware.model.main.Customer;

import javax.validation.constraints.*;

import java.util.Date;

public class Purchase {
    private Integer identifier;
    @NotNull
    private Boolean isPaid;
    @NotNull
    private Date date;
    @NotNull
    private Customer customer;

    public Purchase() {}

    public Integer getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public Boolean getPaid() {
        return isPaid;
    }
    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}