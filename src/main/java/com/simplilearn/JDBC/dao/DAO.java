package com.simplilearn.JDBC.dao;

import java.util.List;

import com.simplilearn.JDBC.model.Customer;

public interface DAO {
    void createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}