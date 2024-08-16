package com.tiya.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tiya.models.entity.Lokasi;
import com.tiya.models.entity.Proyek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.tiya.services.LokasiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/{id}")
    public Lokasi findOne(@PathVariable ("id") Long id) {
        return lokasiService.findOne(id);
    }

    @PutMapping
    public Lokasi update(@RequestBody Lokasi lokasi) {
        return lokasiService.save(lokasi);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        lokasiService.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
