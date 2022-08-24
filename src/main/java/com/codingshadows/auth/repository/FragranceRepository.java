package com.codingshadows.auth.repository;

import com.codingshadows.auth.model.Fragrance;
import com.codingshadows.auth.model.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FragranceRepository extends JpaRepository<Fragrance, Integer> {
    List<Fragrance> findByIdIn(List<Integer> list);
    Optional<Fragrance> findByFragranceName(String name);
}
