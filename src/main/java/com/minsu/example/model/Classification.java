package com.minsu.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Classification implements LodgingAttribute{
    UNDEFINED("미분류"),
    HOTELS("호텔"),
    RESORTS("리조트"),
    CONDOMINIUM("콘도"),
    MOTEL("모텔"),
    APARTMENTS("아파트먼트"),
    RESIDENCES("레지던스"),
    PENSIONS("펜션"),
    HOSTELS("호스텔"),
    GUEST_HOUSES("게스트하우스"),
    CAMPING_SITES("캠핑");

    private final String label;
}
