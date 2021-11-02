package com.minsu.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Attraction implements LodgingAttribute {
    FISHING("낚시장 주변"),
    UNIVERSITY("대학교"),
    SPORTS_GROUND("스포츠 경기장 주변"),
    RIVER_LAKE("강/호수 주변"),
    STREAMS("계곡 주변"),
    COUNTRY_CLUB("골프장 주변"),
    PARK("공원"),
    NATURAL_FORESTS("수목원/휴양림 주변"),
    WATER_ACTIVITIES("수상레져"),
    SKI_RESORTS("스키장 주변"),
    BEACH("해수욕장 주변");

    private final String label;
}
