package com.minsu.example.converter;

import com.minsu.example.model.Facility;
import com.minsu.example.model.LodgingAttribute;

public class FacilityConverter implements LodgingAttributeConverter {
    @Override
    public LodgingAttribute nameToLodgingAttribute(String name) {
        return Facility.valueOf(name);
    }
}
