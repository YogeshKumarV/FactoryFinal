package com.factory.appraisal.vehiclesearchapp.mapper;
// authorName : YogeshKumarV

import com.factory.appraisal.vehiclesearchapp.dto.AppraisalVehicleTireCondition;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalVehicleTireCondition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AppraisalVehicleTireConditionMapper {
    @Mapping(source = "vehicleStatusId",target = "vehicleStatusId")
    AppraisalVehicleTireCondition eAppraisalVehicleTireConditionToAppraisalVehicleTireCondition(EAppraisalVehicleTireCondition eAppraisalVehicleTireCondition);
    @Mapping(source = "vehicleStatusId",target = "vehicleStatusId")
    EAppraisalVehicleTireCondition appraisalVehicleTireConditionToEAppraisalVehicleTireCondition(AppraisalVehicleTireCondition appraisalVehicleTireCondition);

}
