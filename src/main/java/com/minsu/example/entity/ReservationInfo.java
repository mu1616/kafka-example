package com.minsu.example.entity;

import lombok.*;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
public class ReservationInfo {

    @Column(name = "checkin_time")
    private LocalTime checkinTime;

    @Column(name = "checkout_time")
    private LocalTime checkoutTime;

    @Column(name = "reserv_desciption")
    private String description;

    public static ReservationInfo empty() {
        return new ReservationInfo();
    }
}
