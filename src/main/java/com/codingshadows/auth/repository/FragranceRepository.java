package com.codingshadows.auth.repository;

import com.codingshadows.auth.model.Fragrance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FragranceRepository extends JpaRepository<Fragrance, Integer> {
    List<Fragrance> findByIdIn(List<Integer> list);
}
