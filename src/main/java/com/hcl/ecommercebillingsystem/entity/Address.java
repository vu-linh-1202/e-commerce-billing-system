package com.hcl.ecommercebillingsystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address extends BaseObject{

    @Column(name = "address1", nullable = false)
    private String address1;

    @Column(name = "address2", nullable = true)
    private String address2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state", nullable = false)
    private String state;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "landmark", nullable = true)
    private String landmark;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

}
