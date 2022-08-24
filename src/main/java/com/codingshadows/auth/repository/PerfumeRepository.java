package com.codingshadows.auth.repository;

import com.codingshadows.auth.model.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfumeRepository extends JpaRepository<Perfume, Integer> {
    List<Perfume> findAllByMyUser_UserID(Integer userId);
}
