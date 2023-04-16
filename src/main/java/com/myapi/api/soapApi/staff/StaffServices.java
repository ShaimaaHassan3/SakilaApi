package com.myapi.api.soapApi.staff;

import com.myapi.dtos.StaffDto;
import com.myapi.services.StaffService;
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
    public StaffDto addStaff(StaffDto staffDto) {
        System.out.println("staffDto : " + staffDto);
        return service.addStaff(staffDto);
    }
}
