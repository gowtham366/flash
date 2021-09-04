package com.flash.smartenergy.service.common.user.dto.registration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

    private String addressLine1;
    private String addressLine2;
    private String pinCode;
    private Long countryId;
    private Long stateId;
    private Long districtId;
    private Long zoneId;

}
