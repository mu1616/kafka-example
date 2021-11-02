package com.minsu.example.repository;

import com.minsu.example.entity.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepository extends JpaRepository<Shoes, Long> {
}
