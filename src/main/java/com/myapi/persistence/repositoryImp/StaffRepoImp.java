package com.myapi.persistence.repositoryImp;

import com.myapi.persistence.entities.Staff;
import com.myapi.persistence.repository.StaffRepo;

import java.util.Set;

public class StaffRepoImp extends BaseRepoImp<Staff> implements StaffRepo {
    @Override
    public Set<Staff> getAllStaff() {
        return getAll(new Staff());
    }

    @Override
    public Staff getStaffById(int ID) {
        return getById(ID);
    }
}
