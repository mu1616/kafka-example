package com.minsu.example.converter;

import com.minsu.example.model.LodgingAttribute;
import com.minsu.example.model.Service;

public class ServiceConverter implements LodgingAttributeConverter {
    @Override
    public LodgingAttribute nameToLodgingAttribute(String name) {
        return Service.valueOf(name);
    }
}
