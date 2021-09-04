package com.flash.smartenergy.service.common.user.dto.registration;

import com.flash.smartenergy.service.common.dto.BasicResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRespDTO extends BasicResponseDTO {

    private Long userId;

}
