package com.myapi.api.soapApi.paymentservices;

import com.myapi.dtos.customer.CustomerDto;
import com.myapi.dtos.customer.PaymentDto;
import com.myapi.services.PaymentService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "PaymentWebServices")
public class PaymentServices {
    PaymentService service;

    public PaymentServices() {
        service = new PaymentService();
    }

    public PaymentDto getPayment(int paymentID) {
        return service.getPaymentById(paymentID);
    }
    @WebMethod(operationName = "customer")
    public CustomerDto getCustomerPayment(int paymentID) {
        return service.getCustomerPayment(paymentID);
    }
    @WebMethod(operationName = "payments")
    public Set<PaymentDto> getAllPayments() {
        return service.getAllPayment();
    }
}
