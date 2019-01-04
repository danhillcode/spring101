package com.repository;

import com.model.Customer;

import java.util.ArrayList;
import java.util.List;

/*
Stub used to create a customer and add the instance of customer
 */

public class HibernateCustomerRepositoryImpl {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Dan");
        customer.setLastname("Hill");

        customers.add(customer);

        return customers;
    }

}
