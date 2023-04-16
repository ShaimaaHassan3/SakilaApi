package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.Staff;
import com.myapi.persistence.entities.customer.Customer;
import com.myapi.persistence.entities.customer.Payment;
import com.myapi.persistence.entities.customer.Rental;
import com.myapi.persistence.repository.CustomerRepo;
import com.myapi.persistence.repository.PaymentRepo;
import com.myapi.persistence.repository.StaffRepo;

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

    @Override
    public Staff getStaffProcessedPayment(int paymentId) {
        Payment payment = getPaymentById(paymentId);
        return payment.getStaff();
    }

    @Override
    public Rental getRentalApplied(int paymentId) {
        Payment payment = getPaymentById(paymentId);
        return payment.getRental();
    }

    @Override
    public Payment addPayment(Payment payment) {
        StaffRepo staffRepo = new StaffRepoImp();
        CustomerRepo customerRepo = new CustomerRepoImp();
        Staff staff = staffRepo.getStaffById(payment.getStaff().getId());
        Customer customer = customerRepo.getCustomerById(payment.getCustomer().getId());
        payment.setStaff(staff);
        payment.setCustomer(customer);
        return save(payment);
    }
}
