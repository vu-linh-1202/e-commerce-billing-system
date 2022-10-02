package com.hcl.ecommercebillingsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "role")

public class Role extends BaseObject {

    @Column(name = "role_name")
    private String name;

    @Column(name = "role_description")
    private String description;

    @JsonBackReference
    @ManyToMany(targetEntity = User.class, mappedBy = "roles",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<User> users;
}