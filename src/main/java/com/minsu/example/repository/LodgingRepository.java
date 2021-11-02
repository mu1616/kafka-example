package com.minsu.example.repository;

import com.minsu.example.entity.Lodging;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LodgingRepository extends JpaRepository<Lodging, Long> {
}
