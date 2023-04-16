package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.customer.Customer;
import com.myapi.persistence.entities.customer.Payment;
import com.myapi.persistence.repository.PaymentRepo;

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
}
