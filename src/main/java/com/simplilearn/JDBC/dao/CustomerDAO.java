package com.simplilearn.JDBC.dao;

import com.simplilearn.JDBC.model.Customer;
import java.util.List;

public interface CustomerDAO {

    void createCustomer(Customer customer);

    List<Customer> getAllCustomers();

    void updateCustomer(Customer customer);

    void deleteCustomer(int id);
}