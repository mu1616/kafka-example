package com.minsu.example.converter;

import com.minsu.example.model.LodgingAttribute;
import com.minsu.example.model.Property;

public class PropertyConverter implements LodgingAttributeConverter {
    @Override
    public LodgingAttribute nameToLodgingAttribute(String name) {
        return Property.valueOf(name);
    }
}
