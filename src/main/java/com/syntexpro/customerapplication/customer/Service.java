package com.syntexpro.customerapplication.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    @Autowired
    private Repository repository;

    public List<Customer> customerService() {
        return repository.customerRepository();
    }
}
