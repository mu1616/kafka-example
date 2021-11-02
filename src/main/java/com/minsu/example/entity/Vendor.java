package com.minsu.example.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class Vendor {

    @Column(name = "vendor_id")
    private String id;

    @Column(name = "vendor_name")
    private String name;

    @Column(name = "vendor_pid")
    private String pid;

    public static Vendor empty() {
        return new Vendor();
    }
}
