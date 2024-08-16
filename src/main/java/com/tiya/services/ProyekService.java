package com.tiya.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tiya.models.repo.ProyekRepo;
import com.tiya.models.entity.Proyek;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProyekService {
    
    @Autowired
    private ProyekRepo proyekRepo;

    public Proyek create(Proyek proyek) {
        return proyekRepo.save(proyek);
    }

    public Proyek save (Proyek proyek) {
        return proyekRepo.save(proyek);
    }

    public Proyek findOne(Long Id) {
        Optional<Proyek> proyek = proyekRepo.findById(Id);
        if (!proyek.isPresent()) {
            return null;
        }
        return proyek.get();
    }

    public Iterable<Proyek> findAll() {
        return proyekRepo.findAll();
    }

    public void delete(Long Id) {
        proyekRepo.deleteById(Id);
    }

   
}