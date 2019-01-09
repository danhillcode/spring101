package com.service;

import com.model.Customer;
import com.repository.CustomerRepository;
import com.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

            public List<Customer> findAll(){
                return customerRepository.findAll();
            }
}
