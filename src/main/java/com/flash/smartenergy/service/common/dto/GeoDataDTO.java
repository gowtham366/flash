package com.flash.smartenergy.service.common.dto;

import com.flash.smartenergy.entity.Country;
import com.flash.smartenergy.entity.District;
import com.flash.smartenergy.entity.Zone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeoDataDTO {

    private Country country;

    private District district;

    private Zone zone;

    private Long parentId;

    private String parentName;
}
