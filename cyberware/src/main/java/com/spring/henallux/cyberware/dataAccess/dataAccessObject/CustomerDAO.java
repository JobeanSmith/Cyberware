package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.model.Customer;

public interface CustomerDAO {
    Customer findByUsername(String username);
    Customer saveCustomer(Customer customer);
}