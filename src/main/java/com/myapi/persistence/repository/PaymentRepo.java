package com.myapi.persistence.repository;

import com.myapi.persistence.entities.customer.Customer;
import com.myapi.persistence.entities.customer.Payment;

import java.util.Set;

public interface PaymentRepo {
    public Payment getPaymentById(int paymentID);
    public Customer getCustomerPayment(int paymentID);
    public Set<Payment> getAllPayments();
}
