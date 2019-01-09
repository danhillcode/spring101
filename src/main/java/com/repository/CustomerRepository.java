package com.repository;

import com.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
}
