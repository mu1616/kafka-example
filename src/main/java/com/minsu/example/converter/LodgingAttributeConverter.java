package com.minsu.example.converter;

import com.minsu.example.model.LodgingAttribute;
import com.minsu.example.model.Property;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.AttributeConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface LodgingAttributeConverter extends AttributeConverter<List<LodgingAttribute>, String> {
    @Override
    default String convertToDatabaseColumn(List<LodgingAttribute> attributes) {
        if (attributes.isEmpty()) {
            return StringUtils.EMPTY;
        }
        return attributes.stream()
            .map(LodgingAttribute::name)
            .collect(Collectors.joining(";"));
    }

    @Override
    default List<LodgingAttribute> convertToEntityAttribute(String dbData) {
        if (StringUtils.isEmpty(dbData)) {
            return new ArrayList<>();
        }
        return Arrays.stream(dbData.split(";"))
            .map(this::nameToLodgingAttribute)
            .collect(Collectors.toList());
    }

    LodgingAttribute nameToLodgingAttribute(String name);
}
