package com.simplilearn.JDBC.impl;

import com.simplilearn.JDBC.dao.CustomerDAO;
import com.simplilearn.JDBC.db.DBConnection;
import com.simplilearn.JDBC.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {

    Connection connection = DBConnection.getConnection();

    @Override
    public void createCustomer(Customer customer) {
        try {
            String sql = "INSERT INTO customers(name, phone, email, age, temperature) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getPhone());
            ps.setString(3, customer.getEmail());
            ps.setInt(4, customer.getAge());
            ps.setFloat(5, customer.getTemperature());

            ps.executeUpdate();
            System.out.println("✔ Customer Inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> getAllCustomers() {

        List<Customer> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM customers";
            Statement st = connection.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Customer c = new Customer();

                c.setCid(rs.getInt("cid"));
                c.setName(rs.getString("name"));
                c.setPhone(rs.getString("phone"));
                c.setEmail(rs.getString("email"));
                c.setAge(rs.getInt("age"));
                c.setTemperature(rs.getFloat("temperature"));

                list.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void updateCustomer(Customer customer) {
        try {
        	String sql = "UPDATE customers SET name=?, phone=?, email=?, age=?, temperature=? WHERE cid=?";

        	PreparedStatement ps = connection.prepareStatement(sql);

        	ps.setString(1, customer.getName());
        	ps.setString(2, customer.getPhone());
        	ps.setString(3, customer.getEmail());
        	ps.setInt(4, customer.getAge());
        	ps.setFloat(5, customer.getTemperature());
        	ps.setInt(6, customer.getCid());
            ps.executeUpdate();
            System.out.println("✔ Customer Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(int id) {
        try {
        	String sql = "DELETE FROM customers WHERE cid=?";
        	PreparedStatement ps = connection.prepareStatement(sql);
        	ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("✔ Customer Deleted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public Object getAllCustomers1() {
		// TODO Auto-generated method stub
		return null;
	}
}