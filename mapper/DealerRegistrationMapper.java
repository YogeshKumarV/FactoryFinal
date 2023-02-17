package com.factory.appraisal.vehiclesearchapp.mapper;

import com.factory.appraisal.vehiclesearchapp.dto.DealerRegistration;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EDealerRegistration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DealerRegistrationMapper {
    @Mapping(target = "codeId",source = "codeId")
    DealerRegistration eDealerRegisterationToDealerRegisteration(EDealerRegistration eDealerRegistration);
    @Mapping(target = "codeId",source = "codeId")
    EDealerRegistration dealerRegisterationToEDealerRegisteration(DealerRegistration dealerRegistration);

}
