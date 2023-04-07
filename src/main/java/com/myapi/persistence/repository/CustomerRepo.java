package com.myapi.persistence.repository;

import com.myapi.dtos.CustomerDto;
import com.myapi.persistence.entities.Customer;
import com.myapi.persistence.entities.Rental;

import java.util.Set;

public interface CustomerRepo {

    public Set<Rental> getRentalsOfCustomer(int CustomerID);
    public Set<Customer> getAllCustomers();
    public Customer getCustomerById(int ID);
    public void deleteCustomer(Customer customer);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer (Customer customer);


}
