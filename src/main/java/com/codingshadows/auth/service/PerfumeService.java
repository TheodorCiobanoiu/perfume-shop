package com.codingshadows.auth.service;

import com.codingshadows.auth.model.Fragrance;
import com.codingshadows.auth.model.MyUser;
import com.codingshadows.auth.model.Perfume;
import com.codingshadows.auth.repository.FragranceRepository;
import com.codingshadows.auth.repository.PerfumeRepository;
import com.codingshadows.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PerfumeService {

    private final PerfumeRepository perfumeRepository;
    private final FragranceRepository fragranceRepository;

    public Perfume createPerfume(List<Integer> fragranceId, String perfumeName) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return perfumeRepository.save(Perfume.builder()
                .perfumeName(perfumeName)
                .myUser((MyUser) authentication.getPrincipal())
                .fragrances(fragranceRepository.findByIdIn(fragranceId))
                .build());
    }

    public List<Perfume> findPerfumesByUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return perfumeRepository.findAllByMyUser_UserID(((MyUser) authentication.getPrincipal()).getUserID());
    }
}
