package com.flash.smartenergy.service.common.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BasicResponseDTO {

    private boolean status;

    private String statusCode;

    private String successMessage;

    private String errorMessage;

}
