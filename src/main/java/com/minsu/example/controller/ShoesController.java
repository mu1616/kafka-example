package com.minsu.example.controller;

import com.minsu.example.model.ShoesForm;
import com.minsu.example.service.ShoesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shoes")
@RequiredArgsConstructor
public class ShoesController {

    private final ShoesService shoesService;

    @PostMapping("")
    public void save(@RequestBody ShoesForm shoesForm) {
        shoesService.save(shoesForm);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") long id, @RequestBody ShoesForm shoesForm) {
        shoesService.update(id, shoesForm);
    }
}
