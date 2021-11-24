package com.spring.henallux.cyberware.dataAccess.dataAccessObject;

import com.spring.henallux.cyberware.dataAccess.repository.CustomerRepository;
import com.spring.henallux.cyberware.dataAccess.utility.ModelEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerDataAccess implements CustomerDAO {
    private CustomerRepository customerRepository;
    private ModelEntityConverter converter;

    @Autowired
    public CustomerDataAccess(CustomerRepository customerRepository, ModelEntityConverter converter) {
        this.customerRepository = customerRepository;
        this.converter = converter;
    }
}