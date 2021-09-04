package com.flash.smartenergy.service.common.user.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationReqDTO {

    private String firstName;

    private String lastName;

    private Date dob;

    private String email;

    private String userName;

    private String password;

    private AddressDTO address;

}
