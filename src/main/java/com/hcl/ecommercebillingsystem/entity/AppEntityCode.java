package com.hcl.ecommercebillingsystem.entity;

import com.hcl.ecommercebillingsystem.common.staticdata.CodeType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "app_entity_code")
public class AppEntityCode extends BaseObject{

        @Column(name = "code", nullable = false)
        private String code;

        @Column(name = "code_type", nullable = false)
        @Enumerated(EnumType.STRING)
        private CodeType codeType;
    }

