package com.myapi.api.soapApi.staff;

import com.myapi.dtos.StaffDto;
import com.myapi.dtos.customer.PaymentDto;
import com.myapi.dtos.customer.RentalDto;
import com.myapi.persistence.entities.Staff;
import com.myapi.persistence.entities.customer.Rental;
import com.myapi.services.StaffService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Set;

@WebService(name = "StaffWebServices")
public class StaffServices {
    StaffService service;

    public StaffServices() {
        service = new StaffService();
    }

    public Set<StaffDto> getAllStaff() {
        return service.getAllStaff();
    }

    public StaffDto getStaffByID(int staffID) {
        return service.getStaffById(staffID);
    }

    @WebMethod(operationName = "Add")
    public StaffDto addStaff(StaffDto staffDto) {
        return service.addStaff(staffDto);
    }

    @WebMethod(operationName = "Update")
    public StaffDto updateStaff(StaffDto staffDto) {
        return service.updateStaff(staffDto);
    }

    @WebMethod(operationName = "StaffByName")
    public StaffDto getStaffByName(String fName, String lName) {
        return service.getStaffByName(fName, lName);
    }

    @WebMethod(operationName = "Rentals")
    public Set<RentalDto> getAllRentalByStaff(int staffID) {
        return service.getAllRentalByStaff(staffID);
    }

    @WebMethod(operationName = "Payments")
    public Set<PaymentDto> getAllPaymentByStaff(int staffId) {
        return service.getAllPaymentByStaff(staffId);
    }
}
