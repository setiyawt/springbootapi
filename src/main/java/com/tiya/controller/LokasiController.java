package com.tiya.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tiya.models.entity.Lokasi;
import com.tiya.services.LokasiService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/lokasi")
public class LokasiController {
    
    @Autowired
    private LokasiService lokasiService;

    @PostMapping
    public Lokasi create(@RequestBody Lokasi lokasi) {
        
        return lokasiService.create(lokasi);
    }

    @GetMapping
    public Iterable<Lokasi> findAll() {
        return lokasiService.findAll();
    }
    
}
