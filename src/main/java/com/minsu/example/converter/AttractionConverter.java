package com.minsu.example.converter;

import com.minsu.example.model.Attraction;
import com.minsu.example.model.LodgingAttribute;

public class AttractionConverter implements LodgingAttributeConverter {

    @Override
    public LodgingAttribute nameToLodgingAttribute(String name) {
        return Attraction.valueOf(name);
    }
}
