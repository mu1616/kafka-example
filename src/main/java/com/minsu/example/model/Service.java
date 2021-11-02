package com.minsu.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Service implements LodgingAttribute {
    ALLDAY_SERVICE("24시간 프론트"),
    PRIVATE_LOCKER("개인사물함"),
    SMOKING_ALLOWED("객실내흡연"),
    NO_SMOKING("금연"),
    BASIC_SPICE("기본양념"),
    ROOM_SERVICE("룸서비스"),
    MASSAGE("마사지"),
    BAR("바/라운지"),
    VALET_PARKING("발렛파킹"),
    BOARD_GAMES("보드게임"),
    EMERGENCY_PHARMS("상비약"),
    MOVIES("영화관람"),
    BIKE_RENTAL("자전거대여"),
    BARRIER_FREE("장애인편의시설"),
    BAGGAGE_KEEPING("짐보관"),
    COOKING_ALLOWED("취사가능"),
    CAMP_FIRES("캠프파이어"),
    EVENT_AND_PARTIES("프로포즈/파티/이벤트"),
    PRINTER("프린터 사용"),
    WIFI("WIFI"),
    AIRPORT_SHUTTLE("공항 셔틀"),
    FREE_PARKING("무료주차"),
    PETS_ALLOWED("반려동물 동반가능"),
    SHUTTLES("셔틀버스"),
    BREAKFAST("조식서비스"),
    PARKING_AVAILABLE("주차가능"),
    PICK_UP("픽업");

    private final String label;
}
