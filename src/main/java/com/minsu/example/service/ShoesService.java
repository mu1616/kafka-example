package com.minsu.example.service;

import com.minsu.example.entity.Lodging;
import com.minsu.example.entity.LodgingImage;
import com.minsu.example.entity.Shoes;
import com.minsu.example.model.Attraction;
import com.minsu.example.model.Property;
import com.minsu.example.model.ShoesForm;
import com.minsu.example.repository.LodgingImageRepository;
import com.minsu.example.repository.LodgingRepository;
import com.minsu.example.repository.ShoesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoesService {
    private final ShoesRepository shoesRepository;
    private final LodgingRepository lodgingRepository;
    private final LodgingImageRepository lodgingImageRepository;

    @Transactional
    public void save(ShoesForm shoesForm) {
        shoesRepository.save(Shoes.builder()
            .name(shoesForm.getName())
            .size(shoesForm.getSize())
            .build());

        Lodging lodging = lodgingRepository.save(Lodging.builder()
            .attractions(List.of(Attraction.RIVER_LAKE, Attraction.BEACH))
            .properties((List.of(Property.COUPLES)))
            .build());

        List<LodgingImage> images = List.of(LodgingImage.builder().url("sdf").build());
        images.forEach(image -> image.setLodging(lodging));
        lodgingImageRepository.saveAll(images);
    }

    public void update(long id, ShoesForm shoesForm) {
        Shoes shoes = shoesRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        shoes.setName(shoesForm.getName());
        shoes.setSize(shoesForm.getSize());
        shoesRepository.save(shoes);
    }
}
