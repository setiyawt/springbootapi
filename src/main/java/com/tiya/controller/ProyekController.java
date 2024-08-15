package com.tiya.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tiya.models.entity.Proyek;
import com.tiya.services.ProyekService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/proyek")
public class ProyekController {
    
    @Autowired
    private ProyekService proyekService;

    @PostMapping
    public Proyek create(@RequestBody Proyek proyek) {
        
        return proyekService.create(proyek);
    }

    @GetMapping
    public Iterable<Proyek> findAll() {
        return proyekService.findAll();
    }
    
}
