package com.minsu.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Property implements LodgingAttribute {
    TOURISM_HOTEL("관광호텔"),
    GROUP_TRAVELS("단체/MT/워크샵"),
    LUXURY("럭셔리"),
    BOUTIQUE("부띠끄"),
    BNB("비앤비"),
    BUSINESS("비지니스"),
    DOG_PENSION("애견펜션"),
    YACHT("요트"),
    COUPLES("커플"),
    KIDS_PENSION("키즈펜션"),
    GLAMPING("글램핑"),
    CARAVANING("카라반"),
    POOL_VILLA("풀빌라"),
    KOREAN_HOUSE("한옥");

    private final String label;
}
