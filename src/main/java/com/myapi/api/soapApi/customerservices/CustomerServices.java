package com.myapi.api.soapApi.customerservices;

import com.myapi.dtos.AddressDto;
import com.myapi.dtos.CustomerDto;
import com.myapi.dtos.FilmDto;
import com.myapi.persistence.entities.Customer;
import com.myapi.persistence.entities.Film;
import com.myapi.persistence.repositoryImp.BaseRepoImp;
import com.myapi.services.CustomerService;
import jakarta.jws.WebService;
import org.modelmapper.ModelMapper;

import java.util.Set;

@WebService(name = "CustomerWebServices")
public class CustomerServices {
    CustomerService customerService;

    public CustomerServices() {
        customerService = new CustomerService();
    }

    public Set<FilmDto> getAllRentalFilm(int customerID) {

        Set<FilmDto> films = customerService.getRentalFilms(411);
        return films;
    }

    public Set<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    public CustomerDto getCustomer(int Id) {
        return customerService.getCustomerById(Id);
    }

    public String newCustomer(CustomerDto customerDto) {
        System.out.println("New Customer : " + customerDto);
       CustomerDto newCustomerDto = customerService.addCustomer(customerDto);
        if (newCustomerDto != null)
            return "Added Successfully";
        return "Cant Add Customer";
    }

    public String updateCustomer(CustomerDto customerDto) {
        CustomerDto newCustomerDto = customerService.updateCustomer(customerDto);
        if (newCustomerDto != null)
            return "Updated Successfully";
        return "Cant Update Customer";
    }

    public void deleteCustomer(int id) {
        customerService.deleteCustomer(id);
    }

}
