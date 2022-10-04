package com.hcl.ecommercebillingsystem.mapper;

import com.hcl.ecommercebillingsystem.dto.BaseInfo;
import com.hcl.ecommercebillingsystem.entity.BaseObject;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(implementationPackage = "mapper.impl")
public interface BaseMapper {

    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    BaseObject baseInfoToBaseObject(BaseInfo baseInfo);

    @InheritInverseConfiguration
    BaseInfo baseObjectToBaseInfo(BaseObject baseObject);

}
