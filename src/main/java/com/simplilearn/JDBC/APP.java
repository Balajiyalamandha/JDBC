package com.simplilearn.JDBC;

import com.simplilearn.JDBC.dao.CustomerDAO;
import com.simplilearn.JDBC.impl.CustomerDAOImpl;
import com.simplilearn.JDBC.model.Customer;

public class APP {

    public static void main(String[] args) {

        CustomerDAO dao = (CustomerDAO) new CustomerDAOImpl();

        Customer c = new Customer();
        c.setName("Balaji");
        c.setPhone("9876543210");
        c.setEmail("balaji@gmail.com");
        c.setAge(29);
        c.setTemperature(98.6f);

        dao.createCustomer(c);

        System.out.println(dao.getAllCustomers());
    }
}