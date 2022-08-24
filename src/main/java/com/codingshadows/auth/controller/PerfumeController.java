package com.codingshadows.auth.controller;

import com.codingshadows.auth.model.Perfume;
import com.codingshadows.auth.service.PerfumeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("perfume")
public class PerfumeController {

    private final PerfumeService perfumeService;

    @PostMapping("create/{perfumeName}")
    public Perfume createPerfume(@RequestBody List<Integer> fragrancesId, @PathVariable String perfumeName){
        return perfumeService.createPerfume(fragrancesId, perfumeName);
    }

    @GetMapping("my-perfumes")
    public List<Perfume> findMyPerfumes(){
        return perfumeService.findPerfumesByUser();
    }
}
