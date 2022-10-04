package com.hcl.ecommercebillingsystem.mapper.impl;

import com.hcl.ecommercebillingsystem.dto.BaseInfo;
import com.hcl.ecommercebillingsystem.entity.BaseObject;
import com.hcl.ecommercebillingsystem.mapper.BaseMapper;

public class BaseMapperImpl implements BaseMapper {

    /**
     * @param baseInfo
     * @return baseObject
     */
    @Override
    public BaseObject baseInfoToBaseObject(BaseInfo baseInfo) {
        if (baseInfo == null) {
            return null;
        }
        BaseObject baseObject = new BaseObject();
        baseObject.setId(baseInfo.getId());
        return baseObject;

    }

    /**
     *
     * @param baseObject
     * @return baseInfo
     */
    @Override
    public BaseInfo baseObjectToBaseInfo(BaseObject baseObject) {
        if (baseObject == null) {
            return null;
        }
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setId(baseObject.getId());
        return baseInfo;
    }
}
