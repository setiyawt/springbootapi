package com.tiya.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tiya.models.entity.Lokasi;
import com.tiya.models.entity.Proyek;
import com.tiya.services.LokasiService;
import com.tiya.services.ProyekService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/proyek")
public class ProyekController {
    
    @Autowired
    private ProyekService proyekService;

    @Autowired
    private LokasiService lokasiService;

    @PostMapping
    public ResponseEntity<Proyek> create(@RequestBody Proyek proyek) {
        Lokasi lokasi = proyek.getLokasi();

        if (lokasi != null) {
            // Jika Lokasi belum disimpan, simpan terlebih dahulu
            if (lokasi.getId() == null) {
                lokasi = lokasiService.create(lokasi);
            }
            proyek.setLokasi(lokasi);
        }

        Proyek savedProyek = proyekService.create(proyek);
        return ResponseEntity.ok(savedProyek);
    }

    @GetMapping
    public Iterable<Proyek> findAll() {
        return proyekService.findAll();
    }

    @GetMapping("/{id}")
    public Proyek findOne(@PathVariable ("id") Long id) {
        return proyekService.findOne(id);
    }

    @PutMapping
    public Proyek update(@RequestBody Proyek proyek) {
        return proyekService.save(proyek);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        proyekService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
