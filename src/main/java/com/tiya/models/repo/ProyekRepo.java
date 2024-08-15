package com.tiya.models.repo;

import org.springframework.data.repository.CrudRepository;

import com.tiya.models.entity.Proyek;

public interface ProyekRepo extends CrudRepository<Proyek, Long> {
    
}
