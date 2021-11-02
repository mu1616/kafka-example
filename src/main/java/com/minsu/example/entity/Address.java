package com.minsu.example.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import static org.apache.commons.lang3.StringUtils.EMPTY;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class Address {

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "city")
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "country")
    private String country;

    @Column(name = "street_address")
    private String streetAddress;

    @Column(name = "detailed_address")
    private String detailedAddress;

    @Column(name = "zip_code")
    private int zipCode;

    public static Address empty() {
        return new Address();
    }
}
