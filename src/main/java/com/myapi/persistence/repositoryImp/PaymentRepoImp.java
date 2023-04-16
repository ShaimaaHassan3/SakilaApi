package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.customer.Customer;
import com.myapi.persistence.entities.customer.Payment;
import com.myapi.persistence.repository.PaymentRepo;

import java.util.Set;

public class PaymentRepoImp extends BaseRepoImp<Payment> implements PaymentRepo {
    @Override
    public Payment getPaymentById(int paymentID) {
        return getById(paymentID);
    }

    @Override
    public Customer getCustomerPayment(int paymentID) {
        Payment payment = getPaymentById(paymentID);
        return payment.getCustomer();
    }

    @Override
    public Set<Payment> getAllPayments() {
        return getAll(new Payment());
    }
}
