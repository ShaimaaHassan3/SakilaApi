package com.myapi.persistence.repository;

import com.myapi.persistence.entities.Staff;

import java.util.Set;

public interface StaffRepo {
    Set<Staff> getAllStaff();
    Staff getStaffById(int ID);
    Staff addStaff(Staff staff);
}
