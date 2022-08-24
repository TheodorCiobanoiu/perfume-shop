package com.codingshadows.auth.controller;

import com.codingshadows.auth.model.Fragrance;
import com.codingshadows.auth.service.FragranceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("fragrance")
public class FragranceController {

    private final FragranceService fragranceService;

    @GetMapping("all")
    public List<Fragrance> getAllFragrances(){
        return fragranceService.getAllAvailableFragrances();
    }

    @PostMapping("add")
    public Fragrance addFragrance(@RequestBody Fragrance fragrance){
        return fragranceService.addFragrance(fragrance);
    }

    @DeleteMapping("delete/{id}")
    public void deleteFragranceById(@PathVariable Integer id){
        fragranceService.deleteFragranceById(id);
    }
}
