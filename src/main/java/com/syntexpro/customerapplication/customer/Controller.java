package com.syntexpro.customerapplication.customer;

import com.syntexpro.customerapplication.CustomerApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Service service;

    @GetMapping
    public List<Customer> customerController() {
        return service.customerService();
    }
}
