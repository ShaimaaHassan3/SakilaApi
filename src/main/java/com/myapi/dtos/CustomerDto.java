package com.myapi.dtos;

import com.myapi.dtos.AddressDto;
import com.myapi.dtos.PaymentDto;
import com.myapi.dtos.StoreDto;
import com.myapi.persistence.entities.Customer;
import com.myapi.persistence.entities.Staff;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

/**
 * A DTO for the {@link Customer} entity
 */
@Data
@NoArgsConstructor
public class CustomerDto implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private AddressDto address;
    private Date createDate;
    private Date lastUpdate;
    private StoreDto storeDto;
}