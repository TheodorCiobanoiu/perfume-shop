package com.codingshadows.auth.service;

import com.codingshadows.auth.model.Fragrance;
import com.codingshadows.auth.repository.FragranceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FragranceService {

    private final FragranceRepository fragranceRepository;

    public Fragrance addFragrance(Fragrance fragrance){
        if(fragranceRepository.findByFragranceName(fragrance.getFragranceName()).isPresent())
            return fragrance;
        return fragranceRepository.save(fragrance);
    }

    public List<Fragrance> getAllAvailableFragrances(){
        return fragranceRepository.findAll();
    }
    public void deleteFragranceById(Integer fragranceId){
        fragranceRepository.deleteById(fragranceId);
    }

}
