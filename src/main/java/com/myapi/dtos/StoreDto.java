package com.myapi.dtos;

import com.myapi.persistence.entities.Address;
import com.myapi.persistence.entities.Staff;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

/**
 * A DTO for the {@link com.myapi.persistence.entities.Store} entity
 */
@Data
@NoArgsConstructor
public class StoreDto implements Serializable {
    private Short id;
    private Date lastUpdate;
//    private AddressDto address;
    private StaffDto managerStaff;
}