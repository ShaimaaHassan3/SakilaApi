package com.myapi.services;

import com.google.gson.reflect.TypeToken;
import com.myapi.dtos.StaffDto;
import com.myapi.persistence.entities.Staff;
import com.myapi.persistence.repository.StaffRepo;
import com.myapi.persistence.repositoryImp.StaffRepoImp;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;
import java.util.Set;

public class StaffService {
    StaffRepo staffRepo;
    ModelMapper modelMapper;

    public StaffService() {
        staffRepo = new StaffRepoImp();
        modelMapper = new ModelMapper();
    }

    public Set<StaffDto> getAllStaff() {
        Type type = new TypeToken<Set<StaffDto>>() {
        }.getType();
        return modelMapper.map(staffRepo.getAllStaff(), type);
    }

    public StaffDto getStaffById(int ID) {
        return modelMapper.map(staffRepo.getStaffById(ID), StaffDto.class);
    }

    public StaffDto addStaff(StaffDto staffDto) {
        Staff staff = modelMapper.map(staffDto, Staff.class);
        return modelMapper.map(staffRepo.addStaff(staff), StaffDto.class);
    }
    public StaffDto updateStaff(StaffDto staffDto) {
        Staff staff = modelMapper.map(staffDto, Staff.class);
        return modelMapper.map(staffRepo.updateStaff(staff), StaffDto.class);
    }

}
