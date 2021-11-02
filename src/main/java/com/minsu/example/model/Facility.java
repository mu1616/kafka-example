package com.minsu.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Facility implements LodgingAttribute {
    PUBLIC_SHOWER("공용샤워실"),
    PUBLIC_SPA("공용스파"),
    PUBLIC_KITCHEN("공용주방"),
    PUBLIC_TOILET("공용화장실"),
    KARAOKE("노래방"),
    BASKETBALL_FIELD("농구장"),
    RESTAURANT("레스토랑"),
    CONVENIENCE_STORE("매점/편의점"),
    BUSINESS_CENTER("비즈니스센터"),
    SEMINAR_ROOMS("세미나실"),
    BALLROOMS("연회장"),
    WATER_SLIDE("워터슬라이드"),
    WATERPARK("워터파크"),
    JOKGU_JANG("족구장"),
    JJIMJIL_BANG("찜질방"),
    FOOTBALL_FUTSAL_FIELD("축구/풋살장"),
    TABLE_TENNIS("탁구장"),
    FITNESS("피트니스"),
    GOLF_FIELD("골프장"),
    ROOFTOPS("루프탑"),
    BARBEQUE_GRILLS("바베큐장"),
    SAUNA("사우나"),
    SWIMMING_POOL("수영장"),
    SPA("스파/월풀"),
    HOT_SPRING("온천"),
    KINDER_ATTRACTIONS("유아시설"),
    CAFE("카페"),
    KIDS_PLAYROOM("키즈플레이룸");

    private final String label;
}
