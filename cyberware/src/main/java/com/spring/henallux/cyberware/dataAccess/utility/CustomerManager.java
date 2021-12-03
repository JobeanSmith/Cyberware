package com.spring.henallux.cyberware.dataAccess.utility;

import com.spring.henallux.cyberware.model.Customer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomerManager {
    public static void addAccountStatus(Customer customer) {
        customer.setAuthorities("ROLE_USER");
        customer.setAccountNonExpired(true);
        customer.setAccountNonLocked(true);
        customer.setCredentialsNonExpired(true);
        customer.setEnabled(true);
    }

    public static void encodePassword(Customer customer) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        customer.setPassword(encoder.encode(customer.getPassword()));
    }

    public static Boolean isPhoneNumberNull(Customer customer) {
        boolean isNull = false;
        if (customer.getPhoneNumber().equals("")) {
            customer.setPhoneNumber(null);
            isNull = true;
        }
        return isNull;
    }
}
