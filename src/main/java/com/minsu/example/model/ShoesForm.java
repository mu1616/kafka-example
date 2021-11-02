package com.minsu.example.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ShoesForm {
    private final String name;
    private final int size;
}
