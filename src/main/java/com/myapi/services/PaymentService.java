package com.myapi.services;

import com.myapi.dtos.customer.CustomerDto;
import com.myapi.dtos.customer.PaymentDto;
import com.myapi.persistence.repository.PaymentRepo;
import com.myapi.persistence.repositoryImp.PaymentRepoImp;
import org.modelmapper.ModelMapper;

public class PaymentService {
    PaymentRepo paymentRepo;
    ModelMapper modelMapper;

    public PaymentService() {
        paymentRepo = new PaymentRepoImp();
        modelMapper = new ModelMapper();
    }

    public PaymentDto getPaymentById(int paymentId) {
        return modelMapper.map(paymentRepo.getPaymentById(paymentId), PaymentDto.class);
    }

    public CustomerDto getCustomerPayment(int paymentId) {
        return modelMapper.map(paymentRepo.getCustomerPayment(paymentId), CustomerDto.class);
    }
}
