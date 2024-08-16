package com.tiya.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tiya.models.repo.LokasiRepo;
import com.tiya.models.entity.Lokasi;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LokasiService {
    
    @Autowired
    private LokasiRepo lokasiRepo;

    public Lokasi create(Lokasi lokasi) {
        return lokasiRepo.save(lokasi);
    }

    public Lokasi save (Lokasi lokasi) {
        return lokasiRepo.save(lokasi);
    }

    public Lokasi findOne(Long Id) {
        return lokasiRepo.findById(Id).orElse(null);
    }

    public Iterable<Lokasi> findAll() {
        return lokasiRepo.findAll();
    }

    public void delete(Long Id) {
        lokasiRepo.deleteById(Id);
    }
}