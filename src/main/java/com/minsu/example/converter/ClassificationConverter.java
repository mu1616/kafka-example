package com.minsu.example.converter;

import com.minsu.example.model.Classification;
import com.minsu.example.model.LodgingAttribute;

public class ClassificationConverter implements LodgingAttributeConverter{
    @Override
    public LodgingAttribute nameToLodgingAttribute(String name) {
        return Classification.valueOf(name);
    }
}
