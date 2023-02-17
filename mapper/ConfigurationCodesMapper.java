package com.factory.appraisal.vehiclesearchapp.mapper;
// authorName : YogeshKumarV

import com.factory.appraisal.vehiclesearchapp.dto.ConfigurationCodes;
import com.factory.appraisal.vehiclesearchapp.persistence.model.EConfigurationCodes;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConfigurationCodesMapper {
    ConfigurationCodes eConfigurationCodesToConfigurationCodes(EConfigurationCodes eConfigurationCodes);
    EConfigurationCodes ConfigurationCodesToEConfigurationCodes(ConfigurationCodes configurationCodes);
}
